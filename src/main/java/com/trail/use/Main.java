package com.trail.use;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args){
        ConfigurableApplicationContext ctx = SpringApplication.run(Main.class, args);
        College clg = ctx.getBean(College.class);
        clg.setCid(174);
        clg.setCollegeName("RAIT");
        clg.showInfo();
    }
}
