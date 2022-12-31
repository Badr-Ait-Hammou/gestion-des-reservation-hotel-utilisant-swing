package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import connexion.Connexion;
import dao.IDAO;
import entities.Chambre;
import entities.Client;
import entities.Reservation;

public class ReservationService implements IDAO<Reservation>{
	//List<Reservation> listReservation;
	
	
	
	public ReservationService() {
		super();
		//listReservation=new ArrayList<>();
		//listChambreBetweenDate=new ArrayList<>();
	}

	@Override
	public boolean create(Reservation o) {
		String req="insert into reservation values(null,?,?,?,?)";
		try {
			PreparedStatement ps= Connexion.getCon().prepareStatement(req);
			java.sql.Date date_debut= new java.sql.Date(o.getDatedebut().getTime());
			java.sql.Date date_fin= new java.sql.Date(o.getDatefin().getTime());
			ps.setInt(1, o.getChambre().getId());
			ps.setInt(2, o.getClient().getId());
			ps.setDate(3, date_debut);
			ps.setDate(4, date_fin);
			//ps.setDate(3,(java.sql.Date) new Date(o.getDatedebut().getTime())); //(java.sql.Date)new Date(o.getdateDebut.getTime());
			//ps.setDate(4,(java.sql.Date) new Date(o.getDatefin().getTime()));
			if(ps.executeUpdate()==1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(Reservation o) {
		String req="update reservation set chambre_id=?,client_id=?,datedebut=?,datefin=? where reservation_id=?";
		try {
			PreparedStatement ps=Connexion.getCon().prepareStatement(req);
			java.sql.Date date_debut= new java.sql.Date(o.getDatedebut().getTime());
			java.sql.Date date_fin= new java.sql.Date(o.getDatefin().getTime());
			ps.setInt(1, o.getChambre().getId());
			ps.setInt(2, o.getClient().getId());
			ps.setDate(3, date_debut);
			ps.setDate(4, date_fin);
                        ps.setInt(5, o.getId());
                        
			if(ps.executeUpdate()==1) {
				return true;
			}

		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(Reservation o) {
		String reqd="delete from reservation where reservation_id=?";
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
	public List<Reservation> findall() {
		List<Reservation> listReservation=new ArrayList<>();
		ChambreService chs=new ChambreService();
		ClientService cs=new ClientService();
		String all="select * from reservation";
		try {
			PreparedStatement ps=Connexion.getCon().prepareStatement(all);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Reservation reservation = new Reservation(rs.getInt(1),chs.findById(rs.getInt(2)),cs.findById(rs.getInt(3)),rs.getDate(4),rs.getDate(5));
				listReservation.add(reservation);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listReservation;
	}

	@Override
	public Reservation findById(int id) {
		ChambreService chs=new ChambreService();
		ClientService cs=new ClientService();
		String req="select * from reservation where reservation_id=?";
		try {
			PreparedStatement ps=Connexion.getCon().prepareStatement(req);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				return new Reservation(rs.getInt(1),chs.findById(rs.getInt(2)),cs.findById(rs.getInt(3)),rs.getDate(4),rs.getDate(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
        public boolean checkRes(Chambre chambre,Date dateDebut,Date dateFin){
           // SELECT * FROM chambre c WHERE c.id = 9 AND c.id NOT IN (SELECT id_ch FROM reservation r WHERE r.date_debut > '2022-12-12' AND r.date_fin < '2022-12-27');
           // SELECT * FROM chambre c WHERE c.id = ? AND c.id NOT IN (SELECT id_ch FROM reservation r WHERE r.date_debut > ? AND r.date_fin < ? );
           // SELECT COUNT(id_ch)  FROM reservation WHERE date_debut >= ? AND date_fin < ? ;
           
          
		// String req="SELECT * FROM reservation where id_ch=? NOT IN (SELECT id_ch FROM reservation WHERE  date_debut > ? AND date_fin < ? ;";
              //  String req="SELECT * FROM reservation WHERE id_ch=? AND ( date_debut > ? AND date_fin < ? );";
               // String req="SELECT * FROM reservation WHERE id_ch=? AND  date_debut BETWEEN ? AND ? ;";
                
                // chambre disponible 
                //select * from chambre where id not IN (SELECT id_ch FROM reservation );
                //  SELECT * FROM reservation WHERE id_ch=8 AND  ('2022-12-01' BETWEEN date_debut AND date_fin  OR '2022-12-02' BETWEEN date_debut AND date_fin );  
                 String req="SELECT * FROM reservation WHERE chambre_id=? AND(? BETWEEN datedebut AND datefin OR ? BETWEEN datedebut AND datefin)";
                  java.sql.Date date_d= new java.sql.Date(dateDebut.getTime());
			java.sql.Date date_f= new java.sql.Date(dateFin.getTime());
                try {
                 
			PreparedStatement st=Connexion.getCon().prepareStatement(req);
                        st.setInt(1, chambre.getId());
                        st.setDate(2, date_d);
                        st.setDate(3,  date_f);
                      //  st.setDate(2, (java.sql.Date) new Date(dateDebut.getTime()));
                      //  st.setDate(3, (java.sql.Date) new Date(dateFin.getTime()));
                        
			ResultSet res=st.executeQuery();
		while(res.next()){
                    return true;
                }
             
		}catch(SQLException e) {
			System.out.println("checkRes !!");
                        e.printStackTrace();
		}
              return false;
}
    
        
        
        
        
	public List<Chambre> findChambreBetweenDates(Client client,Date dateDebut,Date dateFin){
		ClientService cs=new ClientService();
		ChambreService chs=new ChambreService();
		CategorieService cat=new CategorieService();
		List<Chambre> listChambreBetweenDate =new ArrayList<>();
		java.sql.Date date_debut= new java.sql.Date(dateDebut.getTime());
		java.sql.Date date_fin= new java.sql.Date(dateFin.getTime());
		
		String bet="select * from reservation where  client_id=? and (datedebut>? and datefin<?)";
		try {
			PreparedStatement ps =Connexion.getCon().prepareStatement(bet);
			ps.setInt(1, client.getId());
			ps.setDate(2,  date_debut);
			ps.setDate(3, date_fin);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Chambre chambre= chs.findById(rs.getInt(2));
				//Chambre chambre=new Chambre().getId(),chs.findById(rs.getInt(2)).getTelephone(),cat.findById(rs.getInt(3)));
				listChambreBetweenDate.add(chambre);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listChambreBetweenDate;
		
	}

}
