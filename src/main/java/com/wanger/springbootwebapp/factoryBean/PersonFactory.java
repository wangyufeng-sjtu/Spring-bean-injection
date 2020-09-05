package com.wanger.springbootwebapp.factoryBean;

import com.wanger.springbootwebapp.model.Person;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * factory bean to create a person
 *
 * @author wanger
 * @date 2020年 08月31日
 */

@Component
public class PersonFactory implements InitializingBean, FactoryBean<Person> {
    private Person person;

    @Override
    public Person getObject() throws Exception {
        System.out.println("person is generated");
        return person;
    }

    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        person = new Person();
        person.setAge(25);
        person.setName("wanger");
        System.out.println("person factory init.");
    }
}
