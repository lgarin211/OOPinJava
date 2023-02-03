package PPTI15.Session6.TRYSL2.GURU;

import PPTI15.Session6.TRYSL2.MATAKULIAH.MATAKULIAH;
import java.util.ArrayList;
import java.util.Scanner;

public class GURU {
    public String Nama_GURU;
    public String NIP;

    public GURU(){}

    public GURU(String Nama_GURU, String NIP) {
        this.Nama_GURU = Nama_GURU;
        this.NIP = NIP;
    }

    public void getdata() {
        System.out.println("Nama Guru : " + Nama_GURU);
        System.out.println("NIP : " + NIP);
    }

    public String getNIP() {
        return NIP;
    }



}
