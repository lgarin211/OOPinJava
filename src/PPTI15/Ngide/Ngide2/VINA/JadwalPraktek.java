package PPTI15.Ngide.Ngide2.VINA;

import java.util.ArrayList;
import java.util.Scanner;

class JadwalPraktek{
    //0 = praktek pagi
    //1 = praktek sore
    //2 = praktek malam

    public static ArrayList<String> hari = new ArrayList<String>(10);
    public static ArrayList<String> pukul = new ArrayList<String>(10);

    Dokter panggilDokter = new Dokter();
    public void initialize(){
        hari.add("");
        hari.add("");
        hari.add("");

        pukul.add("");
        pukul.add("");
        pukul.add("");
    }

    public void menuAwalDokter(){
        int choose;
        Scanner input = new Scanner(System.in);
        System.out.println("MENU JADWAL PRAKTIK DOKTER");
        System.out.println("===========================");
        System.out.println("1. Lihat Jadwal");
        System.out.println("2. Ubah Jadwal");
        System.out.println("3. Back");
        System.out.print("Select menu [1 - 2]: ");
        choose = input.nextInt();
        if(choose == 1){
            view();
        }else if(choose == 2){
            ubah_jadwal();
        }else{
            Mainn.menuDokter();
        }
    }
    
    public void menuAwalPasien(){
        int choose;
        Scanner input = new Scanner(System.in);
        System.out.println("MENU JADWAL PRAKTIK DOKTER");
        System.out.println("===========================");
        System.out.println("1. Lihat Jadwal");
        System.out.println("2. Back");
        System.out.print("Select menu : ");
        choose = input.nextInt();
        if(choose == 1) {
            view();
        }else{
            Mainn.menuPasien();
        }
    }
    int menuPraktek = -1, menuUbah = -1, menuTambahPraktek = -1;
    
    public void view(){
        do {
            Scanner userInput = new Scanner(System.in);
            System.out.println("MENU LIHAT JADWAL PRAKTIK");
            System.out.println("==========================");
            System.out.println("1. Praktek Pagi");
            System.out.println("2. Praktek Sore");
            System.out.println("3. Praktek Malam");
            System.out.println("4. Back");
            System.out.println("=======================");
            System.out.print("Pilih Jadwal Praktek yang ingin dilihat : ");
            menuPraktek = userInput.nextInt();

            switch (menuPraktek) {
                case 1:
                    System.out.println("Praktek Pagi");
                    System.out.println("=============");
                    if(hari.get(0) == ""){
                        System.out.println("Tidak ada jadwal praktek\n");
                    }else{
                        System.out.println("Hari : " + hari.get(0));
                        System.out.println("Pukul : " + pukul.get(0));
                        panggilDokter.viewDokter(0);
                    }
                    System.out.print("Press enter to continue...");
                    userInput.nextLine();
                    userInput.nextLine();
                    break;
                case 2:
                    System.out.println("Praktek Sore");
                    System.out.println("=============");
                    if(hari.get(1) == ""){
                        System.out.println("Tidak ada jadwal praktek\n");
                    }else {
                        System.out.println("Hari : " + hari.get(1));
                        System.out.println("Pukul : " + pukul.get(1));
                        panggilDokter.viewDokter(1);
                    }
                    System.out.print("Press enter to continue...");
                    userInput.nextLine();
                    userInput.nextLine();
                    break;
                case 3:
                    System.out.println("Praktek Malam");
                    System.out.println("==============");
                    if(hari.get(2) == ""){
                        System.out.println("Tidak ada jadwal praktek\n");
                    }else {
                        System.out.println("Hari : " + hari.get(2));
                        System.out.println("Pukul : " + pukul.get(2));
                        panggilDokter.viewDokter(2);
                    }
                    System.out.print("Press enter to continue...");
                    userInput.nextLine();
                    userInput.nextLine();
                    break;
                case 4:
                    menuAwalPasien();
                    break;
            }
        }while(menuPraktek != 4);

    }

    public void ubah_jadwal() {
        do {
            Scanner userInput = new Scanner(System.in);
            System.out.println("Ubah Jadwal Praktek");
            System.out.println("===================");
            System.out.println("1. Praktek Pagi");
            System.out.println("2. Praktek Sore");
            System.out.println("3. Praktek Malam");
            System.out.println("4. Back");
            System.out.println("===================");
            System.out.print("Pilih Jadwal Praktek yang ingin diubah : ");
            menuUbah = userInput.nextInt();


            switch (menuUbah) {
                case 1:
                    System.out.println("Praktek Pagi");
                    System.out.println("=============");
                    System.out.print("Masukkan hari : ");
                    userInput.nextLine();
                    hari.set(0, userInput.nextLine());
                    System.out.print("Masukkan jam : ");
                    pukul.set(0, userInput.nextLine());
                    panggilDokter.inputDokter(0);
                    System.out.println("Data Praktek Pagi berhasil diubah!");

                    System.out.print("Press enter to continue...");
                    userInput.nextLine();
                    break;
                case 2:
                    System.out.println("Praktek Sore");
                    System.out.println("=============");
                    System.out.print("Masukkan hari : ");
                    userInput.nextLine();
                    hari.set(1, userInput.nextLine());
                    System.out.print("Masukkan jam : ");
                    pukul.set(1, userInput.nextLine());

                    panggilDokter.inputDokter(1);
                    System.out.println("Data Praktek Sore berhasil diubah!");

                    System.out.print("Press enter to continue...");
                    userInput.nextLine();
                    break;
                case 3:
                    System.out.println("Praktek Malam");
                    System.out.println("==============");
                    System.out.print("Masukkan hari : ");
                    userInput.nextLine();
                    hari.set(2, userInput.nextLine());
                    System.out.print("Masukkan jam : ");
                    pukul.set(2, userInput.nextLine());

                    panggilDokter.inputDokter(2);
                    System.out.println("Data Praktek Malam berhasil diubah!");

                    System.out.print("Press enter to continue...");
                    userInput.nextLine();
                    break;
                case 4:
                    menuAwalDokter();
                    break;
            }
        } while (menuUbah != 4);
    }
}