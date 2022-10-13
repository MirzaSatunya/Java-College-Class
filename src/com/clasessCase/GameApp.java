package com.clasessCase;

import java.util.Scanner;

public class GameApp {
    public static void main(String[] args) {
        final short HERO_ATTACK = 200;
        final short ENEMY_ATTACK = 350;
        final short ENEMY_ULTIMATE = 500;
        final short HEAL = 400;
        
        short hpHero = 1000;
        short hpEnemy = 1500;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnemy Muncul!\nHero Muncul!");
        
        int whoFirst = ((int)(Math.random() * 10)) + 1;

        for (byte nol = 0; nol <= hpHero && nol <= hpEnemy; whoFirst++) {
            System.out.println("--------------");
            System.out.printf("%-9s%c%d\n","HP Hero",':',hpHero);
            System.out.printf("%-9s%c%d\n","HP Enemy",':',hpEnemy);
            System.out.println("--------------\n");
            if (whoFirst >= 12) whoFirst -= 12;
            if (whoFirst % 2 == 0) {

                System.out.print("Pilih aksi : ");
                byte chooseAttack = sc.nextByte();

                switch(chooseAttack) {
                    case 1 : //Attack
                    System.out.println("Hero cast Attack!!");
                    hpEnemy -= HERO_ATTACK;
                    break;
                    case 2 : // Healing
                    System.out.println("Hero cast Heal!");
                    hpHero += HEAL;
                    break;
                    case 3 : //Escape
                    System.out.println("K-Kaburrr.....\n");
                    return;
                }
            }
            else if (whoFirst % 3 == 0) {
                System.out.println("Enemy cast Ultimate!!");
                hpHero -= ENEMY_ULTIMATE;
            }
            else {
                System.out.println("Enemy cast Attack!!");
                hpHero -= ENEMY_ATTACK;
            }
        }
        String winner = (hpHero <= 0) ? "Yahh Enemy Menang!\n" : "Horeee Hero Menangg!!\n";
        System.out.println(winner);
        sc.close();
    }

    public static int generateAttack(int baseAtk) {
        int random = ((int)(Math.random() * 40)) + baseAtk - 20;
        return random;
    }
}

