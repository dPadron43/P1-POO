
public class PersonalServicio extends Personas{

	private String seccion;
	public PersonalServicio() {
		super();
	}
	public PersonalServicio(String nombre, String apellido, String estadoCivil, int numIdentificacion, String seccion) {
		super(nombre, apellido, estadoCivil, numIdentificacion);
		this.seccion = seccion;
		
	}
	public String getSeccion() {
		return seccion;
	}
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	@Override
	public String toString() {
		return super.toString() + "PersonalServicio [seccion=" + seccion + "]";
	}

	
	
	 
}
