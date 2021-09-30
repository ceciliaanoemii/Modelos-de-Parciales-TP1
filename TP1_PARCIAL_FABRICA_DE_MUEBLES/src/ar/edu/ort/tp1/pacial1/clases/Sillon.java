package ar.edu.ort.tp1.pacial1.clases;

public class Sillon extends Mueble {
	private int cantDeCuerpo;
	private TelaSillon tela;
	
	public Sillon(String modelo, float costoBase, float porcentajeGanancia, int cantDeCuerpo, TelaSillon tela) {
		super(modelo, costoBase, porcentajeGanancia);
		this.cantDeCuerpo = cantDeCuerpo;
		this.tela = tela;
	}
	@Override
	public float calcularPrecioCosto() {
		return super.getCostoBase() * this.cantDeCuerpo* tela.getPorcentaje();
	}
	public int getCantDeCuerpo() {
		return cantDeCuerpo;
	}
	public void setCantDeCuerpo(int cantDeCuerpo) {
		this.cantDeCuerpo = cantDeCuerpo;
	}
	public TelaSillon getTela() {
		return tela;
	}
	public void setTela(TelaSillon tela) {
		this.tela = tela;
	}
	
	
	

}
