package BANK;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.*;

public class Tabungan{
    double Saldo;
    double Bunga;
    String Norek;
    LocalDate tanggalCair = LocalDate.of(LocalDate.now().getYear(), (LocalDate.now().getMonthValue()+1)%12,1);
    Scanner scanDouble=new Scanner(System.in);
    Scanner scanInt=new Scanner(System.in);
    Tabungan(){
        plusBunga();
    }

    Tabungan(double Saldo){
        this.Saldo=Saldo;
        this.Bunga=Saldo*(0.025/12);
        this.Norek=Main.ActiveUser.Norek;
    }
    Tabungan(double Saldo, String NoRek){
        this.Saldo=Saldo;
        this.Bunga=Saldo*(0.025/12);
        this.Norek= NoRek;
    }

    void BuatTabungan(){
        System.out.print("Jumlah Saldo : ");
        double Saldo = scanDouble.nextDouble();
        Tabungan TabunganBaru = new Tabungan(Saldo);
        Main.DataTabungan.add(TabunganBaru);
        // int id, String norek, String keterangan, double saldo
        Main.DataLog.add(new Log(Main.DataLog.size(),Main.ActiveUser.Norek,"BUAT TABUNGAN", Saldo));
        System.out.println();
        // Main.Transaksi();
    }

    void TarikSaldo(){
        ArrayList<Tabungan> MyTabungan = new ArrayList<>();
        /*Inisial Data Tabungan Yand di miliki Nasabah Spresifik*/
        for (Tabungan temp: Main.DataTabungan) {
            if (temp.Norek.equals(Main.ActiveUser.Norek)){
                MyTabungan.add(temp);
            }
        }
        // Menampilkan Data yang di miliki
        int p=1;
        for (Tabungan Tabunganku: MyTabungan) {
            if (Tabunganku.Saldo < 0){
                Main.DataTabungan.remove(Main.DataTabungan.indexOf(Tabunganku));
            }else {
                System.out.println(p + ". Saldo : " + Tabunganku.Saldo);
                System.out.printf("Bunga : %.2f\n", Tabunganku.Bunga);
                p++;
            }
        }

        if (MyTabungan.size()==0) {
            System.out.println("Anda Belum Punya Tabungan");
        }else{
        int pil=999;
        while (pil>MyTabungan.size()) {
            System.out.print("Pilih Tabungan : ["+MyTabungan.size()+"]");
            pil=Main.validangka()-1;            
        }

       
        Tabungan Selected=MyTabungan.get(pil);
//        Proses Penarikan
        double Tarik=0;
        do {
            System.out.print("Banyak Yang Ingin Ditarik Max ["+Selected.Saldo+"] : ");
            Tarik = scanDouble.nextDouble();
        } while ((Tarik>Selected.Saldo));
        Selected.Saldo-=Tarik;
        if (Selected.Saldo < 0){
            Main.DataTabungan.remove(Main.DataTabungan.indexOf(Selected));
        }
        System.out.printf("Anda Menarik : %.2f\n",Tarik);
        System.out.println("Sisah Saldo Anda : "+ Selected.Saldo);
        System.out.println();
        Main.DataLog.add(new Log(Main.DataLog.size(),Main.ActiveUser.Norek,"TARIK TABUNGAN", Selected.Saldo));
        // int id, String norek, String keterangan, double saldo.add(new Log("TARIK TABUNGAN", Tarik, Selected.Saldo)Main.DataLog.size(),);
        System.out.println();
        // Main.Transaksi();
    }
    }

    void TambahSaldo(){
        ArrayList<Tabungan> MyTabungan = new ArrayList<>();
        /*Inisial Data Tabungan Yang di miliki Nasabah Spresifik*/
        for (Tabungan temp: Main.DataTabungan) {
            if (temp.Norek.equals(Main.ActiveUser.Norek)){
                MyTabungan.add(temp);
            }
        }
        // Menampilkan Data yang di miliki
        int p=1;
        for (Tabungan Tabunganku: MyTabungan) {
            System.out.printf(p+". Saldo : %.2f\n",Tabunganku.Saldo);
            p++;
        }
        System.out.print("Pilih Tabungan : ");
        int pil=Main.validangka()-1;
        Tabungan Selected=MyTabungan.get(pil);

        //proses tambah saldo
        System.out.print("Banyak saldo yang ingiin ditabung : ");
        double tambah=Main.validangka();
        Selected.Saldo+=tambah;
        System.out.printf("Total Saldo anda sekarang : %.1f\n" , Selected.Saldo);
//        System.out.println();
        Main.DataLog.add(new Log(Main.DataLog.size(), Norek, Norek, tambah));
        // int id, String norek, String keterangan, double saldo.add(new Log("TAMBAH TABUNGAN", tambah, Selected.Saldo)Main.DataLog.size(),);
        System.out.println();
        // Main.Transaksi();
    }

    void plusBunga(){

        if (tanggalCair==LocalDate.now()){
            Saldo +=Bunga;
            Bunga = 0;
            Bunga = Saldo*(0.025/12);
            tanggalCair = LocalDate.of(LocalDate.now().getYear(), LocalDate.now().getMonthValue()+1,1);
        }
    }


}
