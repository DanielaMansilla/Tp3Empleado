package ar.edu.unlam.pb2.empresa;

public class Gerente extends Empleado {

	protected String cochera;

	public Gerente(String nombre, Double sueldo, String fechaCumpleanios, String cochera) {
		super(nombre, sueldo, fechaCumpleanios);
		this.cochera = cochera;
	}

	@Override
	public String brindarDetalles() {
		return "La gerente se llama: " + nombre + "su sueldo es de " + sueldo + "y su fecha de cumpleaños es el "
				+ fechaCumpleanios + "su cochera es: " + cochera;
	}

}
