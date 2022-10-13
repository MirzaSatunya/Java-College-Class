package com.guinea;
import java.util.Scanner;
public class NopalFix {
    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);

        System.out.print("Masukkan berat (kg): ");
        float b = angka.nextFloat();
        System.out.print("Masukkan tinggi (m): ");
        float t = angka.nextFloat();
        angka.close();
        float IMT = b/(t * t);
        System.out.println("IMT : " + IMT);
       
    if(IMT <= 18.5){
        System.out.println("Kurus ");
    }
    else if(IMT > 18.5 || IMT <= 25){
        System.out.println("Normal ");
    }
    else if(IMT > 25 || IMT <= 30){
        System.out.println("Gemuk ");
    }
    else {
        System.out.println("Kegemukan ");
            }  
        }
    }
