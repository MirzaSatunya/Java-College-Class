package com.guinea;

import java.util.Scanner;

public class StarPrint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte userInput = input.nextByte();
        input.close();
        System.out.println(userInput);
    }
}
