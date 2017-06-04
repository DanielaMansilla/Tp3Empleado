package ar.edu.unlam.pb2.empresa;

public class Secretaria extends Empleado {

	public Secretaria(String nombre, Double sueldo, String fechaCumpleanios) {
		super(nombre, sueldo, fechaCumpleanios);

	}

	@Override
	public String brindarDetalles() {
		return "La secretaria se llama: " + nombre + "su sueldo es de " + sueldo + "y su fecha de cumpleaños es el "
				+ fechaCumpleanios;
	}

}
