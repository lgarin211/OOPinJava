package PPTI15.Session02.SL1;

import java.util.Scanner;

public class Clock {
    public static double minAngle(int h, int m) {
        double angle = Math.abs(30.0 * h - 5.5 * m);
        if (angle > 180) {
            return 360 - angle;
        } else {
            return angle;
        }
    }

    public static void main(String[] args) {
        int h=10;
        int m=10;
        // Scanner input = new Scanner(System.in);
        // h = input.nextInt();
        // inpu
        // m = input.nextInt();
        System.out.println(minAngle(h, m));
    }
    
}
