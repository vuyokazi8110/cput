/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author sbm
 */
public class Contact {
    private String email;
    private String TelNumber;
    private String address;

    private Contact(Builder build) {
    email= build.email;
    TelNumber = build.TelNumber;
    address = build.address;
 
    }
    
    public static class Builder{
        
        private String email;
        private String TelNumber;
        private String address;
        
        public Builder (String email)
        {
            this.email=email;
        }
        
        public Builder TelNumber(String TelNumber)
        {
            this.TelNumber = TelNumber;
            return this;
        }
         public Builder address(String address)
        {
            this.address = address;
            return this;
        }
        public Builder email(Contact con)
        {
            this.email = con.getEmail();
            return this;
        }
        public Contact build()
        {
            return new Contact(this);
        }
    }
    public String getTelNumber() {
        return TelNumber;
    }

    public String getAddress() {
        return address;
    }
    
    public String getEmail() {
        return email;
    }
    
}
