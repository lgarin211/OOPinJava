package PPTI15.Ngide.Ngide2;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class Praktek {
    static String NamaDokter;
    static String Keluhan="";
    static String Diagnosis;
    static String Tindakan;
    static String JadwalDokter;
    static ArrayList<Praktek> DataBerobat = new ArrayList<Praktek>();
    static Scanner in = new Scanner(System.in);

    static void AddPraktek(String NamaDokter1, String Keluhan1, String Diagnosis1, String Tindakan1){
        NamaDokter = NamaDokter1;
        Keluhan = Keluhan1;
        Diagnosis = Diagnosis1;
        Tindakan = Tindakan1;
    }
    // Praktek
    static void sesiTanya(){
        Scanner poll=new Scanner(System.in);
        System.out.println("1. Ya\n2. Tidak");
        int Punce = poll.nextInt();
        while(Punce < 1 || Punce > 2){
            System.out.println("Pilihan tidak tersedia");
            System.out.println("1. Ya\n2. Tidak");
            Punce = poll.nextInt();
        }
        if(Punce==1){
            System.out.print("\033c");
            System.out.println("Silahkan Beri Keluhan Anda");
            Keluhan+=poll.next()+",";
            System.out.println("Apakah Anda Ingin Menambah Keluhan?");
            sesiTanya();
        }
    }
    public static void keluhan() {
        System.out.print("\033c");
        System.out.println("Dokter Yang Tersedia Untuk konsultasi :");
        Dokter dokter = new Dokter();
        dokter.ShowDokter();
        int pilih=0;
        while(pilih < 1 || pilih > dokter.Datadokter.size()){
            System.out.print("Pilih Dokter : ");
            pilih = in.nextInt();
            if(pilih < 1 || pilih > dokter.Datadokter.size()){
                System.out.println("Pilihan tidak tersedia");
            }
        }
        
        NamaDokter=dokter.Datadokter.get(pilih-1).NamaDokter;
        JadwalDokter=dokter.Datadokter.get(pilih-1).Jadwal;
        // System.out.println("Hallo "+Pasien.NamaPasien+" Saya "+NamaDokter+" Bisa Saya Bantu ?");
        System.out.println("Anda memilih konsultasi dengan Dr. " + NamaDokter + "\nJadwal : " + JadwalDokter);

        System.out.println("Apakah anda ingin memberikan keluhan sebelum berkonsultasi?");
        sesiTanya();
        AddPraktek("Dokter B", Keluhan, "Diagnosis", "Tindakan");
        System.out.print("\033c");
        System.out.println("Keluhan Anda : "+Keluhan+"\nTelah di rekam dan akan di proses Oleh Dokter,\nSilahkan datang berkonsultasi sesuai dengan jadwal yang ada\n");
    }

    public static void Jadwalview(){
        System.out.print("\033c");
        Dokter dataDokter = new Dokter();
        System.out.println("===============================");
        int p=0;
        do {
            Scanner userInput = new Scanner(System.in);
            System.out.println("MENU LIHAT JADWAL PRAKTIK");
            System.out.println("==========================");
            System.out.println("1. Praktek Pagi");
            System.out.println("2. Praktek Sore");
            System.out.println("3. Praktek Malam");
            System.out.println("4. Back");
            System.out.println("=======================");
            System.out.print("Pilih Jadwal Praktek yang ingin dilihat : ");
            p = userInput.nextInt();
            while (p < 1 || p > 4) {
                System.out.println("Pilihan tidak tersedia");
                System.out.print("Pilih Jadwal Praktek yang ingin dilihat : ");
                p = userInput.nextInt();
            }
            System.out.print("\033c");
            switch (p) {
                case 1:
                    for (int i = 0; i < dataDokter.Datadokter.size(); i++) {
                        if (dataDokter.Datadokter.get(i).Jadwal.equals("Pagi")) {
                            System.out.println("Nama Dokter : " + dataDokter.Datadokter.get(i).NamaDokter);
                            System.out.println("Spesialis : " + dataDokter.Datadokter.get(i).Spesialis);
                            System.out.println("Jadwal : " + dataDokter.Datadokter.get(i).Jadwal);
                            System.out.println("===================================");
                        }
                    }
                    System.out.print("Press enter to continue...");
                    userInput.nextLine();
                    userInput.nextLine();
                    break;
                case 2:
                    for (int i = 0; i < dataDokter.Datadokter.size(); i++) {
                        if (dataDokter.Datadokter.get(i).Jadwal.equals("Sore")) {
                            System.out.println("Nama Dokter : " + dataDokter.Datadokter.get(i).NamaDokter);
                            System.out.println("Spesialis : " + dataDokter.Datadokter.get(i).Spesialis);
                            System.out.println("Jadwal : " + dataDokter.Datadokter.get(i).Jadwal);
                            System.out.println("===================================");
                        }
                    }
                    System.out.print("Press enter to continue...");
                    userInput.nextLine();
                    userInput.nextLine();
                    break;
                case 3:
                    for (int i = 0; i < dataDokter.Datadokter.size(); i++) {
                        if (dataDokter.Datadokter.get(i).Jadwal.equals("Malam")) {
                            System.out.println("Nama Dokter : " + dataDokter.Datadokter.get(i).NamaDokter);
                            System.out.println("Spesialis : " + dataDokter.Datadokter.get(i).Spesialis);
                            System.out.println("Jadwal : " + dataDokter.Datadokter.get(i).Jadwal);
                            System.out.println("===================================");
                        }
                    }
                    System.out.print("Press enter to continue...");
                    userInput.nextLine();
                    userInput.nextLine();
                    break;
                case 4:
                    // menuAwalPasien();
                    break;
            }
        }while(p != 4);

    }
    
}
