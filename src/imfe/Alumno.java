package imfe;

public class Alumno { //solo las clases en mayusculas
	//Atributos
	String nombre;
	String apellidos;
	float notamedia;
	boolean estaAdmitido;
	
	//Constructores
	public Alumno() {
		nombre="sin nombre";
		apellidos="sin apellidos";
		notamedia=0;
		estaAdmitido=false;
	}
	
	//Métodos (siempre en minusculas)
	public void mostrarFicha(){
		
		System.out.println("***********************");
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellidos: "+apellidos);
		System.out.println("Nota media: "+notamedia);
		if (estaAdmitido) {
			System.out.println("Admitido: [x]");
		}
		else {
			System.out.println("*Admitido: [ ]");
		}
		System.out.println("***********************");
	}
	
	public void estaAdmitido(){
		
		
		if (estaAdmitido) { // si es true
			
			System.out.println(nombre+ "[x]"); 
		}
		else {
			
			System.out.println(nombre+ "[ ]");
		}
	}
}
