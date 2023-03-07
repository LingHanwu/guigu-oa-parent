package com.atguigu.auth;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.net.InetAddress;

@SpringBootApplication
@MapperScan(basePackages = {"com.atguigu.auth.mapper", "com.atguigu.process.mapper", "com.atguigu.wechat.mapper"})
@Slf4j
public class ServiceAuthApplication {
    @SneakyThrows
    public static void main(String[] args) {
        SpringApplication app=new SpringApplication(ServiceAuthApplication.class);
        ConfigurableApplicationContext application=app.run(args);
        Environment env = application.getEnvironment();
        log.info("""

                        ----------------------------------------------------------
                        \tApplication '{}' is running! Access URLs:
                        \tLocal: \t\thttp://localhost:{}
                        \tExternal: \thttp://{}:{}
                        \tDoc: \thttp://{}:{}/doc.html
                        ----------------------------------------------------------""",
                env.getProperty("spring.application.name"),
                env.getProperty("server.port"),
                InetAddress.getLocalHost().getHostAddress(),
                env.getProperty("server.port"),
                InetAddress.getLocalHost().getHostAddress(),
                env.getProperty("server.port"));
    }
}
