
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exercise31 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/student";
        String username = "root";
        String password = "Shivani@1234"; // Replace with your MySQL password

        try {
            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(
                    url, username, password);

            // Create Statement
            Statement stmt = con.createStatement();

            // Execute Query
            String query = "SELECT * FROM students";
            ResultSet rs = stmt.executeQuery(query);

            // Display Results
            System.out.println("Student Records:");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                        rs.getString("name") + " " +
                        rs.getInt("age"));
            }

            // Close Resources
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}