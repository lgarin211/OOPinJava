package PPTI15.Session02.SL1;

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
        System.out.println(minAngle(12, 30));
    }
    
}
