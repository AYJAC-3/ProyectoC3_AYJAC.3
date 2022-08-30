package com.Udea.ciclo3.repo;

import com.Udea.ciclo3.Domain.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository  //Anotacion que le dice a SPrint que esta clase es un repositorio
public interface EmpresaAYJAC3 extends JpaRepository<Empresa, Integer> {
}
