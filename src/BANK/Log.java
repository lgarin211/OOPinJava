package BANK;

import java.util.Date;
import java.time.LocalDate;

public class Log {
    int id;
    String Norek;
    String Keterangan;
    double Saldo;
    String Tanggal;

    public Log(int id, String norek, String keterangan, double saldo) {
        this.id = id;
        this.Norek = norek;
        this.Keterangan = keterangan;
        this.Saldo = saldo;
        this.Tanggal = LocalDate.now().toString();
    }

    public static void log(String message){
        System.out.println(message);
    }

    public static void show(){
        for (int i = 0; i < Main.DataLog.size(); i++) {
            if (Main.DataLog.get(i).Norek.equals(Main.ActiveUser.Norek)) {
                System.out.println(Main.DataLog.get(i).Tanggal+"|"+Main.DataLog.get(i).Keterangan+"|"+Main.DataLog.get(i).Saldo);
            }
        }
    }
}