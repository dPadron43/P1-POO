
public class Estudiantes extends Personas{
	
	private String matricula;

	public Estudiantes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Estudiantes(String nombre, String apellido, String estadoCivil, int numIdentificacion, String matricula) {
		super(nombre, apellido, estadoCivil, numIdentificacion);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return super.toString() + "Estudiantes [matricula= " + matricula + "]";
	}
	
	
	
	
}
