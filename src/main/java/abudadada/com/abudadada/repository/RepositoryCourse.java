package abudadada.com.abudadada.repository;
import abudadada.com.abudadada.model.ModelCourse;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCourse extends JpaRepository<ModelCourse, Long>{
    List<ModelCourse> findAll();
}
