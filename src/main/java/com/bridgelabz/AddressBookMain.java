package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class AddressBookMain {

    public List<Contact> contactList;


    public static void main(String[] args)
    {
        System.out.println("welcome to addressbook");
    }

    public List<Contact> addContact(Contact contact) {
        System.out.println(contact);
        contactList = new ArrayList<>();
        try {
            contactList.add(contact);
            return contactList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contactList;
    }
    public Contact updateContact(List<Contact> contactList, String name, String fieldName, String update) {
        try {
            for(Contact contact : contactList){
                if(contact.fristname.equals(name)) {
                    switch (fieldName) {
                        case "firstName":
                            contact.fristname = update;
                            break;
                        case "lastName":
                            contact.lastname = update;
                            break;
                        case "address":
                            contact.address = update;
                            break;
                        case "city":
                            contact.city = update;
                            break;
                        case "state":
                            contact.state = update;
                            break;
                        case "zip":
                            contact.zip = update;
                            break;
                        case "phone":
                            contact.phone = update;
                            break;
                        case "email":
                            contact.email = update;
                            break;
                    }
                }
                return contact;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
