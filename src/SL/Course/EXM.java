package SL.Course;

public class EXM extends Course {
    int idExam;
    int idSiswa;
    double NilaiExam=0;

    public EXM(int idCourse, int idGuru, String namaCourse, int idASGint , int idSiswa) {
        super(idCourse, idGuru, namaCourse);
        this.idExam = idExam;
        this.idSiswa = idSiswa;
        this.NilaiExam = NilaiExam;
    }

    public int getIdExam() {
        return idExam;
    }

    public int getIdSiswa() {
        return idSiswa;
    }

    public double getNilaiExam() {
        return NilaiExam;
    }

    public void setIdExam(int idExam) {
        this.idExam = idExam;
    }

    public void setIdSiswa(int idSiswa) {
        this.idSiswa = idSiswa;
    }

    public void setNilaiExam(int nilaiExam) {
        NilaiExam = nilaiExam;
    }


}
