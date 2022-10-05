public class Empleados extends Personas{
	
	private String fechaIncorporacion;
	private int numDespacho;
	
	public Empleados() {
		super();
	}
	public Empleados(String nombre, String apellido, String estadoCivil, int numIdentificacion, String fechaIncorporacion, int numDespacho) {
		super(nombre, apellido, estadoCivil, numIdentificacion);
		this.fechaIncorporacion = fechaIncorporacion;
		this.numDespacho = numDespacho;
	}
	public String getFechaIncorporacion() {
		return fechaIncorporacion;
	}
	public void setFechaIncorporacion(String fechaIncorporacion) {
		this.fechaIncorporacion = fechaIncorporacion;
	}
	public int getNumDespacho() {
		return numDespacho;
	}
	public void setNumDespacho(int numDespacho) {
		this.numDespacho = numDespacho;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Empleados [fechaIncorporacion=" + fechaIncorporacion + ", numDespacho=" + numDespacho + "]";
	}
	
		
	
}
