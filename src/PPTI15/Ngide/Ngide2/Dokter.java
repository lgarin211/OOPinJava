package PPTI15.Ngide.Ngide2;

import java.util.ArrayList;
import java.util.*;

public class Dokter{
    String NamaDokter;
    String Spesialis;
    String Jadwal;
    String Ruangan;
    int setindex=-1;

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Dokter> Datadokter = new ArrayList<Dokter>();
    static Dokter dokter = new Dokter();
    static Dokter nowloginDokter = new Dokter();
   //save data
    public void savedata(String NamaDokter,String Spesialis,String  Jadwal,String Ruangan){
        Dokter newdokter = new Dokter();
        newdokter.NamaDokter=NamaDokter;
        newdokter.Spesialis=Spesialis;
        newdokter.Jadwal=Jadwal;
        newdokter.Ruangan=Ruangan;
        dokter=newdokter;
        Datadokter.add(dokter);
    }

    // ShowDokter
    public void ShowDokter(){
        for (int i = 0; i < Datadokter.size(); i++) {
            Dokter pin=Datadokter.get(i);
            System.out.println((i+1)+". "+pin.NamaDokter+" Spesialis : "+pin.Spesialis);
        }
    } 

    // CreateDokter
    public void makeDokter(){
        System.out.println("Silahkan Isi Data Diri Anda");
        System.out.print("Nama Dokter : ");
        NamaDokter=sc.nextLine();
        while (NamaDokter.length() > 20) {
            System.out.println("Nama Dokter Maximal 20 Karakter");
            System.out.printf("Masukkan Nama Dokter : ");
            NamaDokter = sc.nextLine();
        }
        System.out.print("Spesialis : ");
        Spesialis=sc.nextLine();
        while (Spesialis.length() > 20) {
            System.out.println("Spesialis Maximal 20 Karakter");
            System.out.printf("Masukkan Spesialis : ");
            Spesialis = sc.nextLine();
        }
        System.out.print("Jadwal [Pagi/Sore/Malam] : ");
        Jadwal=sc.nextLine();
        while (Jadwal.equals("Pagi")||Jadwal.equals("Sore")||Jadwal.equals("Malam")) {
            System.out.println("Jadwal [Pagi/Sore/Malam]");
            System.out.printf("Masukkan Jadwal [Pagi/Sore/Malam]: ");
            Jadwal = sc.nextLine();
        }
        System.out.print("Ruangan : ");
        Ruangan=sc.nextLine();
        savedata(NamaDokter,Spesialis,Jadwal,Ruangan);
    }
    public void kerja(){
        System.out.println("Selamat Datang "+nowloginDokter.NamaDokter);
        System.out.println("Silahkan Pilih Menu");
        System.out.println("1. Lihat Jadwal");
        System.out.println("2. Ubah Jadwal");
        System.out.println("3. logout");
        String choose;
        System.out.print("Pilih Menu : ");
        choose=sc.next();
        while (!choose.equals("1")&&!choose.equals("2")&&!choose.equals("3")) {
            System.out.println("Pilihan Tidak Tersedia");
            System.out.println("Pilih Menu : ");
            choose=sc.next();
        }
        // if(isNumeric)
        switch (choose) {
            case "1":
                System.out.print("\033c");
                System.out.println("Jadwal : "+nowloginDokter.Jadwal);
                System.out.println("Ruangan : "+nowloginDokter.Ruangan);
                kerja();
                break;
            case "2":
                System.out.print("\033c");
                System.out.println("Silahkan Ubah Jadwal");
                do{
                    System.out.print("Jadwal [Pagi/Sore/Malam]: ");
                    nowloginDokter.Jadwal=sc.next();
                }while(!nowloginDokter.Jadwal.equals("Pagi")&&!nowloginDokter.Jadwal.equals("Sore")&&!nowloginDokter.Jadwal.equals("Malam"));
                
                System.out.print("Ruangan : ");
                nowloginDokter.Ruangan=sc.next();
                nowloginDokter.Datadokter.set(setindex, nowloginDokter);
                kerja();
                break;
            case "3":
                System.out.print("\033c");
                System.out.println("Terima kasih");
                // Main.main(null);
                break;
            default:
                break;
        }
    }
    // login
    public void login(){
        System.out.println("Silahkan Login");
        int p=0;
        do{
            Scanner rmp=new Scanner(System.in);
            System.out.print("Nama Dokter : ");
            NamaDokter=sc.nextLine();
            if(NamaDokter.equals("")) {
                NamaDokter = sc.nextLine();
            }
            System.out.println("name: '"+NamaDokter + "'");

            Dokter arta=new Dokter();
            for (int index = 0; index < arta.Datadokter.size(); index++) {
                Dokter oldDokter=arta.Datadokter.get(index);
                if (oldDokter.NamaDokter.equals(NamaDokter)) {
                    nowloginDokter = oldDokter;
                    setindex=index;
                    // p=1;
                    kerja();
                    break;
                }else{
                    // System.out.println("ri");
                    p=1;
                }
            }
    
        }while(p!=0);
    }
}
