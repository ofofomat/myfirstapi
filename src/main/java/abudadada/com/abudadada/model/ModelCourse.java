package abudadada.com.abudadada.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "model_course")
public class ModelCourse {
    // properties
    @Id
    private Long idCourse;
    private String courseName;
    private String beginning;

    @OneToMany
    private List<ModelStudent> students;
    @OneToMany
    private List<ModelClass> classes;
    @OneToMany
    private List<ModelSubject> subjects;

    public Long getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(Long idCourse) {
        this.idCourse = idCourse;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getBeginning() {
        return beginning;
    }

    public void setBeginning(String beginning) {
        this.beginning = beginning;
    }

    public List<ModelStudent> getStudents() {
        return students;
    }

    public void setStudents(List<ModelStudent> students) {
        this.students = students;
    }

    public List<ModelClass> getClasses() {
        return classes;
    }

    public void setClasses(List<ModelClass> classes) {
        this.classes = classes;
    }

    public List<ModelSubject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<ModelSubject> subjects) {
        this.subjects = subjects;
    }

}
