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
    public static ArrayList<Tabungan> DataTabungan = new ArrayList<Tabungan>();
    
    public static User ActiveUser=null;
    public static Scanner is=new Scanner(System.in);
    public static Scanner ss=new Scanner(System.in);

    public static ArrayList<User> getDatausers() {
        return Datausers;
    }

    public static int validangka(){
        Scanner scan = new Scanner(System.in);
        int a=0;
        boolean nom = false;
        do {
            try {
                System.out.print(">> ");
                String input = scan.next();
                if (input.matches("-?\\d+(\\.\\d+)?")) {
                    a = Integer.parseInt(input);
                    nom=true;
                } else {
                    System.out.println("Harus berupa angka");
                    nom = false;
                }
            } catch (Exception e) {
                System.out.println("Harus berupa angka");
                nom = false;
            }
        } while(nom==false);
        return a;
    }

    public static void addBunga_Tabungan() {
        for (User user : Datausers) {
            user.Saldo = user.Saldo + (user.Saldo * (0.025/12));
            user.Saldo = Math.round(user.Saldo);
        }
    }
    public static void dummy(){
        Datausers.add(new User("1234567890", "Rizky Febrian", "252531", 1000000));
        Datausers.add(new User("1234567891", "Rudy Hartono", "252531", 90000000)); 
        Datausers.add(new User("121", "Rizal Wijaya Purnama", "212", 8000000));
        
        DataDeposito.add(new Deposito(DataDeposito.size(), 2000000,200, 3, "123",LocalDate.of(2022, 8, 1)));

    }
    
    public static void auth(){
        while(ActiveUser == null){
            System.out.print("Nomor Rekening : ");
            String norek = is.nextLine();
            System.out.print("Masukkan Pin : ");
            String pin = is.nextLine();
            ActiveUser = new User().LoginUser(norek, pin);

            if(ActiveUser==null){
                System.out.println("Nomor Rekening atau Pin Salah");
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
            clear();
            System.out.println("Selamat Datang di Bank ABC");
            System.out.println("Silahkan Login Terlebih Dahulu");
            System.out.println("==============================");
            auth();
            clear();
            
            Nasabah();
        }       
    }

    public static void enter(){
        Scanner input = new Scanner(System.in);
        System.out.print("Tekan Enter untuk melanjutkan...");
        input.nextLine();
    }

    public static void clear(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }
}
