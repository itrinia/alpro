
import java.util.Random;
import java.util.Scanner;

class Main {

    static Random acak = new Random();
    static int angka = acak.nextInt(10) + 1;
    static int tebak = 0;

    public static void main(String[] args) {
        Scanner player = new Scanner(System.in);
        //System.out.println("angka random itu adalah: " + String.valueOf(angka));   -- ini cuma buat munculin angka randomnya brp--
        while (tebak != angka) {
            System.out.print("Silakan tebak angka antara 1 sampai 10: ");
            tebak = player.nextInt();
            if (tebak < angka) {
                System.out.println("Angka terlalu kecil. Silakan tebak lagi.\n");
            } else if (tebak > angka) {
                System.out.println("Angka terlalu besar. Silakan tebak lagi.\n");
            } else {
                System.out.println("Jawaban anda benar!");
                System.exit(0);
            }
        }
    }
}
