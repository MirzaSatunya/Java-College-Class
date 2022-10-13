package com.clasessCase;

import java.util.Scanner;

public class ArrayClock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String userInput = sc.nextLine();
        sc.close();

        String hour = userInput.substring(0,1);
        int timeHour = Integer.parseInt(hour);
        
        System.out.println(timeHour % 12 + 
        userInput.substring(2,7) + (timeHour % 12 >= 1 ? " PM" : " AM"));
    }
}
