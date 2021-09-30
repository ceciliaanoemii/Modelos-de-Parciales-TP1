package ar.edu.ort.tp1.parcial1.clases;

public abstract class Mascota implements Animal {

	private static final String MSG_COM_FELIZ = " dice: He comido demasiado";
	private static final String MSG_COM_HAMBRIENTO = " dice: Muchas gracias tenía hambre";
	private static final String MSG_COM_ENFERMO = " dice: No tenía mucha hambre, pero gracias";

	private static final int CIEN = 100;
	
	private String nombre;
	private double peso;
	private boolean vacunado;
	
	private Estado estado;

	public Mascota(String nombre, double peso, boolean vacunado, Estado estado) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.vacunado = vacunado;
		this.estado = estado;
	}

	// TODO Completar
	/**
	 * Alimenta a las mascotas de forma general. Si su estado es hambiento estará
	 * feliz y dara las gracias ya que tenía hambre Si su estado es feliz, se
	 * enfermará e indicará que comio demasiado. si estaba enfermo, dara las gracias, pero seguirá enfermo.
	 * además actualizará el peso sumando al actual la multiplicación entre la cantidad de comida recibida y un multiplicador.
	 * Finalmente indicará su estado
	 * 
	 * @param comida
	 * @param multiplicador
	 */

	public void comer (double comida, double multiplicador) {
		System.out.println(this.nombre);
		if( this.estado == Estado.HAMBRIENTO) {
			this.estado= Estado.FELIZ;
			System.out.println(MSG_COM_HAMBRIENTO);
		}
		else if ( this.estado== Estado.FELIZ ){
			this.estado= Estado.ENFERMO;		
			System.out.println(MSG_COM_FELIZ);
		}
		else {
			System.out.println(MSG_COM_ENFERMO);
		}
		this.actualizarPeso(multiplicador * comida);
	}
	
	public void actualizarPeso(double porcentaje) {
		this.peso += peso * porcentaje / CIEN;
	}
	
	public void vacunar() {
		this.vacunado= true;
	}
	public boolean isVacunado() {
		return this.vacunado;
	}


		
		public String getNombre() {
			return nombre;
		}



		
		

}
