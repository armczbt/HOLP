package com.holpapp.models;

import java.time.LocalDate;

public class HelperModel extends UserModel {
    private String skills;
    private String availability;

    public HelperModel(String name, String surname, LocalDate birthdate, String email, String phone, String address, String password, String skills, String availability) {
        super(name, surname, birthdate, email, phone, address, password);
        this.skills = skills;
        this.availability = availability;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String isAvailable() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
}
