package com.holpapp.models;

import java.time.LocalDate;

public class ValidatingUserModel extends UserModel {
    private String building;

    public ValidatingUserModel(String name, String surname, LocalDate birthdate, String email, String phone, String address, String password, String building) {
        super(name, surname, birthdate, email, phone, address, password);
        this.building = building;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }
}
