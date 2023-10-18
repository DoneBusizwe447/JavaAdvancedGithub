/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package igbook1.lesson4;

public final class Contacts {

    private final String firstName;
    private final String lastName;
    private final String mobileNo;

    public Contacts(String fname, String lname, String mobile) {
        this.firstName = fname;
        this.lastName = lname;
        this.mobileNo = mobile;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public String toString() {

        return firstName + " - " + lastName + " - " + mobileNo;

    }
}