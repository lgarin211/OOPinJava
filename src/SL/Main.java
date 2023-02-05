package SL;

import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
import javax.xml.crypto.Data;

import SL.Course.Course;
import SL.Guru.Guru;
import SL.Siswa.Siswa;
import SL.Course.EXM;
import SL.Course.ASG;
import SL.Validasi.Validasi;

public class Main {
    
    public static ArrayList<Course> Datacourses = new ArrayList<>();
    public static ArrayList<Guru> Datagurus = new ArrayList<>();
    public static ArrayList<Siswa> Datasiswa = new ArrayList<>();
    public static ArrayList<EXM> Dataexam = new ArrayList<>();
    public static ArrayList<ASG> DataASG = new ArrayList<ASG>();

    public static Siswa Activesiswa = null;
    public static Guru Activeguru = null;

    public static void Dummy(){
        Datagurus.add(new Guru (1, "Agustinus Tobing", "agus@gmail.com", "agus123"));
        Datagurus.add(new Guru (2, "Martinus Pardamean", "mar@gmail.com", "mar123"));
        Datagurus.add(new Guru (3, "Jack Griffo", "jack@gmail.com", "jack123"));
        Datagurus.add(new Guru (4, "Tom Jerry", "tom@gmail.com", "tom123"));

        Datacourses.add(new Course (1, 1, "Matematika"));
        Datacourses.add(new Course (2, 2, "Bahasa Indonesia"));
        Datacourses.add(new Course (3, 3, "Bahasa Inggris"));
        Datacourses.add(new Course (4, 4, "Kimia"));

        Datasiswa.add(new Siswa (1, "Leo Damanik", "leo@gmail.com", "leo123"));
        Datasiswa.add(new Siswa (2, "Valerie Savira", "val@gmail.com", "val123"));
        Datasiswa.add(new Siswa (3, "Cindy Aprilia", "cin@gmail.com", "cin123"));
        Datasiswa.add(new Siswa (4, "Keira Devon", "kei@gmail.com", "kei123"));
        
        DataASG.add(new ASG (1, 1, "Matematika", 1, 1));
        DataASG.add(new ASG (2, 1, "Bahasa Indonesia", 2, 2));
        DataASG.add(new ASG (3, 3, "Bahasa Inggris", 3, 3));
        DataASG.add(new ASG (4, 4, "Kimia", 4, 4));

        Dataexam.add(new EXM (1, 1, "Matematika", 1, 1));
        Dataexam.add(new EXM (2, 1, "Bahasa Indonesia", 2, 2));
        Dataexam.add(new EXM (3, 3, "Bahasa Inggris", 3, 3));
        Dataexam.add(new EXM (4, 4, "Kimia", 4, 4));
    }

    public static void addCourse(Course course){
        Datacourses.add(course);
    }

    public static void addGuru(Guru guru){
        Datagurus.add(guru);
    }

    public static void addSiswa(Siswa siswa){
        Datasiswa.add(siswa);
    }

    public static void addASG(ASG asg){
        DataASG.add(asg);
    }


    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void showCourse(){
        for (Course course : Datacourses) {
            System.out.println("===================================");
            int index=Datacourses.indexOf(course);
            System.out.println(index+". : ");
            System.out.println("ID Course : "+course.getIdCourse());
            System.out.println("ID Guru : "+course.getIdGuru());
            System.out.println("Nama Course : "+course.getNamaCourse());
            System.out.println("===================================");
        }
    }

    public static void showGuru(){
        for (Guru guru : Datagurus) {
            System.out.println("===================================");
            int index=Datagurus.indexOf(guru);
            System.out.println(index+". : ");
            System.out.println("ID Guru : "+guru.getIdGuru());
            System.out.println("Nama Guru : "+guru.getNamaGuru());
            System.out.println("Email Guru : "+guru.getEmailGuru());
            System.out.println("Password Guru : "+guru.getPasswordGuru());
            System.out.println("===================================");
        }
    }

    public static void showSiswa(){
        for (Siswa siswa : Datasiswa) {
            System.out.println("===================================");
            int index=Datasiswa.indexOf(siswa);
            System.out.println(index+". : ");
            System.out.println("ID Siswa : "+siswa.getIdSiswa());
            System.out.println("Nama Siswa : "+siswa.getNamaSiswa());
            System.out.println("Email Siswa : "+siswa.getEmailSiswa());
            System.out.println("Password Siswa : "+siswa.getPasswordSiswa());
            System.out.println("===================================");
        }
    }

    // login Guru
    public static Guru GuruLogin(){
        boolean run=true;
        Guru Data=null;
        while (true) {
            
            Scanner input = new Scanner(System.in);
            String username ;
            do {
                System.out.print("Masukkan Email : ");
                username = input.nextLine();    
            } while (!username.matches("(.*)gmail.com(.*)"));
            System.out.print("Masukkan Password : ");
            String password = input.nextLine();
            for (Guru guru : Datagurus) {
                if (guru.getEmailGuru().equals(username) && guru.getPasswordGuru().equals(password)) {
                    Data=guru;
                    run=false;
                    return Data;
                    // break;  
                }
            }
        }
    }

    // login Siswa
    public static Siswa SiswaLogin(){
        boolean run=true;
        Siswa Data=null;

        while (true) {

            Scanner input = new Scanner(System.in);
            String username ;
            do {
                System.out.print("Masukkan Email : ");
                username = input.nextLine();    
            } while (!username.matches("(.*)gmail.com(.*)"));

            
            System.out.print("Masukkan Password : ");
            String password = input.nextLine();
            for (Siswa siswa : Datasiswa) {
                if (siswa.getEmailSiswa().equals(username) && siswa.getPasswordSiswa().equals(password)) {
                    Data=siswa;
                    run=false;
                    return Data;
                    // break;  
                }
            }
        }
    }

    public static void Guru(){
        clearScreen();
        ArrayList<Siswa> MySiswa = new ArrayList<Siswa>();
        ArrayList<EXM> Myexam = new ArrayList<EXM>();
        ArrayList<ASG> MyASG = new ArrayList<ASG>();
        
        Course MyCourse = null;

        for (Course C : Datacourses) {
            if (C.getIdGuru()==Activeguru.getIdGuru()) {
                MyCourse=C;
            }
        }
        

        for (ASG A : DataASG) {
            if (A.getIdGuru()==Activeguru.getIdGuru()) {
                MyASG.add(A);
            }
        }

        for (EXM A : Dataexam) {
            if (A.getIdGuru()==Activeguru.getIdGuru()) {
                Myexam.add(A);
            }
        }

        for (Siswa Siswa : Datasiswa) {
            for (ASG A : MyASG) {
                if (Siswa.getIdSiswa()==A.getIdSiswa()) {
                    MySiswa.add(Siswa);
                }
            }
        }


        System.out.println("Selamat Datang "+Activeguru.getNamaGuru());
        boolean run=true;
        while (run) {
                
            System.out.println("===================================");
            System.out.println("Course : "+MyCourse.getNamaCourse());
            System.out.println("===================================");
            System.out.println("1. Lihat Siswa");
            System.out.println("2. Nilai Tugas Siswa");
            System.out.println("3. Nilai Ujian SIswa");
            System.out.println("4. Log Out Akun Guru");
            System.out.println("===================================");
            Scanner input = new Scanner(System.in);
            int pilih;
            do {
                System.out.print("Pilih [1-4]: ");     
                pilih = input.nextInt();
            } while (pilih<1 || pilih>4);
                        
            switch (pilih) {
                case 1:
                    clearScreen();
                    for (Siswa siswa : MySiswa) {
                        System.out.println("===================================");
                        int index=MySiswa.indexOf(siswa);
                        System.out.println("Murid ke-"+(index+1));
                        System.out.println("Nama Siswa : "+siswa.getNamaSiswa());
                        System.out.println("Email Siswa : "+siswa.getEmailSiswa());
                        System.out.println("===================================");
                        Validasi.Enter();
                        clearScreen();
                    }
                    break;
                case 2:
                    clearScreen();
                    for (ASG A : MyASG) {
                        System.out.println("===================================");
                        int index=MyASG.indexOf(A);
                        System.out.println("Murid ke-"+(index+1));
                        System.out.println("Nama Siswa : "+MySiswa.get(index).getNamaSiswa());
                        System.out.println("Nilai ASG  : "+A.getNilaiASG());
                        System.out.println("===================================");
                    }
                    int poll=0;
                    input = new Scanner(System.in);
                    do{
                        System.out.print("Pilih index siswa yang ingin di nilai : ");
                        poll=input.nextInt();
                    }while(poll<1 || poll>MyASG.size());
                    boolean run2=true;
                    while (run2) {
                        System.out.println("===================================");
                        Scanner input3 = new Scanner(System.in);
                        int pilih3 = poll-1;
                        Scanner input4 = new Scanner(System.in);
                        int pilih4 =0;
                        do {
                            try{
                                    System.out.print("Nilai ASG [0-100]: ");        
                                    pilih4 = input4.nextInt();
                            }catch(Exception e){
                                    System.out.println("Inputan harus berupa angka");
                            }
                        } while (!(pilih4>=0 && pilih4<=100));

                        MyASG.get(pilih3).setNilaiASG(pilih4);
                        System.out.println("===================================");
                        run2=false;
                        Validasi.Enter();
                        clearScreen();
                        break;
                    }
                    break;
                case 3:
                    clearScreen();
                    for (EXM A : Myexam) {
                        int index=Myexam.indexOf(A);
                        System.out.println("Murid ke-"+(index+1));
                        System.out.println("Nama Siswa : "+MySiswa.get(index).getNamaSiswa());
                        System.out.println("Nilai Exam : "+A.getNilaiExam());
                        System.out.println("===================================");
                    }
                    poll=0;
                    
                    do{
                        System.out.print("Pilih index siswa yang ingin di nilai : ");
            
                        input = new Scanner(System.in);
                        poll=input.nextInt();
                    }while(poll<1 || poll>Myexam.size());
                    
                    run2=true;
                    while (run2) {
                        System.out.println("===================================");
                        int pilih3 = poll-1;
                        Scanner input4 = new Scanner(System.in);
                        int pilih4 =0;
                        do {
                            try{
                                    System.out.print("Nilai Exam [0-100] : ");        
                                    pilih4 = input4.nextInt();
                            }catch(Exception e){
                                    System.out.println("Inputan harus berupa angka");
                            }
                        } while (!(pilih4>=0 && pilih4<=100));
                        Myexam.get(pilih3).setNilaiExam(pilih4);
                        System.out.println("===================================");
                        run2=false;
                        break;
                    }
                    break;
                case 4:
                    run=false;
                    break;
            }
        }
    }
    
    public static void Siswa(){
        boolean run=true;
        clearScreen();
        while(run){
        ArrayList<ASG> MyASG = new ArrayList<ASG>();
        ArrayList<EXM> Myexam = new ArrayList<EXM>();

        for (ASG A : DataASG) {
            if (A.getIdSiswa()==Activesiswa.getIdSiswa()) {
                MyASG.add(A);
            }
        }

        for (EXM A : Dataexam) {
            if (A.getIdSiswa()==Activesiswa.getIdSiswa()) {
                Myexam.add(A);
            }
        }

        System.out.println("Selamat Datang "+Activesiswa.getNamaSiswa());
        System.out.println("===================================");
        System.out.println("1. Pilih Mata Pelajaran");
        System.out.println("2. Lihat Nilai Akhir");
        System.out.println("3. Log Out Akun Siswa");
        System.out.println("===================================");
        System.out.print("Pilih [1-3] >> ");
        Scanner input = new Scanner(System.in);
        int pilih;
        do {
            pilih= input.nextInt();
        } while (!(pilih>0 && pilih<=3));
        switch (pilih){
            case 1:
                clearScreen();
                Course newCourse = null;
                int pilih2;
                    System.out.println("Pilih Mata Pelajaran");
                    System.out.println("=============================================");
                    for (Course C : Datacourses) {
                        int index=Datacourses.indexOf(C);
                        System.out.print((index+1)+". ");
                        System.out.println("Nama Course : "+C.getNamaCourse());
                    }
                    System.out.println("==============================================");
                    System.out.print("Pilih >> ");
                    Scanner input2 = new Scanner(System.in);
                do {
                        pilih2 = input2.nextInt()-1;    
                } while (!(pilih2>=0 && pilih2<Datacourses.size()));
                
                
                newCourse=Datacourses.get(pilih2);
                DataASG.add(new ASG(newCourse.getIdCourse(), newCourse.getIdGuru(), newCourse.getNamaCourse(), DataASG.size(), Activesiswa.getIdSiswa()));
                Dataexam.add(new EXM(newCourse.getIdCourse(), newCourse.getIdGuru(), newCourse.getNamaCourse(), Dataexam.size(), Activesiswa.getIdSiswa()));
                MyASG.add(new ASG(newCourse.getIdCourse(), newCourse.getIdGuru(), newCourse.getNamaCourse(), DataASG.size(), Activesiswa.getIdSiswa()));
                Myexam.add(new EXM(newCourse.getIdCourse(), newCourse.getIdGuru(), newCourse.getNamaCourse(), Dataexam.size(), Activesiswa.getIdSiswa()));
                System.out.println("Kamu memilih "+newCourse.getNamaCourse());
                System.out.println("==============================================");
                Validasi.Enter();
                clearScreen();
                break;
            case 2:
                clearScreen();
                ArrayList<Course> myCourses = new ArrayList<Course>();
                System.out.println("Nilai Akhir");
                for (Course C : Datacourses) {
                    if (C.getIdGuru()==Activesiswa.getIdSiswa()) {
                        myCourses.add(C);       
                    }
                }
                float ASG=0;
                float EXP=0;

                for (Course C : myCourses) {

                    System.out.println("===================================");
                    int index=myCourses.indexOf(C);
                    System.out.println("Murid ke-"+(index+1));
                    System.out.println("Nama Siswa : "+Activesiswa.getNamaSiswa());
                    
                    for (ASG M : MyASG) {
                        if (C.getIdCourse()==M.getIdCourse()) {
                            ASG+=M.getNilaiASG();
                        }   
                    }
                    
                    for (EXM M : Myexam) {
                        if (C.getIdCourse()==M.getIdCourse()) {
                            EXP+=M.getNilaiExam();
                            M.getNilaiExam();
                        }   
                    }

                    System.out.println("Nama Course : "+C.getNamaCourse()); 
                    System.out.println("Nilai ASG: "+ASG);
                    System.out.println("Nilai Exam: "+EXP);
                    System.out.println("Nilai Akhir: "+((0.6*ASG)+(0.4*EXP)));
                    System.out.println("===================================");
                    Validasi.Enter();
                    clearScreen();
                    break;
                }

                
                break;
                
            case 3:
                
                run=false;
                clearScreen();
                break;
            }
        }
    }



    public static void main(String[] args) {
        Dummy();

        boolean run=true;
        while (run) {
            clearScreen();
            System.out.println("===================================");
            System.out.println("     Welcome to System Learning    ");
            System.out.println("===================================");
            System.out.println("   _____  _____ _    _ ___  __ __ ");
            System.out.println("  / ____|/ ____| |  | |__ \\/_ /_ |");
            System.out.println(" | (___ | |    | |__| |  ) || || |");
            System.out.println("  \\___ \\| |    |  __  | / / | || |");
            System.out.println("  ____) | |____| |  | |/ /_ | || |");
            System.out.println(" |_____/ \\_____|_|  |_/____|___|_|");
            System.out.println("                                   ");
            System.out.println("===================================");
            System.out.println("Silahkan Pilih Menu di Bawah Ini : ");
            System.out.println("1. Login Guru");
            System.out.println("2. Login Siswa");
            System.out.println("3. Exit Program");
            System.out.println("===================================");
            System.out.print("Pilih [1-3] : ");
             
            int pilih = Validasi.pilih(1,3);          
            switch (pilih) {
                case 1:
                    clearScreen();
                    System.out.println("Login Guru");
                    Activeguru=null;
                    Activeguru=GuruLogin();
                    Guru();
                    break;
                    
                case 2:
                    clearScreen();
                    System.out.println("Login Siswa");
                    Activesiswa=null;
                    Activesiswa=SiswaLogin();
                    System.out.println("Selamat Datang "+Activesiswa.getNamaSiswa());
                    Siswa();
                    break;

                case 3:
                    System.exit(0);
                    break;
            }
        }
        
    }


}
