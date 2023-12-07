package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * ClassName: SpringConfig
 * Description:
 *
 * @Author snuonuo
 * @Create 2023/12/7 15:03
 * @Version 1.0
 */
@Configuration
@ComponentScan("com.example")
@PropertySource("jdbc.properties")
public class SpringConfig {

}
