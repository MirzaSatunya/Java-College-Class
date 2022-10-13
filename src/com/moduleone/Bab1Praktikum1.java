package com.moduleone;
import java.util.Scanner;

public class Bab1Praktikum1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first numbers: ");
        float one = input.nextFloat();
        System.out.print("Enter your second numbers: ");
        float two = input.nextFloat();
        input.close();
        float sum1 = one+two;
        float sum2 = one-two;
        float sum3 = one*two;
        float sum4 = one/two;
        System.out.println("==============================================");
        System.out.printf("%s%15c%5.2f\n","Addition number",':',sum1);
        System.out.printf("%s%12c%5.2f\n","Subtraction number",':',sum2);
        System.out.printf("%s%9c%5.2f\n","Multiplication number",':',sum3);
        System.out.printf("%s%15c%5.2f\n","Division number",':',sum4);
        System.out.println("==============================================");
    }
}