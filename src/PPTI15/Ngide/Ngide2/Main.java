package PPTI15.Ngide.Ngide2;

import java.util.ArrayList;

import PPTI15.Ngide.Ngide2.RIZAL.CallCenter;
import PPTI15.Ngide.Ngide2.Support.bin;

import java.util.*;
public class Main {
    static Scanner input = new Scanner(System.in);
    // data pasien
    static ArrayList<Pasien> DataPasiend = new ArrayList<Pasien>();

    public static void main(String[] args) {
        Dokter dokter = new Dokter();
        dokter.savedata("u","U","Y","D");
        dokter.savedata("Dr. Ngide1","Dokter Umum","Pagi","Ruang 1");
        dokter.savedata("Dr. Ngide2","Dokter Umum","Sore","Ruang 2");
        dokter.savedata("Dr. Ngide3","Dokter Umum","Malam","Ruang 3");
        dokter.savedata("Dr. Ngide4","Dokter Umum","Pagi","Ruang 4");
        dokter.savedata("Dr. Ngide5","Dokter Umum","Sore","Ruang 5");

        System.out.println("Selamat Datang Masuk Sebagai \n 1. Pasien \n 2. Dokter");
        Scanner input = new Scanner(System.in);
        int masuk=input.nextInt();
        switch (masuk) {
            case 1:
                Hospitalrun();    
                break;        
            case 2:
                dokter.login();
                // belumjadi    //    
                break;        
            default:
                break;
        }
    }

    public static void Berobat(){
        input = new Scanner(System.in);
        System.out.println("Silahkan Melakukan Registrasi Pasien");
        System.out.printf("Masukkan Nama Pasien : ");
        String NamaPasien = input.nextLine();
        System.out.printf("Masukkan Alamat Pasien : ");
        String Alamat = input.nextLine();
        System.out.printf("Masukkan Umur Pasien : ");
        String Umur = input.nextLine();
        Pasien Newpasien = new Pasien(NamaPasien, Alamat, Umur);
        System.out.print("\033c");
        System.out.println("Data Anda Telah Di simpah, Harap Tunggu");
        Newpasien.Berobat();
        DataPasiend.add(Newpasien);
    }
    public static void NewReservasi(){
        input = new Scanner(System.in);
        System.out.println("Silahkan Melakukan Registrasi Pasien");
        System.out.printf("Masukkan Nama Pasien : ");
        String NamaPasien = input.nextLine();
        System.out.printf("Masukkan Alamat Pasien : ");
        String Alamat = input.nextLine();
        System.out.printf("Masukkan Umur Pasien : ");
        String Umur = input.nextLine();
        Reservasi Newpasien = new Reservasi();
        System.out.print("\033c");
        System.out.println("Data Anda Telah Di simpah, Harap Tunggu");
        Newpasien.tambahReservasi();
        // DataPasiend.add(Newpasien);
    }

    public static void Hospitalrun() {
        new Main();
        // okw.tanyadokternya();
        // okw.tanyadokternya("Nama Kota Di Jawa barat?");
        int pilihan =0;
        do{
            bin.Hospital();
            // System.out.print("\033c");
            System.out.println("WELCOME TO OOP HOSPITAL\n");

            System.out.println("Menu OOP HOSPITAL APPS");
            System.out.println("======================");
            System.out.println("1. Reservasi");
            System.out.println("2. Berobat");
            System.out.println("3. Jadwal Praktik Dokter");
            System.out.println("4. Fasilitas Rumah Sakit");
            System.out.println("5. Call Center");
            System.out.println("6. Exit");

            System.out.printf("Select menu : ");
            // Scanner input = new Scanner(System.in);
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    NewReservasi();
                    break;
                case 2:
                    Berobat();
                    break;
                case 3:
                    Praktek.Jadwalview();
                    break;
                case 4:
                    Fasilitas.lihatFasilitas();
                    break;
                case 5:
                    // CallCenter callCenter = new CallCenter();
                    // callCenter.Callmenu();
                    CallCenter.run();   
                    break;                 
                default:
                    break;
            }
        }while(pilihan!=6);
    }
    public Main(){
        Pasien pasien = new Pasien("Ngide", "Jl. Ngide", "20");
        DataPasiend.add(pasien);
    }
}
