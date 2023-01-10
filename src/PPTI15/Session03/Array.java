package PPTI15.Session03;
import java.util.ArrayList;
// import java.io.*;
import java.util.Scanner;

public class Array {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr=new int[100];
        arr[0]=123;
        System.out.println(arr[0]);
        int [][] duaD=new int[100][100];    
        array_list();
    }

    static void array_list(){
        ArrayList<Integer> score = new ArrayList<Integer>();
        score.add(758);
        score.add(0,457);
        System.out.println(score.get(0));
        System.out.println(score.get(1));
    }

}
