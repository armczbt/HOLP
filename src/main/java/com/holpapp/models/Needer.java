package com.holpapp.models;

public class Needer {
    private User user;
    private String diseases;
    private String availability;

    public Needer(User user, String diseases, String availability) {
        this.user = user;
        this.diseases = diseases;
        this.availability = availability;
    }

    public User getUser() {
        return user;
    }

    public String getDiseases() {
        return diseases;
    }

    public String getAvailability() {
        return availability;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setDiseases(String diseases) {
        this.diseases = diseases;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
}
