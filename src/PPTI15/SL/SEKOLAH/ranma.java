package SEKOLAH;
import AUTH.Auth;
import GURU.Guru;
import SISWA.Siswa;

import java.util.*;
import java.lang.*;

public class ranma {
    public static ranma sekolah=new ranma();
    public ArrayList<Auth> DataAUTH=new ArrayList<Auth>();
    public ArrayList<Guru> DataGuru=new ArrayList<Guru>();
    public ArrayList<Siswa> DataSiswa=new ArrayList<Siswa>();

    public String IdLogin="-";    

    public void Dummy(){
        DataAUTH.add(new Auth("ID01", "Ferren Andrea", "FerrenA", "AgusGanteng", "Perempuan", "089625259980","GURU"));
        DataAUTH.add(new Auth("ID02", "AGUSTINUs", "Lgarin211", "AgusGanteng", "Laki-laki", "089625259980","Siswa"));

        DataGuru.add(new Guru("GURU01", "5 Tahun","ID01"));
        DataGuru.add(new Guru("GURU01", "5 Tahun","ID01"));
        DataGuru.add(new Guru("GURU01", "5 Tahun","ID01"));

        DataSiswa.add(new Siswa("ID02", "0039101372", "Kelas 1"));
    }

    

    public static void main(String[] args) {
        sekolah.Dummy();
        // login
        System.out.println("\033[H\033[2J");
        System.out.println("Selamat Datang di Aplikasi Sekolah");
        sekolah.login();
        System.out.println(sekolah.IdLogin);
    }

        // welcome
        public void login(){
            Scanner scan=new Scanner(System.in);
            System.out.println("Silahkan Login");
            System.out.println(sekolah.DataAUTH.size());
            while(sekolah.IdLogin.equals("-")){
                System.out.print("Username: ");
                String username=scan.nextLine();
                System.out.print("Password: ");
                String password=scan.nextLine();
                if(sekolah.IdLogin.equals("-")){
                    String pat=sekolah.Login(username, password);
                    sekolah.IdLogin=pat;
                    System.out.println("\033[H\033[2J");
                    System.out.println("Login Berhasil");
                    sekolah.Logined();
                    break;
                }else{
                    System.out.println("Login Gagal");
                }
            }
        }

        public String Login(String username, String password){
            
        }

        public void Logined(){
            for ( Auth auth : sekolah.DataAUTH ) {
                if ( auth.getID().equals( sekolah.IdLogin ) ) {
                    System.out.println("Selamat Datang " + auth.Name() + " di Aplikasi Sekolah");
                    if ( auth.getLevel().equals( "GURU" ) ) {
                        System.out.println("Anda Login Sebagai Guru");
                    }
                }
            }
            
        }
}