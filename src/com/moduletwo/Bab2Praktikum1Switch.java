package com.moduletwo;

import java.util.Scanner;

public class Bab2Praktikum1Switch {
    public static void main(String[] args) {
        int luasPersegi = 0, kelPersegi = 0, kelSegitiga = 0;
        float luasLingkaran = 0, kelLingkaran = 0, luasSegitiga = 0, pi = 3.14F;
        short a = 0, b = 0, c = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Menu :\n1. menghitung luas dan keliling persegi panjang\n2. menghitung luas dan keliling lingkaran\n3. menghitung luas dan keliling segitiga\n");
        System.out.print("Pilih salah satu dari menu (1, 2, atau 3) : ");
        byte userInput = input.nextByte();
        switch(userInput){
            case 1 :
            System.out.print("Masukkan nilai panjang : ");
            a = input.nextShort();
            System.out.print("Masukkan nilai lebar : ");
            b = input.nextShort();
            input.close();
            kelPersegi = (2*a)+(2*b);
            luasPersegi = a*b;
            System.out.println("Keliling Persegi : "+kelPersegi);
            System.out.println("Luas Persegi : "+luasPersegi);
            break;
            case 2 :
            System.out.print("Masukkan nilai jari-jari : ");
            float r = input.nextFloat();
            input.close();
            luasLingkaran = pi*(r*r);
            kelLingkaran = 2*pi*r;
            System.out.println("Keliling lingkaran : "+kelLingkaran);
            System.out.println("Luas lingkaran : "+luasLingkaran);
            break;
            case 3 :
            System.out.print("Masukkan nilai sisi a : ");
            a = input.nextShort();
            System.out.print("Masukkan nilai sisi b : ");
            b = input.nextShort();
            System.out.print("Masukkan nilai sisi c : ");
            c = input.nextShort();
            System.out.print("Masukkan nilai sisi r : ");
            r = input.nextShort();
            input.close();
            kelSegitiga = a+b+c;
            luasSegitiga = (float) (0.5*a*b);
            System.out.println("Keliling Segitiga : "+kelSegitiga);
            System.out.println("Luas Segitiga : "+luasSegitiga);
            break;
            default :
            System.out.println("Data tidak ditemukan, program dihentikan ...");
        }
        System.out.println();
    }
}