package SL.Guru;

import java.util.ArrayList;

import SL.Course.Course;

public class Guru {
    int idGuru;
    String namaGuru;
    String emailGuru;
    String passwordGuru;
    
    public Guru(int idGuru, String namaGuru, String emailGuru, String passwordGuru) {
        this.idGuru = idGuru;
        this.namaGuru = namaGuru;
        this.emailGuru = emailGuru;
        this.passwordGuru = passwordGuru;
    }

    public Guru() {
    }

    public int getIdGuru() {
        return idGuru;
    }

    public void setIdGuru(int idGuru) {
        this.idGuru = idGuru;
    }

    public String getNamaGuru() {
        return namaGuru;
    }

    public void setNamaGuru(String namaGuru) {
        this.namaGuru = namaGuru;
    }

    public String getEmailGuru() {
        return emailGuru;
    }

    public void setEmailGuru(String emailGuru) {
        this.emailGuru = emailGuru;
    }

    public String getPasswordGuru() {
        return passwordGuru;
    }

    public void setPasswordGuru(String passwordGuru) {
        this.passwordGuru = passwordGuru;
    }
    

    public ArrayList<Course> courses = new ArrayList<>();
    Course getCourse(Arra){
        
    }
}
