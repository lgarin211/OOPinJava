package PPTI15.Ngide.Ngide2;

import java.util.ArrayList;

public class Praktek {
    String NamaDokter;
    String Keluhan;
    String Diagnosis;
    String Tindakan;
    ArrayList<Obat> DataObat = new ArrayList<Obat>();
    public Praktek(String NamaDokter, String Keluhan, String Diagnosis, String Tindakan){
        this.NamaDokter = NamaDokter;
        this.Keluhan = Keluhan;
        this.Diagnosis = Diagnosis;
        this.Tindakan = Tindakan;
    }
    
}
