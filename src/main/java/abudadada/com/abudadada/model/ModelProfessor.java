package abudadada.com.abudadada.model;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "model_professor")
public class ModelProfessor {
    // properties
    @Id // primary key
    private int idProfessor;
    private String name;

    @OneToMany(mappedBy = "professor")
    private List<ModelSubject> subjects;

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
