package PPTI15.Ngide.Ngide2.RIZAL;

import java.sql.Array;
import java.util.Scanner;

public class CallCenter {
    public static void run() {
        System.out.print("\033c");
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
            System.out.println("4. Back");
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
                case 4:
                    System.out.println("Thank You!\n");
                    break;
            }
        }while(menu != 4);
    }
}
