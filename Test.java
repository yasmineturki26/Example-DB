
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {

    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc...Employee", "root", "root");
            
            Statement stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery("select * from tablename");
            
            // Print DB
            while(rs.next()){
                System.out.println("ID:" + rs.getInt(1) + rs.getString(2));
            }
            
            //Add values to DB
            stmt.executeUpdate("INSERT INTO Tablename " + "VALUES (2, 'Turki')");
            
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
