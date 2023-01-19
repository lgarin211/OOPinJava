package PPTI15.Ngide.Masyarakat;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.InputStreamReader;

public class Praktek extends Pasien {
    static Scanner scan = new Scanner(System.in);
    static String Dokter=" ";
    static String Waktu=" ";
    static String Tanggal=" ";
    static String Ruangan=" ";
    static String Keluhan=" ";
    static String Solusi=" ";
    static String resepobatx=" ";
    static String LamaKeluhan=" ";
    
    // QNA
    static void berkeluh(){
        System.out.println("1. Ya\n2. Tidak");
        int pilih = scan.nextInt();
        if(pilih==1){
            System.out.println("Silahkan Beri Keluhan Anda");
            String pa=scan.nextLine();
            Keluhan+=pa+",";
            System.out.println("Berapa Lama Anda Mengalami Keluhan Ini ?");
            String pb=scan.nextLine();
            LamaKeluhan=pb+",";
            System.out.println("Apakah Anda Mengalami Gejala Lain ?");
            berkeluh();
        }else{
            LamaKeluhan+=".";
        }
    }
    public void QNA() {
        System.out.println("Hallo "+nama+" Saya Dokter "+Dokter+"Bisa Saya Bantu ?");
        System.out.println("Hallo "+nama+" Saya Dokter "+Dokter+"Bisa Saya Bantu ?");
        berkeluh();
        System.out.print("\033c");
        System.out.println("Keluhan Anda : \n"+Keluhan+"\nTelah di rekam dan akan di proses Oleh Dokter Di Harap Di tunggu : \n");

    }

    public void Konsultasi() {
        System.out.println("Nama : "+nama);
        System.out.println("Keluhan : "+Keluhan);
        System.out.println("silahkan Pilih Dokter Anda");
        for (int i = 0; i < Main.DataDokter.size(); i++) {
            System.out.println((i+1)+". "+Main.DataDokter.get(i).Spesialis+" : "+Main.DataDokter.get(i).NamaDokter);
        }
        int pilih = scan.nextInt();
        String Dokter=Main.DataDokter.get(pilih-1).NamaDokter;
        System.out.println("Anda Memilih Dokter : "+Main.DataDokter.get(pilih-1).NamaDokter);
        System.out.println("Silahkan Tunggu");
        System.out.println("Dokter : "+Main.DataDokter.get(pilih-1).NamaDokter+" Siap Melayani Anda");
        QNA();
    }
}
