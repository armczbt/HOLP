package com.holpapp.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;

import com.holpapp.models.Ad;
import com.holpapp.models.Admin;
import com.holpapp.models.Helper;
import com.holpapp.models.Needer;
import com.holpapp.models.User;

import java.util.ArrayList;
import java.util.List;

public class DatabaseController {

    public boolean insertUser(User user) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://srv-bdens.insa-toulouse.fr:3306/projet_gei_008", "projet_gei_008", "ois3ohTh");
    
            String query = "INSERT INTO user (name, surname, birthdate, email, phone, address, password) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getSurname());
            preparedStatement.setString(3, user.getBirthdate().toString()); // Convert LocalDate to String
            preparedStatement.setString(4, user.getEmail());
            preparedStatement.setString(5, user.getPhone());
            preparedStatement.setString(6, user.getAddress());
            preparedStatement.setString(7, user.getPassword());
    
            int rowsInserted = preparedStatement.executeUpdate();
            conn.close();
    
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
    public User checkUser(String email, String password) {
    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://srv-bdens.insa-toulouse.fr:3306/projet_gei_008", "projet_gei_008", "ois3ohTh");

        String query = "SELECT * FROM user WHERE email = ? AND password = ?";
        PreparedStatement preparedStatement = conn.prepareStatement(query);
        preparedStatement.setString(1, email);
        preparedStatement.setString(2, password);

        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            Integer id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String surname = resultSet.getString("surname");
            LocalDate birthdate = LocalDate.parse(resultSet.getString("birthdate")); // Convert String to LocalDate
            String phone = resultSet.getString("phone");
            String address = resultSet.getString("address");
            String role = resultSet.getString("role");

            User user = new User(id, name, surname, birthdate, email, phone, address, password, role);
            
            conn.close();
            return user;
        } else {
            conn.close();
            return null; // User not found
        }
    } catch (SQLException e) {
        e.printStackTrace();
        return null; // Error occurred
    }
}


public boolean addHelper(Helper helper) {
    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://srv-bdens.insa-toulouse.fr:3306/projet_gei_008", "projet_gei_008", "ois3ohTh");

        String getUserIdQuery = "SELECT id FROM user WHERE email = ?";
        PreparedStatement getUserIdStatement = conn.prepareStatement(getUserIdQuery);
        getUserIdStatement.setString(1, helper.getUser().getEmail());
        ResultSet userIdResult = getUserIdStatement.executeQuery();

        if (userIdResult.next()) {
            int userId = userIdResult.getInt("id");

            String addHelperQuery = "INSERT INTO helper (id, skills, availability) VALUES (?, ?, ?)";
            PreparedStatement addHelperStatement = conn.prepareStatement(addHelperQuery);
            addHelperStatement.setInt(1, userId);
            addHelperStatement.setString(2, helper.getSkills());
            addHelperStatement.setString(3, helper.getAvailability());
            int rowsInserted = addHelperStatement.executeUpdate();

            // Update the role for the user
            String updateRoleQuery = "UPDATE user SET role = 'Helper' WHERE id = ?";
            PreparedStatement updateRoleStatement = conn.prepareStatement(updateRoleQuery);
            updateRoleStatement.setInt(1, userId);
            int roleUpdated = updateRoleStatement.executeUpdate();

            conn.close();

            return rowsInserted > 0 && roleUpdated > 0;
        } else {
            // The user with this email does not exist
            conn.close();
            return false;
        }
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}

public boolean addNeeder(Needer needer) {
    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://srv-bdens.insa-toulouse.fr:3306/projet_gei_008", "projet_gei_008", "ois3ohTh");

        String getUserIdQuery = "SELECT id FROM user WHERE email = ?";
        PreparedStatement getUserIdStatement = conn.prepareStatement(getUserIdQuery);
        getUserIdStatement.setString(1, needer.getUser().getEmail());
        ResultSet userIdResult = getUserIdStatement.executeQuery();

        if (userIdResult.next()) {
            int userId = userIdResult.getInt("id");

            String addNeederQuery = "INSERT INTO needer (id, diseases, availability) VALUES (?, ?, ?)";
            PreparedStatement addNeederStatement = conn.prepareStatement(addNeederQuery);
            addNeederStatement.setInt(1, userId);
            addNeederStatement.setString(2, needer.getDiseases());
            addNeederStatement.setString(3, needer.getAvailability());
            int rowsInserted = addNeederStatement.executeUpdate();

            // Update the role for the user
            String updateRoleQuery = "UPDATE user SET role = 'Needer' WHERE id = ?";
            PreparedStatement updateRoleStatement = conn.prepareStatement(updateRoleQuery);
            updateRoleStatement.setInt(1, userId);
            int roleUpdated = updateRoleStatement.executeUpdate();

            conn.close();

            return rowsInserted > 0 && roleUpdated > 0;
        } else {
            // The user with this email does not exist
            conn.close();
            return false;
        }
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}

public boolean addAdmin(Admin admin) {
    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://srv-bdens.insa-toulouse.fr:3306/projet_gei_008", "projet_gei_008", "ois3ohTh");

        String getUserIdQuery = "SELECT id FROM user WHERE email = ?";
        PreparedStatement getUserIdStatement = conn.prepareStatement(getUserIdQuery);
        getUserIdStatement.setString(1, admin.getUser().getEmail());
        ResultSet userIdResult = getUserIdStatement.executeQuery();

        if (userIdResult.next()) {
            int userId = userIdResult.getInt("id");

            String addAdminQuery = "INSERT INTO admin (id, building) VALUES (?, ?)";
            PreparedStatement addAdminStatement = conn.prepareStatement(addAdminQuery);
            addAdminStatement.setInt(1, userId);
            addAdminStatement.setString(2, admin.getBuilding());
            int rowsInserted = addAdminStatement.executeUpdate();

            // Update the role for the user
            String updateRoleQuery = "UPDATE user SET role = 'Admin' WHERE id = ?";
            PreparedStatement updateRoleStatement = conn.prepareStatement(updateRoleQuery);
            updateRoleStatement.setInt(1, userId);
            int roleUpdated = updateRoleStatement.executeUpdate();

            conn.close();

            return rowsInserted > 0 && roleUpdated > 0;
        } else {
            // The user with this email does not exist
            conn.close();
            return false;
        }
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}



public static List<String> attributsGet(User user) {
    List<String> attributes = new ArrayList<>();

    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://srv-bdens.insa-toulouse.fr:3306/projet_gei_008", "projet_gei_008", "ois3ohTh");

        // Recherche de l'ID de l'utilisateur en fonction de son e-mail
        String getUserIdQuery = "SELECT id, role FROM user WHERE email = ?";
        PreparedStatement getUserIdStatement = conn.prepareStatement(getUserIdQuery);
        getUserIdStatement.setString(1, user.getEmail());
        ResultSet userIdResult = getUserIdStatement.executeQuery();

        if (userIdResult.next()) {
            int userId = userIdResult.getInt("id");
            String role = userIdResult.getString("role");

            // Maintenant que vous avez l'ID et le rôle de l'utilisateur, vous pouvez récupérer ses attributs spécifiques en fonction du rôle
            if ("Helper".equals(role)) {
                // Récupérez les attributs spécifiques d'un Helper depuis la table Helper
                String getHelperAttributesQuery = "SELECT skills, availability FROM helper WHERE id = ?";
                PreparedStatement getHelperAttributesStatement = conn.prepareStatement(getHelperAttributesQuery);
                getHelperAttributesStatement.setInt(1, userId);
                ResultSet helperAttributesResult = getHelperAttributesStatement.executeQuery();

                if (helperAttributesResult.next()) {
                    String skills = helperAttributesResult.getString("skills");
                    String availability = helperAttributesResult.getString("availability");

                    attributes.add(skills);
                    attributes.add(availability);
                }
            } else if ("Needer".equals(role)) {
                // Récupérez les attributs spécifiques d'un Needer depuis la table Needer
                String getNeederAttributesQuery = "SELECT diseases, availability FROM needer WHERE id = ?";
                PreparedStatement getNeederAttributesStatement = conn.prepareStatement(getNeederAttributesQuery);
                getNeederAttributesStatement.setInt(1, userId);
                ResultSet neederAttributesResult = getNeederAttributesStatement.executeQuery();

                if (neederAttributesResult.next()) {
                    String diseases = neederAttributesResult.getString("diseases");
                    String availability = neederAttributesResult.getString("availability");

                    attributes.add(diseases);
                    attributes.add(availability);
                }
            } else if ("Admin".equals(role)) {
                // Récupérez les attributs spécifiques d'un Admin depuis la table Admin
                String getAdminAttributesQuery = "SELECT building FROM admin WHERE id = ?";
                PreparedStatement getAdminAttributesStatement = conn.prepareStatement(getAdminAttributesQuery);
                getAdminAttributesStatement.setInt(1, userId);
                ResultSet adminAttributesResult = getAdminAttributesStatement.executeQuery();

                if (adminAttributesResult.next()) {
                    String building = adminAttributesResult.getString("building");

                    attributes.add(building);
                    attributes.add(""); // Le deuxième attribut est "null" pour les administrateurs
                }
            }
        }

        conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return attributes;
}

public boolean addAd(Ad ad) {
    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://srv-bdens.insa-toulouse.fr:3306/projet_gei_008", "projet_gei_008", "ois3ohTh");

        String insertQuery = "INSERT INTO ad (type, title, description, ad_when, ad_where, idCreator, creation_date, validated, beneficiary) " +
            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement preparedStatement = conn.prepareStatement(insertQuery);
        preparedStatement.setString(1, ad.getType());
        preparedStatement.setString(2, ad.getTitle());
        preparedStatement.setString(3, ad.getDescription());
        preparedStatement.setString(4, ad.getAdWhen());
        preparedStatement.setString(5, ad.getAdWhere());
        preparedStatement.setInt(6, ad.getIdCreator());
        preparedStatement.setTimestamp(7, Timestamp.valueOf(ad.getCreationDate()));
        preparedStatement.setBoolean(8, ad.isValidated());

        if (ad.getBeneficiary() == null) {
            preparedStatement.setNull(9, java.sql.Types.INTEGER);
        } else {
            preparedStatement.setInt(9, ad.getBeneficiary());
        }

        int rowsInserted = preparedStatement.executeUpdate();
        conn.close();

        return rowsInserted > 0;
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}





}