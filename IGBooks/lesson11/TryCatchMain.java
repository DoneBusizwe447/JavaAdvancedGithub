/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package igbook2.lesson11;


import java.io.FileInputStream;
import java.io.InputStream;

public class TryCatchMain {


    public static void main(String[] args) {
        
        try {
            System.out.println("About to open a file");
            InputStream in = new FileInputStream("missingfile.txt");
            System.out.println("File open");
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }
    }
}
