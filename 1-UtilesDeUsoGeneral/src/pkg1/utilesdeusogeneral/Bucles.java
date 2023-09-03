package pkg1.utilesdeusogeneral;

import java.util.Scanner;
import Enums.BuclesPalo;

public class Bucles {

        public static void main(String[] args) {
            
            Scanner leer = new Scanner(System.in);

            String frase = leer.nextLine();
            
            /********************************************************************************************************/
            /********************************************************************************************************/
            /********************************************************************************************************/

            if (frase.equals("eureka")) {
                System.out.println("La frase es correcta");
            } else {
                System.out.println("La frase es INcorrecta");
            }
            
            /********************************************************************************************************/
            /********************************************************************************************************/
            /********************************************************************************************************/
            
            do {

                frase = leer.nextLine();

                if (frase.length() != 8) {
                    System.out.println("La cantidad de letras ingresada es incorrecta");
                }

            } while (frase.length() != 8);
            
            
            /********************************************************************************************************/
            /********************************************************************************************************/
            /********************************************************************************************************/
            
            int opcN;
            String opcL = "";
            int resultado;
            int num1 = leer.nextInt();
            int num2 = leer.nextInt();;
            
            do {
                System.out.println("Ingrese una opcion");
                opcN = leer.nextInt();
                

                switch (opcN) {
                    case 1:
                        System.out.println("La suma de los números es: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("La resta de los números es: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("El producto de los números es: " + (num1 * num2));
                        break;
                    case 4:
                        resultado = num1 / num2;
                        System.out.println("La division de los números es: " + resultado);
                        break;
                    case 5:
                        System.out.println("Está seguro que desea salir?");
                        opcL = leer.next();
                        break;
                }

            } while (opcN != 5 || !opcL.equals("S"));
            
             /********************************************************************************************************/
            /********************************************************************************************************/
            /********************************************************************************************************/
                
            
            String columna;
            boolean validacion;

            do{
                columna = leer.next().toUpperCase();
                validacion = true;
                switch (columna) {
                    case "A":
                        columna = "0";
                        break;
                    case "B":
                        columna = "1";
                        break;
                    case "C":
                        columna = "2";
                        break;
                    case "D":
                        columna = "3";
                        break;
                    case "E":
                        columna = "4";
                        break;
                    case "F":
                        columna = "5";
                        break;
                    default:
                        System.out.println("Ingrese opción válida");
                        validacion = false;
                }
            }while(validacion == false);
            
        

    }
    
}
