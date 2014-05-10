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
public class Lecturers {
    private String empNumber;
    private String lname;
    private String lsurname;
    private String course;
     
    
    private Lecturers (Builder builder)
    {
        
        empNumber = builder.empNumber;
        lname= builder.lname;
        lsurname= builder.lsurname;
        course= builder.course;
       
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
        course = lecture.getCourse();
        lsurname = lecture.getLsurname();
        lname = lecture.getLname();
        empNumber = lecture.getEmpNumber();
        return this;
    }
    
    
    public Lecturers build()
    {
        return new Lecturers(this);   
    }
    
}
   

   public String getCourse() {
        return course;
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
        hash += (empNumber != null ? empNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lecturers)) {
            return false;
        }
        Lecturers other = (Lecturers) object;
        if ((this.empNumber == null && other.empNumber != null) || (this.empNumber != null && !this.empNumber.equals(other.empNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vuyo.university.domain.Lecturers[ id=" + empNumber + " ]";
    }
    
    
}
