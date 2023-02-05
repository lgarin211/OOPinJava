package SEKOLAH;
import AUTH.Auth;
import GURU.Guru;
import SISWA.Siswa;

import java.util.*;
import java.lang.*;

public class sekolah {
    public static ranma sekolah=new ranma();
    public static ArrayList<Auth> DataAUTH=new ArrayList<Auth>();
    public static ArrayList<Guru> DataGuru=new ArrayList<Guru>();
    public static ArrayList<Siswa> DataSiswa=new ArrayList<Siswa>();
    
    // data login
    public static Auth authed;
    public static Guru activeguru;

    public static void Dummy(){
        DataAUTH.add(new Auth("ID01", "Ferren Andrea", "FerrenA", "123", "Perempuan", "089625259980","GURU"));
        DataAUTH.add(new Auth("ID02", "AGUSTINUs", "Lgarin211", "123", "Laki-laki", "089625259980","SISWA"));

        DataGuru.add(new Guru("ID01", "0039101372","ID01"));
    
        DataSiswa.add(new Siswa("ID02", "0039101372", "Kelas 1"));
    }


    // login
    public static void login(){
        int i=0;
        Scanner scan=new Scanner(System.in);
        while(authed==null){
            System.out.println("Silahkan Login");
            String username=scan.nextLine(); 
            String password=scan.nextLine();    
            for (Auth auth : DataAUTH) {
                if(auth.getUsername().equals(username) && auth.getPassword().equals(password)){
                    authed=auth;
                    System.out.println("Login Berhasil");
                    System.out.println("Selamat Datang "+auth.Name());
                    break;
                }
            }
            if(authed==null){
                System.out.println("Login Gagal");
            }
        }
    }
    
    
    public static void main(String[] args) {
        Dummy();
        // login
        System.out.println("\033[H\033[2J");
        System.out.println("Selamat Datang di Aplikasi Sekolah");
        login();
        switch (authed.getLevel()) {
            case "SISWA":
                break;
            case "GURU":
                Guru();
                break;

            default:
                break;
        }
        

    }

    public static void Guru(){
        for (Guru guru : DataGuru) {
            if (guru.getID().equals(authed.getID())) {
                activeguru=guru;
                System.out.println(activeguru.NIP);
                // break;
            }
        }

        // System.out.println("Selamat Datang Guru ");
        // // System.out.println(activeguru.NIP);
        Scanner scan = new Scanner(System.in);
        int pilihan=0;
        while (pilihan==0) {
            System.out.println("1. Lihat Data Siswa");
            System.out.println("2. Mata Pelajaran");
            System.out.println("3. Lihat Tugas");
            System.out.println("4. Buat Tugas Baru");
            System.out.println("5. Nilai Tugas");
    
            System.out.println("6. Lihat Ujian");
            System.out.println("6. Buat Ujian Baru");
            System.out.println("7. Nilai Ujian");
            
            System.out.println("6. Lihat Nilai Siswa");
    
            System.out.println("7. Logout");
            pilihan=scan.nextInt();
        }
        
        switch (pilihan) {
            case 1:
                System.out.println("1. Lihat Data Siswa");
                System.out.println(DataSiswa.size());
                // for (Siswa siswa : DataSiswa) {
                //     System.out.println(siswa.sID);
                //     System.out.println(siswa.NIS);
                //     System.out.println(siswa.Kelas);
                // }
                break;
        
            default:
                break;
        }

    }


};