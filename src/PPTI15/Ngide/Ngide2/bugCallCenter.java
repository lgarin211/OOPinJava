package PPTI15.Ngide.Ngide2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

// public class CallCenter {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int menu;
//         CallCenterr panggil = new CallCenterr();
//         panggil.initialize();
//         do{
//             System.out.println("Welcome to Call Center OOP Hospital");
//             System.out.println("===================================\n");
//             System.out.println("Pilihan menu : ");
//             System.out.println("1. Tambah Call Center");
//             System.out.println("2. View Call Center");
//             System.out.println("3. Delete Call Center");
//             System.out.printf("Select : ");
//             menu = input.nextInt();

//             switch (menu){
//                 case 1:
//                     panggil.tambah();
//                     break;
//                 case 2:
//                     panggil.view();
//                     break;
//                 case 3:
//                     panggil.deleteCabang();
//                     break;
//             }
//         }while(menu != 4);
//     }
// }

public class bugCallCenter {
    static String nama;
    static String nomor;
    static ArrayList<bugCallCenter> DaftarTempat = new ArrayList<bugCallCenter>();
    static bugCallCenter callCenter = new bugCallCenter();

    public static void initialize(){
        // nama=;
        // nomor=;
        Pathinitialize("Sentul", "1-234-567");
        // nama="Jakarta";
        // nomor="1-234-567";
        Pathinitialize("Jakarta", "1-234-567");
    }

    public static void CallCenter(){
        initialize();
    }

    public static void Callmenu(){
        System.out.println("\033c");
        System.out.println("Selamat Datang Di Informasi Call Center OOP Hospital");
        System.out.println("====================================================");
        System.out.println("1. Tambah Call Center");
        System.out.println("2. View Call Center");
        int menu;
        Scanner input = new Scanner(System.in);
        menu = input.nextInt();
        switch (menu) {
            case 1:
                System.out.println("\033c");
                tambah();
                break;
            case 2:
                System.out.println("\033c");
                DaftarTempat.forEach((callCenter) -> {
                    System.out.println("++++++++++++++++++++++++++++++");
                    callCenter.view();
                    System.out.println("++++++++++++++++++++++++++++++");
                });
                break;
        
            default:
                break;
        }
    }

    public static void Pathinitialize(String nama, String nomor){
        callCenter.nama=nama;
        callCenter.nomor=nomor;
        DaftarTempat.add(callCenter);
    }

    public void view(){
        System.out.println("Call Center ");
        System.out.println(nama);
        System.out.println(nomor);
    }

    public static void tambah(){
        Scanner daerah = new Scanner(System.in);
        System.out.printf("Masukkan daerah cabang baru : ");
        String daerahBaru = daerah.nextLine();
        System.out.printf("Masukkan no telp cabang baru : ");
        String noTelp = daerah.nextLine();
        
        nama=daerahBaru;
        nomor=noTelp;
        // Pathinitialize.add(callCenter);
        Pathinitialize(daerahBaru, noTelp);
        System.out.println("Daftar Call Center : ");
        DaftarTempat.forEach((callCenter) -> {
            System.out.println("++++++++++++++++++++++++++++++");
            callCenter.view();
            System.out.println("++++++++++++++++++++++++++++++");
        });
    }

    public void deleteCabang(){
        Scanner delete = new Scanner(System.in);
        System.out.printf("Nama yang ingin dihapus : ");
        String cabang = delete.nextLine();
        int index = nama.indexOf(cabang);
//        System.out.println(index);
        // nama.remove(index);
        // nomor.remove(index);

    }
}
