import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class db {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/java1";
        String user = "postgres";
        String password = "242234";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected to PostgreSQL database!");
            insertUser(connection, "Aiym");
            insertPost(connection, "Hello, like my post!", 1);
            readUsers(connection);
            updateUser(connection, 1, "Aiym_updated");
            deleteUser(connection, 1);
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }

    String url = "jdbc:postgresql://localhost:5432/java1";

    public static int insertUser(Connection conn, String username) throws SQLException {
        String checkQuery = "SELECT id FROM users WHERE username = ?";
        try (PreparedStatement checkStmt = conn.prepareStatement(checkQuery)) {
            checkStmt.setString(1, username);
            ResultSet rs = checkStmt.executeQuery();
            if (rs.next()) {
                System.out.println("User already exists: " + username);
                return rs.getInt("id"); // Return existing user ID
            }
        }

        String insertQuery = "INSERT INTO users (username) VALUES (?) RETURNING id";
        try (PreparedStatement stmt = conn.prepareStatement(insertQuery)) {
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int userId = rs.getInt(1);
                System.out.println("User inserted: " + username + " (ID: " + userId + ")");
                return userId;
            }
        }
        return -1;
    }

    public static void insertPost(Connection conn, String content, int userId) throws SQLException {
        String query = "INSERT INTO posts (content, user_id) VALUES (?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, content);
            stmt.setInt(2, userId);
            stmt.executeUpdate();
            System.out.println("Post inserted: " + content);
        }
    }

    public static void readUsers(Connection conn) throws SQLException {
        String query = "SELECT * FROM users";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                System.out.println("User ID: " + rs.getInt("id") + ", Username: " + rs.getString("username"));
            }
        }
    }

    public static void updateUser(Connection conn, int userId, String newUsername) throws SQLException {
        String query = "UPDATE users SET username = ? WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, newUsername);
            stmt.setInt(2, userId);
            stmt.executeUpdate();
            System.out.println("User updated: " + newUsername);
        }
    }

    public static void deleteUser(Connection conn, int userId) throws SQLException {
        String query = "DELETE FROM users WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, userId);
            stmt.executeUpdate();
            System.out.println("User deleted: ID " + userId);
        }
    }

}
