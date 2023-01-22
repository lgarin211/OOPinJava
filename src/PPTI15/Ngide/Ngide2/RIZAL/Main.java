package PPTI15.Ngide.Ngide2.RIZAL;

import java.util.Scanner;

import PPTI15.Ngide.Masyarakat.Pasien;

import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Selamat Datang Masuk Sebagai \n 1. Pasien \n 2. Dokter");
        Scanner input = new Scanner(System.in);
        int masuk=input.nextInt();
        switch (masuk) {
            case 1:
                Pasiendmasuk();       
                break;        
            case 2:
                // belumjadi    //    
                break;        
            default:
                break;
        }
    }

    
    public static void Pasiendmasuk() {
        System.out.print("\033c");
        System.out.println("WELCOME TO OOP HOSPITAL\n");

        System.out.println("Menu OOP HOSPITAL APPS");
        System.out.println("======================");
        System.out.println("1. Reservasi");
        System.out.println("2. Berbobat");
        System.out.println("3. Jadwal Praktik Dokter");
        System.out.println("4. Fasilitas Rumah Sakit");
        System.out.println("5. Call Center");
        System.out.println("6. Exit");

        System.out.printf("Select menu : ");
        // Scanner input = new Scanner(System.in);
        int menu = input.nextInt();

        switch (menu){
            case 1:
                System.out.println("Anda memilih menu reservasi");
                System.out.println();
//                Reservasi();
                break;
            case 2:
                System.out.println("Anda memilih menu berobat");
                System.out.println();
                Pasien dPasien = new Pasien();
                break;
            case 3:
//                JadwalPraktik();
                break;
            case 4:
//                Fasilitas();
                break;
            case 5:
//                CallCenter();
                break;
            case 6:
                System.out.println("Thank you for using OOP HOSPITAL apps");
                break;
        }
    }
}