package com.mynetworkdb.data.contacts.humans;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.mynetworkdb.test.BaseTestClass;

public class HumanContactTest extends BaseTestClass {
    @Test
    public void testInstantiatesWithDefaultConstructor() {
        HumanContact contact = new HumanContact();
        assertNotNull(contact);
        assertNull(contact.getFirstName());
        assertNull(contact.getLastName());
        assertNull(contact.getDateOfBirth());
        assertNull(contact.getAge());
    }

    @Test
    public void testCanSetInstanceVariables() {
        HumanContact contact = new HumanContact();

        String[] input = new String[]{"Bilbo", "Baggins", "111", "2890-09-22"};
        contact.setFirstName(input[0]);
        contact.setLastName(input[1]);
        contact.setAge(input[2]);
        contact.setDateOfBirth(input[3]);

        assertEquals(contact.getFirstName(), input[0]);
        assertEquals(contact.getLastName(), input[1]);
        assertEquals(contact.getAge(), input[2]);
        assertEquals(contact.getDateOfBirth(), input[3]);
    }

    @Test
    public void testInstantiatesWithStringArray() {
        String[] input = new String[]{"Bilbo", "Baggins", "111", "2890-09-22"};
        HumanContact contact = new HumanContact(input);
        assertNotNull(contact);
        assertEquals(contact.getFirstName(), input[0]);
        assertEquals(contact.getLastName(), input[1]);
        assertEquals(contact.getAge(), input[2]);
        assertEquals(contact.getDateOfBirth(), input[3]);
    }
}
