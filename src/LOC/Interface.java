package LOC;

import java.util.ArrayList;

public class Interface {

    public static void main(String[] args) {
        
        // menggunakan interface
        InterfaceExample ie = new InterfaceExample();
        ie.g();
        ie.Inlist.add("HelloP");
        ie.Inlist.add("WorldP");
        System.out.println(ie.Inlist);
        
        // menggunakan abstract class
        AbstractExample ae = new AbstractExample();
        ae.f();
        ae.addToList("Hello");
        ae.addToList("World");
        System.out.println(ae.getList());
    }
}

// interface
interface InterfaceA {
    void g();
    public ArrayList<String> Inlist = new ArrayList<String>();
}

class InterfaceExample implements InterfaceA {
    @Override
    public void g() {
        System.out.println("Fungsi G di InterfaceExample");
    }
}




// abstract class
abstract class AbstractA {
    public void horrn(){
        System.out.println("Horn");
    };

    public abstract void f();
    public ArrayList<String> list = new ArrayList<String>();
    
    public void addToList(String s) {
        list.add(s);
    }
    
    public ArrayList<String> getList() {
        return list;
    }
}

class AbstractExample extends AbstractA {
    @Override
    public void f() {
        System.out.println("Fungsi F di AbstractExample");
    }
}
