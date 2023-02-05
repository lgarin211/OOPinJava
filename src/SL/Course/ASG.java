package SL.Course;

public class ASG extends Course{
    int idASG;
    int idSiswa;
    double nilaiASG=0;
    public ASG(int idCourse, int idGuru, String namaCourse, int idASGint , int idSiswa) {
        super(idCourse, idGuru, namaCourse);
        this.idASG = idASG;
        this.idSiswa = idSiswa;
    }

    public ASG() {

    }

    public int getIdASG() {
        return idASG;
    }

    public void setIdASG(int idASG) {
        this.idASG = idASG;
    }

    public int getIdSiswa() {
        return idSiswa;
    }

    public void setIdSiswa(int idSiswa) {
        this.idSiswa = idSiswa;
    }

    public double getNilaiASG() {
        return nilaiASG;
    }

    public void setNilaiASG(int nilaiASG) {
        this.nilaiASG = nilaiASG;
    }

}
