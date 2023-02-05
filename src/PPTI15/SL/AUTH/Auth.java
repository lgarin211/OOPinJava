package AUTH;

public class Auth {    
    String ID;
    String Name;
    String Username;
    String Password;
    String JenisKelamin;
    String NoHP;
    String Level;

    public Auth( String ID,String Name,String Username,String Password,String JenisKelamin,String NoHP,String Level){
        this.ID = ID;
        this.Name = Name;
        this.Username = Username;
        this.Password = Password;
        this.JenisKelamin = JenisKelamin;
        this.NoHP = NoHP;
        this.Level = Level;
    }

    public String getUsername() {
        return Username;
    }
    public String getID() {
        return ID;
    }
    public String getPassword() {
        return Password;
    }
    public String getLevel() {
        return Level;
    }
    public String Name(){
        return Name;
    }

    public Auth(){
        
    }

}
