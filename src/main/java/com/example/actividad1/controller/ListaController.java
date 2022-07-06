package com.example.actividad1.controller;

import com.example.actividad1.model.ListaCanciones;
import com.example.actividad1.service.ListaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/casa")
public class ListaController {

    @Autowired
    ListaService listaService;

    @GetMapping("/listar")
    public ResponseEntity<List<ListaCanciones>>listar() {

      List<ListaCanciones> lista= listaService.findByAll();
      return new ResponseEntity<>(lista,HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<ListaCanciones> crearUsuario(@RequestBody ListaCanciones u) {
      //  u.setCosto_total(calcularCosto(u.getArea()));
        return new ResponseEntity<>(listaService.create(u), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<ListaCanciones> eliminarUsuario(@PathVariable Integer id) {
        listaService.eliminar(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/actualizar/{id}")
    public ListaCanciones actualizarCasa(@PathVariable Integer id, @RequestBody ListaCanciones c) {
        ListaCanciones listaActual = listaService.findById(id);

        ListaCanciones listaca = listaService.findById(id);
        listaActual.setAlbum(c.getAlbum());
        listaActual.setAnio(c.getAnio());
        listaActual.setDescripcion(c.getDescripcion());
        listaActual.setAnio(c.getAnio());
        listaActual.setNombreArtista(c.getNombreArtista());
        return listaService.save(listaActual);
    }

    public ArrayList<ListaCanciones> categorias(@PathVariable String nombre) {

        // Obtener una lista mediante el codigo
        ArrayList<ListaCanciones> lista=listaService.findByCodigo(nombre);

        // Creo un objeto de tipo casa al cual le asigno el valor
        ListaCanciones listcan = listaServicec.findById(lista.get(0).getId());
        listcan.setDescripcion(listcan.getDescripcion());
        listaService.save(listcan);

        //actulizar mi lista
        lista.stream().forEach(c-> c.setDescripcion(listacan.getDescripcion()));

        return lista;
    }
}


}
