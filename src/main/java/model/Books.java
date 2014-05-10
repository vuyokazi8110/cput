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
public class Books {
     private String isbn;
    private String bookname;
    private String title;
    
    
    
    private Books ( Builder builder)
    {
        
        isbn = builder.isbn;
        bookname = builder.bookname;
        title = builder.title;
        
                   
    }
    
     private Books(){
    
    }
   
    
    public static class Builder
    {
           
            private String isbn;
            private String bookname;
            private String title;
           
            
            
            public Builder(String isbn)
            {
                this.isbn = isbn;
            }
            
            
            
            public Builder bookname(String value)
            {
                bookname = value;
                return this;
            }
            
            public Builder titlename(String value)
            {
                title = value;
                return this;
            }
            
           
            
           
            
            public Builder books(Books books)
            {
                
                isbn = books.getIsbn();
                bookname = books.getBookName();
                title = books.getTitle();
                
                
                return this;
            }
            
           
            public Books build()
            {
                return new Books(this);
            }

 
    }

    

    public String getIsbn()
    {
        return isbn;
    }
    
    public String getBookName()
    {
        return bookname;
    }
    
    public String getTitle()
    {
        return title;
    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (isbn != null ? isbn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Books)) {
            return false;
        }
        Books other = (Books) object;
        if ((this.isbn == null && other.isbn != null) || (this.isbn != null && !this.isbn.equals(other.isbn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kabaso.askweb.domain.Books[ id=" + isbn + " ]";
    }
    
    
}
