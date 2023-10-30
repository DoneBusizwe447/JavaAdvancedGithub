/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package igbook1.lesson9;

import java.util.List;
import java.util.function.BiPredicate;

/**
 *
 * @author MikeW
 */
public class A07Binary {
  
  public static void main(String[] args){ 

    List<SalesTxn> tList = SalesTxn.createTxnList();
    SalesTxn first = tList.get(0);            
    String testState = "CA";
    
    BiPredicate<SalesTxn,String> stateBiPred = 
      (t, s) -> t.getState().getStr().equals(s);
    
    System.out.println("\n== First is CA?");
    System.out.println(
      stateBiPred.test(first, testState));
  }
}
