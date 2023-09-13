package enc61.pkg62.ejerc04;

import Entidades.TextAnalizer;
import Servicios.TextAnalizerServicios;

/**
 Crea una clase TextAnalyzer que analice un texto y proporcione estadísticas sobre él (por
ejemplo, número de palabras, número de frases, frecuencia de palabras, etc.).
Escribe pruebas unitarias para asegurarte de que el analizador de texto proporcione los
resultados correctos y maneje diferentes escenarios, como texto vacío o texto con caracteres
especiales.

 */
public class Main {

    public static void main(String[] args) {
        
        TextAnalizerServicios tas = new TextAnalizerServicios();
        TextAnalizer texto = tas.crearTexto();
        tas.buscar(texto);
        
    }
    
}
