package com.nahorniak.chatapplication.config;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "rabbit")
@Getter
@Setter
@NoArgsConstructor
public class RabbitProperties {
    private String host;
    private Integer port;
    private String login;
    private String password;
}
