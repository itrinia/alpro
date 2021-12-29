
import java.util.Random;
import java.util.Scanner;

public class tebakhewan {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String jawaban = "sapi";
        int guessCount = 0;
        int guessLimit = 2;
        boolean tebakan = true;

        System.out.println("Aku adalah hewan berkaki 4.\n"
                + "Aku memiliki warna hitam putih.\n"
                + "Aku biasanya menghasilkan susu.\n"
                + "Siapakah aku? ");
        System.out.print("jawab: ");
        String guess=scan.nextLine();
        
        while ((!(guess.equalsIgnoreCase(jawaban))) && (tebakan)) {
            if (guessCount < guessLimit) {
                System.out.println("Jawaban anda salah. Silakan tebak lagi.");
                System.out.print("jawab: ");
                guess = scan.nextLine();
                guessCount++;
            } else {
                tebakan = false;                  //fungsinya biar kalo pas dia udah nebak 3x, bisa lnjut ke if else yg di bwh ini
            }
        }
        if (tebakan) {
            System.out.println("Jawaban anda benar.");
        } else {
            System.out.println("Jawaban anda salah. Anda kehabisan kesempatan menebak.");
        }
    }

}
