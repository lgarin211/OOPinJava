package PPTI15.Ngide.Masyarakat;

public class Reservasi extends Fasilitas{
    String Tanggal="12-12-2020";
    String Jam="12:00";
    String NamaPasien="Pasient 1";
    String NomorKamar="null";
    String JenisKamar="none"; 

    // Reservasikan
    public void ReservasiKamar(String Tanggal, String Jam, String NamaPasien, String NomorKamar, String JenisKamar) {
        this.Tanggal=Tanggal;
        this.Jam=Jam;
        this.NamaPasien=NamaPasien;
        this.NomorKamar=NomorKamar;
        this.JenisKamar=JenisKamar;
    }

    public void ShowReservasi() {
        System.out.println("Tanggal : "+Tanggal);
        System.out.println("Jam : "+Jam);
        System.out.println("Nama Pasien : "+NamaPasien);
        System.out.println("Nomor Kamar : "+NomorKamar);
        System.out.println("Jenis Kamar : "+JenisKamar);
    }
}
