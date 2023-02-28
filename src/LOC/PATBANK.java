package LOC;

import java.util.ArrayList;

import PPTI15.Session03.Array;

public class PATBANK {
    ArrayList<Nasabah> nasabah = new ArrayList<Nasabah>();
    public static void main(String[] args) {
        bapak budi = new anak();
        budi.say();
    }
       
}

// interface tabungan
interface Tabungan{
    public void setor(double jumlah);
    public void tarik(double jumlah);
    public double getSaldo();
    // public void run(){
    //     System.out.println("lari");
    // };
}

// class tabungan
class Tabungan2 implements Tabungan{
    int saldo=0;
    public void setor(double jumlah){
        saldo+=jumlah;
    }
    public void tarik(double jumlah){
        saldo-=jumlah;
    }
    public double getSaldo(){
        return saldo;
    }
    public void lwt(){
        System.out.println("lari");
    }
}

abstract class Nasabah{
    ArrayList<Tabungan> tabungan = new ArrayList<Tabungan>();
    Tabungan2 tabungan1 = new Tabungan2();
    private String Nama="Agus";
    private String NomorRekening;
    private int Level;
    abstract void daftar();
    public void say(){
        System.out.println("lariiii");
    }
}

class bapak{
    public void say(){
        System.out.println("lari");
    };
}

class anak extends bapak{
    public void say(){
        System.out.println("JANGAN LARI");
    };
}



class GoldNasabah extends Nasabah{
    String Nama;
    String NomorRekening;
    int Level=10;
    public void daftar(){
        System.out.println("Nama : ");
        System.out.println("Nomor Rekening : ");
        System.out.println("Saldo : ");
        Nama = "Rizky";
        NomorRekening="123456789";
        tabungan1.setor(1000000);
        System.out.println("Nama : "+Nama);
        System.out.println("Nomor Rekening : "+NomorRekening);
        System.out.println("Saldo : "+tabungan1.getSaldo());
        tabungan.add(tabungan1);
        tabungan.forEach((tabungan1) -> showAll(tabungan1));
    }
    public void setor(double jumlah){
        tabungan1.setor(jumlah);
    }
    public void tarik(double jumlah){
        tabungan1.tarik(jumlah);
    }
    // show all
    public void showAll(Tabungan tabungan1){
        System.out.println("Saldo : "+tabungan1.getSaldo());
    }
}

class PlatiumNasabah extends Nasabah{
    String Nama;
    String NomorRekening;
    int Level=1;
    public void daftar(){
        System.out.println("Nama : ");
        System.out.println("Nomor Rekening : ");
        System.out.println("Saldo : ");
        Nama = "Rizky";
        NomorRekening="123456789";
        tabungan1.setor(1000000);
        System.out.println("Nama : "+Nama);
        System.out.println("Nomor Rekening : "+NomorRekening);
        System.out.println("Saldo : "+tabungan1.getSaldo());
    }
}