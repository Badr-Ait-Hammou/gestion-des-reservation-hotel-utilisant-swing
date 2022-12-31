package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import connexion.Connexion;
import dao.IDAO;
import entities.Categorie;

public class CategorieService implements IDAO<Categorie> {

	//List<Categorie> listCategorie;
	
	
	public CategorieService() {
		super();
		//listCategorie=new ArrayList<>();
	}

	@Override
	public boolean create(Categorie o) {
		String req="insert into categorie values(null,?,?)";
		try {
			PreparedStatement ps=Connexion.getCon().prepareStatement(req);
			ps.setString(1, o.getCode());
			ps.setString(2, o.getLibelle());
			if(ps.executeUpdate()==1) {
				return true;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(Categorie o) {
		String requ="update categorie set code=?,libelle=? where categorie_id=?";
		try {
			PreparedStatement ps=Connexion.getCon().prepareStatement(requ);
			ps.setString(1, o.getCode());
			ps.setString(2, o.getLibelle());
			ps.setInt(3, o.getId());
			if(ps.executeUpdate()==1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
		/*for (Categorie categorie : listCategorie) {
			Scanner sc =new Scanner(System.in);
			System.out.println("saisir le code de categorie");
			categorie.setCode(sc.nextLine());
			System.out.println("saisir libelle");
			categorie.setLibelle(sc.nextLine());
			
		}*/
		

	@Override
	public boolean delete(Categorie o) {
	    String reqd="delete from categorie where categorie_id=?";
	    try {
			PreparedStatement ps =Connexion.getCon().prepareStatement(reqd);
			ps.setInt(1,o.getId());
			if(ps.executeUpdate()==1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Categorie> findall() {
		List<Categorie> listCategorie=new ArrayList<>();
		String all="select * from categorie";
		try {
			PreparedStatement ps =Connexion.getCon().prepareStatement(all);
			ResultSet rs =ps.executeQuery();
			while(rs.next()){
				Categorie categorie =new Categorie(rs.getInt(1),rs.getString(2),rs.getString(3));
				listCategorie.add(categorie);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listCategorie;
	}

	@Override
	public Categorie findById(int id) {
    String req="select * from categorie where categorie_id=?";
    try {
		PreparedStatement ps =Connexion.getCon().prepareStatement(req);
		ps.setInt(1, id);
		ResultSet rs= ps.executeQuery();
		while(rs.next()) {
			return new Categorie(rs.getInt(1),rs.getString(2),rs.getString(3));
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
		return new Categorie("","");
	}

}
