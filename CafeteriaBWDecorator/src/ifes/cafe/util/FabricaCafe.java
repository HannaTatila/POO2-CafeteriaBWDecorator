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

public class FabricaCafe {

    public static Cafe criarCafe(String nome) {
        FabricaC fabrica;

        if (nome.equals("normal")) {
            fabrica = new FabricaCafeNormal();
        } else {
            if (nome.equals("capuccino")) {
                fabrica = new FabricaCafeCapuccino();
            } else {
                fabrica = new FabricaCafeSemCafeina();
            }
        }
        Cafe cafe = fabrica.criarCafe();
        return cafe;
    }
}
