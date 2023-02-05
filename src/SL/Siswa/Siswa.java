package SL.Siswa;

public class Siswa {
    int idSiswa;
    String namaSiswa;
    String emailSiswa;
    String passwordSiswa;    

    public Siswa(int idSiswa, String namaSiswa, String emailSiswa, String passwordSiswa) {
        this.idSiswa = idSiswa;
        this.namaSiswa = namaSiswa;
        this.emailSiswa = emailSiswa;
        this.passwordSiswa = passwordSiswa;
    }

    public Siswa() {
    }

    public int getIdSiswa() {
        return idSiswa;
    }

    public void setIdSiswa(int idSiswa) {
        this.idSiswa = idSiswa;
    }

    public String getNamaSiswa() {
        return namaSiswa;
    }

    public void setNamaSiswa(String namaSiswa) {
        this.namaSiswa = namaSiswa;
    }

    public String getEmailSiswa() {
        return emailSiswa;
    }

    public void setEmailSiswa(String emailSiswa) {
        this.emailSiswa = emailSiswa;
    }

    public String getPasswordSiswa() {
        return passwordSiswa;
    }

    public void setPasswordSiswa(String passwordSiswa) {
        this.passwordSiswa = passwordSiswa;
    }

    
}
