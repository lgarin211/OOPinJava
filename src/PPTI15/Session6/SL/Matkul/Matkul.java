package PPTI15.Session6.SL.Matkul;

import java.util.ArrayList;
import java.util.Scanner;

import PPTI15.Session6.SL.Guru.GURU;

public class Matkul {
    public String Nama_Matkul;
    public String Kode_Matkul;
    public String NIP= GURU.NIP;
    ArrayList<Matkul> DATAMATKUL = new ArrayList<Matkul>();

    public Matkul(String Nama_Matkul,String Kode_Matkul,String NIP) {
        this.Nama_Matkul = Nama_Matkul;
        this.Kode_Matkul = Kode_Matkul;
        this.NIP = NIP;
    }
    
    public Matkul(String Nama_Matkul,String Kode_Matkul) {
        this.Nama_Matkul = Nama_Matkul;
        this.Kode_Matkul = Kode_Matkul;
    }
    
    public Matkul() {
    }

    public void tambahMatkul() {
        System.out.println("Silahkan Masukan Nama Mata Kuliah");
        Scanner input = new Scanner(System.in);
        String Nama_Matkul=input.nextLine();
        System.out.println("Silahkan Masukan Kode Mata Kuliah");
        String Kode_Matkul=input.nextLine();
        tambahMatkul(Nama_Matkul,Kode_Matkul,NIP);
        System.out.println("Mata Kuliah Berhasil Ditambahkan");
    }

    public void tambahMatkul(String Nama_Matkul,String Kode_Matkul,String NIP) {
        DATAMATKUL.add(new Matkul(Nama_Matkul,Kode_Matkul,NIP));
    }

    public void tampilMatkul() {
        // CONSOLE CLEAR
        System.out.print("\033[H\033[2J");
        System.out.println("Daftar Mata Kuliah");
        String TAG=NIP;
        DATAMATKUL.forEach((matkul)->{
            // System.out.println("MATKUL "+matkul.NIP+" "+TAG);
            if (matkul.NIP.equals(TAG)) {
                System.out.println("==================================");
                System.out.println("No : "+DATAMATKUL.indexOf(matkul));
                System.out.println("Nama Mata Kuliah : "+matkul.Nama_Matkul);
                System.out.println("Kode Mata Kuliah : "+matkul.Kode_Matkul);
                System.out.println("==================================");
            }
        });
    }
    public void hapusMatkul() {
        System.out.println("Silahkan Masukan Kode Mata Kuliah");
        Scanner input = new Scanner(System.in);
        String Kode_Matkul=input.nextLine();
        DATAMATKUL.forEach((matkul)->{
            if (matkul.Kode_Matkul.equals(Kode_Matkul)) {
                DATAMATKUL.remove(matkul);
                System.out.println("Mata Kuliah Berhasil Dihapus");
            }
        });
    }
    public void editMatkul() {
        System.out.println("Silahkan Masukan Kode Mata Kuliah");
        Scanner input = new Scanner(System.in);
        String Kode_Matkul=input.nextLine();
        DATAMATKUL.forEach((matkul)->{
            if (matkul.Kode_Matkul.equals(Kode_Matkul)) {
                System.out.println("Silahkan Masukan Nama Mata Kuliah");
                String Nama_Matkul=input.nextLine();
                System.out.println("Silahkan Masukan Kode Mata Kuliah");
                String Kode_MatkulBaru=input.nextLine();
                matkul.Nama_Matkul=Nama_Matkul;
                matkul.Kode_Matkul=Kode_MatkulBaru;
                System.out.println("Mata Kuliah Berhasil Diedit");
            }
        });
    }
}