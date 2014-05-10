/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vuyo.university.test.respository;

import com.vuyo.university.app.conf.ConnectionConfig;
import com.vuyo.university.domain.Contact;
import com.vuyo.university.domain.Student;
import com.vuyo.university.domain.StudentBalance;
import com.vuyo.university.respository.LecturerRepository;
import com.vuyo.university.respository.StudentRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class StudentRepositoryTest {
    
    private static ApplicationContext ctx;
    private Long id;
    private StudentRepository repo;
    
    public StudentRepositoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void createStudent()
    {
        repo = ctx.getBean(StudentRepository.class);
        StudentBalance b = new StudentBalance();
        b.setIncome(2000.00);
        b.setPayment(1000.00);
        b.setCurrent_balance(1000.00);
        Contact c = new Contact();
        c.setAddress("120 Ngena street, Dunoon");
        c.setEmail("205166652@cput.ac.za");
        c.setTelNumber("0215214200");
        Student s = new Student.Builder(205166652)
                .sName("Veee")
                .surname("Mbulwana")
                .cont(c)
                .bal(b)
                .build();
        repo.save(s);
        id=s.getId();
        Assert.assertNotNull(id);
                
    }
    
    @Test
        (dependsOnMethods = "createStudent", enabled = false)
         public void readStudent(){
         repo = ctx.getBean(StudentRepository.class);
         Student student = repo.findOne(id);
         Assert.assertEquals(student.getsNumber(), 205166652);
         
     }
     
    @Test
     (dependsOnMethods = "readStudent", enabled = false)
     private void updateStudent(){
         repo = ctx.getBean(StudentRepository.class);
         Student lecture = repo.findOne(id);
         Student updatedStudent = new Student.Builder(205166652)
                 .sName("Vuyo")
                 .surname("Wondo")
                 .build();
        
         repo.save(updatedStudent);
         
         Student newStudent = repo.findOne(id);
         Assert.assertEquals(newStudent.getsNumber(), 210112587);
         
     }
     
     @Test
     (dependsOnMethods = "updateStudent",enabled = false)
     private void deleteStudent(){
         repo = ctx.getBean(StudentRepository.class);
         Student student = repo.findOne(id);
         repo.delete(student);
         
         Student deletedStudent = repo.findOne(id);
         
         Assert.assertNull(deletedStudent);
         
         
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
