package ar.edu.ort.tp1.pacial1.clases;
import java.util.ArrayList;

public class FabricaDeMuebles implements Mostrable {
	private static final double TOPE_PORCENTAJE = 0.05;
	private ArrayList<Mueble>muebles;
	private String nombre;

	public FabricaDeMuebles(String nombre) {
		this.muebles= new ArrayList<>();
		this.nombre= nombre;
	}

	public boolean fabricar(Mueble m) {
		boolean sePudoFabricar= false;
		if(m.getPorcentajeGanancia() >TOPE_PORCENTAJE) {
			System.out.println("Fabricando el mueble: ");
			this.muebles.add(m);	
			m.mostrar();
			sePudoFabricar=true;
		} else {
			System.out.println("No se pudo fabricar. Porcentaje de ganancia menor al 5%");
		}
		return sePudoFabricar;
	
	}
	public boolean superoCosto(double monto){ 
		boolean superoCosto = false;
		int i = 0;
		Mueble mueble;
		
		while(i < this.muebles.size() && superoCosto ==false) {
			mueble= this.muebles.get(i);
			if(mueble.getCostoBase() >monto) {
				superoCosto=true;
			}
			else {
				i++;
			}
		}
		return superoCosto;
		}

	@Override
	public void mostrar() {
		System.out.println("Fabrica de muebles: "+ this.nombre);
		int cantSillas=0;
		double porcentaje= 0;
		double totalMuebles= 0;
		float ventaTotales=0;
		
		for (Mueble m : this.muebles) {
			if( m instanceof Silla) {
				cantSillas++;			
			}
			totalMuebles++;
			ventaTotales= ventaTotales+ m.calcularPrecioVenta();
		}
		porcentaje= cantSillas* 100/totalMuebles;
	
	System.out.println("La cantidad de sillas corresponde al "+ porcentaje+ "% del total de muebles fabricados");
	System.out.println("La venta total fue: $"+ ventaTotales);

		
	}
	
}
