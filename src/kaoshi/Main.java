package kaoshi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i;
        String m;
        System.out.println("请输入字符串：");
        Scanner scanner = new Scanner(System.in);
        String[] str;
        m = scanner.nextLine();
        str = m.split(" ");
        for (i = str.length - 1;i < str.length && i >= 0;i--){
            for (int j = str[i].length() - 1; j < str[i].length() && j >=0; j--) {
                System.out.print(str[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}
