package abudadada.com.abudadada.repository;
import abudadada.com.abudadada.model.ModelStudent;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryStudent extends JpaRepository<ModelStudent, Long>{
    List<ModelStudent> findAll();
}
