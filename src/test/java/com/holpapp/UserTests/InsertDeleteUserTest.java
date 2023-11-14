package com.holpapp.UserTests;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import com.holpapp.controllers.DatabaseController;
import com.holpapp.models.User;

public class InsertDeleteUserTest {

    @Test
    public void testDeleteUserFromDatabase() {
       
        DatabaseController databaseController = new DatabaseController();

        
       User testUser = new User(
            0,
            "John",
            "Doe",
            LocalDate.parse("1990-01-01"), 
            "john.doe@example.com",
            "123456789",
            "123 Main St",
            "password",
            "role"
        );

        try {
            
            databaseController.insertUser(testUser);

            
            User retrievedUser = databaseController.checkUser(testUser.getEmail(), testUser.getPassword());
            assertNotNull(retrievedUser);

            
            databaseController.deleteUser(retrievedUser.getId());

            
            retrievedUser = databaseController.getUserById(testUser.getId());

            
            assertNull(retrievedUser);

        } catch (Exception e) {
            fail("Exception not expected: " + e.getMessage());
        }
    }
}
