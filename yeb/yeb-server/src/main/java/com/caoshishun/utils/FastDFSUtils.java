package com.caoshishun.utils;

import org.csource.fastdfs.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 功能描述：
 *
 * @author 曹世顺
 * @version 1.0
 * @date 2022/2/18 0018 13:57
 */
public class FastDFSUtils {

    private static Logger logger = LoggerFactory.getLogger(FastDFSUtils.class);

    /**
     * 初始化客户端
     * ClientGlobal.init 读取配置文件，并初始化属性
     */
    static {
        try {
            String filePath = new ClassPathResource("fdfs_client.conf").getFile().getAbsolutePath();
            ClientGlobal.init(filePath);
        } catch (Exception e){
            logger.error("初始化FastDFS失败",e.getMessage());
        }
    }

    public static String[] upload(MultipartFile file){
        String name = file.getOriginalFilename();
        logger.info("文件名：" ,name);
        StorageClient storageClient = null;
        String[] uploadResults = null;
        try {
            //获取storage客户端
            storageClient = getStorageClient();
            uploadResults = storageClient.upload_file(file.getBytes(),name.substring(name.lastIndexOf(".") + 1),null);
        } catch (Exception e) {
            logger.error("上传文件失败",e.getMessage());
        }
        if (uploadResults == null){
            logger.error("上传文件失败",storageClient.getErrorCode());
        }
        return uploadResults;
    }

    public static FileInfo getFileInfo(String groupName,String remoteFileName){
        StorageClient storageClient = null;
        try {
            storageClient = getStorageClient();
            return storageClient.get_file_info(groupName, remoteFileName);
        } catch (Exception e) {
            logger.error("文件信息获取失败",e.getMessage());
        }
        return null;
    }

    public static InputStream downFile(String groupName,String remoteFileName){
        StorageClient storageClient = null;
        try {
            storageClient = getStorageClient();
            byte[] bytes = storageClient.download_file(groupName, remoteFileName);
            InputStream inputStream = new ByteArrayInputStream(bytes);
        } catch (Exception e) {
            logger.error("文件信息获取失败",e.getMessage());
        }
        return null;
    }

    public static void deleteFile(String groupFile ,String remoteFileName){
        StorageClient storageClient = null;
        try {
            storageClient = getStorageClient();
        } catch (IOException e) {
            logger.error("文件删除失败",e.getMessage());
        }
    }
    /**
     * 生成storage客户端
     * @return
     * @throws IOException
     */
    private static StorageClient getStorageClient() throws IOException{
        TrackerServer trackServer = getTrackServer();
        StorageClient storageClient = new StorageClient(trackServer, null);
        return storageClient;
    }

    /**
     * 生成tracker服务 器
     * @return
     */
    private static TrackerServer getTrackServer() throws IOException {
        TrackerClient trackerClient = new TrackerClient();
        TrackerServer trackerServer = trackerClient.getConnection();
        return trackerServer;
    }

    /**
     * 获取文件路径
     * @return
     */
    public static String getTrackerUrl(){
        TrackerClient trackerClient = new TrackerClient();
        TrackerServer trackerServer = null;
        StorageServer storeStorage = null;
        try {
            trackerServer = trackerClient.getConnection();
            storeStorage = trackerClient.getStoreStorage(trackerServer);
        } catch (Exception e) {
            logger.error("文件路径获取失败",e.getMessage());
        }
        return "http://" + storeStorage.getInetSocketAddress().getHostName() + ":8888/";
    }

}
