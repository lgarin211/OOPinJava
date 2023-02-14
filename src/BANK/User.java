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
        System.out.println("Tekan Enter untuk melanjutkan ... ");
        ss.nextLine();
        System.out.println("\033[H\033[2J");
        System.out.flush();
        // System.out.println("=====================================");
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
        System.out.println("1. Tabungan");
        System.out.println("2. Deposito");
        System.out.print("Pilih Jenis Penyimpanan : ");
        

        int pilih = Main.validangka();
        switch (pilih) {
            case 1:
                Tabungan tab = new Tabungan();
                tab.BuatTabungan();
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
            System.out.println("1. Tabungan");
            System.out.println("2. Deposito");
            System.out.print("Pilih Jenis Penarikan : ");
            
            pilih = Main.validangka();
        } while (!(pilih<3));
        switch (pilih) {
            case 1:
                Tabungan tab = new Tabungan();
                tab.TarikSaldo();
                break;
            case 2:
                Deposito depo = new Deposito();
                depo.tarikdeposito(Norek);
                break;
        }
    }

    public static void graf(){
        System.out.println("===================================================");
        System.out.println("Selamat Datang di ABC Bank, "+Main.ActiveUser.Nama);
        System.out.println("===================================================");
        System.out.println("   ___  ______  _____  ______  ___   _   _  _   __");
        System.out.println("  / _ \\ | ___ \\/  __ \\ | ___ \\/ _ \\ | \\ | || | / /");
        System.out.println(" / /_\\ \\| |_/ /| /  \\/ | |_/ / /_\\ \\|  \\| || |/ / ");
        System.out.println(" |  _  || ___ \\| |     | ___ \\  _  || . ` ||    \\ ");
        System.out.println(" | | | || |_/ /| \\__/\\ | |_/ / | | || |\\  || |\\  \\");
        System.out.println(" \\_| |_/\\____/  \\____/ \\____/\\_| |_/\\_| \\_/\\_| \\_/");
        System.out.println("                                                        ");
        System.out.println("===================================================");
    }

    public void MenuUser(){
        acviUser=Main.ActiveUser;
        // System.out.println("Jalan");
        boolean status=true;
        while(status){

            int pilih;
            do {
                System.out.println("\033[H\033[2J");
                graf();
                System.out.println("1. Cek Saldo");
                System.out.println("2. Tarik Tunai");
                System.out.println("3. Setor Tunai");
                System.out.println("4. Mutasi Rekening");
                System.out.println("5. Keluar");
                System.out.println("===================================================");
                System.out.print("Pilih ");
                pilih = Main.validangka();    
            } while (!(pilih<=5));
            
            switch (pilih) {
                case 1:
                    Main.clear();
                    double Saldo=0;
                    for (Tabungan temp : Main.DataTabungan) {
                        if (temp.Norek.equals(acviUser.Norek)) {
                            Saldo+=temp.Saldo;
                        }
                    }
                        
                    // for (Deposito temp : Main.DataDeposito) {
                    //     if (temp.Norek.equals(acviUser.Norek)) {
                    //         Saldo+=temp.Saldo;
                    //     }
                    // }

                    System.out.println("Hallo, "+(acviUser.Nama));
                    System.out.println("Saldo Anda : "+String.format("%,.2f",Saldo));
                    Main.enter();
                    Main.clear();
                    break;
                case 2:
                    Main.clear();
                    System.out.println("Hallo, "+(acviUser.Nama));
                    tariksaldo();
                    clearscrean();
                    break;
                case 3:
                    Main.clear();
                    System.out.println("Hallo, "+(acviUser.Nama));
                    addsaldo();
                    clearscrean();
                    break;
                case 4:
                    Main.clear();
                    System.out.println("Hallo, "+(acviUser.Nama));
                    System.out.println("Mutasi Rekening Anda");
                    System.out.println("====================");

                    for (Log temp : Main.DataLog) {
                        if (temp.Norek.equals(acviUser.Norek)) {
                            System.out.println(temp.Tanggal+"|"+temp.Keterangan+"|"+temp.Saldo);
                        }   
                    }
                    clearscrean();
                break;
                case 5:
                    
                    System.out.println("Terima Kasih Telah Menggunakan Bank ABC");
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
