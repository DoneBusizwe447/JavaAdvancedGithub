/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package igbook1.lesson10;

import java.util.List;


public class A01MapTest {
    
    public static void main(String[] args) {

        List<Employee> eList = Employee.createShortList();
                            
        System.out.println("\n== CO Bonuses ==");
        eList.stream()
            .filter(e -> e.getRole().equals(Role.EXECUTIVE))
            .filter(e -> e.getState().equals("CO"))
            .map(e -> e.getSalary() * Bonus.byRole(e.getRole()))
            .forEach( s -> System.out.printf("Bonus paid: $%,6.2f %n", s));
        
      
        System.out.println("\n== Eng Manager Bonus ==");
        eList.stream()
            .filter(e -> e.getRole().equals(Role.MANAGER))
            .filter(e -> e.getDept().equals("Eng"))
            .map(e -> e.getSalary() * Bonus.byRole(e.getRole()))
            .forEach( 
                s -> System.out.printf("Bonus paid: $%,6.2f %n", s)
            );

    }
    
}