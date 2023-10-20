package com.holpapp.models;

import java.time.LocalDate;

public class NeederModel extends UserModel {
    private String disease;
    private String availability;

    public NeederModel(String name, String surname, LocalDate birthdate, String email, String phone, String address, String password, String disease, String availability) {
        super(name, surname, birthdate, email, phone, address, password);
        this.disease = disease;
        this.availability = availability;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String isAvailable() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
}
