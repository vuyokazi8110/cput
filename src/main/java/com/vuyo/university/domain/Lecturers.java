/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vuyo.university.domain;

import com.vuyo.university.domain.Books.Builder;
import java.io.Serializable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Lecturers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String empNumber;
    private String lname;
    private String lsurname;
    private String course;
    
    @Embedded
    private Contact cont;
    
    
    private Lecturers (Builder builder)
    {
        id= builder.id;
        empNumber = builder.empNumber;
        lname= builder.lname;
        lsurname= builder.lsurname;
        course= builder.course;
        cont = builder.cont;
    }
private Lecturers (){
    
}
    
public static class Builder
{
    private Long id;
    private String lname;
    private String lsurname;
    private String course;
    private String empNumber;
    private Contact cont;
    
    public Builder (String empNumber)
    {
        this.empNumber = empNumber;
    }
    
    
    public Builder id(Long id)
    {
        this.id = id;
        return this;
    }
    
    public Builder lname(String lname)
    {
        this.lname = lname;
        return this;
    }
    public Builder cont(Contact cont)
    {
        this.cont = cont;
        return this;
    }
    
    
    public Builder lsurname(String lsurname)
    {
        this.lsurname = lsurname;
        return this;
    }
    public Builder course(String course)
    {
        this.course = course;
        return this; 
    }
    
    public Builder lecture(Lecturers lecture)
    {
        id=lecture.getId();
        course = lecture.getCourse();
        lsurname = lecture.getLsurname();
        lname = lecture.getLname();
        empNumber = lecture.getEmpNumber();
        cont = lecture.getCont();
        return this;
    }
    
    
    public Lecturers build()
    {
        return new Lecturers(this);   
    }
    
}
    public Long getId() {
        return id;
    }

   public String getCourse() {
        return course;
    }
   public Contact getCont() {
        return cont;
    }
   
    public String getLname() {
        return lname;
    }
    
     public String getLsurname() {
        return lsurname;
    }
      public String getEmpNumber() {
        return empNumber;
    }
   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lecturers)) {
            return false;
        }
        Lecturers other = (Lecturers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vuyo.university.domain.Lecturers[ id=" + id + " ]";
    }
    
}
