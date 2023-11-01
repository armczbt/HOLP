package com.holpapp.models;

public class Admin {
    private User user;
    private String building;

    public Admin(User user, String building) {
        this.user = user;
        this.building = building;
    }

    public User getUser() {
        return user;
    }

    public String getBuilding() {
        return building;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

}
