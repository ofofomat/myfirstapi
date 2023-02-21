package abudadada.com.abudadada.model;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class ModelClass {
    //properties
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClass;
    
    @OneToMany
    private List<ModelSubject> subjects;
}
