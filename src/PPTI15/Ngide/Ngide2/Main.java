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
        dokter.savedata("vina","U","Y","D");
        dokter.savedata("Dr. Ngide1","Dokter Umum","Pagi","Ruang 1");
        dokter.savedata("Dr. Ngide2","Dokter Umum","Sore","Ruang 2");
        dokter.savedata("Dr. Ngide3","Dokter Umum","Malam","Ruang 3");
        dokter.savedata("Dr. Ngide4","Dokter Umum","Pagi","Ruang 4");
        dokter.savedata("Dr. Ngide5","Dokter Umum","Sore","Ruang 5");
        Scanner input = new Scanner(System.in);
        int masuk=0;
        do{
            System.out.println("\033c");
            System.out.println("Selamat Datang Masuk Sebagai \n 1. Pasien \n 2. Dokter\n 3. Exit");
    
            
    
            do{
                // System.out.println("Masukan Angka ");
                System.out.print("Select [1-3]: ");
                masuk=input.nextInt();          
            }
            while(masuk<1||masuk>3);

            switch (masuk) {
                case 1:
                    Hospitalrun();    
                    break;        
                case 2:
                    dokter.login();
                    break;        
                case 3:
                    break;
                default:
                    break;
            }
        }while(masuk != 3);
    }

    
    public static void Berobat(){
        input = new Scanner(System.in);
        System.out.println("Silahkan Melakukan Registrasi Pasien");
        System.out.printf("Masukkan Nama Pasien : ");
        String NamaPasien = input.nextLine();
        while (NamaPasien.length() > 20) {
            System.out.println("Nama Pasien Maximal 20 Karakter");
            System.out.printf("Masukkan Nama Pasien : ");
            NamaPasien = input.nextLine();
        }
        System.out.printf("Masukkan Alamat Pasien : ");
        String Alamat = input.nextLine();
        while (Alamat.length() > 30) {
            System.out.println("Alamat Pasien Maximal 30 Karakter");
            System.out.printf("Masukkan Alamat Pasien : ");
            Alamat = input.nextLine();
        }

        // System.out.printf("Masukkan Umur Pasien : ");
        int Umur = 0;
        // Umur = input.nextInt();
        while (Umur < 1 || Umur > 150) {
            try {
                System.out.printf("Masukkan Umur Pasien, ");
                System.out.println("Umur Pasien Minimal 1 Tahun dan Maksimal 80 Tahun");
                
                Umur = input.nextInt();
            } catch (Exception e) {
                System.out.println("Masukkan Angka");
            }
        }
       
        Pasien Newpasien = new Pasien(NamaPasien, Alamat, Umur);
        System.out.print("\033c");
        System.out.println("Data Anda Telah disimpan, Harap Tunggu");
        Newpasien.Berobat();
        DataPasiend.add(Newpasien);
    }
    
    public static void NewReservasi(){
        input = new Scanner(System.in);
        System.out.println("Silahkan Melakukan Registrasi Pasien");
        System.out.println("====================================");
        System.out.printf("Masukkan Nama Pasien : ");
        String NamaPasien = input.nextLine();
        while (NamaPasien.length() > 20) {
            System.out.println("Nama Pasien Maximal 20 Karakter");
            System.out.printf("Masukkan Nama Pasien : ");
            NamaPasien = input.nextLine();
        }
        System.out.printf("Masukkan Alamat Pasien : ");
        String Alamat = input.nextLine();
        while (Alamat.length() > 30) {
            System.out.println("Alamat Pasien Maximal 30 Karakter");
            System.out.printf("Masukkan Alamat Pasien : ");
            Alamat = input.nextLine();
        }

        System.out.printf("Masukkan Umur Pasien : ");
        int Umur = 0;
        while (Umur < 1 || Umur > 80) {
            try {
                System.out.println("Umur Pasien Minimal 1 Tahun dan Maksimal 80 Tahun");
                System.out.printf("Masukkan Umur Pasien : ");
                Umur = input.nextInt();
            } catch (Exception e) {
                System.out.println("Masukkan Angka");
            }
        }

        input.nextLine();
        Reservasi Newpasien = new Reservasi();
        System.out.print("\033c");
        System.out.println("Data Anda Telah disimpan, harap tunggu\n");

        Newpasien.Sonslreserv();
    }

    public static void Hospitalrun() {
        new Main();
        int pilihan = 0;
        do{
            bin.Hospital();
            // System.out.print("\033c");
            System.out.println("WELCOME TO OOP HOSPITAL\n");

            System.out.println("Menu OOP HOSPITAL APPS");
            System.out.println("======================");
            System.out.println("1. Reservasi Kamar");
            System.out.println("2. Reservasi Konsultasi");
            System.out.println("3. Jadwal Praktik Dokter");
            System.out.println("4. Fasilitas Rumah Sakit");
            System.out.println("5. Call Center");
            System.out.println("6. Exit");

            System.out.printf("Select menu : ");
        
            do{
                pilihan = input.nextInt();
            }while(pilihan<1||pilihan>6);
           
       
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
                    CallCenter.run();   
                    break;                 
                default:
                    break;
            }
        }while(pilihan!=6);
    }

    public Main(){
        Pasien pasien = new Pasien("Ngide", "Jl. Ngide", 20);
        DataPasiend.add(pasien);
    }
}
