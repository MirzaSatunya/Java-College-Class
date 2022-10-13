package com.guinea;

import java.util.Scanner;

public class SpeedRun {
    public static void main(String[] args) {
        final byte MAX_HOUR = 40;
        final int MAX_NORMAL_PAYMENT = 1_000_000;
        
        int jam = 0;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Nama Pegawai : ");
        String nama = in.nextLine();
        System.out.print("Hari Kerja dalam sepekan : ");
        int hari = in.nextInt();
        
        for (int i = 1; i <= hari; i++) {
            System.out.print("Masukkan Jam Kerja Hari ke-" + i + " : "); 
            short jamKerja = in.nextShort();
            jam += jamKerja;
        }
        
        in.close();

        int upah = (jam <= MAX_HOUR) ? jam * 25000 : (jam - MAX_HOUR) * 30000 + MAX_NORMAL_PAYMENT;
        System.out.println("Nama Pegawai : " + nama);
        System.out.println("Gaji : " + upah);
    }
}