package com;

import  java.util.Scanner;
//冒泡排序法
public class BUbbleSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr1 = {24,69,80,57,13};
        for (int i = 0;i < arr1.length;i++){
            for (int j = i + 1;j < arr1.length;j++){
                int temp = 0;
                if(arr1[i] > arr1[j]) {
                    temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        for (int i = 0;i < arr1.length;i++) {
            System.out.println(arr1[i]);
        }
    }
}
