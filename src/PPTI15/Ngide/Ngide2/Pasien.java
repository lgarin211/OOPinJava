package PPTI15.Ngide.Ngide2;

import java.util.ArrayList;
import java.util.*;

// import PPTI15.Ngide.Masyarakat.Reservasi;

public class Pasien{
    static String NamaPasien;
    static String Alamat;
    static int Umur;
    // static String Status="Sakit";
    static ArrayList<Reservasi> DataReservasi = new ArrayList<Reservasi>();
    static ArrayList<Pasien> DataPasiend = new ArrayList<Pasien>();
    static ArrayList<Praktek> DataPraktek = new ArrayList<Praktek>();
    static Praktek praktek = new Praktek();
    static Scanner input = new Scanner(System.in);
    
    public Pasien(String NamaPasien, String Alamat, int Umur){
        this.NamaPasien = NamaPasien;
        this.Alamat = Alamat;
        this.Umur = Umur;
    }
    public Pasien(){
    }
    
    // update data Pasien
    public void updateDataPasien(String NamaPasien, String Alamat, int Umur){
        this.NamaPasien = NamaPasien;
        this.Alamat = Alamat;
        this.Umur = Umur;
    }

    

    // Berobat
    static void Berobat(){
        praktek.keluhan();
        DataPraktek.add(praktek);        
        // Reservasi.Sonslreserv();
        System.out.println("Terima Kasih Telah Menggunakan Layanan Kami, Jagalah Kesehatan Anda, Karena Better Anda Sehat ...");
        System.out.println("Lekas Sembuh  :)");


    }
    // reservasi
    public void reservasi(String NamaPasien, String Alamat, int Umur){
        Reservasi reservasi = new Reservasi();
    }
}
