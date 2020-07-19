package com.itchao.tchao_blog.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * @author wangchao
 * @create 2020-07-13-15:44
 */
@SpringBootConfiguration
public class OssUploadConfig {

    @ConfigurationProperties(prefix = "oss")
    @Bean
    public OssTemplate ossTemplate() {
        return new OssTemplate();
    }

}
