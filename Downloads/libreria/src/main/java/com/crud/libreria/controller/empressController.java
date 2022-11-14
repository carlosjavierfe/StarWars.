package com.crud.libreria.controller;


import com.crud.libreria.model.Empress;
import com.crud.libreria.service.EmpressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class empressController {

    @Autowired
    EmpressService empressService;

    @GetMapping("/empress")
    private List<Empress> verEmpress(){
        return empressService.verEmpress();

    }


    @PostMapping("/empress")
    private void crearYActualizarEmpress(@RequestBody Empress empress){
        empressService.crearYActualizarEmpress(empress);

    }

    @DeleteMapping("/empress/{id}")
    private void eliminarEmpress(@PathVariable("id") long id){
        empressService.eliminarEmpress(id);
    }

    @PutMapping("/empress")
    private void editarEmpresa(@RequestBody Empress empress){
        empressService.crearYActualizarEmpress(empress);
    }

}
