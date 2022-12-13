package PPTI15.Session02.SL1;

public class Clock {
    // The min angle of clock
    public static double minAngle(int h, int m) {
        double angle = Math.abs(30 * h - 5.5 * m);
        return angle > 180 ? 360 - angle : angle;
    }

    public static void main(String[] args) {
        System.out.println(minAngle(10, 10));
    }
    
}
