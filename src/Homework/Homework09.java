package Homework;

import java.util.Scanner;


public class Homework09 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("用户名：");
            String name = scanner.next();
            System.out.print("密码：");
            String pwd = scanner.next();
            System.out.print("邮箱：");
            String email = scanner.next();
        try {
            userRegister(name,pwd,email);
            System.out.println("恭喜你注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }


    }

    public static void userRegister(String name, String pwd, String email){
        if(!(name.length() > 1 && name.length() < 5)) {
            throw new RuntimeException("用户名长度为2或3或4");
        }

        if(!(pwd.length() == 6 && isDigital(pwd))) {
            throw new RuntimeException("密码长度为6，且为数字");
        }

        int i = email.indexOf('@');
        int j = email.indexOf('.');
        
        if(!(i > -1 && (j - i) > 0)) {
            throw new RuntimeException("邮箱必须含有@，且@要在.之前");
        }

    }

    public static boolean isDigital(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }

}
