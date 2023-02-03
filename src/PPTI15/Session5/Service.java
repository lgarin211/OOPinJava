package PPTI15.Session5;

import java.util.Scanner;
import java.util.*;

public class Service{
    protected String Name;
    protected String Plate;
    protected String AlamatTujuan;
    protected String NoHandphoneCustomer;
    protected String NamaCustomer;
    protected String AlamatJemput;


    // seter 
    public void setName(String Name, String Plate, String AlamatTujuan, String NoHandphoneCustomer, String NamaCustomer, String AlamatJemput){
        this.Name = Name;
        this.Plate = Plate;
        this.AlamatTujuan = AlamatTujuan;
        this.NoHandphoneCustomer = NoHandphoneCustomer;
        this.NamaCustomer = NamaCustomer;
        this.AlamatJemput = AlamatJemput;
    }

    // counstrukter
    public Service(String Plate, String AlamatTujuan,  String NoHandphoneCustomer, String AlamatJemput){
        this.Name = Name;
        this.Plate = Plate;
        this.AlamatTujuan = AlamatTujuan;
        this.NoHandphoneCustomer = NoHandphoneCustomer;
        this.NamaCustomer = NamaCustomer;
        this.AlamatJemput = AlamatJemput;
    }
    public Service(){
        System.out.println("Service");
    }

    public int CalcuculatePrice() {
        
        return (AlamatTujuan+AlamatJemput).length()*1000;
    }

}

class Food extends Service{
    private ArrayList<String> food;
    public Food(String Plate, String AlamatTujuan, String NoHandphoneCustomer, String AlamatJemput){
        super(Plate, AlamatTujuan, NoHandphoneCustomer, AlamatJemput);
        food = new ArrayList<String>();
    }
}

class Delivery extends Service{
    public Delivery(String Plate, String AlamatTujuan, String NoHandphoneCustomer, String AlamatJemput,int berat){
        super(Plate, AlamatTujuan, NoHandphoneCustomer, AlamatJemput);
        this.berat = 0;
    }
    int berat;
}