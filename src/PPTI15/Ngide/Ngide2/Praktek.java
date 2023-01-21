package PPTI15.Ngide.Ngide2;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class Praktek {
    static String NamaDokter;
    static String Keluhan=" ";
    static String Diagnosis;
    static String Tindakan;
    static ArrayList<Praktek> DataBerobat = new ArrayList<Praktek>();
    static ArrayList<Obat> DataObat = new ArrayList<Obat>();
    static Scanner in = new Scanner(System.in);

    static void AddPraktek(String NamaDokter1, String Keluhan1, String Diagnosis1, String Tindakan1){
        NamaDokter = NamaDokter1;
        Keluhan = Keluhan1;
        Diagnosis = Diagnosis1;
        Tindakan = Tindakan1;
    }
    // Praktek
    static void sesiTanya(){
        in = new Scanner(System.in);
        System.out.println("1. Ya\n2. Tidak");
        int Punce = in.nextInt();
        if(Punce==1){
            System.out.print("\033c");
            System.out.println("Silahkan Beri Keluhan Anda");
            Keluhan+=in.next()+",";
            System.out.println("Apakah Anda Ingin Menambah Keluhan?");
            sesiTanya();
        }
    }
    public static void keluhan() {
        // pilih dokter
        System.out.print("\033c");
        System.out.println("Dokter Yang Tersedia :");
        Dokter dokter = new Dokter();
        dokter.ShowDokter();
        System.out.println("Pilih Dokter : ");
        int pilih = in.nextInt();
        NamaDokter=dokter.Datadokter.get(pilih-1).NamaDokter;
        System.out.println("Hallo "+Pasien.NamaPasien+" Saya "+NamaDokter+" Bisa Saya Bantu ?");
        sesiTanya();
        AddPraktek("Dokter B", Keluhan, "Diagnosis", "Tindakan");
        System.out.print("\033c");
        System.out.println("Keluhan Anda : \n"+Keluhan+"\nTelah di rekam dan akan di proses Oleh Dokter Di Harap Di tunggu : \n");
        okw.tanyadokternya("dalam bahasa indonesia obat untuk "+Keluhan+"?");
        // okw.tanyadokternya("dalam bahasa indonesia obat untuk pusing ?");
        // System.out.println("Apakah Anda Ingin Menambah Keluhan?");
    }
    
}
