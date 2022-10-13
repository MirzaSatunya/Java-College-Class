package com.clasessCase;

import java.util.Scanner;

public class Case1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas Looping : "); int n = input.nextInt();
        input.close();

        for (int i = 1; i <= n; i++) {
            System.out.println("Nomor Ke-" + i);
        }
    }
}
