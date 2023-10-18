/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package igbook1.lesson4;

public class Bar extends Foo {
    private int sum = 10;
    public void reportSum() {
        sum += result;
        sum += value;  // compiler error
    }
}