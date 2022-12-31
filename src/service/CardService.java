/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import connexion.Connexion;
import front.ModelCard;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Badr
 */
public class CardService {
    
  

        Connection con;
        
    public ModelCard DataClient(){
          con= Connexion.getCon();
		String req="select count(*) from client;";
		int cnt=0;
                try {
                    
			PreparedStatement st=con.prepareStatement(req);
			ResultSet res=st.executeQuery();
		while(res.next()){
                    String vl=res.getString(1);
                    return new ModelCard(vl);
              
                }
		}catch(SQLException e) {
			System.out.println("cardservice client !!");
		}
                return null;
    }
    
     public ModelCard DataChambre(){
          con= Connexion.getCon();
		String req="select count(*) from chambre;";
		int cnt=0;
                try {
                    
			PreparedStatement st=con.prepareStatement(req);
			ResultSet res=st.executeQuery();
		while(res.next()){
                    String vl=res.getString(1);
                    return new ModelCard(vl);
               //      card1.add(new Model_Card(nch,nbrch));
                }
		}catch(SQLException e) {
			System.out.println("cardservice chambre !!");
		}
                return null;
    }
     
      
     
       public ModelCard DataCat(){
          con= Connexion.getCon();
		String req="select count(*) from categorie;";
		int cnt=0;
                try {
                    
			PreparedStatement st=con.prepareStatement(req);
			ResultSet res=st.executeQuery();
		while(res.next()){
                    String vl=res.getString(1);
                    return new ModelCard(vl);
               //      card1.add(new Model_Card(nch,nbrch));
                }
		}catch(SQLException e) {
			System.out.println("cardservice categorie !!");
		}
                return null;
    }
       
        public ModelCard DataRes(){
          con= Connexion.getCon();
		String req="select count(*) from reservation;";
		int cnt=0;
                try {
                    
			PreparedStatement st=con.prepareStatement(req);
			ResultSet res=st.executeQuery();
		while(res.next()){
                    String vl=res.getString(1);
                    return new ModelCard(vl);
               //      card1.add(new Model_Card(nch,nbrch));
                }
		}catch(SQLException e) {
			System.out.println("cardservice reservation !!");
		}
            return null;
                
}
}
    

    
    

