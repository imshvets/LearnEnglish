package dictbase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Oleg on 13.06.2016.
 */
public class Connector {

   public void connector () {
       String url = "jdbc:mysql://localhost:3306/javabase";
       String username = "root";
       String password = "1627";

       System.out.println("Connecting database...");

       try (Connection connection = DriverManager.getConnection(url, username, password)) {
           System.out.println("Database connected!");
       } catch (SQLException e) {
           throw new IllegalStateException("Cannot connect the database!", e);
       }
   }
}
