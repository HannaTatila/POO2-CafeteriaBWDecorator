/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.cafe.util;

/**
 *
 * @author Hanna
 */
public abstract class CafeAbstrato implements InterfaceCafe{
    float preco;
    
    @Override
    public abstract double getPreco();
    
}
