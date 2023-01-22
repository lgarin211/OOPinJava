package PPTI15.Ngide.Ngide2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Fasilitas {
    public static void lihatFasilitas() {
        Scanner input = new Scanner(System.in);
        int fasilitas=0;
        ListFasilitas callFasilitas = new ListFasilitas();
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
                    callFasilitas.superVIP();
                    break;
                case 2:
                    System.out.println("\033c");
                    callFasilitas.VIP();
                    break;
                case 3:
                    System.out.println("\033c");
                    callFasilitas.kelas1();
                    break;
                case 4:
                    System.out.println("\033c");
                    callFasilitas.kelas2();
                    break;
            }
        // }while (fasilitas < 1 || fasilitas > 4);
        }while (fasilitas!=5);
        
    }
}