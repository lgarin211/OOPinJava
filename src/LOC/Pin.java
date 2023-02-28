package LOC;

import java.util.ArrayList;

public class Pin {
    public static void main(String[] args) {
        ArrayList<satu> list = new ArrayList<>();
        list.add(new satu(1));

        for (satu satu : list) {
            System.out.println(satu.level);
        }
    }
    
}

class satu{
    int level;
    public satu(int level) {
        this.level = level;
    }
}