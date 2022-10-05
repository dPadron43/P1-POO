import java.util.*;
public class Ejecutable {

	public static void main(String[] args) {
		
		//Creamos los objetos de cada clase para poder enseñar el contenido en la clase ejecutabe
		Scanner sc = new Scanner(System.in);
		Estudiantes es = new Estudiantes("Alejandro", "Padron", "Casado", 7800 , "DAM" ); 
		System.out.println(es.toString());
		System.out.println();
		
		Empleados em = new Empleados("David", "Mendoza", "Soltero", 0027, "09/07/2003" , 413);
		System.out.println(em.toString());
		System.out.println();
		
		PersonalServicio ps = new PersonalServicio("Valentina", "Padron", "Soltera", 0043, "Biblioteca");
		System.out.println(ps.toString());
		System.out.println();
		
		Profesores pr = new Profesores("Alejandra", "Guevara", "Casada", 41, "Ciencias");
		System.out.println(pr.toString());
		System.out.println();
		
		
		System.out.println("Cambio de estado civil de un empleado: ");
		String nuevoEstado;
		nuevoEstado = sc.next();
		em.setEstadoCivil(nuevoEstado);
		System.out.println("");
		System.out.println("Cambio de despacho de un empleado: ");
		int cambioDespacho;
		cambioDespacho = sc.nextInt();
		em.setNumDespacho(cambioDespacho);
		System.out.println(em);
		System.out.println("");
		
		System.out.println("Matricular a un alumno en un nuevo curso: ");
		String cambioMatricula;
		cambioMatricula = sc.next();
		es.setMatricula(cambioMatricula);
		System.out.println(es);
		System.out.println("");
		
		
		System.out.println("Cambio de departamento de un profesor: ");
		String cambioDepart;
		cambioDepart = sc.next();
		pr.setDepart(cambioDepart);
		System.out.println(pr);
		System.out.println("");
		
		System.out.println("Cambio de seccion a un personal de servicio: ");
		String cambioSeccion;
		cambioSeccion = sc.next();
		ps.setSeccion(cambioSeccion);
		System.out.println(ps);
		System.out.println("");

	}

}
   