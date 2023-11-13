package com.holpapp.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

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

    public void connect() {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://srv-bdens.insa-toulouse.fr:3306/projet_gei_008", "projet_gei_008", "ois3ohTh");
    
            if (conn != null) {
                System.out.println("Connexion à la base de données établie.");
            } else {
                System.err.println("Échec de la connexion à la base de données.");
            }

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
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

public User getUserById(int userId) throws SQLException {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    User user = null;

    try {
        conn = DriverManager.getConnection("jdbc:mysql://srv-bdens.insa-toulouse.fr:3306/projet_gei_008", "projet_gei_008", "ois3ohTh");
        String query = "SELECT * FROM user WHERE id = ?";
        stmt = conn.prepareStatement(query);
        stmt.setInt(1, userId);
        rs = stmt.executeQuery();

        if (rs.next()) {
            // Construisez l'objet User à partir des résultats de la requête
            user = new User(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getString("surname"),
                rs.getDate("birthdate").toLocalDate(),
                rs.getString("email"),
                rs.getString("phone"),
                rs.getString("address"),
                rs.getString("password"),
                rs.getString("role")
            );
        }
    } finally {
        closeResources(conn, stmt, rs);
    }

    return user;
}


public void deleteUser(int userId) throws SQLException {
    Connection conn = null;
    PreparedStatement stmt = null;

    try {
        conn = DriverManager.getConnection("jdbc:mysql://srv-bdens.insa-toulouse.fr:3306/projet_gei_008", "projet_gei_008", "ois3ohTh");
        String query = "DELETE FROM user WHERE id = ?";
        stmt = conn.prepareStatement(query);
        stmt.setInt(1, userId);
        stmt.executeUpdate();
    } finally {
        closeResources(conn, stmt, null);
    }
}

private void closeResources(Connection conn, PreparedStatement stmt, ResultSet rs) {
    try {
        if (rs != null) {
            rs.close();
        }
        if (stmt != null) {
            stmt.close();
        }
        if (conn != null) {
            conn.close();
        }
    } catch (SQLException e) {
        e.printStackTrace();
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

        String insertQuery = "INSERT INTO ad (type, title, description, ad_when, ad_where, idCreator, creation_date, validated, beneficiary, priority, done) " +
            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement preparedStatement = conn.prepareStatement(insertQuery);
        preparedStatement.setString(1, ad.getType());
        preparedStatement.setString(2, ad.getTitle());
        preparedStatement.setString(3, ad.getDescription());
        preparedStatement.setString(4, ad.getAdWhen());
        preparedStatement.setString(5, ad.getAdWhere());
        preparedStatement.setInt(6, ad.getIdCreator());
        preparedStatement.setTimestamp(7, Timestamp.valueOf(ad.getCreationDate()));
        preparedStatement.setString(8, ad.getValidation());
        preparedStatement.setString(10, ad.getPriority());
        preparedStatement.setBoolean(11, ad.isDone());

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

public List<Ad> getHelperAds() {
        List<Ad> ads = new ArrayList<>();

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://srv-bdens.insa-toulouse.fr:3306/projet_gei_008", "projet_gei_008", "ois3ohTh");

            String query = "SELECT * FROM ad WHERE type = 'Helper'";
            PreparedStatement preparedStatement = conn.prepareStatement(query);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String type = resultSet.getString("type");
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");
                String adWhen = resultSet.getString("ad_when");
                String adWhere = resultSet.getString("ad_where");
                int idCreator = resultSet.getInt("idCreator");
                LocalDateTime creationDate = resultSet.getTimestamp("creation_date").toLocalDateTime();
                String validated = resultSet.getString("validated");
                Integer beneficiary = resultSet.getInt("beneficiary");
                String priority = resultSet.getString("priority");
                Boolean done = resultSet.getBoolean("done");

                Ad ad = new Ad(id,type, title, description, adWhen, adWhere, idCreator, creationDate, validated, beneficiary, priority, done);
                ads.add(ad);
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ads;
    }

    public List<Ad> getNeederAds() {
        List<Ad> ads = new ArrayList<>();

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://srv-bdens.insa-toulouse.fr:3306/projet_gei_008", "projet_gei_008", "ois3ohTh");

            String query = "SELECT * FROM ad WHERE type = 'Needer'";
            PreparedStatement preparedStatement = conn.prepareStatement(query);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String type = resultSet.getString("type");
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");
                String adWhen = resultSet.getString("ad_when");
                String adWhere = resultSet.getString("ad_where");
                int idCreator = resultSet.getInt("idCreator");
                LocalDateTime creationDate = resultSet.getTimestamp("creation_date").toLocalDateTime();
                String validated = resultSet.getString("validated");
                Integer beneficiary = resultSet.getInt("beneficiary");
                String priority = resultSet.getString("priority");
                Boolean done = resultSet.getBoolean("done");

                Ad ad = new Ad(id,type, title, description, adWhen, adWhere, idCreator, creationDate, validated, beneficiary, priority,done);
                ads.add(ad);
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ads;
    }

    public List<Ad> getAllAds() {
        List<Ad> ads = new ArrayList<>();

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://srv-bdens.insa-toulouse.fr:3306/projet_gei_008", "projet_gei_008", "ois3ohTh");

            String query = "SELECT * FROM ad";
            PreparedStatement preparedStatement = conn.prepareStatement(query);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String type = resultSet.getString("type");
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");
                String adWhen = resultSet.getString("ad_when");
                String adWhere = resultSet.getString("ad_where");
                int idCreator = resultSet.getInt("idCreator");
                LocalDateTime creationDate = resultSet.getTimestamp("creation_date").toLocalDateTime();
                String validated = resultSet.getString("validated");
                Integer beneficiary = resultSet.getInt("beneficiary");
                String priority = resultSet.getString("priority");
                Boolean done = resultSet.getBoolean("done");

                Ad ad = new Ad(id,type, title, description, adWhen, adWhere, idCreator, creationDate, validated, beneficiary, priority,done);
                ads.add(ad);
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ads;
    }

    public Needer getNeederFromUser(User user) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://srv-bdens.insa-toulouse.fr:3306/projet_gei_008", "projet_gei_008", "ois3ohTh");
    
            String getNeederQuery = "SELECT * FROM needer WHERE Id = ?";
            PreparedStatement getNeederStatement = conn.prepareStatement(getNeederQuery);
            getNeederStatement.setInt(1, user.getId());
            ResultSet neederResult = getNeederStatement.executeQuery();
    
            if (neederResult.next()) {
                String diseases = neederResult.getString("diseases");
                String availability = neederResult.getString("availability");
    
                Needer needer = new Needer(user, diseases, availability);
                conn.close();
                return needer;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Helper getHelperFromUser(User user) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://srv-bdens.insa-toulouse.fr:3306/projet_gei_008", "projet_gei_008", "ois3ohTh");
    
            String getHelperQuery = "SELECT * FROM helper WHERE Id = ?";
            PreparedStatement getHelperStatement = conn.prepareStatement(getHelperQuery);
            getHelperStatement.setInt(1, user.getId());
            ResultSet helperResult = getHelperStatement.executeQuery();
    
            if (helperResult.next()) {
                String skills = helperResult.getString("skills");
                String availability = helperResult.getString("availability");
    
                Helper helper = new Helper(user, skills, availability);
                conn.close();
                return helper;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Admin getAdminFromUser(User user) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://srv-bdens.insa-toulouse.fr:3306/projet_gei_008", "projet_gei_008", "ois3ohTh");
    
            String getAdminQuery = "SELECT * FROM admin WHERE Id = ?";
            PreparedStatement getAdminStatement = conn.prepareStatement(getAdminQuery);
            getAdminStatement.setInt(1, user.getId());
            ResultSet adminResult = getAdminStatement.executeQuery();
    
            if (adminResult.next()) {
                String building = adminResult.getString("building");
    
                Admin admin = new Admin(user, building);
                conn.close();
                return admin;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public User getUserFromAd(Ad ad) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://srv-bdens.insa-toulouse.fr:3306/projet_gei_008", "projet_gei_008", "ois3ohTh");
    
            String getUserQuery = "SELECT * FROM user WHERE id = ?";
            PreparedStatement getUserStatement = conn.prepareStatement(getUserQuery);
            getUserStatement.setInt(1, ad.getIdCreator());
            ResultSet userResult = getUserStatement.executeQuery();
    
            if (userResult.next()) {
                int id = userResult.getInt("id");
                String name = userResult.getString("name");
                String surname = userResult.getString("surname");
                LocalDate birthdate = LocalDate.parse(userResult.getString("birthdate"));
                String email = userResult.getString("email");
                String phone = userResult.getString("phone");
                String address = userResult.getString("address");
                String password = userResult.getString("password");
                String role = userResult.getString("role");
    
                User user = new User(id, name, surname, birthdate, email, phone, address, password, role);
                conn.close();
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public boolean validateAd(Ad ad) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://srv-bdens.insa-toulouse.fr:3306/projet_gei_008", "projet_gei_008", "ois3ohTh");
    
            String validateQuery = "UPDATE ad SET validated = ? WHERE id = ?";
            PreparedStatement validateStatement = conn.prepareStatement(validateQuery);
            validateStatement.setBoolean(1, true); 
            validateStatement.setInt(2, ad.getId());
    
            int rowsUpdated = validateStatement.executeUpdate();
            conn.close();
    
            return rowsUpdated > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean invalidateAd(Ad ad) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://srv-bdens.insa-toulouse.fr:3306/projet_gei_008", "projet_gei_008", "ois3ohTh");
    
            String invalidateQuery = "UPDATE ad SET validated = ? WHERE id = ?";
            PreparedStatement invalidateStatement = conn.prepareStatement(invalidateQuery);
            invalidateStatement.setBoolean(1, false);  
            invalidateStatement.setInt(2, ad.getId());  
    
            int rowsUpdated = invalidateStatement.executeUpdate();
            conn.close();
    
            return rowsUpdated > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    public boolean linkAdBenef(Ad ad, User beneficiary) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://srv-bdens.insa-toulouse.fr:3306/projet_gei_008", "projet_gei_008", "ois3ohTh");
    
            String linkAdBenefQuery = "UPDATE ad SET beneficiary = ? WHERE id = ?";
            PreparedStatement linkAdBenefStatement = conn.prepareStatement(linkAdBenefQuery);
            
            if (beneficiary != null) {
                linkAdBenefStatement.setInt(1, beneficiary.getId());
            } else {
                linkAdBenefStatement.setNull(1, java.sql.Types.INTEGER);
            }
            
            linkAdBenefStatement.setInt(2, ad.getId());
    
            int rowsUpdated = linkAdBenefStatement.executeUpdate();
            conn.close();
    
            return rowsUpdated > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Ad> getBenefAds(User user) {
        List<Ad> ads = new ArrayList<>();

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://srv-bdens.insa-toulouse.fr:3306/projet_gei_008", "projet_gei_008", "ois3ohTh");

            String validateQuery = "SELECT * from ad WHERE beneficiary = ?";
            PreparedStatement validateStatement = conn.prepareStatement(validateQuery);
            validateStatement.setInt(1, user.getId());

            ResultSet resultSet = validateStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String type = resultSet.getString("type");
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");
                String adWhen = resultSet.getString("ad_when");
                String adWhere = resultSet.getString("ad_where");
                int idCreator = resultSet.getInt("idCreator");
                LocalDateTime creationDate = resultSet.getTimestamp("creation_date").toLocalDateTime();
                String validated = resultSet.getString("validated");
                Integer beneficiary = resultSet.getInt("beneficiary");
                String priority = resultSet.getString("priority");
                Boolean done = resultSet.getBoolean("done");

                Ad ad = new Ad(id,type, title, description, adWhen, adWhere, idCreator, creationDate, validated, beneficiary, priority, done);
                ads.add(ad);
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ads;
    }

    public List<Ad> getCreatedAds(User user) {
        List<Ad> ads = new ArrayList<>();

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://srv-bdens.insa-toulouse.fr:3306/projet_gei_008", "projet_gei_008", "ois3ohTh");

            String validateQuery = "SELECT * from ad WHERE idCreator = ?";
            PreparedStatement validateStatement = conn.prepareStatement(validateQuery);
            validateStatement.setInt(1, user.getId());

            ResultSet resultSet = validateStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String type = resultSet.getString("type");
                String title = resultSet.getString("title");
                String description = resultSet.getString("description");
                String adWhen = resultSet.getString("ad_when");
                String adWhere = resultSet.getString("ad_where");
                int idCreator = resultSet.getInt("idCreator");
                LocalDateTime creationDate = resultSet.getTimestamp("creation_date").toLocalDateTime();
                String validated = resultSet.getString("validated");
                Integer beneficiary = resultSet.getInt("beneficiary");
                String priority = resultSet.getString("priority");
                Boolean done = resultSet.getBoolean("done");

                Ad ad = new Ad(id,type, title, description, adWhen, adWhere, idCreator, creationDate, validated, beneficiary, priority, done);
                ads.add(ad);
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ads;
    }

    public boolean setDone(Ad ad) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://srv-bdens.insa-toulouse.fr:3306/projet_gei_008", "projet_gei_008", "ois3ohTh");
    
            String linkAdBenefQuery = "UPDATE ad SET done = true WHERE id = ?";
            PreparedStatement linkAdBenefStatement = conn.prepareStatement(linkAdBenefQuery);
            
            
            
            linkAdBenefStatement.setInt(1, ad.getId());
    
            int rowsUpdated = linkAdBenefStatement.executeUpdate();
            conn.close();
    
            return rowsUpdated > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    





}