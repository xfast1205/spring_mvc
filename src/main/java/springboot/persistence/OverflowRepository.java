package springboot.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import springboot.model.StackoverflowWebsite;

import java.util.List;

@Repository
public interface OverflowRepository extends MongoRepository<StackoverflowWebsite, String> {

    List<StackoverflowWebsite> findByWebsite(String website);

//    public List<StackoverflowWebsite> findAll() {
//        return mongoTemplate.findAll(StackoverflowWebsite.class);
//    }
}