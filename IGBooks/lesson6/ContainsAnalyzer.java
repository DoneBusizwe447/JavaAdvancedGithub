/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package igbook1.lesson6;

public class ContainsAnalyzer implements StringAnalyzer {
  @Override
  public boolean analyze(String target, String searchStr){
    return target.contains(searchStr);
  }
}