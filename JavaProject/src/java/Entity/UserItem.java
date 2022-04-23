/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author paula
 */
public class UserItem {
    private int id;
    private String username;
    private String password;
    private String fullname;
    private String email;
    private String organization;

    public UserItem(int id, String username, String password, String fullname, String email, String organization) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.email = email;
        this.organization = organization;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getFullname() {
        return fullname;
    }

    public String getEmail() {
        return email;
    }

    public String getOrganization() {
        return organization;
    }
    
    
}
