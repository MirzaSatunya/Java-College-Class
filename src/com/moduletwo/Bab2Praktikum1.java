package com.moduletwo;
import java.util.Scanner;
public class Bab2Praktikum1 {
    public static void main(String[] args) {
        int luaspersegi = 0, kelpersegi = 0, kelsegitiga = 0;
        float luaslingkaran = 0, kellingkaran = 0, luassegitiga = 0;
        short a = 0, b = 0, c = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Menu :\n1. menghitung luas dan keliling persegi panjang\n2. menghitung luas dan keliling lingkaran\n3. menghitung luas dan keliling segitiga\n");
        System.out.print("Pilih salah satu dari menu (1, 2, atau 3) : ");
        byte select = input.nextByte();
        if (select == 1) {
            System.out.println("Pilihan anda : "+select);
            System.out.print("Masukkan nilai panjang : ");
            a = input.nextShort();
            System.out.print("Masukkan nilai lebar : ");
            b = input.nextShort();
            input.close();
            luaspersegi = a*b;
            kelpersegi = (2*a)+(2*b);
            System.out.println("Keliling persegi : " + kelpersegi);
            System.out.println("Luas persegi : " + luaspersegi);
        }
        else if (select == 2) {
            System.out.println("Pilihan anda : "+select);
            System.out.print("Masukkan nilai jari-jari : ");
            float r = input.nextFloat();
            input.close();
            float pi = (float) 3.14;
            luaslingkaran = pi*(r*r);
            kellingkaran = 2*pi*r;
            System.out.println("Keliling lingkaran : "+kellingkaran);
            System.out.println("Luas lingkaran : "+luaslingkaran);
        }
        else if (select == 3) {
            System.out.println("Pilihanmu : " + select);
            System.out.println("1. Keliling Segitiga");
            System.out.println("2. Luas Segitiga");
            System.out.print("Pilih salah satu dari menu (1, atau 2) : ");
            byte triselect = input.nextByte();
            if (triselect == 1) {
                System.out.println("Pilihanmu : " + triselect);
                System.out.print("Masukkan nilai sisi A : ");
                a = input.nextShort();
                System.out.print("Masukkan nilai sisi B : ");
                b = input.nextShort();
                System.out.print("Masukkan nilai sisi C : ");
                c = input.nextShort();
                input.close();
                kelsegitiga = a + b + c;
                System.out.println("Keliling segitiga : "+kelsegitiga);
            }
            else if (triselect == 2) {
                System.out.println("Pilihanmu : "+triselect);
                System.out.print("Masukkan nilai alas : ");
                a = input.nextShort();
                System.out.print("Masukkan nilai tinggi : ");
                b = input.nextShort();
                input.close();
                luassegitiga = (float) (0.5*a*b);
                System.out.println("Luas segitiga : "+luassegitiga);
            }
            else {
                System.out.println("Data tak ditemukan, program dihentikan ...");
            }
        }
        else {
            System.out.println("Data tak ditemukan, program dihentikan ...");
        }
    }
}