
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
public class storyline1 {

    static Scanner scan = new Scanner(System.in);
    static storyline1 story = new storyline1();

    public storyline1() {
        System.out.println("\t\t===============================\n"
                + "\t\tWELCOME AND LET THE STORY BEGIN\n"
                + "\t\t===============================\n");

        System.out.println("!!! Disclaimer: Cerita ini hanya fiksi belaka,\n"
                + "tidak ada maksud terselubung dari cerita ini,\n"
                + "dan mohon maaf apabila ada kesamaan nama/tempat kejadian perkara\n"
                + "karena ini disetting sedemikian rupa agar menjadi cerita fiksi.\n\n");

        System.out.println("! POINT OF VIEW: reader as Sally Chou.\n");

        System.out.println("Pada suatu hari libur, ada anak cantik bernama Sally Chou.\n"
                + "Ia tertidur pulas.\n"
                + "Dalam mimpinya, ia bermimpi pergi ke suatu tempat luas.\n"
                + "Tempat itu sangat gelap, namun ia menemukan dua ruangan.");

        String ruang;
        do {
            System.out.println("Ruangan pertama bertuliskan 'SH03'."
                    + "\nRuangan kedua bertuliskan 'CS10'."
                    + "\nApakah kamu mau pergi ke ruang pertama atau kedua?");
            System.out.print("ketik 'SH03' atau 'CS10': ");
            ruang = scan.nextLine();
            if (ruang.equalsIgnoreCase("SH03")) {
                sh03();
            } else if (ruang.equalsIgnoreCase("CS10")) {
                cs10();
            } else {
                System.out.println("inputan anda tidak valid. silakan input ulang\n");              //masih ngeloop mulu klo inputan udah bner
            }
        } while (ruang != "SH03" || ruang != "CS10");
    }

    public void sh03() {
        String box;
        System.out.println("\nkamu melihat box hitam.");
        do {
            System.out.print("ketik 'buka' atau 'biarkan': ");
            box = scan.nextLine();
            if (box.equalsIgnoreCase("buka")) {
                System.out.println("\nkamu menemukan tulisan 'happy'");
            } else if (box.equalsIgnoreCase("biarkan")) {
                System.out.println("\nkamu berjalan lagi dan menemukan box biru.");
            } else {
                System.out.println("tolong input sesuai yang diminta.");
            }
        } while (box != "buka" || box != "biarkan");
    }

    public void cs10() {

    }

    public static void main(String[] args) {

    }

}
