package PPTI15.Ngide.Ngide2.VINA;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
        int login;
        Scanner userInput = new Scanner(System.in);
        System.out.println("WELCOME TO OOP HOSPITAL");
        System.out.println("========================");
        System.out.println("1. Pasien");
        System.out.println("2. Dokter");
        System.out.println("3. Pegawai Rumah Sakit");
        System.out.print("Select : ");
        login = userInput.nextInt();
        userInput.nextLine();

        switch (login){
            case 1:
                menuPasien();

                break;
            case 2:
                menuDokter();
                break;
            case 3:

                break;
        }
    }

    public static void menuDokter(){
//        FLOW :
        //dokter -> jadwal praktek
        JadwalPraktek jadwal = new JadwalPraktek();
        System.out.println("WELCOME TO OOP HOSPITAL\n");
        System.out.println("Menu OOP HOSPITAL APPS");
        System.out.println("==========================");
        System.out.println("1. Gatau");
        System.out.println("2. Gatau");
        System.out.println("3. Jadwal Praktik Dokter");
        System.out.println("4. Gatau");
        System.out.println("5. Gatau");
        System.out.println("6. Exit");
        System.out.println("==========================");

        System.out.printf("Select menu : ");
        Scanner input = new Scanner(System.in);
        int menu = input.nextInt();

        switch (menu){
            case 1:
//                System.out.println("Anda memilih menu reservasi");
//                System.out.println();
//                Reservasi();
                break;
            case 2:
//                Berobat();
                break;
            case 3:
//                JadwalPraktik();
                jadwal.initialize();
                jadwal.menuAwalDokter();
                break;
            case 4:
//                Fasilitas();
                break;
            case 5:
//                CallCenter();
                break;
            case 6:
                System.out.println("Thank you for using OOP HOSPITAL apps");
                break;
        }
    }

    public static void menuPasien(){
//        FLOW :
        //pasien -> jadwal praktek
        JadwalPraktek jadwal = new JadwalPraktek();

        System.out.println("WELCOME TO OOP HOSPITAL\n");
        System.out.println("Menu OOP HOSPITAL APPS");
        System.out.println("==========================");
        System.out.println("1. Reservasi");
        System.out.println("2. Berbobat");
        System.out.println("3. Jadwal Praktik Dokter");
        System.out.println("4. Fasilitas Rumah Sakit");
        System.out.println("5. Call Center");
        System.out.println("6. Exit");
        System.out.println("==========================");

        System.out.printf("Select menu : ");
        Scanner input = new Scanner(System.in);
        int menu = input.nextInt();

        switch (menu){
            case 1:
                System.out.println("Anda memilih menu reservasi");
                System.out.println();
//                Reservasi();
                break;
            case 2:
//                Berobat();
                break;
            case 3:
//                JadwalPraktik();
                jadwal.initialize();
                jadwal.menuAwalPasien();
                break;
            case 4:
//                Fasilitas();
                break;
            case 5:
//                CallCenter();
                break;
            case 6:
                System.out.println("Thank you for using OOP HOSPITAL apps");
                break;
        }
    }
}

//class Pasien{
//    String namaPasien, noTelpPasien, nikPasien, genderPasien;
//    int usiaPasien;
//
//    void show(){
//        System.out.println("Nama : " + namaPasien);
//    }
//}
//
//class CallCenter{
//    public static ArrayList<String> DataCC = new ArrayList<String>();
//    DataCC.add("hai");
//    String namaCallCenter;
//    Scanner inputCC = new Scanner(System.in);
//    void add(){
//        System.out.print("input nama call center baru : ");
//        String namaCCbaru = inputCC.nextLine();
////        DataCC.add(namaCCbaru);
//        DataCC.a
//        System.out.println(DataCC.size());
//    }
//
//    void view(){
////        for(int i = 0 ; i < DataCC.size() ; i++){
//            System.out.println(DataCC.size());
////        }
//    }
//}