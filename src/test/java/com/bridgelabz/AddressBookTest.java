package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.List;

public class AddressBookTest {

    private static AddressBookMain addressBookMain;

    @Before
    public void initialize()
    {
        AddressBookMain addressBookMain = new AddressBookMain();

    }

    @Test
    public void given_contact_when_addedTo_addressbook_shouldReturn_true() {
        AddressBookMain addressBookMain = new AddressBookMain();
        Contact contact = new Contact("Vinit","Joshi","kagal","city","Maharashtra","416218","7798969414","joshivini@gmail.com");
       // boolean isadd= addressBookMain.addContact(contact);
       // Assert.assertTrue(isadd);
        List<Contact> contactList =addressBookMain.addContact(contact);
        Assert.assertEquals(1,contactList.size());
    }

    @Test
    void given_contact_when_update_shouldReturn_true() {
        AddressBookMain addressBookMain = new AddressBookMain();
        Contact contact = new Contact("Vinit","Joshi","kagal","nipani","Maharashtra","416218","7798969414","joshivini@gmail.com");
        List<Contact> contactList =addressBookMain.addContact(contact);
        Contact updateContact = addressBookMain.updateContact(contactList,"Vinit","address","indiralane");
        Assert.assertEquals("indiralane",updateContact.address);
    }

    @Test
    void given_contact_when_delete_shouldReturn_true() {
        AddressBookMain addressBookMain = new AddressBookMain();
        Contact contact = new Contact("Vinit","Joshi","kagal","nipani","Maharashtra","416218","7798969414","joshivini@gmail.com");
        List<Contact> contactList = addressBookMain.addContact(contact);
        List<Contact> deleteContactList = addressBookMain.deleteContact(contactList, "Vinit");
        Assertions.assertEquals(0, deleteContactList.size());


    }
}
