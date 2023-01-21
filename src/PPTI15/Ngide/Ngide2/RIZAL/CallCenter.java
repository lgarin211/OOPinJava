package PPTI15.Ngide.Ngide2.RIZAL;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class CallCenter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;
        CallCenterr panggil = new CallCenterr();
        panggil.initialize();
        do{
            System.out.println("Welcome to Call Center OOP Hospital");
            System.out.println("===================================\n");
            System.out.println("Pilihan menu : ");
            System.out.println("1. Tambah Call Center");
            System.out.println("2. View Call Center");
            System.out.println("3. Delete Call Center");
            System.out.printf("Select : ");
            menu = input.nextInt();

            switch (menu){
                case 1:
                    panggil.tambah();
                    break;
                case 2:
                    panggil.view();
                    break;
                case 3:
                    panggil.deleteCabang();
                    break;
            }
        }while(menu != 4);
    }
}

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
