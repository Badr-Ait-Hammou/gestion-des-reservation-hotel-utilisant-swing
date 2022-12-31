package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import connexion.Connexion;
import dao.IDAO;
import entities.Categorie;
import entities.Chambre;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChambreService implements IDAO<Chambre> {

	List<Chambre> listChambreByCategorie;
	
	
	public ChambreService() {
		super();
		//listChambre=new ArrayList<>();
		listChambreByCategorie=new ArrayList<>();
	}

	/*public List<Chambre> findChambreByCategorie(Categorie c){
		for (Chambre chambre : listChambre) {
			if(chambre.getCategorie().getLibelle()==c.getLibelle()) {
				listChambreByCategorie.add(chambre);
			}
		}
		return listChambreByCategorie;
		
	}*/
	@Override
	public boolean create(Chambre o) {
		String req="insert into chambre values(null,?,?)";
		try {
			PreparedStatement ps=Connexion.getCon().prepareStatement(req);
			ps.setString(1, o.getTelephone());
			ps.setInt(2, o.getCategorie().getId());
			
			if(ps.executeUpdate()==1) {
				return true;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(Chambre o) {
		String requp="update chambre set telephone=?,categorie_id=? where chambre_id=?";
		try {
			PreparedStatement ps= Connexion.getCon().prepareStatement(requp);
			ps.setString(1, o.getTelephone());
			ps.setInt(2, o.getCategorie().getId());
                       // ps.setString(2, o.getCategorie().getLibelle());
                        ps.setInt(3, o.getId());
			if(ps.executeUpdate()==1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		return false;
		}
		/*for (Chambre chambre : listChambre) {
			if(chambre.getId()==o.getId()) {
			Scanner sc=new Scanner(System.in);
			System.out.println("saisir le num de telephone :");
			chambre.setTelephone(sc.nextLine());
			System.out.println("saisir ");
			chambre.setCategorie(o.getCategorie());
			}
		}*/
	

	@Override
	public boolean delete(Chambre o) {
		String reqd="delete from chambre where chambre_id=?";
		try {
			PreparedStatement ps=Connexion.getCon().prepareStatement(reqd);
			ps.setInt(1, o.getId());
			if(ps.executeUpdate()==1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Chambre> findall() {
		List<Chambre> listChambre = new ArrayList<>();
		CategorieService cs=new CategorieService();
		String all="select * from chambre";
		try {
			PreparedStatement ps=Connexion.getCon().prepareStatement(all);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Chambre chambre = new Chambre(rs.getInt(1),rs.getString(2),cs.findById(rs.getInt(3)));
				listChambre.add(chambre);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return listChambre;
	}

	@Override
	public Chambre findById(int id) {
		String req="select * from chambre where chambre_id =?";
		CategorieService cats=new CategorieService();
                ChambreService chs=new ChambreService();
		try {
			PreparedStatement ps=Connexion.getCon().prepareStatement(req);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				return new Chambre(rs.getInt(1),rs.getString(2),cats.findById(rs.getInt(3)));
			//return new Chambre(rs.getInt(1),rs.getString(2),);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return new Chambre("",null);

	}
        public List<Chambre> findcategoriechambre(Categorie categorie){
          CategorieService cats=new CategorieService();
          ChambreService chs=new ChambreService();
            List<Chambre> listchambrecat =new ArrayList<>();
            String req="select * from chambre where categorie_id=?";
   
            try {
                PreparedStatement ps=Connexion.getCon().prepareStatement(req);
                ps.setInt(1,categorie.getId() );
                ResultSet rs= ps.executeQuery();
                while(rs.next()){
                    Chambre chambre=new Chambre(rs.getInt(1),rs.getString(2),cats.findById(rs.getInt(3)));
                    listchambrecat.add(chambre);
                }
            
            } catch (SQLException ex) {
                Logger.getLogger(ChambreService.class.getName()).log(Level.SEVERE, null, ex);
            }
            return listchambrecat;
            
        
}
        
}