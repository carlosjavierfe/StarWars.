package com.crud.libreria.service;

import com.crud.libreria.model.MovDinero;
import com.crud.libreria.repository.MovDineroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovDineroService {

    @Autowired
    MovDineroRepository movDineroRepository;

    public void crearYActualizarMovDinero(MovDinero movDineros){
        movDineroRepository.save(movDineros);

    }

    public List verMovDinero(){
        List<MovDinero> movDineros = new ArrayList<MovDinero>();
        movDineros.addAll(movDineroRepository.findAll());
        return movDineros;


    }

    public void eliminarMovDinero(Long id){
        movDineroRepository.deleteById(id);


    }

}
