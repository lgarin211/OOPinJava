package PPTI15.Session03;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
// import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public class Array {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr=new int[100];
        arr[0]=123;
        // System.out.println(arr[0]);
        int [][] duaD=new int[100][100];    
        // array_list();
        vektor();
    }

    static void array_list(){
        ArrayList<Integer> score = new ArrayList<Integer>();
        score.add(758);
        score.add(0,457);
        System.out.println(score.get(0));
        System.out.println(score.get(1));
        for (int i = 0; i < 100; i++) {
            score.add((int)(Math.random()*1000));
        }
        // Collections.sort(score);
        // score.sort(Integer::compareTo);
        System.out.println("size is :"+score.size());
        // for (int i = 0; i < score.size(); i++) {
        //     System.out.println(score.get(i));
        // }
        System.out.println("Before : "+score.get(0));
        score.remove(0);
        System.out.println("After Remove size is :"+score.size());
        System.out.println("After Remove : "+score.get(0));
        score.clear();
        System.out.println("After Clear size is :"+score.size());
        // System.out.println("After Clear : "+score.get(0)); //error index out of bounds
    }

    static void vektor(){
        Vector <String> ppti = new Vector<>();
        ppti.add("Agustinus");
        System.out.println(ppti.get(0));
        ppti.add("lingkar");
        System.out.println(ppti.get(1));
        
    }


}
