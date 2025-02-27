package de.mgr.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application extends SpringBootServletInitializer
{
    @Override
    protected SpringApplicationBuilder configure (SpringApplicationBuilder application)
    {
        return application.sources(Application.class);
    }

    public static void main (String[] args) throws InterruptedException
    {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);


    }


}
