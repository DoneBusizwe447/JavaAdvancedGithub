/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package igbook2.lesson17;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class A05AvoidStateful {

    public static void main(String[] args) {
        
        List<Employee> eList = Employee.createShortList();
        List<Employee> newList01 = new ArrayList<>();
        List<Employee> newList02 = new ArrayList<>();
        
        eList.parallelStream() // Not Parallel. Bad.
            .filter(e -> e.getDept().equals("Eng"))
            .forEach(e -> newList01.add(e)); 

        newList02 = eList.parallelStream() // Good Parallel
            .filter(e -> e.getDept().equals("Eng"))
            .collect(Collectors.toList());
        
    }
}
