package com.example.actividad1.service;


import com.example.actividad1.model.ListaCanciones;
import com.example.actividad1.repository.ListaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListaServiceImpl implements ListaService {
    @Autowired
    ListaRepository listaRepository;


    @Override
    public ListaCanciones create(ListaCanciones c) {
        return listaRepository.save(c);
    }

    @Override
    public ListaCanciones save(ListaCanciones c) {
        return listaRepository.save(c);
    }

    @Override
    public ListaCanciones findById(Integer id) {
        return listaRepository.findById(id).orElse(new ListaCanciones());
    }

    @Override
    public List<ListaCanciones> findByAll() {
        return listaRepository.findAll();
    }


    @Override
    public void eliminar(Integer id) {
        listaRepository.deleteById(id);
    }



}
