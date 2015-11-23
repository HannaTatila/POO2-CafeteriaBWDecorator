/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.cafe.application;

import ifes.cafe.cdp.CafeChantili;
import ifes.cafe.cdp.CafeChocolate;
import ifes.cafe.cdp.CafeCremeLaranja;
import ifes.cafe.cdp.CafeLicor;
import ifes.cafe.util.FabricaCafe;
import ifes.cafe.util.InterfaceCafe;

/**
 *
 * @author Hanna
 */

public class App {

    public static void main(String[] args) {
        InterfaceCafe cafe = FabricaCafe.criarCafe("normal");
        System.out.println("Cafe normal");
        System.out.println(cafe);

        cafe = new CafeChocolate(cafe);
        System.out.println(cafe);
        
        cafe = FabricaCafe.criarCafe("normal");
        cafe = new CafeCremeLaranja(cafe);
        System.out.println(cafe);
        
        cafe = FabricaCafe.criarCafe("normal");
        cafe = new CafeLicor(cafe);
        System.out.println(cafe);
        
        cafe = FabricaCafe.criarCafe("normal");
        cafe = new CafeChantili(cafe);
        System.out.println(cafe);
        
        /*
        cafe = FabricaCafe.criarCafe("semcafeina");
        System.out.println("Cafe sem cafeína");
        System.out.println(cafe);

        cafe = FabricaCafe.criarCafe("capuccino");
        System.out.println("Capuccino");
        System.out.println(cafe);
        */
    }

}
