/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import connexion.Connexion;
import dao.IDAO;
import entities.Client;
import entities.Users;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Badr
 */
public class UsersService implements IDAO<Users>{

    @Override
    public boolean create(Users o) {
        String req="insert into users values(null,?,?,?,?,?,?)";
		try {
			PreparedStatement ps=Connexion.getCon().prepareStatement(req);
			
                        ps.setString(1, o.getFirst_name());
			ps.setString(2, o.getLast_name());
                        ps.setString(3, o.getTelephone());
                        ps.setString(4, o.getEmail());
                        ps.setString(5, o.getUsername());
                        ps.setString(6, o.getPassword());
			if(ps.executeUpdate()==1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
        
    }

    @Override
    public boolean update(Users o) {
      //  String req="update users set username=? ,first_name=?,last_name=?,phone=?,address=?,password=? where id=?";
       String req="update users set  first_name=?,last_name=?,address=?,phone=?,username=?,password=? where id=?";
        try {
			PreparedStatement ps=Connexion.getCon().prepareStatement(req);
			  ps.setString(1, o.getFirst_name());
			ps.setString(2, o.getLast_name());
                        ps.setString(3, o.getTelephone());
                        ps.setString(4, o.getEmail());
                        ps.setString(5, o.getUsername());
                        ps.setString(6, o.getPassword());
                          ps.setInt(7, o.getId());
			if(ps.executeUpdate()==1) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
    }

    @Override
    public boolean delete(Users o) {
         String delete="delete from users where id=?";
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
    public List<Users> findall() {
        List<Users> listUsers=new ArrayList<>();
		String all="select * from users";
		
		try {
			PreparedStatement ps=Connexion.getCon().prepareStatement(all);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Users user=new Users(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
				listUsers.add(user);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listUsers;
		
    }

    @Override
    public Users findById(int id) {
       String query3="select * from users where id=?";
		try {
			PreparedStatement ps =Connexion.getCon().prepareStatement(query3);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				return new Users(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
				//return new Client(rs.getString(1),rs.getString(2),rs.getString(4),rs.getString(3));
                                
			}
                       
		} catch (SQLException e) {
			e.printStackTrace();
		}
               				return new Users("", "", "", "", "", "");

    }
    
}
