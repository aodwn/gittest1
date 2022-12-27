package dev.boot.gittest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import dev.mvc.gittest1.Gittest1Application;

@SpringBootApplication
@ComponentScan(basePackages = {"dev.mvc"})
public class ResortV1sbm3cApplication {
  public static void main(String[] args) {
    SpringApplication.run(Gittest1Application.class, args);
  }

}