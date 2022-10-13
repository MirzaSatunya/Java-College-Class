package com.modulethree;

import java.util.Scanner;

public class Bab3Praktikum1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number : ");
        int nilaiN = input.nextInt();
        input.close();
        for (int i = 1; i <= nilaiN; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.printf("%2c",'*'); 
            }
            System.out.println();
        }
    }
}