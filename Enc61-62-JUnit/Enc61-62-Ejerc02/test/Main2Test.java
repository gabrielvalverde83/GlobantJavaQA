import Servicios.TemperaturaServicios;
import Entidades.Temperatura;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class Main2Test {
    
    public Main2Test() {
    }
    
    TemperaturaServicios ts;
    
    @BeforeClass
    public static void setUpClass() {
  
    }
    
    @AfterClass
    public static void tearDownClass() {
      
    }
    
    @Before
    public void setUp() {
        ts = new TemperaturaServicios();
    }
        
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void deberiaConvertirAFarenheit(){
        assertEquals(86.0, ts.calcularTemperaturaFarenheit(new Temperatura(30.0)), 0);
    }
    
    //@Ignore
    @Test
    public void deberiaConvertirAKelvin(){
        assertEquals(303.15, ts.calcularTemperaturaKelvin(new Temperatura(30.0)), 0);
    }
    
    @Test
    public void deberiaActivarODesactivar(){
        Temperatura temp = new Temperatura(40.0);
        assertTrue(temp.isActive());
        temp.setActive(false);
        assertFalse(temp.isActive());
    
    }
    
    
    
}
