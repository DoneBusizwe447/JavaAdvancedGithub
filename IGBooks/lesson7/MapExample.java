/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package igbook1.lesson7;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author magni
 */
public class MapExample {

    private static Iterable<String> keys;
    public static void main(String[] args) {
        // TODO code application logic here
        
        Map<String,String> partList = new TreeMap<>();
        partList.put("S001","Blue Polo Shirt");
        partList.put("S002","Black Polo Shirt");
        partList.put("H001","Duke Hat");
        
        partList.put("S001","Black  T-Shirt");
        Set<String> keys = partList.keySet();
        
        System.out.print("=== Part List ===");
        for (String key:keys){
            System.out.println("Part#; " + key + " " + partList.get(key));
        }
              
    }
    
}
