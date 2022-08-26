package com.emprendedores.UdeaCiclo3.controller;

import com.emprendedores.UdeaCiclo3.Entidades.Empresa;
import com.emprendedores.UdeaCiclo3.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//@RestController
@Controller
public class Controlador {

    @Autowired
    EmpresaService empresaService;

    @GetMapping({"/Empresas","/VerEmpresas"})
    public String viewEmpresas(Model model){
        List<Empresa> listaEmpresas=empresaService.getAllEmpresas();
        model.addAttribute("emplist", listaEmpresas);
        return "verEmpresas";
    }


}
