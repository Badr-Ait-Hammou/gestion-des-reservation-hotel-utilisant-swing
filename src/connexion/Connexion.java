package connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
	static Connection con;
static {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost/gestion_reservation","root","");
		System.out.println("connected");
	}catch(ClassNotFoundException e) {
		System.err.println("Probleme PILOTE !!");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.err.println("Probleme DB");
	}
}
public static Connection getCon() {
	return con;
}



}