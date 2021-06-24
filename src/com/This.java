package com;

public class This {
    public static void main(String[] args) {
        AAA maximum = new AAA();
        System.out.println(maximum.max(5,6,7,8));
        Book noval = new Book("笑傲江湖",170);
        System.out.println(noval.updatepPrice());
        A02 equal = new A02();
        String[] n1 = {"cao","shi" ,"shun"};
        System.out.println(equal.find("shi", n1));
        A03 copy = new A03();
        int[] n2 = {1,2,3};
        System.out.println(copy.copyArr(n2));
    }
}

class AAA {
    public double max(double... n){
        double max = 0;
        for(int i = 0; i < n.length; i++){
            if(max <= n[i]){
                max = n[i];
            } else {
                continue;
            }
        }
        return max;
    }
}

class A02 {
    public int find(String n1,String... n){
        for (int i = 0; i < n.length; i++) {
            if (n[i].equals(n1)){
                return i;
            }
        }
        return -1;
    }
}

class Book {
    String name;
    double price;
    public Book(String name, double price){
        this.name = name;
        this.price = price;
    }
    public double updatepPrice() {
        if (price > 150){
            return 150;
        } else if (price > 100){
            return 100;
        } else {
            return price;
        }
    }
}

class A03 {
    public int[] copyArr(int[] n1) {
        int[] n2 = new int[n1.length];
        for (int i = 0; i < n1.length; i++){
            n2[i] = n1[i];
        }
        return n2;
    }
}