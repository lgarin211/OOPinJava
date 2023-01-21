package PPTI15.Ngide.Ngide2.RIZAL;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
        Scanner input = new Scanner(System.in);
        int menu = input.nextInt();

        switch (menu){
            case 1:
                System.out.println("Anda memilih menu reservasi");
                System.out.println();
//                Reservasi();
                break;
            case 2:
//                Berobat();
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