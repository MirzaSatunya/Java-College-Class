package com.clasessCase;

import java.util.Scanner;

public class CashRegist {
    public static void main(String[] args) {
        final int[] PRICE = {1000, 2000, 500, 1500, 10000};
        int[] itemRegister = {0, 0, 0, 0, 0};
        String userChoice = "a";

        Scanner sc = new Scanner(System.in);

        System.out.println("\n--------------------------");
        System.out.println("Pilih barang yang ingin dibeli:\n1. Sabun\n2. Shampo\n3. Sikat\n4. Sendok\n5. Tisu");
        System.out.println("--------------------------\n");

        while (!userChoice.equals("selesai")) {
            System.out.print("Masukkan nama barang : ");
            userChoice = sc.nextLine().toLowerCase();
            switch(userChoice) {
                case "sabun" :
                itemRegister[0]++;
                break;
                case "shampo" :
                itemRegister[1]++;
                break;
                case "sikat" :
                itemRegister[2]++;
                break;
                case "sendok" :
                itemRegister[3]++;
                break;
                case "tisu" :
                itemRegister[4]++;
                break;
                case "selesai" :
                System.out.println();
            }  
        }

        sc.close();
        
        if (itemRegister[0] > 0) System.out.println("Sabun    " + itemRegister[0] + "   " + (itemRegister[0] * PRICE[0]));
        if (itemRegister[1] > 0) System.out.println("Shampo   " + itemRegister[1] + "   " + (itemRegister[1] * PRICE[1]));
        if (itemRegister[2] > 0) System.out.println("Sikat    " + itemRegister[2] + "   " + (itemRegister[2] * PRICE[2]));
        if (itemRegister[3] > 0) System.out.println("Sendok   " + itemRegister[3] + "   " + (itemRegister[3] * PRICE[3]));
        if (itemRegister[4] > 0) System.out.println("Tisu     " + itemRegister[4] + "   " + (itemRegister[4] * PRICE[4]));

        System.out.println();
    }
}