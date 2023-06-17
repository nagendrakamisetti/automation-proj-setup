package com.little.automation.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties
@EnableConfigurationProperties
@Setter
@Getter
public class ApplicationProperties {

    @Value("${application.url}")
    private String applicationUrl;

    @Value("${application.user}")
    private String userNamee;

    @Value("${application.password}")
    private String password;

}
