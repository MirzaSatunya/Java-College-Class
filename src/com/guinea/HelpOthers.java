package com.guinea;

import java.util.Scanner;

public class HelpOthers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tanggal : ");
        String userInput = input.nextLine();
        input.close();
        System.out.println("Tanggal " + userInput.charAt(0) + userInput.charAt(1) + " Bulan " + userInput.charAt(3) + userInput.charAt(4) + " Tahun " + userInput.charAt(6) + userInput.charAt(7) + userInput.charAt(8) + userInput.charAt(9));
    }
}
