package PPTI15.Session03.SL2;


import java.util.Scanner;

public class ACC3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int r = scan.nextInt();
        r = r % n;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[(i + r) % n] = arr[i];
        }
        // System.out.println("The rotated array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
