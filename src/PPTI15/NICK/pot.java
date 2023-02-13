package PPTI15.NICK;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

public class pot {
   
}

class Siswa extends User{

}

class Pelajaran{
    String NamaPelajaran;
    ArrayList<Siswa> daftarSiswa = new ArrayList<Siswa>();
    public Pelajaran(String NamaPelajaran){
        this.NamaPelajaran = NamaPelajaran;
    }
    public void addSiswa(Siswa siswa){
        daftarSiswa.add(siswa);
    }
    public void removeSiswa(Siswa siswa){
        daftarSiswa.remove(siswa);
    }
    public void printSiswa(){
        for (Siswa siswa : daftarSiswa) {
            System.out.println(siswa);
        }
    }

 
}

class User {
    String username;
    String password;
    String nama;
    
    public User(){
        
    }

    int key;
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    public User(String username, String password, String nama){
        this.username = username;
        this.password = password;
        this.nama = nama;
    }


    public void printUser(){
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}

class Guru extends User{
    int indexPelajaran;

}