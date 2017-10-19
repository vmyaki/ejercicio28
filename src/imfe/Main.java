package imfe;

public class Main {

	public static void main(String[] args) {
		Alumno vero=new Alumno();
		Alumno laura=new Alumno();
		
		//usando el valor por defecto del constructor
		laura.mostrarFicha();
		
		//modificamos los datos del constructor
		vero.nombre="Verónica";
		vero.apellidos="Medina Alcántara";
		vero.notamedia=7.8f;
		vero.estaAdmitido=true;
		
		System.out.println("Nombre: "+vero.nombre);
		System.out.println("Apellidos: "+vero.apellidos);
		System.out.println("Nota media: "+vero.notamedia);
		System.out.println("Admitido: "+vero.estaAdmitido);
		
		//hacemos uso del metodo estaAdmitido
		System.out.println("***********************");
		System.out.println("Admitidos:");
		laura.estaAdmitido();
		vero.estaAdmitido();
		

	}

}
