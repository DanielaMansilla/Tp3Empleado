package ar.edu.unlam.pb2.empresa;

public class ServicioImpuesto {

	public Double obtenerImpuesto(Empleado empleado) {

	
		Double sueldo = empleado.getSueldo();
		if (sueldo > 50000) {

			return sueldo * 0.30;

		} else if (sueldo > 30000) {

			return sueldo * 0.15;

		} else if (sueldo > 25000) {

			return sueldo * 0.10;

		} else
			return 0.0;

	}
}
