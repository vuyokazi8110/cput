/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import junit.framework.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author sbm
 */
public class BooksTest {
    
    public BooksTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void testBooks() 
     {
         Books book = new Books.Builder("4432-5435").bookname("Romeo").build();
         Assert.assertEquals(book.getIsbn(),"4432-5435");
         Assert.assertEquals(book.getBookName(), "Romeo");
                  
     }
     
     @Test
     public void testBooksUpdate() 
     {
        
         Books book = new Books.Builder("4432-5435").bookname("Romeo").build();
         Books book2 = new Books.Builder("99999-99998").books(book).bookname("Juliet").books(book).build();
         Assert.assertEquals(book2.getIsbn(),"4432-5435");
         Assert.assertEquals(book2.getBookName(), "Romeo");
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
