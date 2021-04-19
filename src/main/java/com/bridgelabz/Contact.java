package com.bridgelabz;

import java.util.Scanner;

public class Contact {
    public String fristname;
    public String lastname;
    public String address;
    public String city;
    public String state;
    public int zip;
    public long phone;
    public String email;

    public Contact(String fristname,String lastname,String address,String city,String state,int zip,long phone,String email){
        this.fristname = fristname;
        this.lastname = lastname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.email = email;

    }
    public void person(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your First Name");
        String firstname = input.next();
        System.out.println("Enter your Last Name");
        String Lastname = input.next();


    }

    public static void main(String[] args) {
        System.out.println("WELCOME to Address Book Program");
        Contact entry = new Contact("Vinit", "Joshi", "parit galli", "kapshi", "maharashtra", 416218, "5465651463", "joshivinit@gmail.com");
        System.out.println("First name: " + entry.fristname);
        System.out.println("Last name: " + entry.lastname;
        System.out.println("City: " + entry.city);
        System.out.println("State: " + entry.state);
        System.out.println("Pin code: " + entry.zip);
        System.out.println("E-Mail: " + entry.email);
    }
}
