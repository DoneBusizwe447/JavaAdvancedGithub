/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package igbook2.lesson19;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateFormatTest {
  public static void main(String[] args) {
    
    LocalDateTime today = LocalDateTime.now();
    Locale loc = Locale.FRANCE;
    
    DateTimeFormatter df = 
      DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)
        .withLocale(loc);
    System.out.println("Date: " + today.format(df) 
        + " Locale: " + loc.toString());
  }
}