package PPTI15.Ngide.Ngide2;

import java.util.ArrayList;
import java.util.*;

public class Dokter{
    String NamaDokter="empy";
    String Spesialis="empy";
    String Jadwal="empy";
    String Ruangan="empy";

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Dokter> Datadokter = new ArrayList<Dokter>();
    static Dokter dokter = new Dokter();

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
            System.out.println(i+". "+pin.NamaDokter+" Spesialis : "+pin.Spesialis);
        }
    } 

    // CreateDokter
    public void makeDokter(){
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
