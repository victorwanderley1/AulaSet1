/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaset;

import java.util.TreeSet;

/**
 *
 * @author Victor e Vanessa
 */
public class AulaTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeCapitais = new TreeSet<>();
        
        treeCapitais.add("João Pessoa");
        treeCapitais.add("Natal");
        treeCapitais.add("Recife");
        treeCapitais.add("Fortaleza");
        treeCapitais.add("Terezina");
        treeCapitais.add("Salvador");
        
        System.out.println(treeCapitais);
        
        System.out.println(treeCapitais.first());
        System.out.println(treeCapitais.last());
        
                
        
    }
}
