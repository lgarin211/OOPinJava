package PPTI15.Ngide.CODIPON;

public class run {
    public static void main(String[] args) {
        Dokter dokter1 = new Dokter("Dr. Smith", "123", "Kardiologi");
        Pasien pasien1 = new Pasien("John Doe", "456", "Sakit Jantung");
        Obat obat1 = new Obat("Obat Jantung", 10000);

        pasien1.daftarBerobat(dokter1, obat1);
        dokter1.berobat(pasien1, obat1);    
        Praktek praktek1 = new Praktek(dokter1, pasien1, obat1);
        praktek1.tampilkanInfo();
        System.out.println("Biaya berobat: " + praktek1.hitungBiaya());
    }   
}

class Dokter {
    private String nama;
    private String noId;
    private String spesialisasi;

    public Dokter(String nama, String noId, String spesialisasi) {
        this.nama = nama;
        this.noId = noId;
        this.spesialisasi = spesialisasi;
    }
    public String getNama() {
        return this.nama;
    }
    public void berobat(Pasien pasien, Obat obat) {
        System.out.println("Dokter " + this.nama + " sedang melakukan praktek berobat dengan pasien " + pasien.getNama() + " dan menggunakan obat " + obat.getNama());
    }
}

class Pasien {
    private String nama;
    private String noId;
    private String penyakit;

    public Pasien(String nama, String noId, String penyakit) {
        this.nama = nama;
        this.noId = noId;
        this.penyakit = penyakit;
    }

    public void daftarBerobat(Dokter dokter, Obat obat) {
        System.out.println("Pasien " + this.nama + " mendaftar ke dokter " + dokter.getNama() + " dengan obat yang dibutuhkan " + obat.getNama());
    }

    public String getNama() {
        return this.nama;
    }
}

class Praktek {
    private Dokter dokter;
    private Pasien pasien;
    private Obat obat;
    public Praktek(Dokter dokter, Pasien pasien, Obat obat) {
        this.dokter = dokter;
        this.pasien = pasien;
        this.obat = obat;
    }
    
    public void tampilkanInfo() {
        System.out.println("Dokter: " + dokter.getNama());
        System.out.println("Pasien: " + pasien.getNama());
        System.out.println("Obat: " + obat.getNama());
    }
    
    public int hitungBiaya() {
        return obat.getHarga();
    }
}


class Obat {
    private String nama;
    private int harga;
    public Obat(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return this.nama;
    }

    public int getHarga() {
        return this.harga;
    }

    public void tampilkanInfo() {
        System.out.println("Nama obat: " + this.nama + ", Harga: " + this.harga);
    }
}