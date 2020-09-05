package com.wanger.springbootwebapp.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.wanger.springbootwebapp.model.Person;
import com.wanger.springbootwebapp.model.Player;
import com.wanger.springbootwebapp.model.Student;
import com.wanger.springbootwebapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/mgr")
public class InjectedBeanTestController {

    //injected through factory bean
    //the factory bean's afterPropertiesSet() is before the actual bean's construction
    @Autowired
    private Person person;

    //injected through beanDefinitionRegistryPostProcessor
    @Autowired
    private User user;

    //injected through traditional xml file
    @Autowired
    private Student student;

    //injected through configurationProperties
    @Autowired
    private Player player;

    @RequestMapping(value = "/greet.json", method = {RequestMethod.POST, RequestMethod.GET})
    public String greet() {
        Gson gson2 = new GsonBuilder().enableComplexMapKeySerialization().create();
        Map<String, Object> map = new HashMap<>();
        map.put("respCode", "1000");
        map.put("respMsg", "Hello wanger.");
        return gson2.toJson(map);
    }

    @RequestMapping(value = "/getPerson.json", method = {RequestMethod.POST, RequestMethod.GET})
    public String getPerson() {
        return String.format("Person %s 's age is %d", person.getName(), person.getAge());
    }

    @RequestMapping(value = "/getUser.json", method = {RequestMethod.POST, RequestMethod.GET})
    public String getUser() {
        return String.format("User %s 's money is %d", user.getName(), user.getMoney());
    }

    @RequestMapping(value = "/getStudent.json", method = {RequestMethod.POST, RequestMethod.GET})
    public String getStudent() {
        return String.format("Student %s 's score is %d", student.getName(), student.getScore());
    }

    @RequestMapping(value = "/getPlayer.json", method = {RequestMethod.POST, RequestMethod.GET})
    public String getPlayer() {
        return String.format("Player %s 's sport is %s", player.getName(), player.getSports());
    }

}
