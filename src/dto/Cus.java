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
public class Cus implements Serializable, Comparable<Cus> {

    private int cusid;
    private String cusname;
    private String cussex;
    private String cusadd;
    private int cusphone;
    private int adno;
    
    public Cus() {
    }
    
    public Cus(int cusid, String cusname, String cussex, String cusadd, int cusphone, int adno) {
        this.cusid = cusid;
        this.cusname = cusname;
        this.cussex = cussex;
        this.cusadd = cusadd;
        this.cusphone = cusphone;
        this.adno = adno;
    }
    
    public int getCusid() {
        return cusid;
    }
    
    public void setCusid(int cusid) {
        this.cusid = cusid;
    }
    
    public String getCusname() {
        return cusname;
    }
    
    public void setCusname(String cusname) {
        this.cusname = cusname;
    }
    
    public String getCussex() {
        return cussex;
    }
    
    public void setCussex(String cussex) {
        this.cussex = cussex;
    }
    
    public String getCusadd() {
        return cusadd;
    }
    
    public void setCusadd(String cusadd) {
        this.cusadd = cusadd;
    }
    
    public int getCusphone() {
        return cusphone;
    }
    
    public void setCusphone(int cusphone) {
        this.cusphone = cusphone;
    }
    
    public int getAdno() {
        return adno;
    }
    
    public void setAdno(int adno) {
        this.adno = adno;
    }
    
    @Override
    public int compareTo(Cus o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        return "Cus{" + "cusid=" + cusid + ", cusname=" + cusname + ", cussex=" + cussex + ", cusadd=" + cusadd + ", cusphone=" + cusphone + ", adno=" + adno + '}';
    }
    
}
