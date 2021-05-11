package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicApplication.class, args);
    }

    //public void run(String... args) throws Exception {
        // LOG.info("Hello Spring Boot World!!");
        // servicoUm.executarServico();

        /*String[] beans = applicationContext.getBeanDefinitionNames();
        Arrays.sort(beans);
        for(String bean : beans)
            LOG.info(bean);*/
    //};
}
