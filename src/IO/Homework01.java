package IO;

import java.io.File;
import java.io.IOException;

public class Homework01 {
    public static void main(String[] args) throws IOException {
        String route = "e:\\hello.txt";
        File file = new File(route);
        //FileOutputStream fos = new FileOutputStream(route);
        if (!file.exists()) {
            if(file.mkdir()) {
                System.out.println("创建" + route + "创建成功");
            }
        }
        else {
            System.out.println("创建" + route + "失败");
        }

        //fos.close();
    }
}
