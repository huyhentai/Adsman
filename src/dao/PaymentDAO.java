/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Payment;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import utils.ConnectDB;

/**
 *
 * @author Aptech
 */
public class PaymentDAO {
    List<Payment> lP = null;
    Connection con = null;

    public PaymentDAO() {
            lP = new ArrayList<>();
            con = new ConnectDB().getCon();
    }
    
    public Payment create(Payment p){
        return null;
    }
    
    public List<Payment> readAll(){
        return null;
    }
    
    public Payment readByusername(String Payment){
        return null;
    }
    
    public Payment update(Payment p){
        return null;
    }
    
    public boolean delate(String Payment){
        return false;
    }
    
    
}
