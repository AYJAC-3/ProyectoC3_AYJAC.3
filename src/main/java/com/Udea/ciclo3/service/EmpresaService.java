package com.Udea.ciclo3.service;

import com.Udea.ciclo3.Domain.Empresa;
import com.Udea.ciclo3.repo.EmpresaAYJAC3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
//Le decimos a Spring que esta clase es de servicios

@RestController
public class EmpresaService {

    @Autowired //Conectamos esta clase con repositorio de Empresa
    EmpresaAYJAC3 empresaAYJAC3; //Creamos objeto tipo empresaAYJAC3 para poder usar los metodos que dicha clase hereda

    //Metodo que retornará la lista de empresas usando metodos heredados del jpaAYJAC3
    public List<Empresa> getAllEmpresas(){
        List<Empresa> empresaList = new ArrayList<>();
        empresaAYJAC3.findAll().forEach(empresa -> empresaList.add(empresa));//Recorremos el iterable que regresa el metodo findAll del Jpa y la guardamos en lista
        return empresaList;
    }

    //Metodo que me trae un objeto de tipo Empresa cuando cuento con el id de la misma
    public Empresa getEmpresaById(Integer id){
        return empresaAYJAC3.findById(id).get();
    }

    //Metodo para guardar o actualizar objetos de tipo Empresa
    public boolean saveOrUpdateEmpresa(Empresa empresa){
        Empresa emp = empresaAYJAC3.save(empresa);
        if (empresaAYJAC3.findById(emp.getId())!=null){
            return true;
        }
        return false;
    }
}
