package PPTI15.Session6.TRYSL2.SEKOLAH;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.*;
import java.lang.*;

import PPTI15.Session6.SL.Matkul.Matkul;
import PPTI15.Session6.TRYSL2.GURU.GURU;
import PPTI15.Session6.TRYSL2.GURU.TUGAS.TUGAS;
import PPTI15.Session6.TRYSL2.MATAKULIAH.MATAKULIAH;
import PPTI15.Session6.TRYSL2.SISWA.Siswa;

public class Sekolah {
    ArrayList < MATAKULIAH > DataMataPelajaran = new ArrayList < MATAKULIAH > ();
    ArrayList < GURU > DataGuru = new ArrayList < GURU > ();
    ArrayList < Siswa > DataSiswa = new ArrayList < Siswa > ();
    ArrayList < TUGAS > DataTugas = new ArrayList < TUGAS > ();
    Scanner input = new Scanner(System.in);

    void DUMMY() {
        // new Guru
        DataGuru.add(new GURU("Guru 1", "123"));
        DataGuru.add(new GURU("Guru 2", "456"));

        // new Matkul
        // DataMataPelajaran.add(new MATAKULIAH("SAINTEC CUMPUTING", "SC", "123", "LAB"));
        // DataMataPelajaran.add(new MATAKULIAH("Pemrograman Objek", "OOP", "123", "LAB"));
        // DataMataPelajaran.add(new MATAKULIAH("IPA", "IPA", "123", "LAB"));
        DataMataPelajaran.add(new MATAKULIAH("SAINTEC CUMPUTING", "SC", "456", "LAB"));
        DataMataPelajaran.add(new MATAKULIAH("Pemrograman Objek", "OOP", "456", "LAB"));
        DataMataPelajaran.add(new MATAKULIAH("IPA", "IPA", "456", "LAB"));

        // new Siswa
        DataSiswa.add(new Siswa("ALEX", "BLI", "A123"));
        DataSiswa.add(new Siswa("LUAS", "BLI", "A123"));
        DataSiswa.add(new Siswa("DAFFA", "BLI", "A123"));


        // new Tugas
        DataTugas.add(new TUGAS("123", "SC", "Tugas 1", "12/12/2020"));
        DataTugas.add(new TUGAS("123", "SC", "Tugas 2", "12/12/2020"));
        DataTugas.add(new TUGAS("123", "SC", "Tugas 3", "12/12/2020"));
        DataTugas.add(new TUGAS("123", "SC", "Tugas 4", "12/12/2020"));
        DataTugas.add(new TUGAS("123", "SC", "Tugas 5", "12/12/2020"));

    }
    static Sekolah sekolah = new Sekolah();
    public static void main(String[] args) {
        // sekolah.input.nextLine();
        sekolah.DUMMY();
        int pilih = 0;
        while (pilih != 3) {
            System.out.println("\033[H\033[2J");
            System.out.println("1. Guru");
            System.out.println("2. Siswa");
            System.out.println("3. Keluar");
            System.out.println("Pilih : ");
            pilih = sekolah.input.nextInt();
            switch (pilih) {
            case 1:
                sekolah.Guru();
                break;
            case 2:
                sekolah.Siswa();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                break;
            }
        }

    }
    public void Tugas(String NIP, String KODE_MAPEL) {
        input = new Scanner(System.in);
        System.out.println("\033[H\033[2J");
        System.out.println("Masukan Nama Tugas");
        String Nama_Tugas = input.nextLine();
        System.out.println("Masukan Deatline Tugas (DD/MM/YYYY)");
        String Deadline = input.nextLine();
        TUGAS tugas = new TUGAS(NIP, KODE_MAPEL, Nama_Tugas, Deadline);
        DataTugas.add(tugas);
        System.out.println("Data Tugas Berhasil Ditambahkan");

    }

    public void Guru() {
        int pilih = 0;
        while (pilih != 3) {
            Scanner input = new Scanner(System.in);
            System.out.println("\033[H\033[2J");
            System.out.println("1. Tambah Guru");
            System.out.println("2. Lihat Guru");
            System.out.println("3. Kembali");
            System.out.println("Pilih : ");
            pilih = input.nextInt();
            switch (pilih) {
            case 1:
                input = new Scanner(System.in);
                System.out.println("\033[H\033[2J");
                System.out.println("Masukan Nama Guru");
                String Nama_GURU = input.nextLine();
                System.out.println("Masukan NIP Guru");
                String NIP = input.nextLine();
                GURU newGuru = new GURU(Nama_GURU, NIP);
                System.out.println("Masukan Mata Pelajaran");
                int cl = 0;
                while (cl != 5) {
                    input = new Scanner(System.in);
                    System.out.println("\033[H\033[2J");
                    System.out.println("Guru : " + Nama_GURU + "\nNIP : " + NIP);
                    System.out.println("1. Tambah Mata Pelajaran");
                    System.out.println("2. Tambah Tugas");
                    System.out.println("3. Lihat Mata Pelajaran");
                    System.out.println("4. Lihat Tugas");
                    System.out.println("5. Kembali");
                    cl = input.nextInt();
                    if (cl != 0) {
                        MATAKULIAH newMatkul = new MATAKULIAH();
                        switch (cl) {
                        case 1:
                            input = new Scanner(System.in);
                            System.out.println("\033[H\033[2J");
                            newMatkul.NewMatkul(NIP);
                            DataMataPelajaran.add(newMatkul);
                            break;
                        case 2:
                            input = new Scanner(System.in);
                            System.out.println("\033[H\033[2J");
                            System.out.println("Data Mata Pelajaran");
                            int i = 0;
                            for (MATAKULIAH matkul: DataMataPelajaran) {
                                if (matkul.NIP.equals(NIP)) {
                                    System.out.println("+++++++++++++++++++++++");
                                    System.out.println("Mata Kuliah "+matkul.Nama_MAPEL);
                                    System.out.println("KODE MAPEL : " + matkul.KODE_MAPEL);
                                    System.out.println("+++++++++++++++++++++++");
                                }
                                i++;
                            }
                            System.out.println("Masukan id MAPEL : ");
                            int pilihMatkul = input.nextInt();
                            try {
                                sekolah.Tugas(DataMataPelajaran.get(pilihMatkul).NIP, DataMataPelajaran.get(pilihMatkul).KODE_MAPEL);
                            } catch (Exception e) {
                                System.out.println("Kode Mapel Tidak Ditemukan");
                                break;
                            }
                            break;
                        case 3:
                            input = new Scanner(System.in);
                            System.out.println("\033[H\033[2J");
                            System.out.println("Data Mata Pelajaran");
                            i = 0;
                            for (MATAKULIAH matkul: DataMataPelajaran) {
                                if (matkul.NIP.equals(NIP)) {
                                    System.out.println("id : "+i);
                                    System.out.println("+++++++++++++++++++++++");
                                    matkul.getdata();
                                    System.out.println("+++++++++++++++++++++++");
                                }
                                i++;
                            }
                        case 4:
                            input = new Scanner(System.in);
                            System.out.println("\033[H\033[2J");
                            System.out.println("Data Tugas Pelajaran");
                            i = 0;
                            for (MATAKULIAH matkul: DataMataPelajaran) {
                                if (matkul.NIP.equals(NIP)) {
                                    System.out.println("id : "+i);
                                    System.out.println("+++++++++++++++++++++++");
                                    matkul.getdata();
                                    System.out.println("+++++++++++++++++++++++");
                                }
                                i++;
                            }
                            System.out.println("Masukan ID MAPEL : ");
                            pilihMatkul = input.nextInt();
                            for (TUGAS tugas: DataTugas) {
                                if (tugas.KODE_MAPEL.equals(DataMataPelajaran.get(pilihMatkul).KODE_MAPEL) && tugas.NIP.equals(DataMataPelajaran.get(pilihMatkul).NIP)) {
                                    System.out.println("+++++++++++++++++++++++");
                                    tugas.Detail();
                                    System.out.println("+++++++++++++++++++++++");
                                }
                            }
                            break;
                        default:
                            break;
                        }

                    }
                    System.out.println("Tekan Enter Untuk Kembali");
                    // input.nextLine();
                    input.nextLine();
                }
                DataGuru.add(newGuru);
                break;
            case 2:
                System.out.println("\033[H\033[2J");
                System.out.println("Data Guru");
                int i = 0;
                // foreach whith index
                for (GURU guru: DataGuru) {
                    input = new Scanner(System.in);
                    System.out.println("+++++++++++++++++++++++");
                    System.out.println("Guru ke-" + i+1  );
                    guru.getdata();
                    int see = 1;
                    if (see == 1) {
                        System.out.println("=========");
                        int opw=0;
                        for (MATAKULIAH matkul: DataMataPelajaran) {
                            if (matkul.NIP.equals(guru.NIP)) {
                                System.out.println("KODE MAPEL : " + matkul.KODE_MAPEL);
                                opw=1;
                            }
                        }
                        if(opw==0){
                            System.out.println("Tidak Ada Mata Pelajaran");
                        }
                        System.out.println("=========");
                    }
                    System.out.println("+++++++++++++++++++++++");
                }
                System.out.println("Tekan Enter Untuk Kembali");
                input.nextLine();
                input.nextLine();
                break;
            default:
                break;
            }
        }
    }

    public void Siswa() {
        int pilih = 0;
        Scanner input = new Scanner(System.in);
        while (pilih != 4) {
            System.out.println("\033[H\033[2J");
            System.out.println("1. Tambah Siswa");
            System.out.println("2. Lihat Siswa");
            System.out.println("3. Matakuliah");
            System.out.println("4. Kembali");
            System.out.println("Pilih : ");
            pilih = input.nextInt();
            switch (pilih) {
            case 1:
                Siswa newsiswa = new Siswa().siswaBaru();
                DataSiswa.add(newsiswa);
                break;
            case 2:
                System.out.println("\033[H\033[2J");
                System.out.println("Data Siswa");
                for (Siswa siswa: DataSiswa) {
                    siswa.getdata();
                }
                break;
            case 3:
                System.out.println("\033[H\033[2J");
                for (MATAKULIAH matakuliah: DataMataPelajaran) {
                    System.out.println("++++++++++++++++++++++++++++++");
                    for (GURU guru: DataGuru) {
                        if (guru.NIP.equals(matakuliah.NIP)) {
                            System.out.println("Guru : " + guru.Nama_GURU);
                        }
                    }
                    System.out.println("Mata Pelajaran : " + matakuliah.Nama_MAPEL);
                    System.out.println("Kode Mata Pelajaran : " + matakuliah.KODE_MAPEL);
                    System.out.println("++++++++++++++++++++++++++++++");
                }
                break;
                // default:
                //     System.out.println("Inputan Salah");
                //     break;
            }
            System.out.println("Tekan Enter Untuk Kembali");
            input.nextLine();
            input.nextLine();
        }
    }

}