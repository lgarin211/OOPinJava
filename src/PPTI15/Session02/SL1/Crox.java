package PPTI15.Session02.SL1;

import java.util.Scanner;

public class Crox {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("*");
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print("*");
                } else {
                    if(i==0||i==n-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
