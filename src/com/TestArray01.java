package com;

public class TestArray01 {
    public static void main(String[] args) {
        double[] myList = {3.5,5.6,7.7,2.1,5.1};
        for (int i = 0;i < myList.length;i++){
            System.out.println(myList[i] + " ");
        }
        double total = 0;
        for (int i = 0;i < myList.length;i++){
            total += myList[i];
        }
        System.out.println("total is " + total);
        double max = myList[0];
        for (int i = 1;i < myList.length;i++) {
            if (max < myList[i])
                max = myList[i];
        }
        System.out.println("max is " + max);
    }
}
