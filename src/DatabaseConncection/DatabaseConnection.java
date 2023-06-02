
package DatabaseConncection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DatabaseConnection {
    public static Connection con;
    public Statement stmnt;
    
    public DatabaseConnection() {
        try {
            String url = "jdbc:mysql://196.221.151.195:3306/market_db";
            String username = "dev";
            String password = "pass";
            con = DriverManager.getConnection(url, username, password);
            stmnt = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    public ResultSet executeQuery(String query){
        try {
            ResultSet r = stmnt.executeQuery(query);
            return r;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public int excuteUpdate(String query) throws SQLException{
        try {
            int r = stmnt.executeUpdate(query);
            return r;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    //test

    // public static void main(String[] args) {
    //     DatabaseConnection dc = new DatabaseConnection();
    //     ResultSet rs = dc.executeQuery("select * from employees");
    //     try {
    //         while(rs.next()){
    //             System.out.println(rs.getString("username"));
    //         }
    //     } catch (SQLException ex) {
    //         Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
    //     }
    // }
}
