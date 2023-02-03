package PPTI15.Session6.TRYSL2.GURU.TUGAS;

public class TUGAS {
    public String NIP;
    public String KODE_MAPEL;
    String TUGAS;
    String Deatline;

    public TUGAS(String NIP, String KODE_MAPEL, String TUGAS, String Deatline) {
        this.NIP = NIP;
        this.KODE_MAPEL = KODE_MAPEL;
        this.TUGAS = TUGAS;
        this.Deatline = Deatline;
    }

    public TUGAS() {
    }

    public void Detail(){
        System.out.println("TUGAS : "+TUGAS);
        System.out.println("Deatline : "+Deatline);
    }
}
