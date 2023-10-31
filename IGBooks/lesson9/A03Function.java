/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package igbook1.lesson9;

import java.util.List;
import java.util.function.Function;

public class A03Function {
  
  public static void main(String[] args){ 

    List<SalesTxn> tList = SalesTxn.createTxnList();
    SalesTxn first = tList.get(0);
        
    Function<SalesTxn, String> buyerFunction = 
        t -> t.getBuyerName();
    
    System.out.println("\n== First Buyer");
    System.out.println(buyerFunction.apply(first));      
  }
}