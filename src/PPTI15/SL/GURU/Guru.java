package GURU;

public class Guru {
    String ID;
    public String NIP;
    String LamaMengajar;

    public Guru(String ID, String NIP, String LamaMengajar) {
        this.ID = ID;
        this.NIP = NIP;
        this.LamaMengajar = LamaMengajar;
    }

    public Guru() {
    }

    public String getID() {
        return ID;
    }
}


