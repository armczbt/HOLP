package com.holpapp.DatabaseTests;

import static org.junit.Assert.*;
import org.junit.Test;



import com.holpapp.controllers.DatabaseController;

public class ConnectionTest {

    @Test
    public void testConnect() {
        DatabaseController databaseController = new DatabaseController();
        
        try {
            databaseController.connect();
        } catch (Exception e) {
            fail("Exception not expected: " + e.getMessage());
        }
    }
}
