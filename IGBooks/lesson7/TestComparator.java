/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package igbook1.lesson7;


import java.util.*;

 
 
public class TestComparator {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>(3);
        Comparator<Student> sortName = new StudentSortName();
        Comparator<Student> sortGpa = (Comparator<Student>) new StudentSortGpa();
       studentList.add(new Student("Thomas Jefferson", 1111L, 5.8));
       studentList.add(new Student("John Adams", 2222L, 3.9));
       studentList.add(new Student("George Washington", 3333L, 1.4));
        System.out.println("Sorting name in ascending order");
       Collections.sort(studentList, sortName);
       for(Student st : studentList) {
           System.out.println(st);

       }
        System.out.println("\n**\n\n Sorting Gpa in descending order");
       Collections.sort(studentList, sortGpa);
       for(Student st : studentList) {
           System.out.println(st);

       }
    }

}