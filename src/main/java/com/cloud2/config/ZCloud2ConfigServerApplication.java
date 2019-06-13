package com.cloud2.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ZCloud2ConfigServerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ZCloud2ConfigServerApplication.class).web(true).run(args);
    }

}
