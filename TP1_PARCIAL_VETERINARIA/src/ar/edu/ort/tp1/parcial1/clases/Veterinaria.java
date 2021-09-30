package ar.edu.ort.tp1.parcial1.clases;
import java.util.ArrayList;

public class Veterinaria implements Mostrable{

	private static final String TXT_INGRESO = "Ingresando a la veterinaria \n";
	private String nombreVeterinaria;
	private Doctor doctor;
	private ArrayList<Mascota>animalesIngresados;

	public Veterinaria(String nombre, Doctor doctor) {
		this.nombreVeterinaria= nombre;
		this.doctor= doctor;
		this.animalesIngresados= new ArrayList<>();
	}

	public void admitirMascota(Mascota mascota) {
	this.animalesIngresados.add(mascota);
	System.out.println("Ingresando a "+mascota.getNombre()+ " a la veterinaria.");
	}

	public Mascota buscarMascota(String nombreDeMascota) {
		Mascota mascotaAux= null;
		int i = 0;
		while(i < this.animalesIngresados.size() && (!nombreDeMascota.equals(this.animalesIngresados.get(i).getNombre()))) {
			i++;
		}
		if (nombreDeMascota.equals(this.animalesIngresados.get(i).getNombre())) {
			mascotaAux= this.animalesIngresados.get(i);
		}
		return mascotaAux;
	}

	public void vacunar() {
		int cantVacunas=0;
		for (Mascota m : animalesIngresados) {
			if ( !m.isVacunado()) {
				m.vacunar();
				System.out.println(m.getNombre()+ " fue vacunado");
				cantVacunas++;
			}
		}
		System.out.println("Cantidad de vacunas: "+ cantVacunas);
	}

	@Override
	public void mostrar() {
		int acumuladorGato = 0;
		int acumuladorConejo = 0;
		int acumuladorPerro = 0;
		
		System.out.println(TXT_INGRESO+ this.nombreVeterinaria);
		System.out.println("Doctor de turno: "+ this.doctor.getNombre());
		for (Mascota m : animalesIngresados) {
			if( m instanceof Gato) {
				acumuladorGato++;
			}
			else if (m instanceof Conejo) {
				acumuladorConejo++;
			}
			else {
				acumuladorPerro++;
			}		
		}
		System.out.println("Han sido ingresados: "+ acumuladorConejo+ " conejos, "+ acumuladorGato+" gatos y "+ acumuladorPerro+" perros." );
		
	}
	
	

}
