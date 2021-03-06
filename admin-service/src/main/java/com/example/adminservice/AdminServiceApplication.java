package com.example.adminservice;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableAdminServer
//@EnableTurbine
//@EnableHystrixDashboard
//@EnableHystrix
@SpringBootApplication
public class AdminServiceApplication extends SpringBootServletInitializer {
//      war包需要
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(AdminServiceApplication.class);
//    }
    public static void main(String[] args) {
        SpringApplication.run(AdminServiceApplication.class, args);
    }

}
