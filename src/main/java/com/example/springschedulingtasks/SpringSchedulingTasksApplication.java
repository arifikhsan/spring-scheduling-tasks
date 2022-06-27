package com.example.springschedulingtasks;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
//@EnableAdminServer
@SpringBootApplication
public class SpringSchedulingTasksApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSchedulingTasksApplication.class, args);
    }

}
