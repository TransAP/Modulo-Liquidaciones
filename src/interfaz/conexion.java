package interfaz;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author SISTEMAS
 */
public class conexion {
    //public static final String URL = "jdbc:mysql://localhost:3306/liquidaciones?useTimezone=true&serverTimezone=UTC";
    public static final String URL = "jdbc:mysql://192.185.131.123/kernelca_liquidacionesap?useTimezone=true&serverTimezone=UTC";
    
    public static final String USERNAME ="kernelca_fabian";
    public static final String PASSWORD ="2020BDfabian";
    
    //public static final String USERNAME ="root";
    //public static final String PASSWORD ="";    
    
    public static Connection getConection(){
        Connection con = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //JOptionPane.showMessageDialog(null, "CONEXION CON LA BASE DE DATOS EXITOSA");
        }catch(Exception e){
            System.out.println(e);
        }
        return con;
    }
}
