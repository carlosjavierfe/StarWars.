package com.crud.libreria.controller;



import com.crud.libreria.model.MovDinero;
import com.crud.libreria.service.MovDineroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovDineroController {

    @Autowired
    MovDineroService movDineroService;

    @GetMapping("/modDinero")
    private List<MovDinero> verMovDinero(){
        return movDineroService.verMovDinero();

    }


    @PostMapping("/modDinero")
    private void crearYActualizarMovDinero(@RequestBody MovDinero movDinero){
        movDineroService.crearYActualizarMovDinero(movDinero);

    }

    @DeleteMapping("/modDinero/{id}")
    private void eliminarMovDinero(@PathVariable("id") long id){
        movDineroService.eliminarMovDinero(id);
    }

    @PutMapping("/modDinero")
    private void editarMovDinero(@RequestBody MovDinero movDinero){
        movDineroService.crearYActualizarMovDinero(movDinero);
    }
}
