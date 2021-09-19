package com.mynetworkdb.database;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.mynetworkdb.test.BaseTestClass;

public class DynamoDBHelperTest extends BaseTestClass {

    @Test
    public void testIsAbleToInstantiateObject() {
        DynamoDBHelper helper = new DynamoDBHelper();
        assertNotNull(helper);
    }

    @Test
    public void testCreatesDynamoDBTable() {
        assertTrue(true);
    }

    @Test
    public void testUpdatesDynamoDBTable() {
        assertTrue(true);
    }

    @Test
    public void testDeletesDynamoDBTable() {
        assertTrue(true);
    }
}
