package com.wanger.springbootwebapp.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * a player's properties
 *
 * @author wanger
 * @date 2020年 09月05日
 */
@ConfigurationProperties(prefix = "player")
public class PlayerProperties {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSports() {
        return sports;
    }

    public void setSports(String sports) {
        this.sports = sports;
    }

    private String name;
    private String sports;

}
