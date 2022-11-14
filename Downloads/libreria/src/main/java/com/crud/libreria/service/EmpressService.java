package com.crud.libreria.service;

import com.crud.libreria.model.Empress;
import com.crud.libreria.repository.EmpressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpressService {

    @Autowired
    EmpressRepository empressRepository;

    public void crearYActualizarEmpress(Empress empress){
        empressRepository.save(empress);

    }

    public List verEmpress(){
        List<Empress> empresses = new ArrayList<Empress>();
        empresses.addAll(empressRepository.findAll());
        return empresses;


    }

    public void eliminarEmpress(Long id){
        empressRepository.deleteById(id);


    }


}
