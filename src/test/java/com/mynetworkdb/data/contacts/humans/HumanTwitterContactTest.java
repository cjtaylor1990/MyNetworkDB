package com.mynetworkdb.data.contacts.humans;

import com.mynetworkdb.test.BaseTestClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class HumanTwitterContactTest extends BaseTestClass {

    @Test
    public void testInstantiatesWithDefaultConstructor() {
        HumanTwitterContact contact = new HumanTwitterContact();
        assertNotNull(contact);
        assertNull(contact.getFirstName());
        assertNull(contact.getLastName());
        assertNull(contact.getDateOfBirth());
        assertNull(contact.getAge());
        assertNull(contact.getHandle());
    }

    @Test
    public void testCanSetInstanceVariables() {
        HumanTwitterContact contact = new HumanTwitterContact();

        String[] input = new String[]{"Bilbo", "Baggins", "111", "2890-09-22", "bbaggins111"};
        contact.setFirstName(input[0]);
        contact.setLastName(input[1]);
        contact.setAge(input[2]);
        contact.setDateOfBirth(input[3]);
        contact.setHandle(input[4]);

        assertEquals(contact.getFirstName(), input[0]);
        assertEquals(contact.getLastName(), input[1]);
        assertEquals(contact.getAge(), input[2]);
        assertEquals(contact.getDateOfBirth(), input[3]);
        assertEquals(contact.getHandle(), input[4]);
    }

    @Test
    public void testInstantiatesWithStringArray() {
        String[] input = new String[]{"Bilbo", "Baggins", "111", "2890-09-22", "bbaggins111"};
        HumanTwitterContact contact = new HumanTwitterContact(input);
        assertNotNull(contact);
        assertEquals(contact.getFirstName(), input[0]);
        assertEquals(contact.getLastName(), input[1]);
        assertEquals(contact.getAge(), input[2]);
        assertEquals(contact.getDateOfBirth(), input[3]);
        assertEquals(contact.getHandle(), input[4]);
    }
}
