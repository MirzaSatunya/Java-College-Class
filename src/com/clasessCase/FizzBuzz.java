package com.clasessCase;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number : ");
        int userInput = sc.nextInt();
        sc.close();

        if (userInput % 3 == 0 && userInput % 5 == 0) {
            System.out.println("FizzBuzz!");
        }
        else if (userInput % 5 == 0) {
            System.out.println("Buzz!");
        }
        else if (userInput % 3 == 0) {
            System.out.println("Fizz!");
        }
        else {
            System.out.println(userInput);
        }
    }
}
