package com.mars.qalog.service;

import com.mars.qalog.entity.Qa;
import com.mars.qalog.repo.QaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by USER on 2017/2/7.
 */
@Component
public class DatabaseLoader implements CommandLineRunner {

    private final QaRepo repository;

    @Autowired
    public DatabaseLoader(QaRepo repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Qa("test1","answer1"));
        this.repository.save(new Qa("test2","answer2"));
        this.repository.save(new Qa("test3","answer3"));
        this.repository.save(new Qa("test4","answer4"));
    }

}
