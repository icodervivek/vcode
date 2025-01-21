import java.sql.*;

public class JdbcTypeOne {

    public static void main(String[] args) {
        try {
            // Load the driver
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            System.out.println("Driver Loaded Successfully!");

            // Establish a connection 
            Connection conn = DriverManager.getConnection("jdbc:odbc:std", "username", "password");
            System.out.println("Connection Established Successfully!");

            // Create a statement
            Statement stmt = conn.createStatement();

            // Execute the query
            String query = "SELECT id, Name FROM student"; // Correct SQL syntax
            ResultSet rs = stmt.executeQuery(query);

            // Process the result set
            while (rs.next()) { // Loop through the result set
                System.out.println("ID = " + rs.getInt("id") + ", Name = " + rs.getString("Name"));

            }

            // Close resources
            rs.close();
            stmt.close();
            conn.close();
            System.out.println("Connection Closed Successfully!");
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}

