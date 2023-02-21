package abudadada.com.abudadada.repository;
import abudadada.com.abudadada.model.ModelProfessor;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryProfessor extends JpaRepository<ModelProfessor, Long>{
    List<ModelProfessor> findAll();
}