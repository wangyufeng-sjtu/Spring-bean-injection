package com.wanger.springbootwebapp.configBean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * load student class
 *
 * @author wanger
 * @date 2020年 09月05日
 */
@Configuration
@ImportResource(locations = {"classpath:application-context.xml"})
public class StudentConfig {

}
