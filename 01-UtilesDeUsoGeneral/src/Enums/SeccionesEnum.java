package Enums;

public enum SeccionesEnum {
    BIBLIOTECA(1,"biblioteca"),
    DECANATO(2,"decanato"),
    SECRETARIA(3,"secretaria");

    private Integer codigo;
    private String nombre;

    SeccionesEnum(Integer i, String a) {
        this.nombre = a;
        this.codigo = i;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    //al llamarlo podemos hacer : ps1.setSeccion(SeccionesEnum.values()[1]);
    //                        o : ps1.setSeccion(SeccionesEnum.DECANATO);
    
    
}
