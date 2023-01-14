package PPTI15.Session03.SL2;


import java.util.Scanner;

public class ACC3 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            
            // Menerima input jumlah angka
            int n = scan.nextInt();
            
            // Menerima input rotasi angka
            int ro = scan.nextInt()%n;
    
            // Membuat array untuk menyimpan angka
            int[] numbers = new int[n];
    
            // Menerima input angka
            for (int i = 0; i < n; i++) {
                numbers[i] = scan.nextInt();
            }
        
            // Menghitung jumlah rotasi yang sebenarnya
            ro = ro % n;
    
            // Menampilkan angka yang sudah digeser
            System.out.print("Angka setelah digeser: ");
            for (int i = 0; i < n; i++) {
                System.out.print(numbers[(i + n - ro) % n] + " ");
            }
        }
    }           
