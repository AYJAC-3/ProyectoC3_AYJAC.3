package com.Udea.ciclo3;

import com.Udea.ciclo3.Domain.Empleado;
import com.Udea.ciclo3.Domain.Empresa;
import com.Udea.ciclo3.Domain.MovimientoDinero;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication(exclude ={SecurityAutoConfiguration.class})
public class Ciclo3Application {


	@GetMapping(path = "/udea/mintic/program/spring01",produces = "application/json")
	public String enviandoTodo() {
		Empresa empresa01 = new Empresa();
		empresa01.setNombre("AYJAC.3");
		empresa01.setDireccion("Calle UdeA ciclo3");
		empresa01.setTelefono("222444666");
		empresa01.setNIT("800.143.-5");


		Empleado empleado01 = new Empleado();
		empleado01.setNombreEmpleado("Cristian Gomez");
		empleado01.setCorreoEmpleado("crgomeza1@poligran.edu.co");
		empleado01.setEmpresaPertenece(empresa01);
		empleado01.setRolEmpleado("Programador - Scrum Master");

		MovimientoDinero movimientoDinero = new MovimientoDinero();
		movimientoDinero.setMontoMovimiento(250000);
		movimientoDinero.setConceptoMovimiento("Pago a proveedores");
		movimientoDinero.setEmpleadoEncargado(empleado01);

		return movimientoDinero.toString();
	}


	public static void main(String[] args) {
		SpringApplication.run(Ciclo3Application.class, args);
	}

}
