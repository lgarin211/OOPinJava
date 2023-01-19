package PPTI15.Ngide.Ngide2;

import java.util.ArrayList;
import java.util.*;

import PPTI15.Ngide.Masyarakat.Reservasi;

public class Pasien {
    static String NamaPasien;
    static String Alamat;
    static String Umur;
    static String Status="Sakit";
    static String Keluhan="";
    static ArrayList<Reservasi> DataReservasi = new ArrayList<Reservasi>();
    static ArrayList<Praktek> DataBerobat = new ArrayList<Praktek>();
    static Scanner input = new Scanner(System.in);
    
    public Pasien(String NamaPasien, String Alamat, String Umur){
        this.NamaPasien = NamaPasien;
        this.Alamat = Alamat;
        this.Umur = Umur;
    }
    
    // Praktek
    static void QNA(){
        input = new Scanner(System.in);
        System.out.println("1. Ya\n2. Tidak");
        int pilih = input.nextInt();
        if(pilih==1){
            System.out.println("Silahkan Beri Keluhan Anda");
            Keluhan+=input.nextLine()+",";
            System.out.println("Berapa Lama Anda Mengalami Keluhan Ini ?");
            QNA();
        }else{
            Keluhan+=".";
        }
    }
    public static void keluhan() {
        System.out.println("Hallo "+NamaPasien+" Saya Dokter Bisa Saya Bantu ?");
        QNA();
        System.out.print("\033c");
        System.out.println("Keluhan Anda : \n"+Keluhan+"\nTelah di rekam dan akan di proses Oleh Dokter Di Harap Di tunggu : \n");

    }

    // update data Pasien
    public void updateDataPasien(String NamaPasien, String Alamat, String Umur){
        this.NamaPasien = NamaPasien;
        this.Alamat = Alamat;
        this.Umur = Umur;
    }

    // reservasi
    public void reservasi(String NamaPasien, String Alamat, String Umur){
        Reservasi reservasi = new Reservasi();
        
    }
}
