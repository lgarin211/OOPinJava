import java.util.ArrayList;

import PPTI15.Session03.Array;

class Mahasiswa{
    String nama;
    String nim;
    String jenisKelamin;
    ArrayList <String> mataKuliah = new ArrayList<String>();
    void soutmatkul(){
        System.out.println("Mata Kuliah yang diambil : ");
        mataKuliah.e
    }
    public Mahasiswa(String nama,String nim,String jenisKelamin) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
    }
    
    public Mahasiswa() {
        this.nama = "Brendi";
        this.nim = "123456789";
        this.jenisKelamin = "Laki-laki";
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama = "Brendi";
        mhs.nim = "123456789";
        mhs.jenisKelamin = "Laki-laki";
        System.out.println("Nama : " + mhs.nama+"NIM : " + mhs.nim+"Jenis Kelamin : " + mhs.jenisKelamin);
    }
}
