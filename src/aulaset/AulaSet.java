/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaset;
import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author Victor e Vanessa
 */
public class AulaSet {

    public static void main(String[] args) {
        // TODO code application logic here
        Set<Double>  notasAlunos = new HashSet<>();
        
        notasAlunos.add(5.8);        
        notasAlunos.add(7.9);
        notasAlunos.add(9.0);
        notasAlunos.add(8.5);
        
        System.out.println(notasAlunos);
    }
    
}
