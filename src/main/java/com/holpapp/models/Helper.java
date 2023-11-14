package com.holpapp.models;

public class Helper {
    private User user;
    private String skills;
    private String availability;

    public Helper(User user, String skills, String availability) {
        this.user = user;
        this.skills = skills;
        this.availability = availability;
    }

    public User getUser() {
        return user;
    }

    public String getSkills() {
        return skills;
    }

    public String getAvailability() {
        return availability;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
}
