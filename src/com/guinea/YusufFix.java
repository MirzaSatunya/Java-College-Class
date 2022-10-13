package com.guinea;
import java.util.Scanner;
public class YusufFix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Menu :");
        System.out.println("1. Menghitung luas dan keliling persegi panjang");
        System.out.println("2. Menghitung luas dan keliling lingkaran");
        System.out.println("3. Menghitung luas dan keliling segitiga");

        byte pilihan;
        System.out.print("Masukkan pilihan \t:");
        pilihan = input.nextByte();

        int luas = 0, keliling = 0;

        if(pilihan == 1){
            byte panjang = 0, lebar = 0;
            System.out.print("Masukkan panjang\t:");
            panjang = input.nextByte();
            System.out.print("Masukkan lebar\t\t:");
            lebar = input.nextByte();

            luas = panjang * lebar;
            keliling = 2 * (panjang + lebar);

            System.out.println("\n" + "Luas persegi panjang \t:" + luas + "cm2");
            System.out.println("Keliling persegi anjang:" + keliling + "cm");
        }else if(pilihan == 2){
            byte radius = 0;
            System.out.print("Masukkan radius \t:");
            radius = input.nextByte();

            luas = 22 * radius * radius / 7;
            keliling = 22 * 2 * radius / 7;

            System.out.println("\n" + "Luas lingkaran \t\t:" + luas + "cm2");
            System.out.println("Keliling lingkaran\t:" + keliling + "cm");
        }
        else if (pilihan == 3){
            byte alas = 0, tinggi = 0, miring = 0;
            System.out.print("Masukkan alas\t\t:");
            alas = input.nextByte();
            System.out.print("Masukkan tinggi\t\t:");
            tinggi = input.nextByte();
            System.out.print("Masukkan miring\t\t:");
            miring = input.nextByte();

            luas = (alas * tinggi) / 2;
            keliling = alas + tinggi + miring;

            System.out.println("\n" + "Luas segitiga\t\t:" + luas + "cm2");
            System.out.println("Keliling segitiga\t:" + keliling + "cm");
        }
        else{
            System.out.println("Data tak ditemukan, program dihentikan ...");
        }

        input.close();

    }
} 
