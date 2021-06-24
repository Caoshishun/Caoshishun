package IO;

import java.io.*;

public class Homework02 {
    public static void main(String[] args) throws IOException {
        String route = "e:\\hello.txt";
        String line = "";
        int lineNum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(route),"gbk"));
        while ((line = br.readLine()) != null) {
            System.out.println(++lineNum + line);
        }
        br.close();
    }
}
