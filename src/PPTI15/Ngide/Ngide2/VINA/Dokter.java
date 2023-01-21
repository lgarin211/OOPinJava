package PPTI15.Ngide.Ngide2.VINA;

import java.util.Scanner;

class Dokter{
    //asumsi satu jadwal praktek, satu dokter
    public static String namaDokter[] = new String[10];
    public static String specialistDokter[] = new String[10];
    Scanner userInput = new Scanner(System.in);

    public void inputDokter(int index){
        System.out.print("Masukkan nama dokter : ");
        namaDokter[index] = userInput.nextLine();

        System.out.print("Masukkan specialist dokter : ");
        specialistDokter[index] = userInput.nextLine();
    }

    public void viewDokter(int index){
        System.out.println("dr. " + namaDokter[index]);
        System.out.println("Specialist " + specialistDokter[index] + "\n");
    }

}