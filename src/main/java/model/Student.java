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
public class Student {
    private String sName;
    private String surname;
    private String sNumber;
   
    private Student (Builder builder)
    {
            
            sName = builder.sName;
            surname = builder.surname;
            sNumber = builder.sNumber;
            
    }
    
    private Student ()
    {
        
    }
    
    public static class Builder
    {
        private String sName;
        private String surname;
        private String sNumber;
       
        public Builder(String sNumber)
        {
            this.sNumber = sNumber;            
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
           sName = student.getsName();
           surname = student.getSurname();
           sNumber = student.getsNumber();
           return this;
       }
            
       public Student build()
       {
           return new Student(this);
       }
    }
    
   
        public String getsName() {
            return sName;
        }

        public String getSurname() {
            return surname;
        }

        public String getsNumber() {
            return sNumber;
        }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sNumber != null ? sNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Student)) {
            return false;
        }
        Student other = (Student) object;
        if ((this.sNumber == null && other.sNumber != null) || (this.sNumber != null && !this.sNumber.equals(other.sNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.vuyo.university.domain.Student[ id=" + sNumber + " ]";
    }
    
    
}
