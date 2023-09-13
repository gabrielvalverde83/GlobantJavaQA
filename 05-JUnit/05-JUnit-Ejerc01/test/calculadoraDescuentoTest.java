/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Servicios.calculadoraServicio;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class calculadoraDescuentoTest {
    
    public calculadoraDescuentoTest() {
    }
    
    calculadoraServicio c1;
    
    @BeforeClass
    public static void setUpClass() {
      
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        c1 = new calculadoraServicio();
    }
    
    @After
    public void tearDown() {
    }
    
   
   @Test
   public void deberiaSerDiez() {
       
       //assertEquals(0,c1.calculadoraDescuento(120.5,0.10),0); //para probar si fallaba
       assertEquals(12.05,c1.calculadoraDescuento(120.5,0.10),0);
       assertEquals(12.05,c1.calculadoraDescuento(120.5,0.10),0);
       
   }
   
   @Test
   public void noDescuento () {
       
        assertEquals(0,c1.calculadoraDescuento(120.5,0),0);  
   }
   
   @Test
   public void descuentoMaximo() {
       
       assertTrue(c1.calculadoraDescuento(120.5, 0.10)< 20);
       
   }
}
