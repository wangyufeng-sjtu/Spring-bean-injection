package com.wanger.springbootwebapp.configBean.postProcessor;

import com.wanger.springbootwebapp.model.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

/**
 * userPost processor to register user bean
 *
 * @author wanger
 * @date 2020年 09月04日
 */
public class UserPostProcessor implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        BeanDefinitionBuilder userDefinition = BeanDefinitionBuilder.rootBeanDefinition(User.class).
                addPropertyValue("name", "wanger").
                addPropertyValue("money", 100);
        registry.registerBeanDefinition("user", userDefinition.getBeanDefinition());
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        //no operations
    }
}
