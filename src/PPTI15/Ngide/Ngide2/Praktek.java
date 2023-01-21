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
        // okw.tanyadokternya("dalam bahasa indonesia obat untuk "+Keluhan+"?");
        // okw.tanyadokternya("dalam bahasa indonesia obat untuk pusing ?");
        // System.out.println("Apakah Anda Ingin Menambah Keluhan?");
    }

    public static void Jadwalview(){
        System.out.print("\033c");
        Dokter dataDokter = new Dokter();
        // System.out.println(dataDokter.Datadokter.size());
        System.out.println("===================================");
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
            System.out.print("\033c");
            switch (p) {
                case 1:
                    for (int i = 0; i < dataDokter.Datadokter.size(); i++) {
                        // clear console
                        // System.out.println(dataDokter.Datadokter.get(i).Jadwal);
                        if (dataDokter.Datadokter.get(i).Jadwal.equals("Pagi")) {
                            System.out.println("Nama Dokter : " + dataDokter.Datadokter.get(i).NamaDokter);
                            System.out.println("Spesialis : " + dataDokter.Datadokter.get(i).Spesialis);
                            System.out.println("Jadwal : " + dataDokter.Datadokter.get(i).Jadwal);
                            // System.out.println("Hari : " + dataDokter.Datadokter.get(i).Hari);
                            // System.out.println("Pukul : " + dataDokter.Datadokter.get(i).Pukul);
                            System.out.println("===================================");
                        }
                    }
                    System.out.print("Press enter to continue...");
                    userInput.nextLine();
                    userInput.nextLine();
                    break;
                case 2:
                    for (int i = 0; i < dataDokter.Datadokter.size(); i++) {
                        // clear console
                        // System.out.println(dataDokter.Datadokter.get(i).Jadwal);
                        if (dataDokter.Datadokter.get(i).Jadwal.equals("Sore")) {
                            System.out.println("Nama Dokter : " + dataDokter.Datadokter.get(i).NamaDokter);
                            System.out.println("Spesialis : " + dataDokter.Datadokter.get(i).Spesialis);
                            System.out.println("Jadwal : " + dataDokter.Datadokter.get(i).Jadwal);
                            // System.out.println("Hari : " + dataDokter.Datadokter.get(i).Hari);
                            // System.out.println("Pukul : " + dataDokter.Datadokter.get(i).Pukul);
                            System.out.println("===================================");
                        }
                    }
                    System.out.print("Press enter to continue...");
                    userInput.nextLine();
                    userInput.nextLine();
                    break;
                case 3:
                    for (int i = 0; i < dataDokter.Datadokter.size(); i++) {
                        // clear console
                        if (dataDokter.Datadokter.get(i).Jadwal.equals("Malam")) {
                            System.out.println("Nama Dokter : " + dataDokter.Datadokter.get(i).NamaDokter);
                            System.out.println("Spesialis : " + dataDokter.Datadokter.get(i).Spesialis);
                            System.out.println("Jadwal : " + dataDokter.Datadokter.get(i).Jadwal);
                            // System.out.println("Hari : " + dataDokter.Datadokter.get(i).Hari);
                            // System.out.println("Pukul : " + dataDokter.Datadokter.get(i).Pukul);
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
