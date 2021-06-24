package com;

public class Shuzu {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;
        arr2[0] = 10;
        System.out.println(arr1[0]);
    }
}
