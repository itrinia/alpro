
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] papan = new String[9];
        String turn = "X";
        String garis = null;
        storyline2 obj = new storyline2();

        obj.storyline(in, turn, papan, obj, garis);
        obj.sh03(in, turn, papan, obj, garis);

    }

    public void storyline(Scanner in, String turn, String[] papan, storyline2 obj, String garis) {
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
                obj.sh03(in, turn, papan, obj, garis);
            } else if (ruang.equalsIgnoreCase("CS10")) {
                cs10();
            } else {
                System.out.println("\t!!! Inputan anda tidak valid. silakan input ulang !!!\n");              //looping e ga brenti smpe loop trakhir
            }
        } while ((!(ruang.equalsIgnoreCase("sh03"))) || (!(ruang.equalsIgnoreCase("cs10"))));
    }

    public void sh03(Scanner in, String turn, String[] papan, storyline2 obj, String garis) {
        String box;
        System.out.println("\nDi ruang itu, kamu melihat box hitam.\n"
                + "Apa yang akan kamu lakukan? Membukanya atau membiarkan kotak tersebut?");
        do {
            System.out.print("[ketik 'buka' atau 'biarkan']: ");
            box = scan.nextLine();
            if (box.equalsIgnoreCase("buka")) {
                System.out.println("\nKetika kamu membukanya, kamu menemukan tulisan 'BE HAPPY'");
                System.out.println("Di kertas betuliskan 'BE HAPPY' tersebut, terdapat 2 sisi.\n"
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

                                String kuismat;
                                do {
                                    System.out.print("jawaban: ");
                                    kuismat = scan.nextLine();
                                    if (kuismat.equalsIgnoreCase("2")) {
                                        System.out.println("Jawaban anda tepat. Silakan lanjut ke babak selanjutnya.");
                                        System.out.println("\nKamu telah berhasil lolos dari babak awal.\n"
                                                + "Inilah saatnya kamu harus mengetahui kenyataan ini.\n"
                                                + "Di hadapanmu saat ini terdapat pintu dan jendela yang berwarna coklat.");

                                        String pintujendela;
                                        do {
                                            System.out.print("Pilih 'pintu' atau 'jendela': ");
                                            pintujendela = scan.nextLine();
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
                                                        + "  AND DON'T WORRY ABOUT THE DARKNESS, FOR THAT IS WHEN THE STARS SHINE BRIGHTEST.==\n"
                                                        + "-Ralph Waldo Emerson");

                                                System.out.println("\nInilah awal dari akhir dalam cerita kehidupanmu, Sally Chou.\n"
                                                        + "\t\t==========================\n"
                                                        + "\t\t\tTHE END\n"
                                                        + "\t\t==========================");
                                                System.exit(0);

                                            } else {
                                                System.out.println("[PERINTAH: Tolong input sesuai yang diminta.]");
                                            }
                                        } while ((!(pintujendela.equalsIgnoreCase("pintu"))) || (!(pintujendela.equalsIgnoreCase("jendela"))));

                                    } else {
                                        System.out.println("Jawaban anda salah. Silakan coba jawab lagi.");
                                    }
                                } while ((!(kuismat.equalsIgnoreCase("2"))));

                            } else if (misterius.equalsIgnoreCase("2")) {
                                System.out.println("==Pilihanmu adalah kuis logika.==\n"
                                        + "Aku adalah milikmu, tapi orang lain lebih sering menggunakan aku daripada dirimu sendiri.\n"
                                        + "Apakah aku? ");

                                String kuislogika;
                                do {
                                    System.out.print("jawaban: ");
                                    kuislogika = scan.nextLine();
                                    if (kuislogika.equalsIgnoreCase("nama")) {
                                        System.out.println("Jawaban anda tepat. Silakan lanjut ke babak selanjutnya.");
                                        System.out.println("\nKamu telah berhasil lolos dari babak awal.\n"
                                                + "Kamu menemukan sekantong fortune cookies dan sekantong permen");

                                        String kantong;
                                        do {
                                            System.out.print("Pilih 'fortune' atau 'permen': ");
                                            kantong = scan.nextLine();
                                            if (kantong.equalsIgnoreCase("fortune")) {
                                                System.out.println("Kamu memilih fortune cookies.\n\n"
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
                                        } while ((!(kantong.equalsIgnoreCase("fortune"))) || (!(kantong.equalsIgnoreCase("permen"))));

                                    } else {
                                        System.out.println("Jawaban anda salah. Silakan coba jawab lagi.");
                                    }
                                } while ((!(kuislogika.equalsIgnoreCase("nama"))));

                            } else {
                                System.out.println("[PERINTAH: Tolong input sesuai yang diminta.]");
                            }
                        } while ((!(misterius.equalsIgnoreCase("1"))) || (!(misterius.equalsIgnoreCase("2"))));

                    } else if (kertas.equalsIgnoreCase("balik")) {
                        System.out.println("\nKamu membalik kertas tersebut dan menemukan sebuah perintah.\n"
                                + "Perintah pertama menginstruksikan kamu untuk bermain tik tak toe.\n"
                                + "(permainan ini dimainkan oleh 2 orang).");
                        obj.tiktaktu(in, turn, papan, obj, garis);
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

                } while ((!(kertas.equalsIgnoreCase("bakar"))) || (!(kertas.equalsIgnoreCase("bakar"))));

            } else if (box.equalsIgnoreCase("biarkan")) {
                System.out.println("\nBox hitam itu kamu biarkan saja. \n"
                        + "Kamu berjalan lagi dan menemukan box biru.\n"
                        + "Box itu berlabel ==HAPPY EVER AFTER==\n"
                        + "Apa yang akan kamu lakukan dengan label itu?");
                String label;
                do {
                    System.out.print("[ketik 'sobek' untuk menyobek labelnya ATAU ketik 'siram' untuk menyiram sisi label tersebut]: ");
                    label = scan.nextLine();
                    if (label.equalsIgnoreCase("sobek")) {
                        System.out.println("\nKamu memilih untuk menyobek label tersebut.\n"
                                + "Dibalik label itu ternyata memiliki kode khusus.\n"
                                + "Kode itu bertuliskan sebagai berikut.\n"
                                + ".... .- .--. .--. -.-- / . ...- . .-. / .- ..-. -");

                        String morse;
                        do {
                            System.out.print("Apakah arti dari kode itu? (CLUE = terdapat 3 kata): ");
                            morse = scan.nextLine();
                            if (morse.equalsIgnoreCase("happy ever after")) {
                                System.out.println("Selamat, anda telah berhasil menebak kata sandi tersebut.\n"
                                        + "Sekarang saatnya anda bermain dalam permainan yang sesungguhnya.\n\n"
                                        + "Di hadapan anda terdapat amplop berwarna putih dan hitam.");
                                System.out.print("Apa yang akan kamu pilih? [ketik 'putih' atau 'hitam']: ");

                                String amplop = scan.nextLine();
                                do {
                                    if (amplop.equalsIgnoreCase("putih")) {
                                        System.out.println("\nKamu memilih amplop yang tepat.\n"
                                                + "Ketika kamu membukanya, kamu mendapati sebuah kertas origami berwarna merah.\n"
                                                + "Di kertas origami tersebut terdapat tulisan:\n\n"
                                                + "'Hujan masih air, waktu akan tetap berjalan seperti air sungai yang deras.\n"
                                                + " Tak peduli seberapa jauh ujung sungai tersebut,\n"
                                                + " sejauh kamu bisa membayangkannya, itu berarti kamu bisa menggapainya.'\n\n"
                                                + "==IT'S NOT THE BEGINNING OF THE END, IT'S THE END OF THE BEGINNING==");

                                        System.out.println("\n\t\t==========================\n"
                                                + "\t\t\tTHE END\n"
                                                + "\t\t==========================");
                                        System.exit(0);

                                    } else if (amplop.equalsIgnoreCase("hitam")) {
                                        System.out.println("Kamu memilih amplop berwarna hitam.\n"
                                                + "Amplop ini tergolong sangat langka dikarenakan jarang orang menggunakannya.\n"
                                                + "Ketika kamu membuka amplop hitam ini, kamu mendapati sebuah kalung emas putih dengan liontin yang menggantung pada kalung itu.\n"
                                                + "Liontin itu berbentuk daun clover berwarna violet.\n"
                                                + "Ketika kamu mengarahkan liontin tersebut ke cahaya, liontin itu menampilkan tulisan:\n"
                                                + "'You are what you do, just do what you like and like what you do.\n"
                                                + " Kamu berharga dan aku yakin kamu akan memiliki masa depan yang cerah.\n"
                                                + " Percayalah pada dirimu sendiri, dan lakukan.\n\n"
                                                + "==BE FIRST, BE DIFFERENT, BE UNIQUE==");

                                        System.out.println("\n\t\t==========================\n"
                                                + "\t\t\tTHE END\n"
                                                + "\t\t==========================");
                                        System.exit(0);

                                    } else {
                                        System.out.println("[PERINTAH: Tolong input sesuai yang diminta.]");
                                    }
                                } while (!(amplop.equalsIgnoreCase("hitam")) || (!(amplop.equalsIgnoreCase("putih"))));

                            } else {
                                System.out.println("Jawaban anda salah. Silakan jawab lagi.");
                            }
                        } while (!(morse.equalsIgnoreCase("happy ever after")));

                    } else if (label.equalsIgnoreCase("siram")) {
                        System.out.println("\nKamu menyiram label itu.\n"
                                + "Label itu memunculkan tulisan berwarna biru setelah disiram.\n"
                                + "'Anda diminta untuk bermain dalam sebuah permainan untuk lanjut ke babak selanjutnya.\n"
                                + " Terdapat 2 jenis pilihan permainan yang dapat kamu mainkan.\n"
                                + " Permainan pertama adalah tebak angka.\n"
                                + " Permainan kedua adalah tebak hewan.'");

                        String kuistebak;
                        do {
                            System.out.print("Permainan mana yang akan kamu pilih? [ketik '1' atau '2']:  ");
                            kuistebak = scan.nextLine();
                            if (kuistebak.equalsIgnoreCase("1")) {
                                tebakangka();
                            } else if (kuistebak.equalsIgnoreCase("2")) {
                                tebakhewan();
                            } else {
                                System.out.println("[PERINTAH: Tolong input sesuai yang diminta; Silakan input tanpa tanda petik.]");
                            }
                        } while ((!(kuistebak.equalsIgnoreCase("1"))) || (!(kuistebak.equalsIgnoreCase("2"))));

                    } else {
                        System.out.println("[PERINTAH: Tolong input sesuai yang diminta.]");
                    }
                } while ((!(label.equalsIgnoreCase("sobek"))) || (!(label.equalsIgnoreCase("siram"))));

            } else {
                System.out.println("[PERINTAH: Tolong input sesuai yang diminta.]");
            }
        } while ((!(box.equalsIgnoreCase("buka"))) || (!(box.equalsIgnoreCase("biarkan"))));
    }

    public void cs10() {
        String scroll;
        System.out.println("\n\t\t''WELCOME TO ROOM CS10''"
                + "\nPada ruangan CS10 terdapat 2 Scroll.\n"
                + "Satu berwarna putih , dan satu berwarna kuning\n"
                + "Tiap scroll berisikan sesuatu yang menarik.");

        do {
            System.out.print("Buka Scroll Putih / Scroll Kuning [Input 'Putih' / 'Kuning'] : ");
            scroll = scan.nextLine();
            if (scroll.equalsIgnoreCase("putih")) {
                System.out.println("\nKamu perlahan membuka scroll putih tersebut \n"
                        + "dan sebuah pintu putih terbuka , di pintu tersebut tertulis\n"
                        + "\n\t\t==FIND YOUR OWN HAPPINESS==\n"
                        + "\nApakah yang akan kamu lakukan?");

                String pintu;
                do {
                    System.out.print("[ketik 'masuk' untuk berjalan memasuki pintu putih ATAU ketik 'tidak' untuk tidak memasuki pintu putih]: ");
                    pintu = scan.nextLine();
                    if (pintu.equalsIgnoreCase("masuk")) {
                        System.out.println("\nDi dalam ruangan tersebut terdapat banyak bingkai-bingkai\n"
                                + "Sesuai dengan nama ruangannya , ruangan tersebut berisi bingkai-bingkai tentang\n"
                                + "semua hal yang dapat membuat diri kamu bahagia.\n"
                                + "Kamu berjalan secara perlahan dan melihat setiap bingkai yang ada pada ruangan itu.\n"
                                + "Kamu menemukan satu bingkai yang benar-benar mencerminkan kebahagian kamu\n"
                                + "Apakah kamu mau masuk ke dalam bingkai?");

                        String bingkai;
                        do {
                            System.out.print("[ketik 'masuk' untuk masuk atau 'tidak' untuk tidak masuk] : ");
                            bingkai = scan.nextLine();
                            if (bingkai.equalsIgnoreCase("masuk")) {
                                System.out.println("\nKamu memasuki bingkai tersebut dan didalam bingkai itu,\n"
                                        + "penglihatan kamu semakin memburuk dan juga kepala kamu terasa pusing.\n"
                                        + "Seketika kamu pingsan, setelah itu kamu bangun dan berada pada suatu lahan kosong.\n"
                                        + "Pandangan sally menatap pada sebuah rumah yang berada di depannya, Sally berjalan perlahan menuju ke rumah tersebut."
                                        + "\nDi saat sudah dekat Sally menyadari bahwa rumah tersebut adalah rumah lama Sally.\n"
                                        + "Sally perlahan berjalan lebih dekat pada rumah tersebut.\n"
                                        + "Setelah sampai pada rumah itu Sally melihat ada  seorang wanita, seorang pria, dan juga ada 1 anak perempuan.\n"
                                        + "Seketika Sally chou menyadari bahwa anak perempuan tersebut merupakan, sally chou dari masa lalu\n"
                                        + "\nTerlihat dari jendela di tempat Sally Chou mengintip, bahwa keluarga tersebut sedang makan bersama,\n"
                                        + "bercanda bersama, tertawa bersama. Hal tersebut membuat Sally Chou meneteskan air matany.a\n"
                                        + "Beberapa menit berlalu, Sally semakin sadar bahwa salah satu hal yang membuat Sally Chou bahagia adalah berkumpul bersama keluarga,\n"
                                        + "bercanda, dan tertawa bersama.\n"
                                        + "Seketika penglihatan Sally memburuk dan kepalanya semakin pusing, Sally terbaring di lantai.\n"
                                        + "Minutes passed, Sally Chou tiba-tiba terbangun dari mimpinya, meneteskan air mata dan langsung bergegas keluar dari kamarnya\n"
                                        + "untuk menemui mami dan papinya, Sally Chou berlari ke arah mami dan papinya dan langsung memeluknya seerat-eratnya sambil menangis.\n"
                                        + "Mami Sally menanyakan 'kamu mengapa menangis sayang?'\n"
                                        + "Sally hanya diam dan tersenyum dengan mengucapkan 'I FOUND MY HAPPINESS'\n\n"
                                        + "\t\t'Every story has an ending,make every page worth it'.\n"
                                        + "\t\t\t==FIND YOUR OWN HAPPINESS==");

                                System.out.println("\t\t==========================\n"
                                        + "\t\t\tTHE END\n"
                                        + "\t\t==========================");
                                System.exit(0);

                            } else if (bingkai.equalsIgnoreCase("tidak")) {
                                System.out.println("Sally menolak untuk masuk kedalam bingkai tersebut, melainkan tetap mengamati semua bingkai-bingkai\n"
                                        + "yang ada pada ruangan itu, satu per satu sally amati secara perlahan , tiap bingkai ia pandang\n\n"
                                        + "\t\t\t==1 HOUR LATER==                                        \n"
                                        + "setelah memutari dan mengamati setiap bingkai pada ruangan itu , sally chou terdiam sejenak dan tersenyum.\n"
                                        + "ia menyadari bahwa selama ini ia telah memiliki banyak momen-momen bahagia tanpa disadarinya.\n"
                                        + "sally chou kemabli terdiam dan tersenyum , pandangan sally semakin memburuk , dan juga kepalanya mulai pusing\n"
                                        + "kemudian sally chou terbaring di laintai ruangan itu\n"
                                        + "sally bangun dan menyadari semua itu hanyalah mimpinya , mimpi yang sangat indah.\n"
                                        + "kemudian sally berjalan keluar kamarnya dan mencari semua orang yang dicintainya dan mengatakan\n\n "
                                        + "\t\t==Thankyou for being my happiness==\n\n");
                                System.out.println("\t\t===============================================================\n"
                                        + "\t\t\tTHE END, but there's little game after this ~<.<~\n"
                                        + "\t\t===============================================================");

                                String decision;
                                do {
                                    System.out.print("Lets play a game, How about a little math?? [Yes/No]: ");
                                    decision = scan.nextLine();
                                    if (decision.equalsIgnoreCase("yes")) {
                                        mathgame();
                                    } else if (decision.equalsIgnoreCase("no")) {
                                        System.out.println("\nOkie See you next time, Thankyou for playing :D            ");
                                        System.exit(0);
                                    } else {
                                        System.out.println("[PERINTAH: Tolong input sesuai yang diminta.]");
                                    }
                                } while ((!(decision.equalsIgnoreCase("yes"))) || (!(decision.equalsIgnoreCase("no"))));
                            }
                        } while ((!(bingkai.equalsIgnoreCase("masuk"))) || (!(bingkai.equalsIgnoreCase("tidak"))));
                    } else if (pintu.equalsIgnoreCase("tidak")) {
                        System.out.println("\nSally tidak mempercayai pintu putih tersebut dan ia terus membuka dan membaca scroll tersebut,\n"
                                + "pada scroll tersebut bertuliskan hal-hal yang membuat sally happy, Sally membaca semua isi scroll tersebut\n"
                                + "secara perlahan dan tanpa ia sadari bahwa banyak hal yang dapat membuat dirinya bahagia, setiap kalimat yang terdapat\n"
                                + "pada scroll itu, berisikan tentang semua hal-hal yang perna dilakukan oleh sally yang bisa membuat diirinya bahagia,\n"
                                + "tidak lama setelah membaca semuanya, muncul suatu kalimat pada scroll tersebut, muncullah kalimat\n"
                                + " 'Membaca Scroll 'Find your own happiness' ");
                    }

                } while ((!(pintu.equalsIgnoreCase("masuk"))) || (!(pintu.equalsIgnoreCase("tidak"))));

            } else if (scroll.equalsIgnoreCase("kuning")) {
                System.out.println("\nSally membuka scroll kuning, isi scroll kuning berisi 2 tantangan:\n"
                        + "1. Defeat Plankton\n"
                        + "2. Complete a logic game");

                String decis;
                do {
                    System.out.print("Challenge mana yang ingin kamu jalankan [1/2] : ");
                    decis = scan.nextLine();
                    if (decis.equalsIgnoreCase("1")) {
                        plankton();
                    } else if (decis.equalsIgnoreCase("2")) {
                        System.out.println("");
                    } else {
                        System.out.println("[PERINTAH: Tolong input sesuai yang diminta.]");
                    }
                } while ((!(decis.equalsIgnoreCase("1"))) && (!(decis.equalsIgnoreCase("2"))));

            } else {
                System.out.println("[PERINTAH: Tolong input sesuai yang diminta.]");
            }
        } while ((!(scroll.equalsIgnoreCase("putih"))) || (!(scroll.equalsIgnoreCase("kuning"))));

    }

    public void tiktaktu(Scanner in, String turn, String[] papan, storyline2 obj, String garis) {

        turn = "X";
        String winner = null;
        for (int a = 0; a < 9; a++) {
            papan[a] = String.valueOf(a + 1);
        }

        System.out.println("\n==WELCOME TO 3X3 TIC TAC TOE==");
        obj.printpapan(papan);                                       //manggil papan di function bawah

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
                obj.printpapan(papan);
                winner = obj.cek(garis, papan, turn);
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

    public String cek(String garis, String[] papan, String turn) {

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

    public void printpapan(String[] papan) {  //bikin papannya tiktaktu
        System.out.println("|---|---|---|");
        System.out.println("| " + papan[0] + " | " + papan[1] + " | " + papan[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + papan[3] + " | " + papan[4] + " | " + papan[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + papan[6] + " | " + papan[7] + " | " + papan[8] + " |");
        System.out.println("|---|---|---|");
    }

    public void tebakangka() {
        Random acak = new Random();
        int angka = acak.nextInt(50) + 1;
        int tebak = 0;
        //System.out.println("angka random itu adalah: " + String.valueOf(angka));   -- ini cuma buat munculin angka randomnya brp--
        while (tebak != angka) {
            try {
                System.out.print("Silakan tebak angka antara 1 sampai 50: ");
                tebak = scan.nextInt();
                if (tebak < angka) {
                    System.out.println("Angka terlalu kecil. Silakan tebak lagi.\n");
                } else if (tebak > angka) {
                    System.out.println("Angka terlalu besar. Silakan tebak lagi.\n");
                } else {
                    System.out.println("Jawaban anda benar!\n\n"
                            + "Aku berikan apresiasi padamu yang bisa menebak angka dengan benar.\n"
                            + "Aku akui itu tidak mudah, namun kamu berhasil mencapai titik dimana kamu berhasil menebak angkanya.\n"
                            + "Kamu melakukan yang terbaik dan sikap pantang menyerahmu ini sangatlah bagus.\n"
                            + "Pertahankan dan tingkatkan. Tetap semangat dan pantang menyerah.\n\n"
                            + "==PERLAHAN PUN KAU MENJADI DERET ANGKA YANG TAK LAGI BISA DITERKA==");
                    System.out.println("\n\t\t==========================\n"
                            + "\t\t\tTHE END\n"
                            + "\t\t==========================");
                    System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("Jawaban yang dimasukkan harus berupa angka.");
            }
        }
    }

    public void tebakhewan() {
        String jawaban = "sapi";
        int guessCount = 0;
        int guessLimit = 2;
        boolean tebakan = true;

        System.out.println("\n[Peraturan: anda hanya diberi 3x kesempatan untuk menjawab]\n"
                + "Aku adalah hewan berkaki 4.\n"
                + "Aku memiliki warna hitam putih.\n"
                + "Aku biasanya menghasilkan susu.\n"
                + "Siapakah aku? ");
        System.out.print("jawab: ");
        String guess = scan.nextLine();

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
            System.out.println("Jawaban anda benar!\n\n"
                    + "Mengetahui bahwa sapi merupakan hewan yang dikenal sebagai penghasil susu.\n"
                    + "Aku harap kamu mengetahuinya, karena kamu juga bisa seperti sapi yang dikenal karena salah satu keunggulannya.\n"
                    + "Kamu pasti mempunyai keunggulan yang berbeda dibanding yang lain,\n"
                    + "dan aku harap kamu tidak takut untuk melihatkannya pada dunia.\n\n"
                    + "==HIDUP TIDAK SESEDERHANA SAPI PERAH YANG SETIAP DIPERAS TETAP DIAM IKHLAS.\n"
                    + "  PEMILIKNYA TERSENYUM GIRANG MENDAPAT UANG, SEDANG SAPI HANYA MENDAPAT JERAMI.==\n"
                    + "-Reana Methan");
            System.out.println("\n\t\t==========================\n"
                    + "\t\t\tTHE END\n"
                    + "\t\t==========================");
            System.exit(0);
        } else {
            System.out.println("Jawaban anda salah! Anda kehabisan kesempatan menebak.\n"
                    + "Tidak apa-apa kehabisan kesempatan menebak.\n"
                    + "Salah menebak di permainan ini bukan berarti gagal selamanya.\n"
                    + "Kamu telah berusaha dengan baik. Terimakasih untuk itu.\n"
                    + "Tetap semangat dan jangan pernah menyerah.\n\n"
                    + "==IF YOU FEEL LIKE GIVING UP, JUST LOOK BACK ON HOW FAR YOU ARE ALREADY.==");
            System.out.println("\n\t\t==========================\n"
                    + "\t\t\tTHE END\n"
                    + "\t\t==========================");
            System.exit(0);
        }
    }

    public void mathgame() {
        int number1, number2, number3, number4, number5, number6;
        int[] jawaban = new int[3];
        number1 = (int) (Math.random() * 100);
        number2 = (int) (Math.random() * 100);
        number3 = (int) (Math.random() * 100);
        number4 = (int) (Math.random() * 100);
        number5 = (int) (Math.random() * 100);
        number6 = (int) (Math.random() * 100);
        System.out.println("Welcome to 'THE MATH'  \n"
                + "How to play : Kita akan mengacak angka dari 1-100 , kita akan memberi 2 angka , dan tujuan kamu adalah untuk \n"
                + "menambah kedua angka , gampang kan? Yok kita mulai ");
        System.out.print("First Question : " + number1 + " + " + number2 + " = ");
        jawaban[0] = scan.nextInt();
        if (jawaban[0] == (number1 + number2)) {
            System.out.println("Kamu benar :D , LANJUT!!!\n");
        } else {
            System.out.println("Yahh kamu salah :( gapapa tetap semangat , yok lanjut ke pertanyaan selanjutnya\n");
        }
        System.out.print("Second Question : " + number3 + " + " + number4 + " = ");
        jawaban[1] = scan.nextInt();
        if (jawaban[1] == (number3 + number4)) {
            System.out.println("Kamu benar :D , LANJUT!!!\n");
        } else {
            System.out.println("Yahh kamu salah :( gapapa tetap semangat , yok lanjut ke pertanyaan selanjutnya\n");
        }
        System.out.print("Third Question : " + number5 + " + " + number6 + " = ");
        jawaban[2] = scan.nextInt();
        if (jawaban[2] == (number5 + number6)) {
            System.out.println("Kamu benar :D \n"
                    + "\t\tCONGRATULATION ON COMPLETING 'THE MATH'\n\n"
                    + "\t\tThankyou for playing!!!\n");
        } else {
            System.out.println("Yahh kamu salah :( gapapa tetap semangat, this is just for fun :D\n\n"
                    + "\t\tCONGRATULATION ON COMPLETING 'THE MATH'                 \n"
                    + "\n\t\tThankyou for playing!!!                    ");
        }
        System.out.println("\t\t==========================\n"
                + "\t\t\tTHE END\n"
                + "\t\t==========================");
        System.exit(0);
    }

    public void plankton() {
        String pilihan = null;
        int Plankton, hp, energy;
        int ultimate;
        int pilih;
        do {
            Plankton = 100;
            hp = 60;
            energy = 20;
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
                                chance -= 1;

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
                System.out.println("\tNOOO, PLANKTON HAS WON!!!\n"
                        + "\tBetter Luck Next Time Champ!!");
                System.out.print("Want to Retry?? [yes/no]: ");
                pilihan = scan.next();
            } else if (hp > 0 && Plankton <= 0) {
                System.out.println("YOU DEFEATED PLANKTON AND SAVED THE KRUSTY KRAB GOODJOB!!!\n"
                        + "\n\t\tThanks For Playing!!");
                System.exit(0);
            } else if (hp <= 0 && Plankton <= 0) {
                System.out.println("YOU BOTH FEEL EXHAUSTED AND END THE FIGHT WITH A DRAW!\n"
                        + "\n\t\tBetter luck Next time, Thanks for playing");
                System.exit(0);
            }

        } while (pilihan.equalsIgnoreCase("yes"));
    }
}
