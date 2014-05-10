/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;


public class StudentBalance {
    private double current_balance;
    private double payment;
    private double income;
    private String studId;
    
    private StudentBalance (Builder build)
    {
        current_balance= build.current_balance;
        payment = build.payment;
        income = build.income;
        studId = build.studId;
    }
    
    public static class Builder 
    {
    private double current_balance;
    private double payment;
    private double income;
    private String studId;
    
    public Builder (String studId)
    {
        this.studId= studId;
  
    }
    
    public Builder current_balance(double current_balance)
    {
        this.current_balance = current_balance;
        return this;
    }
    
    public Builder payment(double payment)
    {
        this.payment = payment;
        return this;
    }
    
    public Builder income(double income)
    {
        this.income = income;
        return this;
    }
    
    public Builder studId(String studId)
    {
        this.studId = studId;
        return this;
    }
    
    
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
