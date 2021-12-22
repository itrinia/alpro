
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
            System.out.print("[ketik 'SH03' atau 'CS10']: ");
            ruang = scan.nextLine();
            if (ruang.equalsIgnoreCase("SH03")) {
                sh03();
            } else if (ruang.equalsIgnoreCase("CS10")) {
                cs10();
            } else {
                System.out.println("\t!!! Inputan anda tidak valid. silakan input ulang !!!\n");              //looping e ga brenti smpe loop trakhir
            }
        } while (ruang != "SH03" || ruang != "CS10");
    }

    public void sh03() {
        String box;
        System.out.println("\nDi ruang itu, kamu melihat box hitam.");
        do {
            System.out.print("[ketik 'buka' atau 'biarkan']: ");
            box = scan.nextLine();
            if (box.equalsIgnoreCase("buka")) {
                System.out.println("\nKetika kamu membukanya, kamu menemukan tulisan 'HAPPY'");
                System.out.println("Di kertas betuliskan HAPPY tersebut, terdapat 2 sisi.\n"
                        + "Apa yang akan kamu lakukan?");

                String kertas;
                do {
                    System.out.print("[ketik 'bakar' untuk membakar kertasnya ATAU ketik 'balik' untuk membalik sisi kertas tersebut]: ");
                    kertas = scan.nextLine();
                    if (kertas.equalsIgnoreCase("bakar")) {
                        System.out.println("\nKamu membakar kertas itu dan kertas tersebut memunculkan tulisan misterius.");
                        System.out.println("Tulisan misterius itu bertuliskan:\n\n"
                                + "======YOU ARE GOING TO THE END OF THE BEGINNING=====\n"
                                + "Pilihanmu saat ini menentukan masa depanmu, tentukan sekarang.\n"
                                + "1. Mengerjakan kuis matematika\n"
                                + "2. Mengerjakan kuis logika\n\n");

                        String misterius;
                        do {
                            System.out.print("Apa yang akan kamu pilih? (ketik '1' atau '2': ");
                            misterius = scan.nextLine();
                            if (misterius.equalsIgnoreCase("1")) {
                                System.out.println("Pilihanmu adalah kuis matematika.\n"
                                        + "Aku adalah satu-satunya bilangan genap prima.\n"
                                        + "Siapakah aku?");
                                System.out.print("jawaban: ");
                                String kuismat = scan.nextLine();
                                do {
                                    if (kuismat.equalsIgnoreCase("2")) {
                                        System.out.println("Jawaban tepat. Silakan lanjut ke babak selanjutnya.");
                                        System.out.println("\n Kamu telah berhasil lolos dari babak awal.\n"
                                                + "Inilah saatnya kamu harus mengetahui kenyataan ini.\n"
                                                + "Di hadapanmu saat ini terdapat pintu dan jendela yang berwarna coklat.");
                                        System.out.print("Pilih 'pintu' atau 'jendela': ");
                                        String pintujendela = scan.nextLine();
                                        do {
                                            if (pintujendela.equalsIgnoreCase("pintu")) {
                                                
                                            } else if (pintujendela.equalsIgnoreCase("jendela")) {

                                            } else {
                                                System.out.println("[PERINTAH: Tolong input sesuai yang diminta.]");
                                            }
                                        } while (pintujendela != "pintu" || pintujendela != "jendela");

                                    } else {
                                        System.out.println("Jawaban salah. Silakan coba jawab lagi.");
                                    }
                                } while (kuismat != "2");

                            } else if (misterius.equalsIgnoreCase("2")) {
                                System.out.println("Pilihanmu adalah kuis logika.\n"
                                        + "Jika ");
                                System.out.print("jawaban: ");
                                
                            } else {
                                System.out.println("[PERINTAH: Tolong input sesuai yang diminta.]");
                            }
                        } while (misterius != "1" || misterius != "2");

                    } else if (kertas.equalsIgnoreCase("balik")) {
                        System.out.println("Kamu membalik kertas tersebut dan menemukan sebuah perintah.");
                    } else {
                        System.out.println("[PERINTAH: Tolong input sesuai yang diminta.]");
                    }

                } while (kertas != "bakar" || kertas != "balik");

            } else if (box.equalsIgnoreCase("biarkan")) {
                System.out.println("\nBox hitam itu kamu biarkan saja. \n"
                        + "Kamu berjalan lagi dan menemukan box biru.");

            } else {
                System.out.println("[PERINTAH: Tolong input sesuai yang diminta.]");
            }
        } while (box != "buka" || box != "biarkan");
    }

    public void cs10() {

    }

    public static void main(String[] args) {

    }

}
