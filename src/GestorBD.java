
import java.util.List;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestorBD {
    
    Connection conn;
    
    public GestorBD() throws Exception {
        Class.forName("org.apache.derby.jdbc.ClientDriver");

        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/exercici2", "alumne", "alumne");
    }
    
    public void tancar() throws Exception {
        conn.close();
    }
    
    public void afegirEstudiant(String dni,String nom,String mail) throws Exception {
        Statement update = conn.createStatement();
        String valors = "'" + dni + "','" + nom + "','" + mail + "'";
        update.executeUpdate("INSERT INTO estudiants VALUES(" + valors + ")");
    }
    
    public void afegirProfessor(String dni,String nom,String departament) throws Exception {
        Statement update = conn.createStatement();
        String valors = "'" + dni + "','" + nom + "','" + departament + "'";
        update.executeUpdate("INSERT INTO professors VALUES(" + valors + ")");
    }
    
    public void afegirAssignatura(String nom,int credits,String descripcio,String dni_prof) throws Exception {
        Statement update = conn.createStatement();
        String valors = "'" + nom + "'," + credits + ",'" + descripcio + "','" + dni_prof + "'";
        update.executeUpdate("INSERT INTO assignatures VALUES(" + valors + ")");
    }
    
    public List<Professor> getProf() throws SQLException {
        
        Statement select = conn.createStatement();
        String sql = "select * from professors";
        ResultSet prof = select.executeQuery(sql);
        LinkedList<Professor> llista = new LinkedList<Professor>();

        while(prof.next()){
            llista.add(new Professor(prof.getString("dni"),prof.getString("nom"),prof.getString("departament")));
        }
        return llista;
        
    }
    
}
