
public class Personas {
	
	private String nombre, apellido, estadoCivil;
	private int numIdentificacion;
	
	public Personas() {
	}

	public Personas(String nombre, String apellido, String estadoCivil, int numIdentificacion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.estadoCivil = estadoCivil;
		this.numIdentificacion = numIdentificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public int getNumIdentificacion() {
		return numIdentificacion;
	}

	public void setNumIdentificacion(int numIdentificacion) {
		this.numIdentificacion = numIdentificacion;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", apellido=" + apellido + ", estadoCivil=" + estadoCivil
				+ ", numIdentificacion=" + numIdentificacion + " ";
	}
	
	
	
	
	

}
