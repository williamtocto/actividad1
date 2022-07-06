package com.example.actividad1.repository;


import com.example.actividad1.model.ListaCanciones;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListaRepository extends JpaRepository<ListaCanciones, Integer> {
    ListaCanciones findListaCancionesBy(String codigo);
}
