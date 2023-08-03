package Entidades;

public class PasswordValidator {
    
    private String palabra;
    private boolean longPassValidacion = false;
    private boolean letrasValidacion = false;
    
    public PasswordValidator() {
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public boolean isLongPassValidacion() {
        return longPassValidacion;
    }

    public void setLongPassValidacion(boolean longPassValidacion) {
        this.longPassValidacion = longPassValidacion;
    }

    public boolean isLetrasValidacion() {
        return letrasValidacion;
    }

    public void setLetrasValidacion(boolean letrasValidacion) {
        this.letrasValidacion = letrasValidacion;
    }

    
    
    
    
}
