import java.sql.*;

public class JdbcTypeThree {

    public static void main(String[] args) {
        try {
            // Load the Oracle JDBC Type 3 driver (if needed, depending on your Oracle setup)
            // For modern versions, you typically do not need to load the driver explicitly.
            // Class.forName("oracle.jdbc.OracleDriver");  // Uncomment if needed for older Oracle JDBC versions
            System.out.println("Oracle JDBC Type 3 Driver Loaded Successfully!");

            // Oracle JDBC URL for Type 3 Driver (replace with your actual details)
            String jdbcUrl = "jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=localhost)(PORT=1521)))(CONNECT_DATA=(SID=orcl)))"; 
            // Replace localhost, 1521, and orcl with your actual database details
            String username = "username";  // Replace with your Oracle DB username
            String password = "password";  // Replace with your Oracle DB password

            // Establish a connection
            Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Connection Established Successfully!");

            // Create a statement
            Statement stmt = conn.createStatement();

            // Execute the query
            String query = "SELECT id, Name FROM student"; // Correct SQL syntax
            ResultSet rs = stmt.executeQuery(query);

            // Process the result set
            while (rs.next()) {  // Loop through the result set
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
