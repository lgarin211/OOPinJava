package PPTI15.Session03.SL2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class ACC2 {

    public static void main(String[] args) {
        
    }
    
    // NullPointerException
    static void case1NullPointerException(){
        String str=null;
        System.out.println(str.length());
    }

    // NumberFormatException
    static void case2NumberFormatException(){
        String str="abc";
        int a=Integer.parseInt(str);
    }

    // IllegalArgumentException
    static void case3IllegalArgumentException(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int a=sc.nextInt();
        if(a<0){
            throw new IllegalArgumentException("Angka tidak boleh negatif");
        }
    }

    // RuntimeException
    static void case4RuntimeException(){
        int a=10;
        int b=0;
        int c=a/b;
    }

    // IllegalStateException
    static void case5IllegalStateException(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int a=sc.nextInt();
        if(a<0){
            throw new IllegalStateException("Angka tidak boleh negatif");
        }
    }

    // NoSuchMethodException
    static void case6NoSuchMethodException(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int a=sc.nextInt();
        if(a<0){
            throw new NoSuchMethodException("Angka tidak boleh negatif");
        }
    }

    // ClassCastException
    static void case7ClassCastException(){
        Object obj=new Integer(10);
        String str=(String)obj;
    }

    // Exception
    // Exception adalah kelas utama dimana semua jenis Exception mewariskannya. Java tidak pernah memanggil Exception secara langsung. Ia muncul bisa jadi karena kita atau pihak ketiga memanggilnya secara eksplisit.
    static void case8Exception(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int a=sc.nextInt();
        if(a<0){
            throw new Exception("Angka tidak boleh negatif");
        }
    }

    // ParseException
    static void case9ParseException(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int a=sc.nextInt();
        if(a<0){
            throw new ParseException("Angka tidak boleh negatif");
        }
    }

    // InvocationTargetException
    static void case10InvocationTargetException(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int a=sc.nextInt();
        if(a<0){
            throw new InvocationTargetException("Angka tidak boleh negatif");
        }
    }


}