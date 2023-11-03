/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package igbook1.lesson10;

import java.util.List;
import java.util.Optional;


public class A05BOptionalChain {
    
    public static void main(String[] args) {
        
        List<Employee> eList = Employee.createShortList();
        
        System.out.println("\n== First CO Bonus ==");
        
        System.out.println(
          eList.stream()
              .filter(e -> e.getRole().equals(Role.EXECUTIVE))
              .filter(e -> e.getState().equals("AZ"))
              .findFirst()
              .flatMap(e -> Optional.of(e.getSummary()))
              .orElse("No match found!")
        );                                    
    }
}
