package BANK;
import java.time.LocalDate;
import java.util.*;

public class User {
    public static Scanner is=new Scanner(System.in);
    public static Scanner ss=new Scanner(System.in);

    int id;
    String Norek;
    String Nama;
    String Pin;
    double Saldo;

    User acviUser = null;
    ArrayList<User> dataUser = Main.getDatausers();

    public User(String norek, String nama, String pin, int saldo) {
        this.Norek = norek;
        this.Nama = nama;
        this.Pin = pin;
        this.Saldo = saldo;
    }

    public void clearscrean(){
        System.out.println("Enter To continue ... ");
        ss.nextLine();
        System.out.println("\033[H\033[2J");
        System.out.flush();
        System.out.println("=====================================");
    }

    public User() {

    }

    public boolean Totaltarikan(){
        ArrayList<Log> MyList = new ArrayList<Log>();
        int Total=0;
        for (Log log : Main.DataLog) {
            if (log.Norek==acviUser.Norek) {
                if (log.Tanggal.equals(LocalDate.now())) {
                    if (log.Keterangan.equals("Tarik Tabungan ")) {
                        Total+=log.Saldo;
                    }
                }
            }
        }

        if (Total<10000000) {
            return true;
        }else{
            return false;
        }
    }

    public void addsaldo() {
        System.out.println("Pilih Jenis Penyimpanan : ");
        System.out.println("1. Tabungan");
        System.out.println("2. Deposito");

        int pilih = is.nextInt();
        switch (pilih) {
            case 1:
                if(Totaltarikan()){
                    System.out.println("Masukan Jumlah Uang : ");
                    double uang = is.nextInt();
                    this.Saldo = this.Saldo + uang;
                    Main.Datausers.get(Main.Datausers.indexOf(this)).Saldo = this.Saldo;
                    Main.DataLog.add(new Log(Main.DataLog.size()+1, acviUser.Norek, "Setor Tabungan "+uang, acviUser.Saldo));
                }
                break;
            case 2:
                Deposito depo = new Deposito();
                depo.addeposito(Norek);
                break;
        }
    }

    public void tariksaldo() {
        int pilih=0;
        do {
            System.out.println("Pilih Jenis Penarikan : ");
            System.out.println("1. Tabungan");
            System.out.println("2. Deposito");
            pilih = is.nextInt();
        } while (!(pilih<3));
        switch (pilih) {
            case 1:
                double uang ;
                do {
                    System.out.println("Masukan Jumlah Uang : ");
                    uang = is.nextInt();
                } while (!(uang<=this.Saldo));
                
                this.Saldo = this.Saldo - uang;
                Main.Datausers.get(Main.Datausers.indexOf(this)).Saldo = this.Saldo;
                Main.DataLog.add(new Log(Main.DataLog.size()+1, acviUser.Norek, "Tarik Tabungan "+uang, acviUser.Saldo));
                break;
            case 2:
                Deposito depo = new Deposito();
                depo.tarikdeposito(Norek);
                break;
        }
    }

    public static void graf(){
        System.out.println("   ___  ______  _____  ______  ___   _   _  _   __");
        System.out.println("  / _ \\ | ___ \\/  __ \\ | ___ \\/ _ \\ | \\ | || | / /");
        System.out.println(" / /_\\ \\| |_/ /| /  \\/ | |_/ / /_\\ \\|  \\| || |/ / ");
        System.out.println(" |  _  || ___ \\| |     | ___ \\  _  || . ` ||    \\ ");
        System.out.println(" | | | || |_/ /| \\__/\\ | |_/ / | | || |\\  || |\\  \\");
        System.out.println(" \\_| |_/\\____/  \\____/ \\____/\\_| |_/\\_| \\_/\\_| \\_/");
        System.out.println("                                                        ");
       System.out.println("========================================================");
    }

    public void MenuUser(){
        acviUser=Main.ActiveUser;
        // System.out.println("Jalan");
        boolean status=true;
        while(status){
            graf();
            int pilih;
            do {
                System.out.println("1. Cek Saldo");
                System.out.println("2. Tarik Tunai");
                System.out.println("3. Setor Tunai");
                System.out.println("4. Mutasi");
                System.out.println("5. Keluar");
                System.out.println("Pilih : ");
                pilih = is.nextInt();    
            } while (!(pilih<=5));
            System.out.println(acviUser.Nama);
            switch (pilih) {
                case 1:
                    System.out.println("Saldo Anda : "+acviUser.Saldo);
                    break;
                case 2:
                    tariksaldo();
                    clearscrean();
                    break;
                case 3:
                    addsaldo();
                    clearscrean();
                    break;
                case 4:
                    System.out.println("Mutasimu");
                    for (int i = 0; i < Main.DataLog.size(); i++) {
                        if (Main.DataLog.get(i).Norek.equals(acviUser.Norek)) {
                            System.out.println(Main.DataLog.get(i).Tanggal+"|"+Main.DataLog.get(i).Keterangan+"|"+Main.DataLog.get(i).Saldo);
                        }
                    }
                    clearscrean();
                break;
                case 5:
                    System.out.println("Terima Kasih Telah Menggunakan ATM PPTI");
                    Main.ActiveUser=null;
                    status=false;
                    clearscrean();
                    break;
            }
        }
    }

    public User LoginUser(String Norek, String Pin) {
        User user = new User();
        for (int i = 0; i < dataUser.size(); i++) {
            if (dataUser.get(i).Norek.equals(Norek) && dataUser.get(i).Pin.equals(Pin)) {
                user = dataUser.get(i);
                this.Norek = user.Norek;
                this.Nama = user.Nama;
                this.Pin = user.Pin;
                this.Saldo = user.Saldo;
                break;
            }else{
                user=null;
            }
        }
        return user;
    }
    
}
