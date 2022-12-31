package entities;

public class Chambre {
private int id;
private String telephone;
private Categorie categorie;
public static int count=0;

public Chambre( String telephone, Categorie categorie) {
	super();
	this.id = ++count;
	this.telephone = telephone;
	this.categorie = categorie;
}

public Chambre(int id, String telephone,Categorie categorie ) {
	super();
	this.id = id;
	this.telephone = telephone;
	this.categorie = categorie;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getTelephone() {
	return telephone;
}

public void setTelephone(String telephone) {
	this.telephone = telephone;
}

public Categorie getCategorie() {
	return categorie;
}

public void setCategorie(Categorie categorie) {
	this.categorie = categorie;
}



@Override
public String toString() {
	return id +" | "+categorie.toString() ;
}

}
