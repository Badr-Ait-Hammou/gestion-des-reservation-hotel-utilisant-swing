package entities;

public class Client {
private int id;
private String nom;
private String prenom;
private String telephone;
private String email;
public static int count=0;

public Client( String nom, String prenom, String telephone, String email) {
	super();
	this.id = ++count;
	this.nom = nom;
	this.prenom = prenom;
	this.telephone = telephone;
	this.email = email;
}
public Client(int id, String nom, String prenom, String telephone, String email) {
	super();
	this.id = id;
	this.nom = nom;
	this.prenom = prenom;
	this.telephone = telephone;
	this.email = email;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public String getTelephone() {
	return telephone;
}

public void setTelephone(String telephone) {
	this.telephone = telephone;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

@Override
public String toString() {
	return id+"|"+ nom ;
}




}
