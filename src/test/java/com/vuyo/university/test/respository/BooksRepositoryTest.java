/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vuyo.university.test.respository;


import com.vuyo.university.app.conf.ConnectionConfig;
import com.vuyo.university.domain.Books;
import com.vuyo.university.respository.BooksRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class BooksRepositoryTest {
    
    private static ApplicationContext ctx;
    private Long id;
    private BooksRepository repo;
    
    public BooksRepositoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
        public void createBooks(){
        repo = ctx.getBean(BooksRepository.class);
       
        Books p = new Books.Builder("205166652-7897")
                .bookname("The Life of Vuyo")
                .titlename("Wondo")
                .build();
        
        repo.save(p);
        id = p.getId();
        
        Assert.assertNotNull(id);
        }
        
         @Test
        (dependsOnMethods = "createBooks", enabled = false)
         public void readBooks(){
         repo = ctx.getBean(BooksRepository.class);
         Books book = repo.findOne(id);
         Assert.assertEquals(book.getBookName(), "The Life of Vuyo");
         
     }
     
    @Test
     (dependsOnMethods = "readBooks", enabled = false)
     private void updateBooks(){
         repo = ctx.getBean(BooksRepository.class);
         Books book = repo.findOne(id);
         Books updatedBooks = new Books.Builder("205166652-7897")
                 .bookname("The Life of Vuyo")
                 .titlename("Wondo")
                 .build();
        
         repo.save(updatedBooks);
         
         Books newBooks = repo.findOne(id);
         Assert.assertEquals(newBooks.getBookName(), "The Life of Wondo");
         
     }
     
     @Test
     (dependsOnMethods = "updateBooks",enabled = false)
     private void deleteBooks(){
         repo = ctx.getBean(BooksRepository.class);
         Books book = repo.findOne(id);
         repo.delete(book);
         
         Books deletedBooks = repo.findOne(id);
         
         Assert.assertNull(deletedBooks);
         
         
     }
        
        
    
    

    @BeforeClass
    public static void setUpClass() throws Exception {
         ctx = new AnnotationConfigApplicationContext(ConnectionConfig.class);
         
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
