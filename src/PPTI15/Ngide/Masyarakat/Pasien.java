package PPTI15.Ngide.Masyarakat;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.InputStreamReader;

public class Pasien {
    static Scanner sc = new Scanner(System.in);
    static String nama="Pasient 1";
    static String alamat="Jl. Pasient 1";
    static String noHp="08123456789";
    int umur=20;
    static String Keluhan="Sehat";
    
    public void ShowPasien() {
        System.out.println("Nama : "+nama);
        System.out.println("Alamat : "+alamat);
        System.out.println("No Hp : "+noHp);
        System.out.println("Umur : "+umur);
    }
    
    // konsultasi
    public void CreatePasien() {
        System.out.println("Masukan Nama Pasient");
        this.nama = sc.nextLine();
        System.out.println("Masukan Alamat Pasient");
        this.alamat = sc.nextLine();
        System.out.println("Masukan Kontak Pasient");
        this.noHp = sc.nextLine();
        System.out.println("Masukan Umur Pasient");
        this.umur = sc.nextInt();
        System.out.println("Masukan Keluhan Pasient");
        this.Keluhan = sc.nextLine();
        System.out.print("\033c");
        System.out.println("Data Pasient Berhasil Di Tambahkan");
        Praktek praktek = new Praktek();
        praktek.Konsultasi();
    }

    public void UpdatePasien() {
        System.out.println("Nama "+nama+" Masukan Nama Pasient");
        this.nama = sc.nextLine();
        System.out.println("Alamat "+alamat+" Masukan Alamat Pasient");
        this.alamat = sc.nextLine();
        System.out.println("Kontak "+noHp+" Masukan Kontak Pasient");
        this.noHp = sc.nextLine();
        System.out.println("Umur "+umur+" Masukan Umur Pasient");
        this.umur = sc.nextInt();
        System.out.println("Masukan Keluhan Pasient");
        this.Keluhan = sc.nextLine();
        System.out.println("Data Pasient Berhasil Di Perbaharui");
    }

}
