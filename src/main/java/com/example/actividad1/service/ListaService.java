package com.example.actividad1.service;

import com.example.actividad1.model.ListaCanciones;

import java.util.List;

public interface ListaService {

    public ListaCanciones create(ListaCanciones c);
    public ListaCanciones save(ListaCanciones casa);
    public ListaCanciones findById(Integer id);
    public List<ListaCanciones> findByAll();
    public void eliminar(Integer id);


}
