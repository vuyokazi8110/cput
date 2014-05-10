/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vuyo.university.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;


@Embeddable
public class StudentBalance implements Serializable{
    
    private double current_balance;
    private double payment;
    private double income;

    public void setCurrent_balance(double current_balance) {
        this.current_balance = current_balance;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getCurrent_balance() {
        return current_balance;
    }

    public double getPayment() {
        return payment;
    }

    public double getIncome() {
        return income;
    }
    
    
}
