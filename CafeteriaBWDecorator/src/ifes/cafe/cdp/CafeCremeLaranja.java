/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.cafe.cdp;

import ifes.cafe.util.DecoradorCafeAbstrato;
import ifes.cafe.util.InterfaceCafe;

/**
 *
 * @author Hanna
 */

public class CafeCremeLaranja extends DecoradorCafeAbstrato {
   
    public CafeCremeLaranja(InterfaceCafe cafe){
        super(cafe);
    }
    
    @Override
    public double getPreco(){
        return (float) (cafeDecorado.getPreco() + 1.50);
    }
    
    public String toString() {
        cafeDecorado.toString();
        return "Creme de laranja adicionado ao cafe! Novo preco final: " + this.getPreco() + "\n";
    }
    
}
