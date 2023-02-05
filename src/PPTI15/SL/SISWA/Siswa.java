package SISWA;

import java.util.ArrayList;

public class Siswa {
    String ID;
    String NIS;
    String Kelas;

    public Siswa(String ID, String NIS, String Kelas) {
        this.ID = ID;
        this.NIS = NIS;
        this.Kelas = Kelas;
    }

    public Siswa() {
    }

    public void printSiswa(ArrayList<Siswa> DataSiswa){
        System.out.println(DataSiswa.size());
        for (Siswa siswa : DataSiswa) {
            System.out.println(siswa.ID);
            System.out.println(siswa.NIS);
            System.out.println(siswa.Kelas);
        }
    }
    
}

