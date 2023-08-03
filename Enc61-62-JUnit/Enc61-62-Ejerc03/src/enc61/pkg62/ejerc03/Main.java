package enc61.pkg62.ejerc03;

import Servicios.PasswordValidatorServicios;

/*
Validador de Contraseñas:
Crea una clase PasswordValidator que verifique la fortaleza de una contraseña según ciertas
reglas (por ejemplo, longitud mínima, presencia de caracteres especiales, letras mayúsculas, etc.).
Escribe pruebas unitarias para asegurarte de que el validador de contraseñas funcione
correctamente para diferentes escenarios, incluyendo contraseñas válidas e inválidas.

*/

public class Main {

    public static void main(String[] args) {
        
        PasswordValidatorServicios cs = new PasswordValidatorServicios();
        cs.validarPass();
        
        //cs.validarPass(contrasena);

    }
    
}
