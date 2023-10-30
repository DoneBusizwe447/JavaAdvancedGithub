/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package igbook1.lesson9;
import java.util.List;
import java.util.function.UnaryOperator;
public class A08Unary {
  
  public static void main(String[] args){ 

    List<SalesTxn> tList = SalesTxn.createTxnList();
    SalesTxn first = tList.get(0);
        
    UnaryOperator<String> unaryStr = 
        s -> s.toUpperCase();
    
      System.out.println("== Upper Buyer");
      System.out.println(
          unaryStr.apply(first.getBuyerName()));
  }
}
