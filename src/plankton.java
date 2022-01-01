
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ileene
 */
public class plankton {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int Plankton = 100, hp = 60, energy = 20;
        int ultimate;
        int pilih;
        String pilihan = null;
        do {
            System.out.println("\n\nAh, the sea. So fascinating, so wonderful. Here, we see Bikini Bottom, teaming with life. \n"
                    + "Home of one of my favorite creatures: Spongebob Squarepants. Yes, of course he lives in a pineapple, you silly.\n"
                    + "And there we see patrick the star,, but ofcourse he lives under a rock.\n"
                    + "ahh i see here we have spongebob's heading to work.\n"
                    + "\n\t\t\tOH NO ITS PLANKTON!! \n\n"
                    + "QUICK!! DEFEND THE KRUSTY CRAB!!!");
            do {
                System.out.println("\nYour Turn\n"
                        + "===============\n"
                        + "Enemy: Plankton\n"
                        + "Plankton's Health: " + Plankton);
                System.out.println("===============\n"
                        + "Your Health : " + hp);
                System.out.println("Your Energy : " + energy);
                System.out.println("1. Throw a Krabby Patty (Consume 0 Energy)\n"
                        + "2. Throw Patrick (Consume 5 Energy)\n"
                        + "3. Ultimate 'Spongebob's Laugh of death ' (Consume 20 Energy)\n"
                        + "4. Recharge 'Eat a Krabby Patty' (+5 Energy)");
                System.out.print("Type your decision [type '1' or '2' or '3' or '4']: ");
                pilih = scan.nextInt();

                if (pilih == 1) {
                    Plankton -= 10;
                    hp -= 10;
                    System.out.println("\n\nPlankton's Turn\nSwoosh!!!\n");

                } else if (pilih == 2) {
                    if (energy >= 5) {
                        energy -= 5;
                        Plankton -= 20;
                        System.out.println("\nThrow Patrick , \nYEEET!!");
                        hp -= 10;
                        System.out.println("\n\nPlankton's Turn\nSwoosh!!!\n");
                    } else {
                        System.out.println("\nNot Enough Energy!!");
                    }

                } else if (pilih == 3) {
                    if (energy == 20) {
                        energy -= 20;
                        Plankton -= 40;
                        System.out.println("\nUltimate!!\n"
                                + "!!!TAHIAHIAHIAHIAHAHAHAHA!!!\n"
                                + "                 ===Enter Special Zone===\n"
                                + "Plankton's Turn\nSwoosh!!!");
                        int chance = 2;
                        do {
                            System.out.println("\nYour Turn\n"
                                    + "===============\n"
                                    + "Enemy : Plankton\n"
                                    + "Plankton's Health = " + Plankton);
                            System.out.println("Your Health = " + hp);
                            System.out.println("Your Energy = " + energy);
                            System.out.println("1. Throw a Krabby Patty (Consume 0 Mana)\n"
                                    + "2. Eat A Krabby Patty (+5 Mana)");
                            System.out.print("Action : ");
                            ultimate = scan.nextInt();

                            if (ultimate == 1) {
                                Plankton -= 20;
                                hp -= 10;
                                System.out.println("\nThrow Patrick , \nYEEET!!");
                                System.out.println("\nPlankton's Turn\nSwoosh!!!\n");
                                chance = 1;

                            } else if (ultimate == 2) {
                                hp -= 10;
                                energy += 5;
                                chance -= 1;

                            } else {
                                System.out.println("Please input a valid number.");
                            }
                        } while (chance > 0);

                    } else {
                        System.out.println("\nNot Enough Energy");
                        hp -= 10;
                        System.out.println("\nPlankton's Turn\nSwoosh!!!\n");
                    }

                } else if (pilih == 4) {
                    if (energy < 20) {
                        energy += 5;
                        if (energy >= 20) {
                            energy = 20;
                        }
                    }
                    if (energy >= 20) {
                        energy = 20;
                        System.out.println("\nFULL OF ENERGY, LET'S GOO!!!");
                    }
                    System.out.println("\nPlankton's Turn\nSwoosh!!!\n");
                    hp -= 10;

                } else {
                    System.out.println("Please input a valid number.\n");
                }
            } while (hp > 0 && Plankton > 0);

            //cek hp n plankton
            if (hp <= 0 && Plankton > 0) {
                System.out.println("\tNOOO PLANKTON HAS WON!!!\n"
                        + "\tBetter Luck Next Time Champ!!");
                System.out.print("Want to Retry?? [yes/no]: ");
                pilihan = scan.next();
            } else if (hp > 0 && Plankton <= 0) {
                System.out.println("YOU DEFEATED PLANKTON AND SAVED THE KRUSTY KRAB GOODJOB!!!\n"
                        + "          \n               Thanks For Playing!!          ");

            } else if (hp <= 0 && Plankton <= 0) {
                System.out.println("YOU BOTH FEEL EXHAUSTED AND END THE FIGHT WITH A DRAW!\n"
                        + "\n              Better luck Next time, Thanks for playing          ");
            }

        } while (pilihan.equalsIgnoreCase("yes"));
    }
}
