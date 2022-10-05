
public class Profesores extends Personas{
	
	private String depart;

	public Profesores() {
		super();
	}

	public Profesores(String nombre, String apellido, String estadoCivil, int numIdentificacion, String depart) {
		super(nombre, apellido, estadoCivil, numIdentificacion);
		this.depart = depart;
	
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	@Override
	public String toString() {
		return super.toString() + "Profesores [depart=" + depart + "]";
	}
	
	
	
	
		
	
	
}
