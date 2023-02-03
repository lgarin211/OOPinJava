package PPTI15.Session6.SL.Guru;

import java.util.ArrayList;
import java.util.Scanner;

import PPTI15.Session6.SL.Matkul.Matkul;
import PPTI15.Session6.SL.Matkul.Tugas.Tugas;

public class GURU {
    String Nama_Guru;
    String Password;
    static public String NIP;
    ArrayList<GURU> DATAGURU = new ArrayList<GURU>();

    
    public String menu() {
        System.out.println("Menu");
        System.out.println("1. Lihat Matkul");
        System.out.println("2. Nilai Tugas");
        System.out.println("3. Keluar");
        System.out.print("Pilih: ");
        Scanner input = new Scanner(System.in);
        int pilih = input.nextInt();
        switch (pilih) {
            case 1:
                System.out.println("LIHAT MATAKULIAH");
                Matkul matkul = new Matkul();
                matkul.tambahMatkul("DISCRITMATE","DM",this.NIP);
                matkul.tambahMatkul("BASIC STATISTIC","BS",this.NIP);
                matkul.tampilMatkul();
                break;
            case 2:
                System.out.println("Tugas");
                Tugas tugas = new Tugas();
                tugas.tambahTugas("TUGAS LA","DM",this.NIP);
                tugas.tampilTugas(NIP);
                break;
            case 3:
                System.out.println("Keluar");
                break;
            default:
                break;
        }
        return null;
    }

    public String login() {
        System.out.println("silahkan Masukan Nama Anda");
        Scanner input = new Scanner(System.in);
        String Username=input.nextLine();        
        DATAGURU.forEach((guru)->{
            if (guru.Nama_Guru.equals(Username)) {
                System.out.println("Silahkan Masukan Password Anda");
                String Password=input.nextLine();
                if (guru.Password.equals(Password)) {
                    System.out.println("Password Benar");
                    System.out.println("Selamat Datang "+guru.Nama_Guru);
                    this.Nama_Guru=guru.Nama_Guru;
                    this.NIP=guru.NIP;
                }else{
                    System.out.println("Password Anda Salah");
                }
            }else{
                this.Nama_Guru="Gagal";
            }

        });

        if (!Nama_Guru.equals("Gagal")) {
            return Nama_Guru; 
        }else{
            return this.login();
        }
        
        // this.NIP="1";
        // return "FERREN";
    }
    public GURU(String Nama_Guru,String Password,String NIP) {
        this.Nama_Guru = Nama_Guru;
        this.Password = Password;
        this.NIP = NIP;
    }

    public void DUMMY(){
        DATAGURU.add(new GURU("AGUSTINUS","FERRENCANTIK","1"));        
        DATAGURU.add(new GURU("FERREN","FERRENCANTIK","2"));
    } 

    public GURU() {
        
    }
    
}
