package PPTI15.Ngide.Ngide2.RIZAL;

import java.util.ArrayList;
import java.util.Scanner;

class CallCenterr{
    public ArrayList<String> nama = new ArrayList<>();
    public ArrayList<String> nomor = new ArrayList<>();

    public void initialize(){
        nama.add("Sentul");
        nomor.add("1-234-567");
        nama.add("Jakarta");
        nomor.add("1-345-978");
    }
    
    public void view(){
        System.out.println("Call Center ");
        System.out.println(nama);
        System.out.println(nomor);
    }

    public void tambah(){
        Scanner daerah = new Scanner(System.in);

        System.out.printf("Masukkan daerah cabang baru : ");
        String daerahBaru = daerah.nextLine();

        System.out.printf("Masukkan no telp cabang baru :");
        String noTelp = daerah.nextLine();

        nama.add(daerahBaru);
        nomor.add(noTelp);
    }

    public void deleteCabang(){
        Scanner delete = new Scanner(System.in);
        System.out.printf("Nama yang ingin dihapus : ");
        String cabang = delete.nextLine();
        int index = nama.indexOf(cabang);



//        System.out.println(index);

        nama.remove(index);
        nomor.remove(index);


    }
}