/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package igbook2.lesson15;


import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {

    public static void main(String[] args) {
        AtomicInteger ai = new AtomicInteger(5);
        System.out.println("New value: " 
          + ai.incrementAndGet());
        System.out.println("New value: " 
          + ai.getAndIncrement());
        System.out.println("New value: " 
          + ai.getAndIncrement());

    }
}
