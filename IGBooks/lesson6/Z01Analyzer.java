/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package igbook1.lesson6;

public class Z01Analyzer {
  public static void main(String[] args) {
    String[] strList = 
    {"tomorrow","toto","to","timbukto","the","hello","heat"};
    String searchStr = "to";
    System.out.println("Searching for: " + searchStr);

    // Create regular class
    AnalyzerTool analyzeTool = new AnalyzerTool();
    
    System.out.println("===Contains===");
    for(String currentStr:strList){
      if  (analyzeTool.arrContains(currentStr, searchStr)){
        System.out.println("Match: " + currentStr);
      }
    }
  }  
}
