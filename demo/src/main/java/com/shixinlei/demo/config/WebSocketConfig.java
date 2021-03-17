package com.shixinlei.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * @author shixinlei
 */
@Configuration
public class WebSocketConfig {

    static Logger logger = LoggerFactory.getLogger(WebSocketConfig.class);

    /**
     * 注入ServerEndpointExporter，
     * 这个bean会自动注册使用了@ServerEndpoint注解声明的Websocket endpoint
     */
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        logger.info("初始化webSocket成功..................");
        return new ServerEndpointExporter();
    }

}
