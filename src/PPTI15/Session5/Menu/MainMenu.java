package PPTI15.Session5.Menu;

// import Service
import PPTI15.Session5.Service;
import PPTI15.Session5.Ride;

public class MainMenu {
    public static void main(String[] args) {
        // Service service = new Service();
        // service.setName("Agus", "B531", "Tajur", "081221723861", "FAJAR", "CIAWI");
        // Ride ride = new Ride("B531", "Tajur", "081221723861", "CIAWI", 4);
        Ride ride = new Ride("B531", "Tajur", "081221723861", "CIAWI", 4);
        // ride.jumlahPenumpang = 4;
        System.out.println("Price : " + ride.CalcuculatePrice());
        // System.out.println("Nama Driver: " + ride);

    }    
}
