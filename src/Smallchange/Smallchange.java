package Smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Smallchange {
    public static void main(String[] args) {
        //显示菜单
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";
        double money = 0;
        double balance = 0;
        String note ;
        String choice;

        Date date = null;//date 表示日期。
        //SimpleDateFormat可用于日期格式化。
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String details = "-------------零钱通菜单------------";

        do {

            System.out.println("-------------零钱通菜单------------");
            System.out.println("|\t\t\t1.零钱通明细\t\t\t|");
            System.out.println("|\t\t\t2.收益入账\t\t\t|");
            System.out.println("|\t\t\t3.消费     \t\t\t|");
            System.out.println("|\t\t\t4.退     出\t\t\t|");
            System.out.println("-------------零钱通菜单------------");

            System.out.print("请选择(1-4): ");
            key = scanner.next();

            //使用switch 分支控制
            switch (key) {
                case "1" :
                    System.out.println(details);
                    break;
                case "2" :
                    System.out.print("2. 收益入账金额：");
                    money = scanner.nextDouble();
                    //money 的值范围应该校验
                    if(money <= 0) {
                        System.out.println("收益金额 需要 大于0");
                        break;
                    }
                    balance += money;
                    date = new Date();

                    details += "\n收益入账\t+" + money + "  " + sdf.format(date) + "  " + balance;
                    break;
                case "3" :
                    System.out.print("3. 消费金额： ");

                    money = scanner.nextDouble();
                    if (balance < money || money <= 0) {
                        System.out.println("你消费的金额应该在0-" + balance + "之间");
                        break;
                    }
                    System.out.print("消费说明：");
                    //输入消费说明。
                    note = scanner.next();
                    balance -= money;
                    //拼接消费信息到details
                    date = new Date(); //获取当期日期
                    details += "\n" + note + "\t-" + money + "  " + sdf.format(date) + "  " + balance;

                    break;
                case "4" :
                    while (true){
                        System.out.println("你确定要退出吗？y/n");
                        choice = scanner.next();
                        if ("y".equals(choice) || "n".equals(choice)) {
                            break;
                        }
                    }
                    if (choice.equals("y")){
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("选择有误，请重新选择");

            }

        }while (loop);

    }
}
