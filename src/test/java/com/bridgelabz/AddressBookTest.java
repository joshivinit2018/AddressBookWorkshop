package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

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
        Contact contact = new Contact("Vinit","Joshi","address","city","Maharashtra",416218,"7798969414","joshivini@gmail.com");
        boolean isadd= addressBookMain.addContact(contact);
        Assert.assertTrue(isadd);
    }
}
