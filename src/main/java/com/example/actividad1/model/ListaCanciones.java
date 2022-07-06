

package com.example.actividad1.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "lista")


public class ListaCanciones implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    @Column(name = "titulo")
    private String titulo;

    @Basic(optional = false)
    @Column(name = "nombreArtista")
    private String nombreArtista;

    @Column(name = "album")
    private double album;


    @Column(name = "descripcion")
    private String descripcion;


    @Column(name = "anio")
    private int anio;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public double getAlbum() {
        return album;
    }

    public void setAlbum(double album) {
        this.album = album;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
