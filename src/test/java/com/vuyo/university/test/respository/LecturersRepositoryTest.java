/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vuyo.university.test.respository;

import com.vuyo.university.app.conf.ConnectionConfig;
import com.vuyo.university.domain.Contact;
import com.vuyo.university.domain.Lecturers;
import com.vuyo.university.respository.LecturerRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class LecturersRepositoryTest {
    
    private static ApplicationContext ctx;
    private long id; 
    private LecturerRepository repo;
    
    public LecturersRepositoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @Test
    public void createLecturers()
    {
        repo = ctx.getBean(LecturerRepository.class);
        Contact c = new Contact();
        c.setAddress("10  Voortrekker road, Bellville");
        c.setEmail("vwondo@fnb.co.za");
        c.setTelNumber("08397750752");
        Lecturers lect = new Lecturers.Builder("205166652")
                .lname("Vuyokazi")
                .lsurname("Wondo")
                .course("TP3")
                .cont(c)
                .build();
        
        repo.save(lect);
        id = lect.getId();
        Assert.assertNotNull(id);
    }
    
     @Test
        (dependsOnMethods = "createLecturers", enabled = false)
         public void readLecturers(){
         repo = ctx.getBean(LecturerRepository.class);
         Lecturers lecture = repo.findOne(id);
         Assert.assertEquals(lecture.getEmpNumber(), "205166652");
         
     }
     
    @Test
     (dependsOnMethods = "readLecturers", enabled = false)
     private void updateLecturers(){
         repo = ctx.getBean(LecturerRepository.class);
         Lecturers lecture = repo.findOne(id);
         Lecturers updatedBooks = new Lecturers.Builder("205166652")
                 .lname("Vuyo")
                 .lsurname("Wondo")
                 .build();
        
         repo.save(updatedBooks);
         
         Lecturers newLecturers = repo.findOne(id);
         Assert.assertEquals(newLecturers.getEmpNumber(), "210112587");
         
     }
     
     @Test
     (dependsOnMethods = "updateLecturers",enabled = false)
     private void deleteLecturers(){
         repo = ctx.getBean(LecturerRepository.class);
         Lecturers lecture = repo.findOne(id);
         repo.delete(lecture);
         
         Lecturers deletedLecturers = repo.findOne(id);
         
         Assert.assertNull(deletedLecturers);
         
         
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
