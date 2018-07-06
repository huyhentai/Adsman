/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Cus;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import utils.ConnectDB;

/**
 *
 * @author Aptech
 */
public class CusDAO {
    List<Cus> lC = null;
    Connection con = null;

    public CusDAO() {
            lC = new ArrayList<>();
            con = new ConnectDB().getCon();
    }
    
    public Cus create(Cus c){
        return null;
    }
    
    public List<Cus> readAll(){
        return null;
    }
    
    public Cus readByusername(String Cus){
        return null;
    }
    
    public Cus update(Cus c){
        return null;
    }
    
    public boolean delete(String Cus){
        return false;
    }
    
}
