package com.crud.libreria.service;


import com.crud.libreria.model.Empleado;
import com.crud.libreria.model.Empress;
import com.crud.libreria.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpleadoService {

    @Autowired
    EmpleadoRepository empleadoRepository;

    public void crearYActualizarEmpleado(Empleado empleado){
        empleadoRepository.save(empleado);

    }

    public List verEmpleado(){
        List<Empleado> empleados = new ArrayList<Empleado>();
        empleados.addAll(empleadoRepository.findAll());
        return empleados;


    }



    public void eliminarEmpleado(Long id){
        empleadoRepository.deleteById(id);


    }

}
