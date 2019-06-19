/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import info.heleno.DataValidation;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author helenocampos
 */
public class DataValidationTest
{
    
    DataValidation validation;
    
    public DataValidationTest()
    {
    }
    
    @Before
    public void setUp()
    {
        validation = new DataValidation();
    }


     @Test
     public void validEmail() {
         assertEquals(true,validation.isValidEmail("test@test.com"));
     }
     
     @Test
     public void invalidEmail() {
         assertEquals(false,validation.isValidEmail("test.com"));
     }
     
     @Test
    public void nullEmail() {
        assertEquals(false,validation.isValidEmail(null));
    }
    
    @Test
     public void invalidEmail2() {
         assertEquals(false,validation.isValidEmail("test#@test.com"));
     }
}
