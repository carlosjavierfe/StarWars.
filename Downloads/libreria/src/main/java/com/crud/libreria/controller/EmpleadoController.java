package com.crud.libreria.controller;

import com.crud.libreria.model.Empleado;
import com.crud.libreria.model.Empress;
import com.crud.libreria.service.EmpleadoService;
import com.crud.libreria.service.EmpressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;

    @GetMapping("/empleado")
    private List<Empleado> verEmleado(){
        return empleadoService.verEmpleado();

    }

    @PostMapping("/empleado")
    private void crearYActualizarEmpleado(@RequestBody Empleado empleados){
        empleadoService.crearYActualizarEmpleado(empleados);

    }

    @DeleteMapping("/empleado/{id}")
    private void eliminarEmpleado(@PathVariable("id") long id){
        empleadoService.eliminarEmpleado(id);
    }

    @PutMapping("/empleado")
    private void editarEmpleado(@RequestBody Empleado empleados){
        empleadoService.crearYActualizarEmpleado(empleados);
    }
}
