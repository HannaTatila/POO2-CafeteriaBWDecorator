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

public class CafeChocolate extends DecoradorCafeAbstrato {
    
    public CafeChocolate(InterfaceCafe cafe){
        super(cafe);
    }
    
    @Override
    public double getPreco(){
        return (float) (cafeDecorado.getPreco() + 0.50);
    }
    
    public String toString() {
        cafeDecorado.toString();
        return "Chocolate adicionado ao cafe! Novo preco final: " + this.getPreco() + "\n";
    }
}
