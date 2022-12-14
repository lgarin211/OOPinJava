package PPTI15.Session02.SL1;

import java.util.Scanner;

public class CountingIPK {
    
    public static void sort(double ipk[]) {
        for (int i = 0; i < ipk.length; i++) {
            for (int j = i + 1; j < ipk.length; j++) {
                if (ipk[i] < ipk[j]) {
                    double temp = ipk[i];
                    ipk[i] = ipk[j];
                    ipk[j] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double ipk[] = new double[n];
        
        for (int i = 0; i < ipk.length; i++) {
            ipk[i] = input.nextDouble();
        }
        
        sort(ipk);
        for (int i = 0; i < ipk.length; i++) {
            for (int j = i + 1; j < ipk.length; j++) {
                if (ipk[i] < ipk[j]) {
                    double temp = ipk[i];
                    ipk[i] = ipk[j];
                    ipk[j] = temp;
                }
            }
        }

        for (int i = 0; i < ipk.length; i++) {
            int rank = 1;
            for (int j = 0; j < ipk.length; j++) {
                if (ipk[i] < ipk[j]) {
                    rank++;
                }
            }
            // System.out.println(rank+" " + ipk[i] );            
            System.out.printf("%d %.2f", rank, ipk[i]);
        }
    }
}
