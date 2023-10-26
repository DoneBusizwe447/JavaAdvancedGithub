/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package igbook1.lesson7;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author magni
 */
public class setExample {
public static void main (String[] args) {
    Set<String> set = new TreeSet<> ();
    
    set.add("one");
    set.add("two");
    set.add("three");
    set.add("three");
    
    for (String item:set) {
        System.out.println("Item: " + item);
                
    
}
}
    
}
