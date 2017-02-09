package com.mars.qalog.repo;

import com.mars.qalog.entity.Qa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by yangyuchi on 2016/6/4.
 */
@RepositoryRestResource(collectionResourceRel = "qa", path = "qa")
public interface QaRestRepo extends CrudRepository<Qa, String> {

    List<Qa> findByQuestion(String question);

}
