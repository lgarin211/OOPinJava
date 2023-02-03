package PPTI15.Session6.TRYSL2.MATAKULIAH;

import PPTI15.Session6.TRYSL2.GURU.GURU;
import java.util.ArrayList;
import java.util.Scanner;

public class MATAKULIAH {
    public String Nama_MAPEL;
    public String NIP;
    public String Nama_RUANGAN;
    public String KODE_MAPEL;

    public MATAKULIAH(String Nama_MAPEL, String KODE_MAPEL, String NIP, String Nama_RUANGAN) {
        this.Nama_MAPEL = Nama_MAPEL;
        this.NIP = NIP;
        this.Nama_RUANGAN = Nama_RUANGAN;
        this.KODE_MAPEL = KODE_MAPEL;
    }

    public void getdata() {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Nama Mata Pelajaran : " + Nama_MAPEL);
        System.out.println("Nama Ruangan : " + Nama_RUANGAN);
        System.out.println("Kode Mata Pelajaran : " + KODE_MAPEL);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++\n");

    }

    public MATAKULIAH() {

    }

    public void getdataMatkul(ArrayList<MATAKULIAH> Pat, String NIP) {
        for (MATAKULIAH mataKULIAH : Pat) {
            if(mataKULIAH.NIP==NIP){
                mataKULIAH.getdata();
            }
        }
    }

    public void NewMatkul(String NIP){
        Scanner input = new Scanner(System.in);
        System.out.println("Nama Mata Pelajaran : ");
        this.Nama_MAPEL=input.nextLine();
        this.NIP=NIP;
        System.out.println("Nama Ruangan : ");
        this.Nama_RUANGAN=input.nextLine();
        System.out.println("Kode Mata Pelajaran : ");
        this.KODE_MAPEL=input.nextLine();
        System.out.println("Data Berhasil DI tambahkan");
    }
}
