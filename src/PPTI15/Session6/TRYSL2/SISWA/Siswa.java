package PPTI15.Session6.TRYSL2.SISWA;

import java.util.Random;
import java.util.Scanner;
public class Siswa {
    String nama;
    String alamat;
    String kelas;
    String idString ;


    public Siswa(String nama, String alamat, String kelas){
        this.nama = nama;
        this.alamat = alamat;
        this.kelas = kelas;
        Random random = new Random();
        this.idString = String.format("%04d", random.nextInt(10000)); 
    }

    public Siswa(){}

    public Siswa siswaBaru() {
        Scanner input = new Scanner(System.in);
        int i=1;
        Siswa newsiswa=new Siswa();
        while (i==1){
            try {
                System.out.println("Masukan Nama Siswa");
                String nama=input.nextLine();
                System.out.println("Masukan Alamat Siswa");
                String alamat=input.nextLine();
                System.out.println("Masukan Kelas Siswa");
                String kelas=input.nextLine();
                newsiswa = new Siswa(nama, alamat, kelas);
                i=0;
            } catch (Exception e) {
                System.out.print("\033[H\033[2J");
                System.out.println("Inputan salah Harap Periksa Input dengan Benar");
            }
        }
        // System.out.println(newsiswa.idString+"  "+newsiswa.nama+"  "+newsiswa.alamat+"  "+newsiswa.kelas);
        return newsiswa;
    }
    
    public void getdata(){
        System.out.println("Data++++++++++++++++++++++++++");
        System.out.println("Nama : "+this.nama);
        System.out.println("Alamat : "+this.alamat);
        System.out.println("Kelas : "+this.kelas);
        System.out.println("ID : "+this.idString);
        System.out.println("++++++++++++++++++++++++++++++");
    }
}
