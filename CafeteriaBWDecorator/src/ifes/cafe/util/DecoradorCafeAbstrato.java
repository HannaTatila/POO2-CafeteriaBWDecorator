/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.cafe.util;

import ifes.cafe.cdp.Cafe;

/**
 *
 * @author Hanna
 */

public abstract class DecoradorCafeAbstrato extends CafeAbstrato {
    
    protected InterfaceCafe cafeDecorado;
    
    public DecoradorCafeAbstrato(InterfaceCafe cafe){
        cafeDecorado = cafe;
    } 
    
    @Override
    public abstract double getPreco();
   
}
 
