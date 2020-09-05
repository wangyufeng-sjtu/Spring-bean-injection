package com.wanger.springbootwebapp.model;

/**
 * student base class
 *
 * @author wanger
 * @date 2020年 09月05日
 */
public class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    private String name;
    private int score;
}
