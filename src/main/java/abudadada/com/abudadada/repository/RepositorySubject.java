package abudadada.com.abudadada.repository;
import abudadada.com.abudadada.model.ModelSubject;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorySubject extends JpaRepository<ModelSubject, Long>{
    List<ModelSubject> findAll();
}
