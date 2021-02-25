package com.apress.springbootrecipes.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * Simple application which will print the number of beans in the context and
 * a sorted list of bean names.
 *
 * @author Marten Deinum
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class DemoApplication {

  public static void main(String[] args) {
    // SpringApplication is a class having run static method..
    // returns ConfigurableApplicationContext..
    var ctx = SpringApplication.run(DemoApplication.class, args);
    // we can get a particular bean or beanCount from application context..
    System.out.println("# Beans: " + ctx.getBeanDefinitionCount());
   // get all bean names
    var names = ctx.getBeanDefinitionNames();
    Arrays.sort(names);
    // converting names array to list and dn using internal forEach to iterate
    Arrays.asList(names).forEach(System.out::println);
  }
}
