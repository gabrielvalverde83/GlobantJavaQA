package Entidades;

import java.util.Date;

public class DateValidator {
    
    private Date fecha;

    public DateValidator() {
    }

    public DateValidator(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

//    public DateValidator(int anio) {
//        this.fecha.setYear(anio);
//    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
}
