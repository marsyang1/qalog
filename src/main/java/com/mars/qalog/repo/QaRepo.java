package com.mars.qalog.repo;

import com.mars.qalog.entity.Qa;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yangyuchi on 2016/6/4.
 */
@Repository
public interface QaRepo extends MongoRepository<Qa, String> {

    List<Qa> findByQuestion(String question);

}
