package Entidades;


public class Butaca {
    
    private String [] butaca = new String [3];  //Fila - Asiento - Ocupado

    public Butaca() {
    }
    
    public Butaca(String fila, String columna, String ocupado) {
        this.butaca[0] = fila;
        this.butaca[1] = columna;
        this.butaca[2] = ocupado;
    }
    
    
    public String getButaca(int i) {
        return butaca[i];
    }

    public void setButaca(String[] butaca) {
        this.butaca = butaca;
    }

    @Override
    public String toString() {
        return "Butaca{" + "butaca=" + butaca + '}';
    }
    
    

}
