package com.mars.qalog.service;

import com.mars.qalog.entity.Qa;

import java.util.List;

/**
 * Created by yangyuchi on 05/02/2017.
 */
public interface QaService {

    List<Qa> findByQuestion(String question);

    List<Qa> findByTag(String tag);

}
