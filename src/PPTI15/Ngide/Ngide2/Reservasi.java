package PPTI15.Ngide.Ngide2;

import java.util.ArrayList;
import java.util.Scanner;

public class Reservasi extends Fasilitas{
    static ArrayList<Reservasi> DataReservasi= new ArrayList<Reservasi>();
    static String level;

    static Scanner Fil=new Scanner(System.in);
    public static void Reservasi(){
        System.out.println("Reservasi");
    }

    public static void Sonslreserv(){
        Reservasi reservasi = new Reservasi();
        System.out.println("Anda Akan Melakukan Reservasi");
        System.out.println("Berikut Pilihan Fasititas Rumah Sakit Kami");
        // Fasilitas.lihatFasilitas();
        System.out.println("Silahkan Pilih Fasilitas Rumah Sakit");
        System.out.println("1. Super VIP\n2. VIP\n3. Kelas 1\n4. Kelas 2");
        System.out.printf("Masukkan Pilihan Anda : ");
        int pilihan = Fil.nextInt();
        while (pilihan > 4 || pilihan < 1){
            System.out.println("Pilihan Anda Tidak Tersedia");
            System.out.println("Silahkan Pilih Fasilitas Rumah Sakit");
            System.out.println("1. Super VIP\n2. VIP\n3. Kelas 1\n4. Kelas 2");
            System.out.printf("Masukkan Pilihan Anda : ");
            pilihan = Fil.nextInt();
        }
        switch (pilihan){
            case 1:
                System.out.println("Anda Memilih Super VIP");
                reservasi.level = "Super VIP";
                break;
            case 2:
                System.out.println("Anda Memilih VIP");
                reservasi.level = "VIP";
                break;
            case 3:
                System.out.println("Anda Memilih Kelas 1");
                reservasi.level = "Kelas 1";
                break;
            case 4:
                System.out.println("Anda Memilih Kelas 2");
                reservasi.level = "Kelas 2";
                break;
        }

        System.out.println("Pesanan Anda Berhasil");
        System.out.println("Pesanan Anda Adalah : "+reservasi.level);
        DataReservasi.add(reservasi);
        System.out.println("Lekas Sembuh");
    }


    public static void tambahReservasi(){
        Reservasi reservasi = new Reservasi();
        System.out.println("Anda Akan Melakukan Reservasi");
        System.out.println("Berikut Pilihan Fasititas Rumah Sakit Kami");
        Fasilitas.lihatFasilitas();
        System.out.println("Silahkan Pilih Fasilitas Rumah Sakit");
        System.out.println("1. Super VIP\n2. VIP\n3. Kelas 1\n4. Kelas 2");
        System.out.println("Masukkan Pilihan Anda : ");
        int pilihan = Fil.nextInt();
        while (pilihan > 4 || pilihan < 1){
            System.out.println("Pilihan Anda Tidak Tersedia");
            System.out.println("Silahkan Pilih Fasilitas Rumah Sakit");
            System.out.println("1. Super VIP\n2. VIP\n3. Kelas 1\n4. Kelas 2");
            System.out.println("Masukkan Pilihan Anda : ");
            pilihan = Fil.nextInt();
        }
        switch (pilihan){
            case 1:
                System.out.println("Anda Memilih Super VIP");
                reservasi.level = "Super VIP";
                break;
            case 2:
                System.out.println("Anda Memilih VIP");
                reservasi.level = "VIP";
                break;
            case 3:
                System.out.println("Anda Memilih Kelas 1");
                reservasi.level = "Kelas 1";
                break;
            case 4:
                System.out.println("Anda Memilih Kelas 2");
                reservasi.level = "Kelas 2";
                break;
        }

        System.out.println("Pesanan Anda Berhasil");
        System.out.println("Pesanan Anda Adalah : "+reservasi.level);
        DataReservasi.add(reservasi);
        System.out.println("Lekas Sembuh");
    }


    
    
}
