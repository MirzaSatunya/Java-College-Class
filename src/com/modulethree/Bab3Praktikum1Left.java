package com.modulethree;

import java.util.Scanner;

public class Bab3Praktikum1Left {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-20s%c ","\nMasukkan nilai n",':');
        byte nilaiN = input.nextByte();
        input.close();
        System.out.println();
        int sC = nilaiN * 2; // sC = spaceCount : untuk menghitung spasi sesuai dengan input
        for (int i = 1; i <= nilaiN; i++, sC -= 2) {
                for (int k = 1; k <= sC; k++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            System.out.println();
        }
        System.out.println();
    }
}
