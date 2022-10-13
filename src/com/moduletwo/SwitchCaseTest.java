package com.moduletwo;
import java.util.Scanner;
public class SwitchCaseTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userinput = input.nextLine();
        input.close();
        switch(userinput){
            case "one" :
            System.out.println("Pilihan diterima, jenis komunikasi anda : KonsChannel ");
            break;
            case "two" :
            System.out.println("Pilihan diterima, jenis komunikasi anda : TotsChanTOL ");
            break;
            default :
            System.out.println("Ketik one atau two cok");
        }
    }
}