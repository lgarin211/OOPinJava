package PPTI15.Ngide.Ngide2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Fasilitas {
    public static void lihatFasilitas() {
        Scanner input = new Scanner(System.in);
        int fasilitas=0;
        do {
            System.out.println("============================");
            System.out.println("Fasilitas Kamar OOP Hospital");
            System.out.println("============================\n");
            System.out.println("1. Super VIP");
            System.out.println("2. VIP");
            System.out.println("3. Kelas 1");
            System.out.println("4. Kelas 2");
            System.out.println("5. Back");

            System.out.printf("Masukkan nomor untuk melihat fasilitas : ");
            fasilitas = input.nextInt();
            System.out.println(fasilitas);
            switch (fasilitas) {
                case 1:
                    System.out.println("\033c");
                    superVIP();
                    break;
                case 2:
                    System.out.println("\033c");
                    VIP();
                    break;
                case 3:
                    System.out.println("\033c");
                    kelas1();
                    break;
                case 4:
                    System.out.println("\033c");
                    kelas2();
                    break;
            }
        // }while (fasilitas < 1 || fasilitas > 4);
        }while (fasilitas!=5);
        
    }

    public static void superVIP(){
        System.out.println("=========================");
        System.out.println("Fasilitas Kamar Super VIP");
        System.out.println("=========================\n");
        System.out.println("Tempat Tidur Elektrik");
        System.out.println("AC");
        System.out.println("TV LCD 32");
        System.out.println("Meja Makan Pasien");
        System.out.println("Sofa Bed & Meja");
        System.out.println("Kamar Mandi (Panas / Dingin)");
        System.out.println("Credenza");
        System.out.println("Telepon");
        System.out.println("2 Kabinet");
        System.out.println("Microwave");
        System.out.println("Kulkas");
        System.out.println("1 Set Meja Makan Keluarga");
    }

    public static void VIP(){
        System.out.println("===================");
        System.out.println("Fasilitas Kamar VIP");
        System.out.println("===================\n");
        System.out.println("Tempat Tidur Elektrik");
        System.out.println("AC");
        System.out.println("TV LCD 32");
        System.out.println("Kulkas Minibar");
        System.out.println("Meja Makan Pasien");
        System.out.println("Sofa Bed & Meja");
        System.out.println("Kamar Mandi (Panas / Dingin)");
        System.out.println("Telepon");
    }

    public static void kelas1(){
        System.out.println("=======================");
        System.out.println("Fasilitas Kamar Kelas 1");
        System.out.println("=======================\n");
        System.out.println("2 Tempat Tidur Pasien");
        System.out.println("AC");
        System.out.println("TV LCD 32");
        System.out.println("2 Meja Makan Pasien");
        System.out.println("2 Kursi Tunggu");
        System.out.println("Kamar Mandi (Panas / Dingin)");
    }

    public static void kelas2(){
        System.out.println("=======================");
        System.out.println("Fasilitas Kamar Kelas 2");
        System.out.println("=======================\n");
        System.out.println("3 Tempat Tidur Pasien");
        System.out.println("3 Tempat Tidur Pasien");
        System.out.println("AC");
        System.out.println("TV LCD 32");
        System.out.println("3 Meja Makan Pasien");
        System.out.println("3 Kursi Tunggu");
        System.out.println("Kamar Mandi (Panas / Dingin)");
    }
}