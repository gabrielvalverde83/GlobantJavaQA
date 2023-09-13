import Servicios.TareaServicios;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class Pruebas {
    
    public Pruebas() {
    }
    
    TareaServicios ts;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        ts = new TareaServicios();
        ArrayList<String> prueba = new ArrayList();
        
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void crearTarea(){
        ts.crearTarea();
        String descripcion = "hola";
    
    
    }
}
