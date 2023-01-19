package PPTI15.Ngide.Masyarakat;

import java.util.ArrayList;

public class Dokter extends Pasien {
    String NamaDokter="empy";
    String Spesialis="empy";
    String Jadwal="empy";
    String Ruangan="empy";
    // Cekpasiend

   //save data
    public void savedata(String NamaDokter,String Spesialis,String  Jadwal,String Ruangan){
        this.NamaDokter=NamaDokter;
        this.Spesialis=Spesialis;
        this.Jadwal=Jadwal;
        this.Ruangan=Ruangan;
    }
    // ShowDokter
    public void ShowDokter(){
        System.out.println("Nama Dokter : "+NamaDokter);
        System.out.println("Spesialis : "+Spesialis);
        System.out.println("Jadwal : "+Jadwal);
        System.out.println("Ruangan : "+Ruangan);
        System.out.println("Semoga anda lekas Sembuh");
    } 
    // CreateDokter
    public void CreateDokter(){
        System.out.println("Silahkan Isi Data Diri Anda");
        System.out.print("Nama Dokter : ");
        NamaDokter=sc.nextLine();
        System.out.print("Spesialis : ");
        Spesialis=sc.nextLine();
        System.out.print("Jadwal : ");
        Jadwal=sc.nextLine();
        System.out.print("Ruangan : ");
        Ruangan=sc.nextLine();
        savedata(NamaDokter,Spesialis,Jadwal,Ruangan);
    }
}
