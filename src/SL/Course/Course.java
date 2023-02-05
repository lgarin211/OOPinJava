package SL.Course;

public class Course {
    int idCourse;
    int idGuru;
    String namaCourse;


    public Course(int idCourse, int idGuru, String namaCourse) {
        this.idCourse = idCourse;
        this.idGuru = idGuru;
        this.namaCourse = namaCourse;

    }

    public Course() {
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public int getIdGuru() {
        return idGuru;
    }

    public void setIdGuru(int idGuru) {
        this.idGuru = idGuru;
    }

    public String getNamaCourse() {
        return namaCourse;
    }

    public void setNamaCourse(String namaCourse) {
        this.namaCourse = namaCourse;
    }

}
