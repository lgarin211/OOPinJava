package PPTI15.Ngide.Ngide2;

import java.util.ArrayList;

import java.util.*;
public class Main {
    static Scanner input = new Scanner(System.in);
    // data pasien
    static ArrayList<Pasien> DataPasiend = new ArrayList<Pasien>();

    public static void Berobat(){
        input = new Scanner(System.in);
        System.out.println("Silahkan Melakukan Registrasi Pasien");
        System.out.println("Masukkan Nama Pasien");
        String NamaPasien = input.nextLine();
        System.out.println("Masukkan Alamat Pasien");
        String Alamat = input.nextLine();
        System.out.println("Masukkan Umur Pasien");
        String Umur = input.nextLine();
        Pasien Newpasien = new Pasien(NamaPasien, Alamat, Umur);
        System.out.print("\033c");
        System.out.println("Data Anda Telah Di simpah, Harap Tunggu");
        Newpasien.Berobat();
        DataPasiend.add(Newpasien);
    }
    public static void main(String[] args) {
        new Main();
        Dokter dokter = new Dokter();
        dokter.savedata("Dr. Ngide1","Dokter Umum","Senin - Jumat","Ruang 1");
        dokter.savedata("Dr. Ngide2","Dokter Umum","Senin - Jumat","Ruang 1");
        dokter.savedata("Dr. Ngide3","Dokter Umum","Senin - Jumat","Ruang 1");
        int pilihan =0;
        do{
            System.out.println("SELAMAT DATANG DI KLINIK NGIDE?");
            System.out.println("Silahkan Pilih Menu Berikut Untuk Melanjutkan");
            System.out.println("1. Reservasi\n2. Berobat\n3. Keluar");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    // Reservasi();
                    break;
                case 2:
                    Berobat();
                    break;
                default:
                    break;
            }
        }while(pilihan!=0);
    }
    public Main(){
        Pasien pasien = new Pasien("Ngide", "Jl. Ngide", "20");
        DataPasiend.add(pasien);
    }
}
