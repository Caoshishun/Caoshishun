package com;

import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("size:");
        int size = scan.nextInt();
        System.out.println("Array:");
        int[] myList = new int[size];
        for (int i = 0;i < size;i++){
            myList[i] = scan.nextInt();
        }
        System.out.println("target:");
        int target = scan.nextInt();
        for (int i = 0;i < size;i++){
            for (int n = i + 1;n < size;n++){
                if(target == myList[i] + myList[n])
                    System.out.println("[" + i + "," + n + "]");
            }
        }
    }
}
