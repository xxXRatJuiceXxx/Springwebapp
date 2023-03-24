package de.springboot.persistence;

import de.springboot.model.StackOverflowWebsite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StackOverflowWebsiteRepository  extends MongoRepository <StackOverflowWebsite,String> {
    List<StackOverflowWebsite> findAllByWebsite(String website);

}
