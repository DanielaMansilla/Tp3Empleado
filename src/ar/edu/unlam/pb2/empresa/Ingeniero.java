package ar.edu.unlam.pb2.empresa;

public class Ingeniero extends Empleado {

	public Ingeniero(String nombre, Double sueldo, String fechaCumpleanios) {
		super(nombre, sueldo, fechaCumpleanios);

	}

	@Override
	public String brindarDetalles() {
		return "El ingeniero se llama: " + nombre + "su sueldo es de " + sueldo + "y su fecha de cumpleaños es el "
				+ fechaCumpleanios;
	}

}
