package com.clasessCase;

import java.util.Scanner;

public class GameApp2 {
  public static void main(String[] args) {
    int hpHero = 1000;
    int hpEnemy = 800;
    int atkHero = 100;
    int atkEnemy = 120;
    
    Scanner sc = new Scanner(System.in);
    
    int siapadulu = ((int)(Math.random() * 10)) + 1;

    System.out.println(siapadulu); // oke, siap

    do {

      if (siapadulu % 2 == 0) {
        // di sini kodenya Enemy
        // di sini Enemy nyerang
        System.out.println("Enemy cast magic! Whooozzhh!!!");
        // hpHero -= atkEnemy;
        // hpHero -= generateAttack(atkEnemy);
        int boostAtk = boost(atkEnemy);
        hpHero -= boostAtk;
        
        System.out.println("HP Hero: " + hpHero);
        System.out.println("----------------------------------");
        siapadulu++;
      } else {
        // di sini kodenya Hero
        System.out.println("Giliran Hero, mau ngapain?");
        System.out.println("(a)ttack!");
        System.out.println("(h)ealing...");
        System.out.println("(k)abur");
        System.out.print("Pilihan: ");
        char pilih = sc.next().charAt(0);
  
        switch(pilih) {
          case 'a': 
            hpEnemy -= atkHero;
            System.out.println("Hero nyerang! Chiiaaattt...");
            System.out.println("HP Hero: " + hpHero);
            System.out.println("HP Enemy: " + hpEnemy);
            break;
          case 'h': 
            hpHero += 300;
            if (hpHero > 1000) hpHero = 1000;
            System.out.println("Hero healing..., HP Hero: " + hpHero);
            break;
          case 'k': 
            System.out.println("Kabur dulu ahh...");
            // return;
            break; // keluar dari switch
        }

        if (pilih == 'k') break; // keluar dari loop.

        siapadulu--;
      }

    }  
    while (hpHero > 0 && hpEnemy > 0);
    
    sc.close();

    if (hpHero > 0 && hpEnemy > 0)
      System.out.println("Kabur nih yeee...");
    else if (hpHero > 0) System.out.println("Menanggg!!!!");
    else if (hpEnemy > 0) System.out.println("Game Over");
    
    
  }

  public static int generateAttack(int baseAtk) {
    int random = (int)(Math.random() * 40) + baseAtk - 20;
    return random;
  }

  public static int boost(int baseAtk) {
    return baseAtk * 2;
  }

}