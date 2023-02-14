package BANK;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Deposito extends User{
    int id;
    int DepositoSaldo;
    int DepositoBunga;
    int DepositoLama;
    String norek;
    LocalDate date = LocalDate.now(); 

    public Deposito(int id, int depositoSaldo, int depositoBunga, int depositoLama, String norek) {
        this.id = id;
        this.DepositoSaldo = depositoSaldo;
        this.DepositoBunga = depositoBunga;
        this.DepositoLama = depositoLama;
        this.norek = norek;
    }

    public Deposito(int id, int depositoSaldo, int depositoBunga, int depositoLama, String norek, LocalDate date) {
        this.id = id;
        this.DepositoSaldo = depositoSaldo;
        this.DepositoBunga = depositoBunga;
        this.DepositoLama = depositoLama;
        this.norek = norek;
        this.date = date;
    }

    public Deposito() {

    }

    public void addeposito(String norek){
        System.out.print("Masukan Jumlah Uang : ");
        int uang = Main.validangka();
        System.out.print("Masukan Lama Deposito [3/6/12] bulan: ");
        int longdeposito;
        do{
            longdeposito=Main.validangka();
        }while(!(longdeposito==3||longdeposito==6||longdeposito==12));
        System.out.println("Anda Telah Melakukan Deposito Sebesar "+uang+" Dengan Lama "+longdeposito+" Bulan");
        int bunga=uang*longdeposito/100;
        for (int i = 0; i < longdeposito; i++) {
            System.out.println("Total Deposito Anda Setelah "+(i+1)+" Bulan : "+(uang+uang*i/100));            
        }
        Main.DataDeposito.add(new Deposito(Main.DataDeposito.size(),uang,bunga,longdeposito,norek));
        Main.DataLog.add(new Log(Main.DataLog.size(),norek,"Deposito Masuk Di "+LocalDate.now(),uang+bunga));        
    }

    public void tarikdeposito(String norek){
        int Total_Deposito=0;
        ArrayList<Deposito> MyDeposito=new ArrayList<Deposito>();

        

        for (Deposito dep : Main.DataDeposito) {
            if(dep.norek.equals(norek)){
                Total_Deposito+=dep.DepositoSaldo+dep.DepositoBunga;
                MyDeposito.add(dep);
            }            
        }
        int indexdeposito=0;

        if (MyDeposito.size()==0) {
            System.out.println("Anda Belum Punya Deposito");
        }else{
            do {
                System.out.println("Total Deposito Anda Adalah" + Total_Deposito);
                System.out.println("Silahkan Pilih Deposito Yang Akan Di Tarik");
                for (int i = 0; i < MyDeposito.size(); i++) {
                    System.out.println((i+1)+". Tanggal Deposito : "+MyDeposito.get(i).date+" Total Deposito = "+(MyDeposito.get(i).DepositoSaldo+MyDeposito.get(i).DepositoBunga));
                }
                System.out.print(">> ");
                indexdeposito=Main.validangka();
            } while (!(indexdeposito<=MyDeposito.size()));
    
            Deposito selectedDeposito=MyDeposito.get(indexdeposito-1);
            Period lama_Deposito=selectedDeposito.date.until(LocalDate.now());
            System.out.println("Lama Deposito Adalah "+lama_Deposito.getMonths()+" Bulan");
    
            if (lama_Deposito.getMonths()<=selectedDeposito.DepositoLama) {
                int totalsaldo=selectedDeposito.DepositoSaldo+(selectedDeposito.DepositoSaldo*lama_Deposito.getMonths()/100);
                double tarik;
                do {
                    System.out.println("Anda Dapat Menarik : "+totalsaldo);
                    System.out.print("Masukan Jumlah Uang Yang Akan Di Tarik : [50000-"+totalsaldo+"]");
                    tarik=Main.validangka();
                } while (!(tarik<=totalsaldo));
                
                System.out.println("Anda Telah Menarik Deposito Sebesar "+(tarik));
                Main.DataDeposito.get(Main.DataDeposito.indexOf(selectedDeposito)).DepositoSaldo-=tarik;
                tarik=tarik-(tarik*0.01)-50000;
                double bunga=(tarik*lama_Deposito.getMonths()/100-50000);
                int index=Main.DataDeposito.indexOf(selectedDeposito);
                Main.DataDeposito.get(index).DepositoBunga-=bunga;
                Main.DataLog.add(new Log(Main.DataLog.size(),norek,"Tarik Deposito "+tarik ,Main.DataDeposito.get(Main.DataDeposito.indexOf(selectedDeposito)).DepositoSaldo));
            }
        } 
        
    }
}
