package com.wanger.springbootwebapp.configBean;

import com.wanger.springbootwebapp.configBean.postProcessor.UserPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * user configuration bean
 *
 * @author wanger
 * @date 2020年 09月04日
 */
@Configuration
public class UserConfig {

    //static means that the postProcessor is injected early
    @Bean
    public static UserPostProcessor builder() {
        return new UserPostProcessor();
    }
}
