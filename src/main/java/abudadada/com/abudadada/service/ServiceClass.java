package abudadada.com.abudadada.service;

import java.util.List;
import org.springframework.stereotype.Service;
import abudadada.com.abudadada.repository.RepositoryClass;
import abudadada.com.abudadada.model.ModelClass;
@Service
public class ServiceClass {
    
    private static RepositoryClass repoClass;

    public ServiceClass(RepositoryClass repoClass) {
        ServiceClass.repoClass = repoClass;
    }

    // data check method
    public List<ModelClass> list(){
        return repoClass.findAll();
    }
}
