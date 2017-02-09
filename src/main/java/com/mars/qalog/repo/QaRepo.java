package com.mars.qalog.repo;

import com.mars.qalog.entity.Qa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yangyuchi on 2016/6/4.
 */
@Repository
public interface QaRepo extends CrudRepository<Qa, String> {

    List<Qa> findByQuestion(String question);

}
