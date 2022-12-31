/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Badr
 */
public class Users {
    private int id;
    private String username;
private String first_name;
private String last_name;
private String telephone;
private String email;
private String password;
public static int count=0;

    public Users( String username, String first_name, String last_name, String telephone, String email, String password) {
        this.id = ++count;
        this.username = username;
        this.first_name = first_name;
        this.last_name = last_name;
        this.telephone = telephone;
        this.email = email;
        this.password = password;
    }

    public Users(int id, String username, String first_name, String last_name, String telephone, String email, String password) {
        this.id = id;
        this.username = username;
        this.first_name = first_name;
        this.last_name = last_name;
        this.telephone = telephone;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public static int getCount() {
        return count;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void setCount(int count) {
        Users.count = count;
    }

    @Override
    public String toString() {
        return "Users{" + "id=" + id + ", username=" + username + ", first_name=" + first_name + ", last_name=" + last_name + ", telephone=" + telephone + ", email=" + email + ", password=" + password + '}';
    }
    

}
