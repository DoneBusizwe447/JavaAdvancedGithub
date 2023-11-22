/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package igbook2.lesson15;


public class ExampleThread extends Thread {
    private final String name;
    
    public ExampleThread(String name){
        this.name = name;
    }
    
    @Override
    public void run(){  
        for (int i = 0; i < 1000; i++) {
            System.out.println(name + ":" + i);        
        }
    } 
}
