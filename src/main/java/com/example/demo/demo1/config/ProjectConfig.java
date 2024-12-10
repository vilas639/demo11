package com.example.demo.demo1.config;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = {"com.example.demo.demo1"})
//@EnableAspectJAutoProxy


@EnableJpaRepositories("com.example.demo.demo1.repository")
@EntityScan("com.example.demo.demo1.entity")
//@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
public class ProjectConfig {
}
