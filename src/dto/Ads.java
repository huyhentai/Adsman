/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Aptech
 */
public class Ads implements Serializable, Comparable<Ads> {

    private int adno;
    private String adname;
    private String adtype;
    private int adlength;
    private int adsize;
    private double adprice;
    private Date adtime;
    private int status;
    private String username;
    private Date adtimefrom;
    private Date adtimeto;
    
    public Ads() {
    }
    
    public Ads(int adno, String adname, String adtype, int adlength, int adsize, double adprice, Date adtime, int status, String username, Date adtimefrom, Date adtimeto) {
        this.adno = adno;
        this.adname = adname;
        this.adtype = adtype;
        this.adlength = adlength;
        this.adsize = adsize;
        this.adprice = adprice;
        this.adtime = adtime;
        this.status = status;
        this.username = username;
        this.adtimefrom = adtimefrom;
        this.adtimeto = adtimeto;
    }
    
    public int getAdno() {
        return adno;
    }
    
    public void setAdno(int adno) {
        this.adno = adno;
    }
    
    public String getAdname() {
        return adname;
    }
    
    public void setAdname(String adname) {
        this.adname = adname;
    }
    
    public String getAdtype() {
        return adtype;
    }
    
    public void setAdtype(String adtype) {
        this.adtype = adtype;
    }
    
    public int getAdlength() {
        return adlength;
    }
    
    public void setAdlength(int adlength) {
        this.adlength = adlength;
    }
    
    public int getAdsize() {
        return adsize;
    }
    
    public void setAdsize(int adsize) {
        this.adsize = adsize;
    }
    
    public double getAdprice() {
        return adprice;
    }
    
    public void setAdprice(double adprice) {
        this.adprice = adprice;
    }
    
    public Date getAdtime() {
        return adtime;
    }
    
    public void setAdtime(Date adtime) {
        this.adtime = adtime;
    }
    
    public int getStatus() {
        return status;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public Date getAdtimefrom() {
        return adtimefrom;
    }
    
    public void setAdtimefrom(Date adtimefrom) {
        this.adtimefrom = adtimefrom;
    }
    
    public Date getAdtimeto() {
        return adtimeto;
    }
    
    public void setAdtimeto(Date adtimeto) {
        this.adtimeto = adtimeto;
    }
    
    @Override
    public int compareTo(Ads o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        return "Ads{" + "adno=" + adno + ", adname=" + adname + ", adtype=" + adtype + ", adlength=" + adlength + ", adsize=" + adsize + ", adprice=" + adprice + ", adtime=" + adtime + ", status=" + status + ", username=" + username + ", adtimefrom=" + adtimefrom + ", adtimeto=" + adtimeto + '}';
    }
    
}
