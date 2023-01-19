package PPTI15.Ngide.Masyarakat;

import java.util.ArrayList;
import java.util.Scanner;

import PPTI15.Session03.Array;

import java.io.InputStreamReader;


public class Main {
    static Pasien pasien = new Pasien();
    static Dokter dokter = new Dokter();
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Pasien> Datapasien = new ArrayList<Pasien>();
    static ArrayList<Dokter> DataDokter = new ArrayList<Dokter>();
    
    static void inopi(int index){
        System.out.print("\033c");
        System.out.println("Pasient Yang Terhormat Selamat Datang Di Rumah Sakit Kami");
        pasien=new Pasien();
        pasien.CreatePasien();
        Datapasien.add(pasien);
    }

    static void showall(){
        int leng=Datapasien.size();
        for (int i = 0; i < leng; i++) {
            System.out.println("Pasient "+(i+1));
            Datapasien.get(i).ShowPasien();
            System.out.println("Keluhan : "+Datapasien.get(i).Keluhan);
        }
    }
    public static void dummyDokter(){
        String NamaDokter="Dr. Ngide";
        String Spesialis="Dokter Umum";
        String Jadwal="Senin - Jumat";
        String Ruangan="Ruang 1";
        dokter = new Dokter();
        dokter.savedata(NamaDokter,Spesialis,Jadwal,Ruangan);
        DataDokter.add(dokter);

        NamaDokter="Dr. Idris";
        Spesialis="Dokter Gigi";
        Jadwal="Senin - Jumat";
        Ruangan="Ruang 2";
        dokter = new Dokter();
        dokter.savedata(NamaDokter,Spesialis,Jadwal,Ruangan);
        DataDokter.add(dokter);

        NamaDokter="Dr. Lala";
        Spesialis="Dokter Gizi";
        Jadwal="Senin - Jumat";
        Ruangan="Ruang 3";
        dokter = new Dokter();
        dokter.savedata(NamaDokter,Spesialis,Jadwal,Ruangan);
        DataDokter.add(dokter); 
    } 

    static void Dcd(){
        int leng=DataDokter.size();
        for (int i = 0; i < leng; i++) {
            System.out.println("Dokter "+(i+1));
            DataDokter.get(i).ShowDokter();
        }
    }

    public static void main(String[] args) {
        dummyDokter();
        int a=0;
        int pit=0;
        do {
            System.out.println("Selamat Datang Di Rumah Sakit Kami");
            System.out.println("Silahkan Pilih Menu");
            // 1. Reservasi 2. berobat 3. login dokter 4. login admin
            System.out.println("1. Reservasi\n2. Berobat\n3. Login Dokter\n4. Login Admin\n5. Keluar");
            pit++;
            a=sc.nextInt();
            switch (a) {
                case 2:
                    inopi(pit);
                    break;  
                case 6:
                    showall();
                case 7:
                    Dcd();
                    break;  
                default:
                    break;
        }
       } while (a!=5);
       
    }
}
