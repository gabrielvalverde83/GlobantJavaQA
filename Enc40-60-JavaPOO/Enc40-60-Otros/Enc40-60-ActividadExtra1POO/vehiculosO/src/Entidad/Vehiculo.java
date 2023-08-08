package Entidad;

public class Vehiculo {
	
	private String tipo;
	private String  marca;
	private String modelo;
	private int anio;
	
	public Vehiculo(String tipo, String marca, String modelo, int anio) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
	}

	public Vehiculo() {
		super();
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	
	
	
}
