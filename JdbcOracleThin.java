import java.sql.*;

public class JdbcOracleThin {

    public static void main(String[] args) {
        // Oracle JDBC URL (replace with your actual details)
        String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl"; // Replace with your database host, port, and SID
        String username = "username";  // Replace with your Oracle DB username
        String password = "password";  // Replace with your Oracle DB password

        // Declare resources
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Establish connection
            conn = DriverManager.getConnection(jdbcUrl, username, password);
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT id, name FROM student");

            // Print results
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        } finally {
            // Manually close resources
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
                System.out.println("Connection Closed Successfully!");
            } catch (SQLException e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }
        }
    }
}
