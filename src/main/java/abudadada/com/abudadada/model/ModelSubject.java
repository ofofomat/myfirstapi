package abudadada.com.abudadada.model;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class ModelSubject {
    // propoerties
    @Id
    private int idSubject;
    private String subjectName;
    private String duration;

    @OneToOne
    private ModelProfessor professor;
    @OneToMany
    private List<ModelClass> classes;
    @OneToMany
    private List<ModelCourse> courses;

    public int getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

}
