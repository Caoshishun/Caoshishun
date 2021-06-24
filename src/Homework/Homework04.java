package Homework;

public class Homework04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        //匿名内部类debug跑一边
        cellphone.testwork(new Computer() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        } , 10, 20);
    }
}

class Cellphone implements Computer {

    public void testwork(Computer computer, double n1, double n2){
        double result = computer.work(n1,n2);
        System.out.println("计算的结果是=" + result);
    }

    @Override
    public double work(double n1, double n2) {
        return 0;
    }
}

interface Computer {
    public double work(double n1, double n2);
}
