package PPTI15.Session02.SL1;
import java.util.Scanner;
// import java.io.*;

public class matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matrix[][] = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                // System.out.print("Masukkan nilai matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        int pax=input.nextInt();
        for (int i = 0; i < pax; i++) {
            int ip=input.nextInt();
            int jp=input.nextInt();
            int push=input.nextInt();                
            for (int j = 0; j < matrix.length; j++) {
                if(ip>0){
                    matrix[j][jp]+=push;
                }else{
                    matrix[jp][j]+=push;
                }
            }
        }
        
        // sum of matrix
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[i][j];
            }
        }

        // max value of matrix
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        // min value of matrix
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }

        // print sum , max , min
        System.out.println("Sum of matrix: " + sum);
        System.out.println("Max value of matrix: " + max);
        System.out.println("Min value of matrix: " + min);

        // print matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
