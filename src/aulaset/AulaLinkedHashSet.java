/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaset;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Iterator;
        
/**
 *
 * @author Victor e Vanessa
 */
public class AulaLinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> numeros = new LinkedHashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        
        System.out.println(numeros);
        
        Iterator<Integer> iteratorNumeros = numeros.iterator();
        
        while(iteratorNumeros.hasNext()){
            int numero = iteratorNumeros.next();
            System.out.println(numero);
        }
    }
}
