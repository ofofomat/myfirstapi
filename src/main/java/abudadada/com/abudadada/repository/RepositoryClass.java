package abudadada.com.abudadada.repository;
import abudadada.com.abudadada.model.ModelClass;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryClass extends JpaRepository<ModelClass, Long>{
    List<ModelClass> findAll();
}
