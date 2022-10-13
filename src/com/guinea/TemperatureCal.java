package com.guinea;

import java.util.Scanner;

public class TemperatureCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        short cel;
		float r,f,k;
		
		System.out.print("insert temperature in celcius : ");
		cel=input.nextShort();
        input.close();
		
		r= 4 * cel / 5;
		f= (cel * 9 / 5) + 32;
		k= cel + 273;
		
		System.out.printf("%s%d%s\n","Celcius = ",cel," C");
		System.out.printf("%s%.2f%s\n","Reamur = ",r," C");
		System.out.printf("%s%.2f%s\n","Fahrenheit = ",f," C");
		System.out.printf("%s%.2f%s\n","Kelvin = ",k," C");
    }
}