
import java.util.Arrays;
import java.util.InputMismatchException;
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
    static String[] papan;
    static String turn;
    static String garis = null;

    public storyline1() {
        System.out.println("\t\t=================================\n"
                + "\t\tWELCOME, AND LET THE STORY BEGIN\n"
                + "\t\t=================================\n");

        System.out.println("!!! Disclaimer:\n"
                + "Cerita ini hanya fiksi belaka,\n"
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
                System.out.println("\nKetika kamu membukanya, kamu menemukan tulisan 'BE HAPPY'");
                System.out.println("Di kertas betuliskan BE HAPPY tersebut, terdapat 2 sisi.\n"
                        + "Apa yang akan kamu lakukan?");

                String kertas;
                do {
                    System.out.print("[ketik 'bakar' untuk membakar kertasnya ATAU ketik 'balik' untuk membalik sisi kertas tersebut]: ");
                    kertas = scan.nextLine();
                    if (kertas.equalsIgnoreCase("bakar")) {
                        System.out.println("\nKamu membakar kertas itu. \n"
                                + "Abu kertas tersebut memunculkan tulisan misterius."
                                + "Tulisan misterius itu bertuliskan:\n\n"
                                + "======YOU ARE GOING TO THE END OF THE BEGINNING=====\n"
                                + "Pilihanmu saat ini menentukan masa depanmu, tentukan sekarang.\n"
                                + "1. Mengerjakan kuis matematika\n"
                                + "2. Mengerjakan kuis logika");

                        String misterius;
                        do {
                            System.out.print("Apa yang akan kamu pilih? [ketik '1' atau '2']: ");
                            misterius = scan.nextLine();
                            if (misterius.equalsIgnoreCase("1")) {
                                System.out.println("\n==Pilihanmu adalah kuis matematika.==\n"
                                        + "Aku adalah satu-satunya bilangan genap prima di dunia ini.\n"
                                        + "Siapakah aku? (jawaban berupa angka)");
                                System.out.print("jawaban: ");

                                String kuismat = scan.nextLine();
                                do {
                                    if (kuismat.equalsIgnoreCase("2")) {
                                        System.out.println("Jawaban anda tepat. Silakan lanjut ke babak selanjutnya.");
                                        System.out.println("\nKamu telah berhasil lolos dari babak awal.\n"
                                                + "Inilah saatnya kamu harus mengetahui kenyataan ini.\n"
                                                + "Di hadapanmu saat ini terdapat pintu dan jendela yang berwarna coklat.");
                                        System.out.print("Pilih 'pintu' atau 'jendela': ");
                                        String pintujendela = scan.nextLine();
                                        do {
                                            if (pintujendela.equalsIgnoreCase("pintu")) {
                                                System.out.println("\nKamu memilih pintu dan pintu itu terbuka secara otomatis.\n"
                                                        + "Pintu itu membawa kamu ke sebuah ruangan.\n"
                                                        + "Dalam ruangan itu, kamu melihat dimensi dunia yang berbeda dari dunia aslimu.\n"
                                                        + "Kamu melihat seseorang yang berwujud sama denganmu.\n"
                                                        + "Ia adalah kamu di masa depan.\n"
                                                        + "Ia berkata 'Lakukan apa yang ingin kamu lakukan, jangan pernah takut."
                                                        + "Kegagalanmu akan membawamu pada kesuksesan.\n"
                                                        + "Teruslah belajar dan pantanglah menyerah.'\n");
                                                System.out.println("Lalu kamu menjawabnya 'Bagaimana bisa?'\n");
                                                System.out.println("Ia menjawab 'Pilihan yang kamu pilih sejak tadi merupakan jawaban dari pertanyaanmu.\n"
                                                        + "SH03 merupakan kode penanda yang berarti Semua jawaban atas pertanyaan-pertanyaanmu akan Hadir dalam 3 tahun ke depan.\n"
                                                        + "Kemudian ketika kamu memutuskan untuk membuka box hitam dan ada kertas yang betuliskan 'BE HAPPY',\n"
                                                        + "itu berarti dalam 3 tahun ke depan, aku harap kamu akan tetap bahagia apapun situasi dan kondisinya.\n"
                                                        + "Lalu ketika kamu memutuskan untuk membakar kertasnya dan muncul kuis matematika,\n"
                                                        + "itu menandakan bahwa kamu satu-satunya yang berharga bagi dirimu,\n"
                                                        + "sama seperti angka 2 yang merupakan satu-satunya bilangan genap prima.\n"
                                                        + "Setelah berhasil melewati beberapa babak, kamu menemukan pintu terakhir dalam tempat ini.\n"
                                                        + "Disinilah kamu menemukan dirimu. Aku adalah kamu di 3 tahun kemudian.\n"
                                                        + "Aku disini hanya ingin membuktikan bahwa dirimu sekarang akan bisa bertahan di masa depan.\n\n"
                                                        + "==DO WHATEVER YOU WANT TO DO AND ALWAYS BE HAPPY.=='\n");

                                                System.out.println("Inilah awal dari akhir dalam cerita kehidupanmu, Sally Chou.\n"
                                                        + "\t\t==========================\n"
                                                        + "\t\t\tTHE END\n"
                                                        + "\t\t==========================");
                                                System.exit(0);

                                            } else if (pintujendela.equalsIgnoreCase("jendela")) {
                                                System.out.println("\nKamu memilih jendela dan korden pada jendela itu terbuka secara otomatis.\n"
                                                        + "Jendela itu memiliki pemandangan yang sangat bagus.\n"
                                                        + "Pemandangan itu menunjukkan langit malam hari yang sangat cantik.\n"
                                                        + "Terdapat 1 pohon besar yang dapat terlihat melalui jendela tersebut.\n"
                                                        + "Di bawah pohon tersebut, terdapat 1 orang anak laki-laki dan kakeknya yang sedang duduk bersantai.\n"
                                                        + "Dari jendela ini, kamu bisa mendengar percakapan yang anak laki-laki dan kakeknya ini bincangkan.\n");

                                                System.out.println("Anak itu bertanya pada kakeknya, 'Kakek, mengapa waktu tidak pernah berhenti?'\n"
                                                        + "Lalu kakeknya menjawab 'Waktu akan terus berjalan dan tidak akan berhenti.\n"
                                                        + "Kamu mungkin akan membutuhkan istirahat untuk berhenti sejenak dari aktifitasmu,\n"
                                                        + "tapi waktu akan membantumu bersama dalam segala aktifitasmu.\n"
                                                        + "Cahaya matahari tenggelam sore hari memang cantik. Namun matahari itu tidak akan bertahan selamanya.\n"
                                                        + "Setelah ia tenggelam, malam akan tiba. Kegelapan akan muncul.\n"
                                                        + "Langit akan berubah menjadi hitam seperti saat ini. Memang terlihat menyeramkan,\n"
                                                        + "tetapi di langit hitam inilah kita bisa melihat sinar bulan yang sangat cantik dan bintang yang bersinar terang.\n"
                                                        + "Lihatlah satu bintang kecil di langit itu,' ucap kakek itu sambil menunjuk bintang di langit.\n\n"
                                                        + "'Kakek harap kamu bisa menjadi seperti bintang kecil itu.\n"
                                                        + "Tetap bersinar walaupun gelapnya malam datang,' lanjut kakeknya.\n\n"
                                                        + ""
                                                        + "==TO BE A STAR, YOU MUST SHINE YOUR OWN LIGHT, FOLLOW YOUR PATH,\n"
                                                        + "AND DON'T WORRY ABOUT THE DARKNESS, FOR THAT IS WHEN THE STARS SHINE BRIGHTEST.==\n"
                                                        + "-Ralph Waldo Emerson");

                                                System.out.println("\nInilah awal dari akhir dalam cerita kehidupanmu, Sally Chou.\n"
                                                        + "\t\t==========================\n"
                                                        + "\t\t\tTHE END\n"
                                                        + "\t\t==========================");
                                                System.exit(0);

                                            } else {
                                                System.out.println("[PERINTAH: Tolong input sesuai yang diminta.]");
                                            }
                                        } while (pintujendela != "pintu" || pintujendela != "jendela");

                                    } else {
                                        System.out.println("Jawaban anda salah. Silakan coba jawab lagi.");
                                    }
                                } while (kuismat != "2");

                            } else if (misterius.equalsIgnoreCase("2")) {
                                System.out.println("==Pilihanmu adalah kuis logika.==\n"
                                        + "Aku adalah milikmu, tapi orang lain lebih sering menggunakan aku daripada dirimu sendiri.\n"
                                        + "Apakah aku? ");
                                System.out.print("jawaban: ");
                                String kuislogika = scan.nextLine();
                                do {
                                    if (kuislogika.equalsIgnoreCase("nama")) {
                                        System.out.println("Jawaban anda tepat. Silakan lanjut ke babak selanjutnya.");
                                        System.out.println("\n Kamu telah berhasil lolos dari babak awal.\n"
                                                + "Kamu menemukan sekantong fortune cookies dan sekantong permen");
                                        System.out.print("Pilih 'fortune' atau 'permen': ");
                                        String kantong = scan.nextLine();
                                        do {
                                            if (kantong.equalsIgnoreCase("fortune")) {
                                                System.out.println("Kamu memilih fortune cookies.\n"
                                                        + "Fortune cookies merupakan suatu kue keberuntungan yang memiliki berbagai macam kalimat positif di dalamnya.\n"
                                                        + "Silakan coba makan satu, dan kamu akan menemukan kalimat yang cocok dengan situasimu saat ini.\n"
                                                        + "Di saat memakannya, aku harap kamu bisa menikmati cookies ini dan tetap berpikir positif ke depannya.\n"
                                                        + "Hidup tidak hanya berhenti pada kenyataan yang kamu lalui, melainkan ekspektasimulah yang membuat kenyataan ini berubah.\n\n"
                                                        + "==LIFE IS NOT A PROBLEM TO BE SOLVED. BUT RATHER A MYSTERY TO BE LIVED.==");

                                                System.out.println("\nInilah awal dari akhir dalam cerita kehidupanmu, Sally Chou.\n"
                                                        + "\t\t==========================\n"
                                                        + "\t\t\tTHE END\n"
                                                        + "\t\t==========================");
                                                System.exit(0);

                                            } else if (kantong.equalsIgnoreCase("permen")) {
                                                System.out.println("Kamu memilih sekantong permen.\n"
                                                        + "Manis. Itulah yang terlintas dalam benak sebagian orang ketika mendengar kata permen.\n"
                                                        + "Aku harap kamu akan selalu merasakan manisnya hidup dalam segala pahitnya perjuangan yang telah kamu lalui.\n"
                                                        + "Kamu telah mengambil jalan yang benar, kamu tidak salah.\n"
                                                        + "Lanjutkan dan jangan pernah menyesali masa lalu yang ada, karena masa lalumu membentukmu saat ini.\n\n"
                                                        + "==LIFE IS SHORT, SO MAKE IT SWEET==");

                                                System.out.println("\nInilah awal dari akhir dalam cerita kehidupanmu, Sally Chou.\n"
                                                        + "\t\t==========================\n"
                                                        + "\t\t\tTHE END\n"
                                                        + "\t\t==========================");
                                                System.exit(0);

                                            } else {
                                                System.out.println("[PERINTAH: Tolong input sesuai yang diminta.]");
                                            }
                                        } while (kantong != "fortune" || kantong != "permen");

                                    } else {
                                        System.out.println("Jawaban anda salah. Silakan coba jawab lagi.");
                                    }
                                } while (kuislogika != "nama");

                            } else {
                                System.out.println("[PERINTAH: Tolong input sesuai yang diminta.]");
                            }
                        } while (misterius != "1" || misterius != "2");

                    } else if (kertas.equalsIgnoreCase("balik")) {
                        System.out.println("\nKamu membalik kertas tersebut dan menemukan sebuah perintah.\n"
                                + "Perintah pertama menginstruksikan kamu untuk bermain tik tak toe.\n"
                                + "(permainan ini dimainkan oleh 2 orang).");
                        tiktaktu();
                        System.out.println("\nTerima kasih telah bermain tik tak toe.\n"
                                + "Kamu melakukan yang terbaik dari yang terbaik.\n"
                                + "Semoga keberanianmu ini akan awet di kehidupan nyatamu.\n\n"
                                + "==LIFE IS LIKE A TIC TAC TOE GAME. THINK. PLAN. MAKE YOUR MOVE==");

                        System.out.println("\n\t\t==========================\n"
                                + "\t\t\tTHE END\n"
                                + "\t\t==========================");
                        System.exit(0);

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

    public void tiktaktu() {
        Scanner in = new Scanner(System.in);

        papan = new String[9];
        turn = "X";
        String winner = null;
        for (int a = 0; a < 9; a++) {
            papan[a] = String.valueOf(a + 1);
        }

        System.out.println("\n==WELCOME TO 3X3 TIC TAC TOE==");
        printpapan();                                       //manggil papan di function bawah

        System.out.print(
                "X akan bermain dahulu. Masukkan angka untuk X: ");

        while (winner == null) {
            int nmrinput = in.nextInt();
            try {
                if (!(nmrinput > 0 && nmrinput <= 9)) {
                    System.out.print(
                            "Error (angka tidak terdeteksi); masukkan angka baru: ");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.print(
                        "Error (angka tidak terdeteksi); masukkan angka baru: ");
                continue;
            }

            if (papan[nmrinput - 1].equals(
                    String.valueOf(nmrinput))) {
                papan[nmrinput - 1] = turn;

                if (turn.equals("X")) {
                    turn = "O";
                } else {
                    turn = "X";
                }
                printpapan();
                winner = cek();
            } else {
                System.out.print(
                        "Slot telah terpenuhi. Silakan masukkan angka baru: ");
            }
        }

        //kasus: klo hasil seri
        if (winner.equalsIgnoreCase("draw")) {
            System.out.println(
                    "It's a draw. Hasilnya seri.");
        } //klo menang
        else {
            System.out.println(
                    "Congratulations! Pemenangnya adalah " + winner);
        }
    }

    static String cek() {

        for (int a = 0; a < 8; a++) {
            if (a == 0) {
                garis = papan[0] + papan[1] + papan[2];
            } else if (a == 1) {
                garis = papan[3] + papan[4] + papan[5];
            } else if (a == 2) {
                garis = papan[6] + papan[7] + papan[8];
            } else if (a == 3) {
                garis = papan[0] + papan[3] + papan[6];
            } else if (a == 4) {
                garis = papan[1] + papan[4] + papan[7];
            } else if (a == 5) {
                garis = papan[2] + papan[5] + papan[8];
            } else if (a == 6) {
                garis = papan[0] + papan[4] + papan[8];
            } else if (a == 7) {
                garis = papan[2] + papan[4] + papan[6];
            }

            //cek menang
            //x menang
            if (garis.equals("XXX")) {
                return "X";
            } // o menang
            else if (garis.equals("OOO")) {
                return "O";
            }
        }

        for (int i = 0; i < 9; i++) {
            if (Arrays.asList(papan).contains(
                    String.valueOf(i + 1))) {
                break;
            } else if (i == 8) {
                return "draw";
            }
        }

        System.out.print(turn + "'s turn; enter a slot number to place " + turn + " in: ");
        return null;
    }

    //bikin papan nya
    static void printpapan() {
        System.out.println("|---|---|---|");
        System.out.println("| " + papan[0] + " | " + papan[1] + " | " + papan[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + papan[3] + " | " + papan[4] + " | " + papan[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + papan[6] + " | " + papan[7] + " | " + papan[8] + " |");
        System.out.println("|---|---|---|");
    }

    public static void main(String[] args) {
        new storyline1();
    }
}
