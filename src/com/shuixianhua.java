import java.util.Scanner;

public class shuixianhua {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("������һ����λ����");
        int n = scan.nextInt();
        int n1 = n / 100; //��λ��
        int n2 = n % 100 / 10; //ʮλ��
        int n3 = n % 10; //��λ��
        if (n == n1 * n1 * n1 + n2 * n2 * n2 + n3 * n3 * n3) {
            System.out.println(n + "��ˮ�ɻ�����");
        } else
            System.out.println(n + "����ˮ�ɻ���");
    }
}

