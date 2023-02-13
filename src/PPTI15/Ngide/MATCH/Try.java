package PPTI15.Ngide.MATCH;

import PPTI15.Session03.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.crypto.Data;

public class Try {

    public static ArrayList<Try> DataListnya = new ArrayList<Try>();
    public static ArrayList<poin> Datapoin = new ArrayList<poin>();

    int value = 0;
    int index = 0;
    String name = "";


    public Try(int value, int index, String name) {
        this.index = index;
        this.value = value;
        this.name = name;
    }

    public Try() {
        DataListnya.add(new Try(10,DataListnya.size(),"A"));
        DataListnya.add(new Try(20,DataListnya.size(),"B"));
        DataListnya.add(new Try(30,DataListnya.size(),"C"));
        DataListnya.add(new Try(40,DataListnya.size(),"D"));
        DataListnya.add(new Try(50,DataListnya.size(),"E"));
        
        Datapoin.add(new poin(1,"AFATAR ANGG"));    
        Datapoin.add(new poin(1,"HORRY POTTER"));
        Datapoin.add(new poin(2,"UCUPPPP"));

        


    }

    public static void main(String[] args) {

        Try margin = new Try();

        List<poinTry> joinedList = margin.DataListnya.stream()
            .flatMap(dataList -> margin.Datapoin.stream()
                .filter(dataPoin -> dataPoin.index == dataList.index)
                .map(dataPoin -> new poinTry(dataList.value, dataList.name, dataPoin.judulString, dataList.index)))
            .collect(Collectors.toList());
        
        System.out.println("====================================");
        System.out.println(joinedList.size());
        for (poinTry poinTry : joinedList) {
            System.out.println("Joined List: " + poinTry.value + " " + poinTry.name + " " + poinTry.title);
        }
    }
}