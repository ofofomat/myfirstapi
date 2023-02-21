package abudadada.com.abudadada.service;

import java.util.List;
import org.springframework.stereotype.Service;
import abudadada.com.abudadada.repository.RepositoryCourse;
import abudadada.com.abudadada.KeyNotFoundException;
import abudadada.com.abudadada.model.ModelCourse;

@Service
public class ServiceCourse {

    private static RepositoryCourse repoCourse;

    public ServiceCourse(RepositoryCourse repoCourse) {
        ServiceCourse.repoCourse = repoCourse;
    }

    // data check method
    public List<ModelCourse> list() {
        return repoCourse.findAll();
    }

    public static ModelCourse getModelCurso(Long idCourse) {
        return repoCourse.findById(idCourse).orElseThrow(() -> new KeyNotFoundExecption("not found" + idCourse));
    }
}
