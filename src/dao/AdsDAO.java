/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Ads;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import utils.ConnectDB;

/**
 *
 * @author Aptech
 */
public class AdsDAO {
    List<Ads> lA = null;
    Connection con = null;

    public AdsDAO() {
            lA = new ArrayList<>();
            con = new ConnectDB().getCon();
            
    }
    public Ads create(Ads a){
        return null;
    }
    
    public List<Ads> readAll(){
        return null;
    }
    
    public Ads readByusername(String username){
        return null;
    }
    
    public Ads update(Ads a){
        return null;
    }
    
    public boolean delete (String username){
        return false;
    }
}
