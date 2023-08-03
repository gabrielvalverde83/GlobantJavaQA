package Entidades;

//Probado métodos estáticos

public class Matematica {
    
    private static double num1;
    private static double num2;
    private static double mayor;
    private static double menor;

    public Matematica() {
    }

    public static double getNum1() {
        return num1;
    }

    public static void setNum1(double num1) {
        Matematica.num1 = num1;
    }

    public static double getNum2() {
        return num2;
    }

    public static void setNum2(double num2) {
        Matematica.num2 = num2;
    }

    public static double getMayor() {
        return mayor;
    }

    public static void setMayor(double mayor) {
        Matematica.mayor = mayor;
    }

    public static double getMenor() {
        return menor;
    }

    public static void setMenor(double menor) {
        Matematica.menor = menor;
    }

    
    
    
    
}
