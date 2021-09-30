package ar.edu.ort.tp1.pacial1.clases;

public class Silla extends Mueble {

	private static final int COEFICIENTE_SILLA = 3;
	private long alto;
	private MaterialSilla material;
	
	public Silla(String modelo, float costoBase, float porcentajeGanancia, long alto, MaterialSilla material) {
		super(modelo, costoBase, porcentajeGanancia);
		this.alto = alto;
		this.material= material;
	}
	@Override
	public float calcularPrecioCosto() {
		return super.getCostoBase() + material.getMultiplicadorValor()* this.alto ;
	}
	
	public long getAlto() {
		return alto;
	}
	public void setAlto(long alto) {
		this.alto = alto;
	}
	public static int getCoeficienteSilla() {
		return COEFICIENTE_SILLA;
	}
	
	

}
