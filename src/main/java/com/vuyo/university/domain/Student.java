/*
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
public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
        
    private Long id;
    private String sName;
    private String surname;
    private int sNumber;
    
    @Embedded
    private Contact cont;
         
    @Embedded
    private StudentBalance bal;
    
    private Student (Builder builder)
    {
            id = builder.id;
            sName = builder.sName;
            surname = builder.surname;
            sNumber = builder.sNumber;
            cont = builder.cont;
            bal = builder.bal;
    }
    
    private Student ()
    {
        
    }
    
    public static class Builder
    {
        private Long id;
        private String sName;
        private String surname;
        private int sNumber;
        private Contact cont;
        private StudentBalance bal;

        
        
        public Builder(int sNumber)
        {
            this.sNumber = sNumber;            
        }
        
        public Builder cont(Contact cont)
        {
        this.cont = cont;
        return this;
        }
        
        public Builder bal(StudentBalance bal)
        {
        this.bal = bal;
        return this;
        }
        
        public Builder id(Long value)
        {
            this.id = value;
            return this;
        }
        public Builder sName(String value)
        {
            this.sName = value;
            return this;
        }
        public Builder surname(String value)
        {
            this.surname= value;
            return this;
        
        }
        
       public Builder student(Student student) 
       {
           id=student.getId();
           sName = student.getsName();
           surname = student.getSurname();
           sNumber = student.getsNumber();
           cont = student.getContact();
           bal = student.getBalance();
           return this;
       }
            
       public Student build()
       {
           return new Student(this);
       }
    }
    
    public Contact getContact() {
            return cont;
        }

        public StudentBalance getBalance() {
            return bal;
        }
    
    public Long getId() {
            return id;
        }

        public String getsName() {
            return sName;
        }

        public String getSurname() {
            return surname;
        }

        public int getsNumber() {
            return sNumber;
        }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vuyo.university.domain.Student[ id=" + id + " ]";
    }
    
}
