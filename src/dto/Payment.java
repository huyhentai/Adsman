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
public class Payment implements Serializable, Comparable<Payment> {

    private int paymentid;
    private double payment;
    private int status;
    private int cusid;
    private int adno;
    private String username;
    private Date time;

    public Payment(int paymentid, double payment, int status, int cusid, int adno, String username, Date time) {
        this.paymentid = paymentid;
        this.payment = payment;
        this.status = status;
        this.cusid = cusid;
        this.adno = adno;
        this.username = username;
        this.time = time;
    }

    public Payment() {
    }

    public int getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(int paymentid) {
        this.paymentid = paymentid;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCusid() {
        return cusid;
    }

    public void setCusid(int cusid) {
        this.cusid = cusid;
    }

    public int getAdno() {
        return adno;
    }

    public void setAdno(int adno) {
        this.adno = adno;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public int compareTo(Payment o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Payment{" + "paymentid=" + paymentid + ", payment=" + payment + ", status=" + status + ", cusid=" + cusid + ", adno=" + adno + ", username=" + username + ", time=" + time + '}';
    }

}
