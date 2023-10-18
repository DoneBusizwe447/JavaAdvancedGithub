/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package igbook1.lesson4;
public class GoodBonus {
  public double calcBonus(Employee e){
    if (e instanceof Employee){
      return e.getSalary() * 0.01;
    }else if (e instanceof Manager){
      return e.getSalary() * 0.03;
    }else {
      return 0;
    }
   
  }
  public static void main(String[] args) {
        // TODO code application logic here
    }
  
}