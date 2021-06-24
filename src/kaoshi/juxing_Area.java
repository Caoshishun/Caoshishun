package kaoshi;

import java.util.Scanner;

public class juxing_Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入矩形的长：");
        double length = scanner.nextDouble();
        System.out.print("请输入矩形的宽：");
        double width = scanner.nextDouble();
        new area(length,width);
    }
}
class area {
    private double length;
    private double width;

    public area(double length, double width) {
        this.length = length;
        this.width = width;
        calculation(length,width);
    }

    public void calculation(double length,double width) {
        System.out.println("矩形的面积是：" + length * width);
    }
}
