package com.nahorniak.chatapplication.config;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
@PropertySource("classpath:application.yml")
@AllArgsConstructor
public class WebSocketConfiguration implements WebSocketMessageBrokerConfigurer {

    private final RabbitProperties rabbitProperties;

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws").withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.setApplicationDestinationPrefixes("/app");
        registry.enableStompBrokerRelay("/topic")
                .setRelayHost(rabbitProperties.getHost())
                .setRelayPort(rabbitProperties.getPort())
                .setClientLogin(rabbitProperties.getLogin())
                .setClientPasscode(rabbitProperties.getPassword());
    }
}
