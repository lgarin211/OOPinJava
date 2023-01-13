package PPTI15.Session03.SL2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class ACC {

    public static void main(String[] args) {
        case1ArithmeticException();
        case2ArrayIndexOutOfBoundsException();
        case3ClassCastException();
        case4IllegalArgumentException();
        case5IllegalMonitorStateException();
        case6IllegalStateException();
        case7IllegalThreadStateException();
        case8IndexOutOfBoundsException();
        case9NegativeArraySizeException();
        case10NullPointerException();
    }

    // Sebutkan 10 tipe exception yang ada di Java! 
        // 1.	ArithmeticException
        static void case1ArithmeticException(){
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println(c);
        }
        // 2.	ArrayIndexOutOfBoundsException
        static void case2ArrayIndexOutOfBoundsException(){
            int[] arr=new int[10];
            arr[10]=123;
        }
        // 3.	ClassCastException
        static void case3ClassCastException(){
            Object obj=new Integer(0);
            String str=(String)obj;
        }
        // 4.	IllegalArgumentException
        static void case4IllegalArgumentException(){
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println(c);
        }
        // 5.	IllegalMonitorStateException
        static void case5IllegalMonitorStateException(){
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println(c);
        }
        // 6.	IllegalStateException
        static void case6IllegalStateException(){
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println(c);
        }
        // 7.	IllegalThreadStateException
        static void case7IllegalThreadStateException(){
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println(c);
        }
        // 8.	IndexOutOfBoundsException
        static void case8IndexOutOfBoundsException(){
            int[] arr=new int[10];
            arr[10]=123;
        }
        // 9.	NegativeArraySizeException
        static void case9NegativeArraySizeException(){
            int[] arr=new int[-10];
        }
        // 10.	NullPointerException
        static void case10NullPointerException(){
            String str=null;
            System.out.println(str.length());
        }


}