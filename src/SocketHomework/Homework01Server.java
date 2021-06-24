package SocketHomework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Homework01Server {
    public static void main(String[] args) throws IOException {
        //设置监听的端口
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        //获得接收的字节流
        InputStream inputStream = socket.getInputStream();
        //将字节刘转换成字符流
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        //
        String s = bufferedReader.readLine();
        String answer = "";
        if ("name".equals(s)) {
            answer = "我是曹世顺";
        } else if ("hobby".equals(s)) {
            answer = "编写java程序";
        } else {
            answer = "你说啥子";
        }

        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write(answer);
        bufferedWriter.newLine();
        bufferedWriter.flush();

        bufferedWriter.close();
        bufferedReader.close();
        socket.close();


    }
}
