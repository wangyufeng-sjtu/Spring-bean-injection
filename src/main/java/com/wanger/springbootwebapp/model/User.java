package com.wanger.springbootwebapp.model;

/**
 * user model
 *
 * @author wanger
 * @date 2020年 09月04日
 */
public class User {
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int money;
    private String name;
}
