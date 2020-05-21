import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class MyConnection {
    public static Connection getConnection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con =  DriverManager.getConnection("jdbc:mysql://localhost/stdmgdb","root",""); 
        } catch (Exception ex) {
           
            JOptionPane.showMessageDialog(null, "Error while connecting server!","Login Failed",2);
            System.out.println(ex.getMessage());
        }
        return con;
    }
}