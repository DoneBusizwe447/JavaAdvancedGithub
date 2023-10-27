/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package igbook1.lesson8;

import java.util.List;

public class RoboCall01 {
  
  public void callDrivers(List<Person> pl){
    for(Person p:pl){
      if (p.getAge() >= 16){
        roboCall(p);
      }
    }
  }
  
  public void emailDraftees(List<Person> pl){
    for(Person p:pl){
      if (p.getAge() >= 18 && p.getAge() <= 25 && p.getGender() == Gender.MALE){
        roboEmail(p);
      }
    }
  }
  
  public void mailPilots(List<Person> pl){
    for(Person p:pl){
      if (p.getAge() >= 23 && p.getAge() <= 65){
        roboMail(p);
      }
    }
  }
  
  
  public void roboCall(Person p){
    System.out.println("Calling " + p.getGivenName() + " " + p.getSurName() + " age " + p.getAge() + " at " + p.getPhone());
  }
  
  public void roboEmail(Person p){
    System.out.println("EMailing " + p.getGivenName() + " " + p.getSurName() + " age " + p.getAge() + " at " + p.getEmail());
  }
  
  public void roboMail(Person p){
    System.out.println("Mailing " + p.getGivenName() + " " + p.getSurName() + " age " + p.getAge() + " at " + p.getAddress() + ", " + p.getCity() + ", " + p.getState() + " " + p.getCode());
  }

}