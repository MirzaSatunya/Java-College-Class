package com.moduleone;

import java.util.Scanner;

public class Bab1Praktikum2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama lengkap: ");
        String name = input.nextLine();
        System.out.print("Nama Kelurahan: ");
        String kel = input.nextLine();
        System.out.print("Masukkan posisi awal Kwh Meter: ");
        short bef = input.nextShort();
        System.out.print("Masukkan posisi akhir Kwh Meter: ");
        short af = input.nextShort();
        System.out.print("Masukkan biaya beban saat ini: ");
        short w = input.nextShort();
        System.out.print("Masukkan PPJ (tanpa %): ");
        byte percentage = input.nextByte();
        input.close();
        short usetot = (short) (af-bef); 
        int useprice = (int) w*usetot;
        int usepercent = Math.round((float) (percentage/100.0*useprice));
        int tot = (int) (useprice+usepercent);
        System.out.println("===================PLN Java===================");
        System.out.printf("%s%21c%s\n","Nama",':',name);
        System.out.printf("%s%16c%s\n","Kelurahan",':',kel);
        System.out.printf("%s%6c%d%s\n","Pemakaian bulan ini",':',usetot," Kwh Meter");
        System.out.printf("%s%12c%d%c%c\n","Tarif Listrik",':',useprice,',','-');
        System.out.printf("%s%d%c%18c%d%c%c\n","PPJ ",percentage,'%',':',usepercent,',','-');
        System.out.printf("%s%14c%d%c%c\n","Total Bayar",':',tot,',','-');
        System.out.println("==============================================");
    }
}
