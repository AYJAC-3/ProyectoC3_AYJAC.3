package com.Udea.ciclo3.controller;

import com.Udea.ciclo3.Domain.Empresa;
import com.Udea.ciclo3.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
import java.util.List;

@Controller
public class ControllerFull {
    @Autowired
    EmpresaService empresaService;

    @GetMapping ({"/","/verEmpresas"})
    public String viewEmpresas(Model model){
        List<Empresa> ListaEmpresa = empresaService.getAllEmpresas();
        model.addAttribute(  "emplist",ListaEmpresa);
        return  "verEmpresas";
    }
}
