package PPTI15.Ngide.Ngide2;

import java.util.ArrayList;
import java.util.*;

public class Dokter{
    String NamaDokter="empy";
    String Spesialis="empy";
    String Jadwal="empy";
    String Ruangan="empy";
    int setindex=-1;

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Dokter> Datadokter = new ArrayList<Dokter>();
    static Dokter dokter = new Dokter();
    static Dokter nowloginDokter = new Dokter();
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
            System.out.println((i+1)+". "+pin.NamaDokter+" Spesialis : "+pin.Spesialis);
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
    public void kerja(){
        System.out.println("Selamat Datang "+nowloginDokter.NamaDokter);
        System.out.println("Silahkan Pilih Menu");
        System.out.println("1. Lihat Jadwal");
        System.out.println("2. Ubah Jadwal");
        System.out.println("3. logout");

        int choose;
        System.out.print("Pilih Menu : ");
        choose=sc.nextInt();
        switch (choose) {
            case 1:
                System.out.print("\033c");
                System.out.println("Jadwal : "+nowloginDokter.Jadwal);
                System.out.println("Ruangan : "+nowloginDokter.Ruangan);
                kerja();
                break;
            case 2:
                System.out.print("\033c");
                System.out.println("Silahkan Ubah Jadwal");
                System.out.print("Jadwal : ");
                nowloginDokter.Jadwal=sc.next();
                System.out.print("Ruangan : ");
                nowloginDokter.Ruangan=sc.next();
                nowloginDokter.Datadokter.set(setindex, nowloginDokter);
                kerja();
                break;
            case 3:
                System.out.print("\033c");
                System.out.println("Terimakasih");
                Main.main(null);
                break;
            default:
                break;
        }
    }
    // login
    public void login(){
        System.out.println("Silahkan Login");
        System.out.print("Nama Dokter : ");
        NamaDokter=sc.nextLine();
        Dokter arta=new Dokter();
        for (int index = 0; index < arta.Datadokter.size(); index++) {
            Dokter oldDokter=arta.Datadokter.get(index);
            if (oldDokter.NamaDokter.equals(NamaDokter)) {
                nowloginDokter = oldDokter;
                setindex=index;
            }
        }
        kerja();
    }
}
