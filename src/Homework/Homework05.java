package Homework;

public class Homework05 {
    public static void main(String[] args) {
        A a = new A();
        a.show();
        a.new B().show();
    }
}

class A {
    private String name = "小红";

    class B {
        private String name = "小蓝";

        public void show() {
            System.out.println(this.name);
        }
    }
    public void show() {
        System.out.println(name);
    }
}