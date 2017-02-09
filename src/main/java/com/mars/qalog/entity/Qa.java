package com.mars.qalog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by yangyuchi on 05/02/2017.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Qa {

    @Id
    private String id;
    private String question;
    private String answer;
//    private List<String> tag;

    public Qa(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }
//
//    public Qa(String question, String answer, List<String> tag) {
//        this.question = question;
//        this.answer = answer;
//        this.tag = tag;
//    }

}
