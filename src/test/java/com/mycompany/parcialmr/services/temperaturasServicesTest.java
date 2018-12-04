/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcialmr.services;

import com.mycompany.parcialmr.temperaturas.temperatura;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2099444
 */
public class temperaturasServicesTest {
    
    public temperaturasServicesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of CaF method, of class temperaturasServices.
     */
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

    /**
     * Test of FaC method, of class temperaturasServices.
     */
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
