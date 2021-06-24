package Homework;

public class Homework02 {
    public static void main(String[] args) {
        Frock frock01 = new Frock();
        System.out.println(frock01);
        Frock frock02 = new Frock();
        System.out.println(frock02);
        Frock frock03 = new Frock();
        System.out.println(frock03);
    }

}

class Frock {
    private static int currentNum = 100000;
    private static int serialNumber;

    public Frock() {
        serialNumber = getNextNum();
    }

    public static int getNextNum() {
        currentNum += 100;
        return currentNum;
    }

    public static int getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return "Frock{" + serialNumber + "}";
    }
}
