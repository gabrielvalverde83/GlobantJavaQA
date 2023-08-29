package junit.conversiontemp;

import Entidades.Temperatura;
import Servicios.TemperaturaServicios;

/*
Conversión de Temperatura:
Crea una clase TemperatureConverter que convierta entre diferentes unidades de temperatura
(por ejemplo, Celsius, Fahrenheit, Kelvin).
Escribe pruebas unitarias para asegurarte de que la conversión entre las diferentes unidades
se realiza correctamente y produce los resultados esperados.

*/

public class Main {

    public static void main(String[] args) {
        
        TemperaturaServicios ts = new TemperaturaServicios();
        Temperatura temp = ts.crearTemperatura();
        
        ts.calcularTemperaturaFarenheit(temp);
        ts.calcularTemperaturaKelvin(temp);

    }
    
}
