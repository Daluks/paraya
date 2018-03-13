package com.bmw.praya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class PayaraApplication extends SpringBootServletInitializer
{
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder)
    {
        return builder.sources(PayaraApplication.class); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args)
    {
        SpringApplication.run(PayaraApplication.class, args);
    }
}
