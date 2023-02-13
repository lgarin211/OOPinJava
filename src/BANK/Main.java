package BANK;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

import javax.xml.crypto.Data;

import PPTI15.Ngide.BCase.B;

public class Main {
    public static ArrayList<User> Datausers = new ArrayList<User>();
    public static ArrayList<Log> DataLog = new ArrayList<Log>();
    public static ArrayList<Deposito> DataDeposito = new ArrayList<Deposito>();
    
    public static User ActiveUser=null;
    public static Scanner is=new Scanner(System.in);
    public static Scanner ss=new Scanner(System.in);

    public static ArrayList<User> getDatausers() {
        return Datausers;
    }

    public static void addBunga_Tabungan() {
        for (User user : Datausers) {
            user.Saldo = user.Saldo + (user.Saldo * (0.025/12));
            user.Saldo = Math.round(user.Saldo);
        }
    }
    public static void dummy(){
        Datausers.add(new User("1234567890", "Rizky", "252531", 1000000));
        Datausers.add(new User("1234567891", "Rudy", "252531", 90000000)); 
        Datausers.add(new User("121", "Rizal", "212", 8000000));
        
        DataDeposito.add(new Deposito(DataDeposito.size(), 2000000,200, 3, "123",LocalDate.of(2022, 8, 1)));

    }
    
    public static void auth(){
        while(ActiveUser==null){
            System.out.println("nomor Rekening : ");
            String norek = is.nextLine();
            System.out.println("Pin : ");        
            String pin = is.nextLine();
            ActiveUser = new User().LoginUser(norek, pin);
            if(ActiveUser==null){
                System.out.println("Norek atau Pin Salah");
            }
        }
    }


    public static void Nasabah(){
        ActiveUser.MenuUser();
    }

    public static void main(String[] args) {
        dummy();
        boolean status=true;
        while(status){
            System.out.println("Selamat Datang di Bank PPTI");
            System.out.println("Silahkan Login Terlebih Dahulu");
            System.out.println("=====================================");
            auth();
            System.out.println("=====================================");
            System.out.println("Selamat Datang "+ActiveUser.Nama);
            System.out.println("=====================================");
            Nasabah();
        }       
    }
}
