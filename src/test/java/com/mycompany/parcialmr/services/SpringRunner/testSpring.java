/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcialmr.services.SpringRunner;

import com.mycompany.parcialmr.services.temperaturasServices;
import com.mycompany.parcialmr.temperaturas.temperatura;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author 2099444
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)

public class testSpring{ 
    
    @LocalServerPort
    private int port;

    @Test
    public void testCaF() {
        System.out.println("CaF");
        temperatura t = new temperatura();
        temperaturasServices instance = new temperaturasServices();
        t.setValor(10);
        float expResult = 50;
        float result = instance.CaF(t);
        assertEquals(expResult, result,50);
    }
    
    @Test
    public void testFaC() {
        System.out.println("FaC");
        temperatura t = new temperatura();
        t.setValor(50);
        temperaturasServices instance = new temperaturasServices();
        float expResult = 71.6f;
        float result = instance.FaC(t);
        assertEquals(expResult, result,71.6f);  
    }

}
