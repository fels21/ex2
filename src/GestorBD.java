

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class GestorBD {
    
    Connection conn;
    
    public GestorBD() throws Exception {
        Class.forName("org.apache.derby.jdbc.ClientDriver");

        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/exercici2", "alumne", "alumne");
    }
    
    public void tancar() throws Exception {
        conn.close();
    }
    
    public void afegirClient(String dni,String nom,String mail) throws Exception {
        Statement update = conn.createStatement();
        String valors = "'" + dni + "','" + nom + "','" + mail + "'";
        update.executeUpdate("INSERT INTO estudiants VALUES(" + valors + ")");
    }
    
}
