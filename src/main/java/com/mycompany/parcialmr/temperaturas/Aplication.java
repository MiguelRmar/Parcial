/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcialmr.temperaturas;

import com.mycompany.parcialmr.services.temperaturasServices;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author 2099444
 */
@SpringBootApplication
public class Aplication implements CommandLineRunner {
    
    public void run(String... args) throws Exception {
        
        temperatura C = new temperatura();
        C.setTipo("Centigrados");
        C.setValor(22);
        
        System.out.println("C "+C.getValor());
        
        temperaturasServices ts = new temperaturasServices();
        
        float valor = ts.CaF(C);
        
        System.out.println("Valor temperatura convertido es: "+valor);
        
        C.setValor(50);
        
        valor = ts.FaC(C);
        
        System.out.println("Valor temperatura convertido es: "+valor);

    }
    
}
