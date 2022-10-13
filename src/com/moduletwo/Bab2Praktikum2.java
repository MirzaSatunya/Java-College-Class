package com.moduletwo;

import java.util.Scanner;

public class Bab2Praktikum2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nBerat Badan (kg)   : ");
        int inputBB = input.nextInt();
        System.out.print("Tinggi Badan (m)   : ");
        float inputTinggi = input.nextFloat();
        input.close();
        float IMT = inputBB / (inputTinggi*inputTinggi);
        System.out.printf("%s%3c% .2f","IMT",'=',IMT);
        if (IMT <= 18.5) {
            System.out.println(" Termasuk Kurus");
        }
        else if (IMT > 18.5 && IMT <= 25) {
            System.out.println(" Termasuk Normal");
        }
        else if (IMT > 25 && IMT <= 30) {
            System.out.println(" Termasuk Gemuk");
        }
        else if (IMT > 30 && IMT <= 185.54) {
            System.out.println(" Termasuk Kegemukan");
        }
        else {
            System.out.println(" New World Record!");
        }
        System.out.println();
    }
}
