/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.ConnectDB;

/**
 *
 * @author Aptech
 */
public class UsersDAO {

    final private String SQL_CHECK = "SELECT * FROM USERS WHERE USERNAME = ?";
    final private String SQL_CREATE = "INSERT INTO USERS VALUES (?,?,?)";
    final private String SQL_READALL = "SELECT * FROM USERS";
    final private String SQL_READBYUSERNAME = "SELECT * FROM USERS WHERE USERNAME = ?";
    final private String SQL_UPDATE = "UPDATE FROM USERS SET PASS = ?,ROLEID = ? WHERE USERNAME = ?";
    final private String SQL_DELETE = "DELETE FROM USERS WHERE USERNAME = ?";
    List<Users> lU = null;
    Connection con = null;

    public UsersDAO() {
        lU = new ArrayList<>();
        con = new ConnectDB().getCon();
    }

    public Users create(Users u) {
        try {
            PreparedStatement pr = con.prepareStatement(SQL_CREATE);
            pr.setString(1, u.getUsername());
            pr.setString(2, u.getPassword());
            pr.setInt(3, u.getRoleid());
            pr.execute();
            return u;
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public List<Users> readAll() {
        lU = new ArrayList<>();
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL_READALL);
            if (rs != null) {
                while (rs.next()) {
                    Users u = new Users();
                    u.setUsername(rs.getString(1));
                    u.setPassword(rs.getString(2));
                    u.setRoleid(rs.getInt(3));
                    lU.add(u);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lU;
    }

    public Users readbyUsername(String username) {
        lU = new ArrayList<>();
        try {
            PreparedStatement pr = con.prepareStatement(SQL_READBYUSERNAME);
            pr.setString(1, username);
            ResultSet rs = pr.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    Users u = new Users();
                    u.setUsername(rs.getString(1));
                    u.setPassword(rs.getString(2));
                    u.setRoleid(rs.getInt(3));
                    return u;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public Users update(Users u) {
        try {
            PreparedStatement pr = con.prepareStatement(SQL_UPDATE);
            pr.setString(1, u.getPassword());
            pr.setInt(2, u.getRoleid());
            pr.setString(3, u.getUsername());
            pr.execute();
            return u;
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public boolean delete(String username) {
        try {
            PreparedStatement pr = con.prepareStatement(SQL_DELETE);
            pr.setString(1, username);
            pr.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Users login(Users u) {
        try {
            PreparedStatement pr = con.prepareStatement(SQL_CHECK);
            pr.setString(1, u.getUsername());
            ResultSet rs = pr.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    if (rs.getString(2).equals(u.getPassword())) {
                        u.setRoleid(rs.getInt(3));
                        return u;
                    }
                }
            } else {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
