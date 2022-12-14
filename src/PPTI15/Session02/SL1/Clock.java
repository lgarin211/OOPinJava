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
        int h=0;
        int m=0;
        Scanner input = new Scanner(System.in);
        // 10:10
        String p= input.next();
        String p1[]= new String[2];
        if (p.charAt(2)==':') {
            p1 = p.split(":");
        }else{
            p1 = p.split("\\.");
        }
        h = Integer.parseInt(p1[0]);
        h=h<12?h:h%12;
        m = Integer.parseInt(p1[1]);
        m=m<60?m:m%60;
        System.out.println(minAngle(h, m));
    }
    
}
