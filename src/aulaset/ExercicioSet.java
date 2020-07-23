/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Victor e Vanessa
 */
public class ExercicioSet {
    public static void main(String[] args) {
        HashSet<Integer> numerosInt = new HashSet<>();
        
        numerosInt.add(3);
        numerosInt.add(88);
        numerosInt.add(20);
        numerosInt.add(44);
        numerosInt.add(3);
        
        for(int numero: numerosInt){
            System.out.println("--> "+numero);
        }
        Iterator<Integer> iterator = numerosInt.iterator();
        
        //numerosInt.pollFirst();//Para o TreeSet
        numerosInt.remove(iterator.next());
        numerosInt.add(23);
        System.out.println("O tamanho do set é: " + numerosInt.size());
        System.out.println("O set está vazio? " + numerosInt.isEmpty());
        System.out.println(numerosInt);
        
    }
}
