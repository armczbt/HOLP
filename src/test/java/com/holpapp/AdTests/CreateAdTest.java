package com.holpapp.AdTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.junit.Test;

import com.holpapp.controllers.DatabaseController;
import com.holpapp.models.Ad;
import com.holpapp.models.User;

public class CreateAdTest {

    @Test
    public void testCreateAd() {
       
         DatabaseController Database = new DatabaseController();

        
       User user = new User(
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

        Ad ad = new Ad(1, "Offer", "Job Title", "Job Description", "2023-01-01", "Location", user.getId(), LocalDateTime.now(), "Pending", null, "High", false);

        Database.addAd(ad);

        Ad retrievedAd = null;

        List<Ad> ads = Database.getAllAds();
        for (Ad ad2 : ads) {
            if (ad2.getTitle().equals(ad.getTitle())) {
                retrievedAd = ad2;
            }
        }

        assertNotNull(retrievedAd);
        assertEquals(ad.getTitle(), retrievedAd.getTitle());
        assertEquals(ad.getDescription(), retrievedAd.getDescription());

    }
}