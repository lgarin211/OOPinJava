package PPTI15.Session6.SL.Matkul.Tugas;

import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.crypto.Data;

import PPTI15.Session6.SL.Matkul.Matkul;

public class Tugas extends Matkul {
    String Nama_Tugas;
    int Nilai;
    String NIM;
    String NIP = super.NIP;
    String Kode_Matkul;
    ArrayList<Tugas> DATATUGAS = new ArrayList<Tugas>();

    public Tugas(String Nama_Tugas, String NIP) {
        this.Nama_Tugas = Nama_Tugas;
        this.Nilai=0;
        this.NIP=super.NIP;
        this.Kode_Matkul=super.Kode_Matkul;
    }

    public void tampilTugas(String NIP) {
        DATATUGAS.forEach((tugas)->{
            if (tugas.NIP.equals(NIP)) {
                System.out.println("Nama Tugas: "+tugas.Nama_Tugas);
                System.out.println("Nilai: "+tugas.Nilai);
                System.out.println("Nilai: "+tugas.NIP);
                System.out.println("Nilai: "+tugas.Kode_Matkul);
            }
        });
    }

    public void tambahTugas(String Nama_Tugas, String Kode_Matkul, String NIP) {
        DATATUGAS.add(new Tugas(Nama_Tugas, NIP));
    }

    public void DUMMY(){
        DATATUGAS.add(new Tugas("Tugas 1", "EMPTY"));
        DATATUGAS.add(new Tugas("Tugas 2", "EMPTY"));
    }

    public Tugas() {
    }
    
}
