package ar.edu.unlam.pb2.empresa;

public class Director extends Empleado {

	protected String cochera;
	protected Double gastoVehiculo;

	public Director(String nombre, Double sueldo, String fechaCumpleanios, String cochera, Double gastoVehiculo) {
		super(nombre, sueldo, fechaCumpleanios);
		this.cochera = cochera;
		this.gastoVehiculo = gastoVehiculo;

	}

	@Override
	public String brindarDetalles() {
		this.sueldo = sueldo + gastoVehiculo;
		return "El director de la empresa se llama: " + nombre + "su sueldo es de " + sueldo
				+ "y su fecha de cumpleaños es el " + fechaCumpleanios + "su cochera es: " + cochera;
	}

}
