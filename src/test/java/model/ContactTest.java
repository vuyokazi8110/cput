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
public class ContactTest {
    @Test
    public void testme(){
        Contact con = new Contact.Builder("vwonwo@yahoo.com").TelNumber("0839750752").build();
         Assert.assertEquals(con.getTelNumber(),"0839750752");
         Assert.assertEquals(con.getEmail(), "vwonwo@yahoo.com");
    }
    @Test
    public void ContactTestUpdate() 
    {
        Contact con = new Contact.Builder("Romeo@yahoo.com").TelNumber("86767678778").build();
        Contact con2 = new Contact.Builder("Romfggfhghgeo@yahoo.com").email(con).TelNumber("4432-5435").email(con).build();
         Assert.assertEquals(con2.getTelNumber(),"4432-5435");
         Assert.assertEquals(con2.getEmail(), "Romeo@yahoo.com");
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
