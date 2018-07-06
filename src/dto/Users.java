/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.Serializable;

/**
 *
 * @author Aptech
 */
public class Users implements Serializable, Comparable<Users> {

    private String username;
    private String password;
    private int roleid;

    public Users() {
    }

    public Users(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Users(String username, String password, int roleid) {
        this.username = username;
        this.password = password;
        this.roleid = roleid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    @Override
    public int compareTo(Users o) {
        return this.username.compareTo(o.getUsername());
    }

    @Override
    public String toString() {
        return "Users{" + "username=" + username + ", password=" + password + ", roleid=" + roleid + '}';
    }

}
