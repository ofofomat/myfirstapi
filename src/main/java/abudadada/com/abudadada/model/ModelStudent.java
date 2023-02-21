package abudadada.com.abudadada.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ModelStudent {
    // properties
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idStudent;
    private String studentName;
    private String studentAdress;

    @ManyToOne
    @JoinColumn(name = "idCourse")
    private ModelCourse course;
    @ManyToOne
    private ModelClass class1;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAdress() {
        return studentAdress;
    }

    public void setStudentAdress(String studentAdress) {
        this.studentAdress = studentAdress;
    }

}
