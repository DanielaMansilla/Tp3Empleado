package ar.edu.unlam.pb2.empresa;

public abstract class Empleado {

	protected String nombre;
	protected Double sueldo;
	protected String fechaCumpleanios;

	public Empleado(String nombre, Double sueldo, String fechaCumpleanios) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.fechaCumpleanios = fechaCumpleanios;
	}

	public abstract String brindarDetalles();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getSueldo() {
		return sueldo;
	}

	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}

	public String getFechaCumpleanios() {
		return fechaCumpleanios;
	}

	public void setFechaCumpleanios(String fechaCumpleanios) {
		this.fechaCumpleanios = fechaCumpleanios;
	}

}
