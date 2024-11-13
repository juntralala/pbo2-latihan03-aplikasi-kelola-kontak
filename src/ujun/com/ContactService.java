package ujun.com;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;

public class ContactService {

    private Connection connection;

    public ContactService() {
        try {
            this.connection = DB.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addContact(String name, String telepon, String kategori) throws SQLException {
        String query = "INSERT INTO contacts(name, telepon, kategori) VALUES (?, ?, ?)";
        try (PreparedStatement statement = this.connection.prepareStatement(query)) {
            statement.setString(1, name);
            statement.setString(2, telepon);
            statement.setString(3, kategori);
            statement.execute();
        }
    }

    public String[][] getAll() throws SQLException {
        String query = "SELECT * FROM contacts";
        try (Statement statement = this.connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);
            ArrayList<String[]> results = new ArrayList<>();
            while (resultSet.next()) {
                results.add(new String[]{resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4)});
            }
            return results.toArray(new String[0][0]);
        }
    }

    public String[][] getAllByName(String name) throws SQLException {
        String query = "SELECT * FROM contacts WHERE name LIKE ?";
        try (PreparedStatement statement = this.connection.prepareStatement(query)) {
            statement.setString(1, "%" + name + "%");
            ResultSet resultSet = statement.executeQuery();
            ArrayList<String[]> results = new ArrayList<>();
            while (resultSet.next()) {
                results.add(new String[]{resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4)});
            }
            return results.toArray(new String[0][0]);
        }
    }

    public String[][] getAllByTelepon(String telepon) throws SQLException {
        String query = "SELECT * FROM contacts WHERE telepon LIKE ?";
        try (PreparedStatement statement = this.connection.prepareStatement(query)) {
            statement.setString(1, "%" + telepon + "%");
            ResultSet resultSet = statement.executeQuery();
            ArrayList<String[]> results = new ArrayList<>();
            while (resultSet.next()) {
                results.add(new String[]{resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4)});
            }
            return results.toArray(new String[0][0]);
        }
    }

    public int update(int id, String name, String telepon, String kategori) throws SQLException {
        String query = "UPDATE contacts SET name=?, telepon=?, kategori=? WHERE id=?";
        try (PreparedStatement statement = this.connection.prepareStatement(query)) {
            statement.setString(1, name);
            statement.setString(2, telepon);
            statement.setString(3, kategori);
            statement.setInt(4, id);
            return statement.executeUpdate();
        }
    }
    
    public int delete(int id) throws SQLException{
        String query = "DELETE FROM contacts WHERE id=?";
        try(PreparedStatement statement = this.connection.prepareStatement(query)){
            statement.setInt(1, id);
            return statement.executeUpdate();
        }
    }
}
