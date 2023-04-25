package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

// Clase creada para la conexion y desconexion de la base de datos. 
public class Conexion {
    // atributos de la clase 
    public Connection conexion=null;
    public Statement sentencia;
    public ResultSet resultado;
          
    // Metodo para la conexion de la base de datos 
    public void ConectarBasedeDatos(){
    try { 
       // controlador para la conexion de la base de datos 
        String Controlador = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        Class.forName(Controlador);
        // conexion de la base de datos con y sin nombre de la base 
        String url = "jdbc:sqlserver://localhost:1433;"; 
        
        // ingresamos la base de datos, entramos con la siguiente conexion 
        conexion = DriverManager.getConnection(url,"usuarioSQL","123456789"); //url, usuario, contraseña
        
        sentencia = conexion.createStatement();

         }catch (ClassNotFoundException | SQLException ex) { // try catch para capturar cualquier error generado en SQL o en la clase 
                JOptionPane.showMessageDialog(null,ex.getMessage(), "Excepcion", JOptionPane.ERROR_MESSAGE);
         }
    }
    
    
   // metodo para desconectar de la base de datos 
    public void DesconectarBasedeDatos() {
    try {
        // Si la conexion esta activa 
    if (conexion != null ) {
        // y si la sentencia  esta activa
        if(sentencia != null) {
            // entonces se cierra la sentencia 
            sentencia.close();
        }
        // y se cierra la conexion a la base de datos. 
        conexion.close();
     }
    } catch (SQLException ex) {
        // en caso de tener un error, se notifica al usuario.
        JOptionPane.showMessageDialog(null,ex.getMessage(), "Excepcion", JOptionPane.ERROR_MESSAGE);
        System.exit(1);
   }
  }     
}
    
    

