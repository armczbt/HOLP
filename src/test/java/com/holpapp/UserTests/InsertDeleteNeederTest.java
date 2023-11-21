package com.holpapp.UserTests;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import com.holpapp.controllers.DatabaseController;
import com.holpapp.models.Needer;
import com.holpapp.models.User;

public class InsertDeleteNeederTest {

    @Test
    public void testInsertDeleteNeeder() {

        DatabaseController databaseController = new DatabaseController();

        // Créez un utilisateur pour le test
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

        // Créez un Needer avec l'utilisateur créé
        Needer testNeeder = new Needer(testUser, "cancer", "wednesdays");

        try {
            // Insérez le Needer dans la base de données
            databaseController.addNeeder(testNeeder);

            // Vérifiez que le Needer a été correctement inséré
            Needer retrievedNeeder = databaseController.getNeederFromUser(testUser);
            assertNotNull(retrievedNeeder);

            // Supprimez le Needer de la base de données
            databaseController.deleteUser(testNeeder.getUser().getId());

            // Vérifiez que le Needer a été correctement supprimé
            retrievedNeeder = databaseController.getNeederFromUser(testUser);
            assertNull(retrievedNeeder);

        } catch (Exception e) {
            fail("Exception not expected: " + e.getMessage());
        }
    }
}
