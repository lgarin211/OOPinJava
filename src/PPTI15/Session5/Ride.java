package PPTI15.Session5;

public class Ride extends Service{
    int jumlahPenumpang;
    public Ride(){
    }
    public Ride(String Plate, String AlamatTujuan, String NoHandphoneCustomer, String AlamatJemput, int jumlahPenumpang){
        super(Plate, AlamatTujuan, NoHandphoneCustomer, AlamatJemput);
        jumlahPenumpang = this.jumlahPenumpang;
    }
    public Ride(String Plate, String AlamatTujuan, String NoHandphoneCustomer, String AlamatJemput){
        super(Plate, AlamatTujuan, NoHandphoneCustomer, AlamatJemput);
        jumlahPenumpang = 1;
    }
 }