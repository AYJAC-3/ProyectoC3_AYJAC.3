package com.Udea.ciclo3;

import com.Udea.ciclo3.Domain.Empleado;
import com.Udea.ciclo3.Domain.Empresa;
import com.Udea.ciclo3.Domain.MovimientoDinero;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(exclude ={SecurityAutoConfiguration.class})
public class Ciclo3Application {


	@GetMapping(path = "/udea/mintic/program/spring01",produces = "application/json")
	public String enviandoTodo() {
		Empresa empresa01 = new Empresa();
		empresa01.setNombre("Supermercado Lucy");
		empresa01.setDireccion("Calle 33 # 23-12 Tulua - Valle del cauca");
		empresa01.setTelefono("6024653099");
		empresa01.setNIT("800.143.-5");


		Empleado empleado01 = new Empleado();
		empleado01.setNombreEmpleado("Diego Florez");
		empleado01.setCorreoEmpleado("D.florez@gmail.com");
		empleado01.setEmpresaPertenece(empresa01);
		empleado01.setRolEmpleado("Administrador");

		MovimientoDinero movimientoDinero = new MovimientoDinero();
		movimientoDinero.setMontoMovimiento(150000);
		movimientoDinero.setConceptoMovimiento("Pago a proveedores");
		movimientoDinero.setEmpleadoEncargado(empleado01);

		return movimientoDinero.toString();
	}


	public static void main(String[] args) {
		SpringApplication.run(Ciclo3Application.class, args);
	}

}
