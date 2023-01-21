package PPTI15.Ngide.Ngide2;

import java.util.ArrayList;
import java.util.*;

import PPTI15.Ngide.Masyarakat.Reservasi;

public class Pasien{
    static String NamaPasien;
    static String Alamat;
    static String Umur;
    static String Status="Sakit";
    static ArrayList<Reservasi> DataReservasi = new ArrayList<Reservasi>();
    // static ArrayList<Pasien> DataPasiend = new ArrayList<Pasien>();
    static ArrayList<Praktek> DataPraktek = new ArrayList<Praktek>();
    static Praktek praktek = new Praktek();
    static Scanner input = new Scanner(System.in);
    
    public Pasien(String NamaPasien, String Alamat, String Umur){
        this.NamaPasien = NamaPasien;
        this.Alamat = Alamat;
        this.Umur = Umur;
    }
    
    // update data Pasien
    public void updateDataPasien(String NamaPasien, String Alamat, String Umur){
        this.NamaPasien = NamaPasien;
        this.Alamat = Alamat;
        this.Umur = Umur;
    }

    

    // Berobat
    static void Berobat(){
        praktek.keluhan();
        DataPraktek.add(praktek);        
        System.out.println("Apakah Anda Ingin Melakukan Reservasi?");
        System.out.println("1. Ya\n2. Tidak");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                break;
     
            case 2:
                System.out.println("Terima Kasih Telah Menggunakan Layanan Kami, Jagalah Kesehatan Anda, Karena Better Anda Sehat ...");
                System.out.println("Lekas Sembuh  :)");
                break;
     
            default:
                break;
        }

    }
    // reservasi
    public void reservasi(String NamaPasien, String Alamat, String Umur){
        Reservasi reservasi = new Reservasi();
    }
}
