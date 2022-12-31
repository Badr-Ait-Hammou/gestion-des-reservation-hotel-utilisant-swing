package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import connexion.Connexion;
import dao.IDAO;
import entities.Client;
import javax.swing.JOptionPane;

public class ClientService implements IDAO<Client> {
	//List<Client> listClient;
	
	public ClientService() {
		super();
		//listClient=new ArrayList<>();
	}

	@Override
	public boolean create(Client o) {
		String req="insert into client values(null,?,?,?,?)";
		try {
			PreparedStatement ps=Connexion.getCon().prepareStatement(req);
			ps.setString(1, o.getNom());
			ps.setString(2, o.getPrenom());
			
                        ps.setString(3, o.getTelephone());
                        ps.setString(4, o.getEmail());
			if(ps.executeUpdate()==1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
		
	}

	@Override
	public boolean update(Client o) {
		String query2="update Client set nom=?,prenom=?,email=?,telephone=? where id=?";
		
		try {
			PreparedStatement ps = Connexion.getCon().prepareStatement(query2);
			ps.setString(1,o.getNom());
			ps.setString(2,o.getPrenom());
                       
			ps.setString(3,o.getTelephone());
                         ps.setString(4,o.getEmail());
			
			ps.setInt(5, o.getId());
			if(ps.executeUpdate()==1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
		}
	
	
		/*for (Client client : listClient) {
			Scanner sc=new Scanner(System.in);
			System.out.println("saisir le nom :");
			client.setNom(sc.nextLine());
			System.out.println("saisir le prenom :");
			client.setPrenom(sc.nextLine());
			System.out.println("saisir le numero de telephone :");
			client.setTelephone(sc.nextLine());
			System.out.println("saisir l'email :");
			client.setEmail(sc.nextLine());
			System.out.println(client);
		}
		return false;*/
	

	@Override
	public boolean delete(Client o) {
		String delete="delete from client where id=?";
		try {
			PreparedStatement ps =Connexion.getCon().prepareStatement(delete);
			ps.setInt(1, o.getId());
			if(ps.executeUpdate()==1) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Client> findall() {
		List<Client> listClient=new ArrayList<>();
		String all="select * from client";
		
		try {
			PreparedStatement ps=Connexion.getCon().prepareStatement(all);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Client client=new Client(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
				listClient.add(client);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listClient;
		
		
	}

	@Override
	public Client findById(int id) {
		String query3="select * from client where id=?";
		try {
			PreparedStatement ps =Connexion.getCon().prepareStatement(query3);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				return new Client(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(5),rs.getString(4));
				//return new Client(rs.getString(1),rs.getString(2),rs.getString(4),rs.getString(3));
                                
			}
                       
		} catch (SQLException e) {
			e.printStackTrace();
		}
               				return new Client(null,"","","");

        }
		
		/*for (Client client : listClient) {
			if(client.getId()==id) {
			//	System.out.println(client);
			//	c=new Client(client.getNom(),client.getPrenom(),client.getTelephone(),client.getEmail());
			return client;
			}
		}*/
	

}
