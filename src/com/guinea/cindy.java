package com.guinea;
import java.util.Scanner;
public class cindy {

        private static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {
            double tugas, quiz, absen, uTS, uAS, nA;

            System.out.println("Menghitung nilai akhir");
            System.out.println("Masukkan Nilai Tugas");
            tugas = input.nextDouble();
            System.out.println("Masukkan Nilai Quiz");
            quiz = input.nextDouble();
            System.out.println("asukkan Nilai UTS");
            uTS = input.nextDouble();
            System.out.println("Berapa Nilai UAS");
            uAS = input.nextDouble();
            System.out.println("Masukkan Nilai Absen");
            absen = input.nextDouble();
            nA = 0.1 * tugas + 0.2 * quiz + 0.3 * uTS + 0.3 * uAS + 0.1 * absen;
            System.out.println("Nilai Akhir (NA) adalah " + nA);


        }
        

}




