package ar.edu.ort.tp1.pacial1.clases;

public abstract class Mueble implements Mostrable {
	private String modelo;
	private float costoBase;
	private float porcentajeGanancia;

	public Mueble(String modelo, float costoBase, float porcentajeGanancia) {
		this.modelo= modelo;
		this.costoBase= costoBase;
		this.porcentajeGanancia= porcentajeGanancia;				
	}

	public abstract float calcularPrecioCosto();
	
	
	public float calcularPrecioVenta() {
		float costo = this.calcularPrecioCosto();
		return this.porcentajeGanancia * costo/100 + costo;	
	}
	
	@Override
	public void mostrar() {
		System.out.println("Mueble tipo: "+ getClass().getSimpleName() + " -Modelo:  " + this.modelo + " - Precio de venta: $" +  calcularPrecioVenta());	
	}

	protected float getCostoBase() {
		return costoBase;
	}

	public boolean modeloCorrecto(String modelo) {
	
		return modelo == this.modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getPorcentajeGanancia() {
		return porcentajeGanancia;
	}

	public void setPorcentajeGanancia(float porcentajeGanancia) {
		this.porcentajeGanancia = porcentajeGanancia;
	}

	public void setCostoBase(float costoBase) {
		this.costoBase = costoBase;
	}
	
}
