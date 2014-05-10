/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vuyo.university.domain;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class Contact implements Serializable {
    
    private String email;
    private String TelNumber;
    private String address;
   
    
    public void setTelNumber(String TelNumber) {
        this.TelNumber = TelNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelNumber() {
        return TelNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    
}
