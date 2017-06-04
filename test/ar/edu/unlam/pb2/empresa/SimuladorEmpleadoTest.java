package ar.edu.unlam.pb2.empresa;

import org.junit.Assert;
import org.junit.Test;

public class SimuladorEmpleadoTest {

		@Test
		public void testQueCreeUnaSecretariayNoSupereNingunTopeDeImpuesto() {
			Secretaria secretaria1 = new Secretaria("Ana Laura", 15000.0, "3 de agosto");
			ServicioImpuesto servimpuesto = new ServicioImpuesto();
			Double impuesto = servimpuesto.obtenerImpuesto(secretaria1);
			Double impuestoEsperado = 0.0;
			Assert.assertEquals(impuesto, impuestoEsperado);

		}

		@Test
		public void testQueCreeUnIngenieroYqueTengaElImpuesto10porciento() {
			Ingeniero ingeniero1 = new Ingeniero("Roberto Giles", 26000.0, "5 de septiembre");
			ServicioImpuesto servimpuesto = new ServicioImpuesto();
			Double impuesto = servimpuesto.obtenerImpuesto(ingeniero1);
			Double impuestoEsperado = 2600.0;
			Assert.assertEquals(impuesto, impuestoEsperado);
		}

		@Test
		public void testQueCreeUnGerenteYqueTengaElImpuesto15porciento() {
			Gerente gerente1 = new Gerente("Mario Dimitri", 35100.0, "25 de diciembre", "Cochera las Marías");
			ServicioImpuesto servimpuesto = new ServicioImpuesto();
			Double impuesto = servimpuesto.obtenerImpuesto(gerente1);
			Double impuestoEsperado = 5265.0;
			Assert.assertEquals(impuesto, impuestoEsperado);
		}

		@Test
		public void testQueCreeUnDirectorYqueTengaElImpuesto30porciento() {
			Director director1 = new Director("Geral Luchetti", 54000.0, "30 de noviembre", "Cochera las Marías", 100.0);
			ServicioImpuesto servimpuesto = new ServicioImpuesto();
			Double impuesto = servimpuesto.obtenerImpuesto(director1);
			Double impuestoEsperado = 16200.0;
			Assert.assertEquals(impuesto, impuestoEsperado);
		}

	}


