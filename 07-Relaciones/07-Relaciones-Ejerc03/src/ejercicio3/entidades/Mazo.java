package ejercicio3.entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Mazo {

    private ArrayList<Carta> cartas = new ArrayList();
    private ArrayList<Carta> cartasSacadas = new ArrayList();
    Scanner sc = new Scanner(System.in);
    
    /*****************************************************************************************************************/
    /*****************************************************************************************************************/
    /*****************************************************************************************************************/

    public Mazo() {
        
        for(Palo palo : Palo.values()){
            for (int i = 1; i < 13; i++) {
                if(i == 8 || i == 9){
                    continue;
                }else{
                    Carta carta = new Carta(i, palo);
                    cartas.add(carta);
                }
            }
        }
    }
    
    /*****************************************************************************************************************/
    /*****************************************************************************************************************/
    /*****************************************************************************************************************/
    
    public void barajar() {
        Collections.shuffle(cartas);
    }
    
    /*****************************************************************************************************************/
    /*****************************************************************************************************************/
    /*****************************************************************************************************************/

    public void siguienteCarta() {
        
        if(cartas.size()>0){
            System.out.println("La siguiente carta que pediste es: ");
            System.out.println(cartas.get(0));
            
            cartasSacadas.add(cartas.get(0));
            cartas.remove(0);
        }else{
            System.out.println("Te quedaste sin cartas :(");
        }
    }
    
    /*****************************************************************************************************************/
    /*****************************************************************************************************************/
    /*****************************************************************************************************************/

    public void cartasDisponibles() {
        System.out.println("----------------------------");
        System.out.println("La cantidad de cartas disponibles es: " + cartas.size());
        System.out.println("----------------------------\n");
    }
    
    /*****************************************************************************************************************/
    /*****************************************************************************************************************/
    /*****************************************************************************************************************/

    public void darCartas() {
        System.out.println("----------------------------");
        int cantidad;
        do{
            System.out.println("Ingrese la cantidad de cartas que quiera dar: ");
            cantidad = Integer.parseInt(sc.nextLine());
        }while(cantidad > cartas.size());
        for (int i = 0; i < cantidad; i++) {
            siguienteCarta();
        }
        
        System.out.println("----------------------------\n");
    }
    
    /*****************************************************************************************************************/
    /*****************************************************************************************************************/
    /*****************************************************************************************************************/

    public void cartasSacadas() {
        System.out.println("----------------------------");
        System.out.println("Las cartas SACADAS del primer monton son: ");
        System.out.println(cartasSacadas.size());
        cartasSacadas.forEach(System.out::println);
        System.out.println("----------------------------\n");
    }
    
    /*****************************************************************************************************************/
    /*****************************************************************************************************************/
    /*****************************************************************************************************************/

    public void mostrarBaraja() {
        System.out.println("----------------------------");
        System.out.println("Las cartas del primer monton son: ");
        System.out.println(cartas.size());
        cartas.forEach(System.out::println);
        System.out.println("----------------------------\n");
    }
}
