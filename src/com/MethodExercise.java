package com;

public class MethodExercise {
    public static void main(String[] args) {
        AA a = new AA();
        boolean b = a.isOdd(1);
        System.out.println(b);
    }
}
class AA {
    public boolean isOdd(int num) {
        return num % 2 != 0 ? true:false;
    }
}
