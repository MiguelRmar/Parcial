/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcialmr.services;

import com.mycompany.parcialmr.temperaturas.temperatura;
import org.springframework.stereotype.Service;

/**
 *
 * @author 2099444
 */
@Service
public class temperaturasServices {
    float conversion;
    
    public float CaF(temperatura t){
        conversion = t.getValor();
        conversion = (conversion*9/5)+32 ;
        return conversion;
    }
    
    public float FaC(temperatura t){
        conversion = t.getValor();
        conversion = (conversion-32)*5/9 ;
        return conversion;
    } 
    
}
