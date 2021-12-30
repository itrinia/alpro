
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
public class tambah2an {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1, number2;
        int[] jawaban = new int[3];
        number1 = (int) (Math.random() * 20);
        number2 = (int) (Math.random() * 20);
        int number3 = (int) (Math.random() * 20);
        int number4 = (int) (Math.random() * 20);
        int number5 = (int) (Math.random() * 20);
        int number6 = (int) (Math.random() * 20);
        System.out.println("Welcome to 'THE MATH'  \n"
                + "How to play : Kita akan mengacak angka dari 1-100 , kita akan memberi 2 angka ,\n"
                + "dan tujuan kamu adalah untuk menambah kedua angka , gampang kan? Yok kita mulai ");
        System.out.print("First Question : " + number1 + " + " + number2 + " = ");
        jawaban[0] = scan.nextInt();
        if (jawaban[0] == (number1 + number2)) {
            System.out.println("Kamu benar 😄 , LANJUT!!!\n");
        } else {
            System.out.println("Yahh kamu salah 😦 gapapa tetap semangat , yok lanjut ke pertanyaan selanjutnya\n");
        }
        System.out.print("Second Question : " + number3 + " + " + number4 + " = ");
        jawaban[1] = scan.nextInt();
        if (jawaban[1] == (number3 + number4)) {
            System.out.println("Kamu benar 😄 , LANJUT!!!\n");
        } else {
            System.out.println("Yahh kamu salah 😦 gapapa tetap semangat , yok lanjut ke pertanyaan selanjutnya\n");
        }
        System.out.print("Third Question : " + number5 + " + " + number6 + " = ");
        jawaban[2] = scan.nextInt();
        if (jawaban[2] == (number5 + number6)) {
            System.out.println("Kamu benar 😄 \n\n"
                    + "\t\tCONGRATULATION ON COMPLETING 'THE MATH'\n"
                    + "\t\t\tThankyou for playing!!!");
        } else {
            System.out.println("Yahh kamu salah 😦 gapapa tetap semangat, this is just for fun 😄\n\n"
                    + "\t\tCONGRATULATION ON COMPLETING 'THE MATH'\n"
                    + "\t\t\tThankyou for playing!!!");
        }
    }
}

