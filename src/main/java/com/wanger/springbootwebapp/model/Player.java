package com.wanger.springbootwebapp.model;

import com.wanger.springbootwebapp.properties.PlayerProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * a player base class
 *
 * @author wanger
 * @date 2020年 09月05日
 */
@Component
@EnableConfigurationProperties(PlayerProperties.class)
public class Player {
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

    public Player(PlayerProperties properties) {
        this.name = properties.getName();
        this.sports = properties.getSports();
    }
}
