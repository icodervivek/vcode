
import java.sql.*;

public class JdbcOracleThin {

    public static void main(String[] args) {

        try {
            // Oracle JDBC URL (replace with your actual details)
            String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl"; // Replace with your database host, port, and SID
            String username = "username";  // Replace with your Oracle DB username
            String password = "password";  // Replace with your Oracle DB password
            // Establish connection
            Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id, name FROM student");

            // Print results
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
