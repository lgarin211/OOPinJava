package PPTI15.Ngide.Ngide2;

import java.util.ArrayList;

import java.util.*;
public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Pasien> DataPasiend = new ArrayList<Pasien>();
    Pasien pasien;
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
        System.out.println("Data Anda Telah Di simpah, Harap Tunggu");
        Newpasien.keluhan();
        DataPasiend.add(Newpasien);
    }
    public static void main(String[] args) {
        new Main();
        System.out.println("SELAMAT DATANG DI KLINIK NGIDE?");
        System.out.println("Silahkan Pilih Menu Berikut Untuk Melanjutkan");
        System.out.println("1. Reservasi\n2. Berobat\n3. Keluar");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 2:
                Berobat();
                break;
        
            default:
                break;
        }
    }
    public Main(){
        Pasien pasien = new Pasien("Ngide", "Jl. Ngide", "20");
        DataPasiend.add(pasien);
    }
}
