package com.mars.qalog.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by yangyuchi on 05/02/2017.
 */
@Data
public class Qa {


    @Id
    private String id;
    private String question;
    private String answer;
    private List<String> tag;


}
