/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.cafe.cdp;

import ifes.cafe.util.CafeAbstrato;
import java.util.ArrayList;

/**
 *
 * @author Hanna
 */

public class Cafe extends CafeAbstrato{

    protected double preco;
    protected ArrayList<Ingredientes> ingredientes;

    public Cafe(){}
    
    public Cafe(double preco){
        this.preco += preco;
    }
    
    @Override
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public ArrayList<Ingredientes> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingredientes> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        System.out.println("Preco: " + preco);
        String nomeatual = "";
        String nome = this.ingredientes.get(0).getNome();
        String unidadeMedida = this.ingredientes.get(0).getUnidadeMedida();
        int cont = 0;
        for (Ingredientes ing : ingredientes) {
            nomeatual = ing.getNome();
            if (!nomeatual.equals(nome)) {
                System.out.println(cont + unidadeMedida + " de " + nome);
                nome = nomeatual;
                unidadeMedida = ing.getUnidadeMedida();
                cont = 0;
            }
            cont++;
        }
        System.out.println(cont + ingredientes.get(ingredientes.size() - 1).getUnidadeMedida() + " de " + ingredientes.get(ingredientes.size() - 1).getNome());
        return " ";
    }

}
