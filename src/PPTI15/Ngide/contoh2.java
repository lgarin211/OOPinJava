package PPTI15.Ngide;

import java.util.*;

import PPTI15.Ngide.CODIPON.run;
public class contoh2 {

    static ArrayList<contoh2> c2 = new ArrayList<contoh2>();
    static contoh2 data= new contoh2();


    static int a=10;
    static String nama="null";
    static int umur=0;
    static String alamat="null";

    static void larii(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Masukkan Nama Anda");
        data.nama=sc.next();
        System.out.println("Masukkan Umur Anda");
        data.umur=sc.nextInt();
        System.out.println("Masukkan Alamat Anda");
        data.alamat=sc.next();
        System.out.println("Nama Anda Adalah "+nama);
        System.out.println("Umur Anda Adalah "+umur);
        System.out.println("Alamat Anda Adalah "+alamat);
        c2.add(data);
        System.out.println(c2.size());
    }

    static void showdata(int a){
        System.out.println(c2.get(a).nama);
        System.out.println(c2.get(a).umur);
        System.out.println(c2.get(a).alamat);
    }

    static void put(){
        System.out.println("index 0 sampai "+(c2.size()-1));
        System.out.println("Masukkan Index");
        Scanner sc= new Scanner(System.in);
        int index=sc.nextInt();
        showdata(index);
    }

    static void scans(){
        for (int i = 0; i < 10; i++) {
            int p=0;
            Scanner sc= new Scanner(System.in);
            System.out.println("1. Input Data\n2. Show Data");
            p=sc.nextInt();
            switch (p) {
                case 1:
                    larii();                      
                    break;
                case 2:
                    put();
                    break;
                default:
                    break;
            }
        }
    }
}
