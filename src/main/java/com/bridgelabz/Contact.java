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

    @Override
    public String toString() {
        return "Contact{" +
                "fristname='" + fristname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}
