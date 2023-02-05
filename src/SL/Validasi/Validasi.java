package SL.Validasi;

import java.util.Scanner;

public class Validasi {

    private static Scanner pilih = new Scanner(System.in);

    public static void Enter() {
        System.out.print("Press enter to continue...");
        pilih.nextLine();
    }

    public static int pilih (int a, int b) {
        
        int choice;
        do {
            try {
                choice = pilih.nextInt();
                pilih.nextLine();
                if (choice < a || choice > b) {
                    System.out.println("Pilih menu antara 1-3!");
                    System.out.print("Pilih [1-3]: ");
                }
            } catch (Exception e) {
                System.out.println("Pilih menu antara 1-3!");
                System.out.print("Pilih [1-3]: ");
                choice = 0;
            }
        } while (choice < a || choice > b);
        return choice;
    }


}