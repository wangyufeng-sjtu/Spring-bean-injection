package com.wanger.springbootwebapp.configBean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * test the time when ApplicationContextAwareProcessor is injected
 *
 * @author wanger
 * @date 2020年 09月20日
 */
public class AppliacationContextAwareBean implements ApplicationContextAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Do something with application context");
    }
}
