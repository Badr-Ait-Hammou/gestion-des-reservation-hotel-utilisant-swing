package entities;

import java.util.Date;

public class Reservation {
private int id;
private Date datedebut;
private Date datefin;
private Client client;
private Chambre chambre;
public static int count=0;


public Reservation(  Client client, Chambre chambre,Date datedebut, Date datefin) {
	super();
	this.id = ++count;
	this.datedebut = datedebut;
	this.datefin = datefin;
	this.client = client;
	this.chambre = chambre;
}





public Reservation(int id,  Chambre chambre ,Client client,Date datedebut, Date datefin) {
	super();
	this.id = id;
	this.datedebut = datedebut;
	this.datefin = datefin;
	this.client = client;
	this.chambre = chambre;
}
















public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public Date getDatedebut() {
	return datedebut;
}


public void setDatedebut(Date datedebut) {
	this.datedebut = datedebut;
}


public Date getDatefin() {
	return datefin;
}


public void setDatefin(Date datefin) {
	this.datefin = datefin;
}


public Client getClient() {
	return client;
}


public void setClient(Client client) {
	this.client = client;
}


public Chambre getChambre() {
	return chambre;
}


public void setChambre(Chambre chambre) {
	this.chambre = chambre;
}


public static int getCount() {
	return count;
}


public static void setCount(int count) {
	Reservation.count = count;
}


@Override
public String toString() {
	return "Reservation [id=" + id + ", datedebut=" + datedebut + ", datefin=" + datefin + ", client=" + client
			+ ", chambre=" + chambre + "]";
}


}
