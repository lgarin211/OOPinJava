package PPTI15.Session04;

class Hero{

    private String name;
    private int atk;
    protected int energy;
    
    // counstuctor
    Hero(String name){
        atk=10;
        energy=100;
        this.name=name;
        System.out.println("Hero " + name + " is created, come form unknown world and will save the worlds");
    }
    //setter 
    Hero(String name,int energy){
        atk=10;
        this.energy=energy;
        this.name=name;
        System.out.println("Hero " + name + " is created, come form unknown world and will save the worlds");
    }
    //setter 
    public void setAtk(int atk) {
        try {
            if (atk>10000||atk<0) {
                throw new Exception("Attack cannot be more than 10000 or less than 0");
            }
            this.atk = atk;
        } catch (Exception e) {
            System.out.println("perintah error");
            System.out.println(e);
        }
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
        if (energy+50<=100) {
            energy+=50;
        } else {
            energy=100;
        }
        this.showStatus();
    }
    public void showStatus(){
        System.out.println("Energy: " + energy);
        System.out.println("Attack: " + atk);
    }
    protected void train(){
        System.out.println(name + " is training");
        if(energy-10>=0){
            energy-=10;
            atk+=5;
        }
        System.out.println("Energy: " + energy);
        System.out.println("Attack: " + atk);
    }
    // getter
    int getAtk(){
        return atk;
    }
    // access modifier
                    // class|package|inheritance|public/all
    // public       // Y    |   Y    |    Y     |   Y
    // private      // Y    |   N    |    N     |   N
    // protected    // Y    |   Y    |    Y     |   N
    // default      // Y    |   Y    |    N     |   N


}