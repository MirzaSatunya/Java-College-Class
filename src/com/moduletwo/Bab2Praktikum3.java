package com.moduletwo;

import java.util.Scanner;

public class Bab2Praktikum3 {
    public static void main(String[] args) {
        int upah = 0;
        int bonusLembur = 0;
        int denda = 0;
        int upahTotal = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("\nJam kerja   : ");
        byte jamKerja = input.nextByte();
        input.close();
        if (jamKerja <= 60 && jamKerja >= 50) {
            upah = jamKerja * 5000;
            System.out.println("Upah  = Rp. " + upah);
            System.out.println("Lembur= Rp. " + bonusLembur);
            System.out.println("Denda = Rp. " + denda);
            System.out.println("---------------------");
            System.out.println("Total = Rp. " + upah);
        }
        else if (jamKerja > 60) {
            bonusLembur = (jamKerja - 60) * 6000;
            upah = 60 * 5000;
            upahTotal = upah + bonusLembur;
            System.out.println("Upah  = Rp. " + upah);
            System.out.println("Lembur= Rp. " + bonusLembur);
            System.out.println("Denda = Rp. " + denda);
            System.out.println("---------------------");
            System.out.println("Total = Rp. " + upahTotal);
        }
        else if (jamKerja < 50) {
            denda = (50 - jamKerja) * 1000;
            upah = jamKerja * 5000;
            upahTotal = jamKerja * 5000 - denda;
            System.out.println("Upah  = Rp. " + upah);
            System.out.println("Lembur= Rp. " + bonusLembur);
            System.out.println("Denda = Rp. " + denda);
            System.out.println("---------------------");
            System.out.println("Total = Rp. " + upahTotal);
        }
        System.out.println();
    }
}
