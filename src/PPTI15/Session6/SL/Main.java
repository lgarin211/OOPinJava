package PPTI15.Session6.SL;

import java.util.Scanner;

import PPTI15.Session04.main;
import PPTI15.Session6.SL.Guru.GURU;
import PPTI15.Session6.SL.Matkul.Matkul;
import PPTI15.Session6.SL.Matkul.Tugas.Tugas;

public class Main {

    public static void DUMMY(){
        new GURU().DUMMY();
        new Tugas().DUMMY();
        new Matkul().DUMMY();
    }

    public static void main(String[] args) {
        System.out.println("Login");
        System.out.println("1. Guru");
        System.out.println("2. Siswa");
        System.out.println("3. Keluar");
        System.out.print("Pilih: ");
        Scanner input = new Scanner(System.in);
        int pilih = input.nextInt();
        switch (pilih) {
            case 1:
                GURU guru = new GURU();
                String Login=guru.login();
                guru.menu();
                break;
        
            default:
                break;
        }
    }
}
