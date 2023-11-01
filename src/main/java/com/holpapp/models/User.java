package com.holpapp.models;

import java.time.LocalDate;

public class User {

    private int id;
    private String name;
    private String surname;
    private LocalDate birthdate;
    private String email;
    private String phone;
    private String address;
    private String password;
    private String role;

    public User(int id,String name, String surname, LocalDate birthdate, String email, String phone, String address, String password, String role) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.password = password;
        this.role=role;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }



    public String getSurname() {
        return surname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public void setId(int id) { this.id = id; }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

