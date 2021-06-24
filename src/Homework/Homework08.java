package Homework;

public class Homework08 {
    public static void main(String[] args) {
        Color yellow = Color.YELLOW;
        switch (yellow) {
            case RED:
                System.out.println("匹配到红色");
                break;
            case YELLOW:
                System.out.println("匹配到黄色");
                break;
            default:
                System.out.println("没有匹配到");
        }
    }
}

enum Color implements AA {
    RED(255,0,0),BLUE(0,0,255),
    BLACK(0,0,0),YELLOW(255,255,0),
    GREEN(0,255,0);
    private double redValue;
    private double blueValue;
    private double greenValue;

    Color(double redValue, double buleValue, double greenValue) {
        this.redValue = redValue;
        this.blueValue = buleValue;
        this.greenValue = greenValue;
    }

    @Override
    public void show() {
        System.out.println("属性值为 " + redValue + "," + blueValue + "," + greenValue);
    }
}

interface AA{
    public void show();
}
