/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package igbook1.lesson7;

/**
 *
 * @author magni
 */
public class Student implements Comparable{
    String name;
    Long id;
    Double gpa;
    
    public Student(String name, Long id, Double gpa) {
        this.name = name;
        this.id = id;
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }

    @Override
    public int compareTo(Object o) {
        
    
        return 0;
        
    
}
}