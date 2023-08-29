package Servicios;

import Entidades.Cliente;
import Entidades.Cuota;
import Entidades.Poliza;
import Entidades.Vehiculo;
import Enumeraciones.FormaPago;
import java.util.ArrayList;
import java.util.Date;

public class PolizaServicio {
    
    ArrayList <Poliza> polizas = new ArrayList();
    ArrayList <Cuota> cuotas = new ArrayList();
    
    
    public void inicializar(){
    
        Poliza p1 = new Poliza(((int)(Math.random()*1000)), new Date("2022/08/17"), new Date("2023/08/17"), 50000, true, 200000, "completo");
        p1.setCliente(new Cliente("Pepe Argento", "33568798"));
        p1.setVehiculo(new Vehiculo("Ford", "Focus", 2019, "Auto"));
        
        //cuotas.add(new Cuota(1, 20000, true, new Date("2023/02/10"), FormaPago.EFECTIVO));
        //cuotas.add(new Cuota(2, 20000, true, new Date("2023/04/10"), FormaPago.EFECTIVO));
        //cuotas.add(new Cuota(3, 20000,true, new Date("2023/08/10"), FormaPago.EFECTIVO));
        //cuotas.add(new Cuota(4, 20000,false, new Date("2023/10/10"),FormaPago.EFECTIVO));
        
        p1.setCuotas(new Cuota(1, 20000, true, new Date("2023/02/10"), FormaPago.EFECTIVO));
        p1.setCuotas(new Cuota(2, 20000, true, new Date("2023/04/10"), FormaPago.EFECTIVO));
        

        Poliza p2 = new Poliza(((int)(Math.random()*1000)), new Date("2020/05/17"), new Date("2023/08/17"), 40000, true, 300000, "tercero");
        p2.setCliente(new Cliente("Rulo Campanopolis", "77878498"));
        p2.setVehiculo(new Vehiculo("Renault", "Oroch", 2022, "Camioneta"));
        
        Poliza p3 = new Poliza(((int)(Math.random()*1000)), new Date("2018/11/7"), new Date("2023/08/17"), 50000, false, 0, "franquicia");
        p3.setCliente(new Cliente("Monica Perez", "3547798"));
        p3.setVehiculo(new Vehiculo("Fiat", "Duna", 1990, "Auto"));
    
        polizas.add(p1);
        polizas.add(p2);
        polizas.add(p3);
        
        System.out.println(polizas.toString());

    }
    
}
