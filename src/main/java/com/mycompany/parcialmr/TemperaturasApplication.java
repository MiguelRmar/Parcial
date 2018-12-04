/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcialmr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author 2099444
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.mycompany.parcialmr"})
public class TemperaturasApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(TemperaturasApplication.class, args);
    }
    
}
