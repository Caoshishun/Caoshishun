import java.util.Scanner;

public class shuixianhua {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int n = scan.nextInt();
        int n1 = n / 100; //百位数
        int n2 = n % 100 / 10; //十位数
        int n3 = n % 10; //个位数
        if (n == n1 * n1 * n1 + n2 * n2 * n2 + n3 * n3 * n3) {
            System.out.println(n + "是水仙花数。");
        } else
            System.out.println(n + "不是水仙花数");
    }
}

