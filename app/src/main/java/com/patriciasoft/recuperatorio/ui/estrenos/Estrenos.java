package com.patriciasoft.recuperatorio.ui.estrenos;

import java.io.Serializable;

public class Estrenos implements Serializable {
    private String titulo;

    private String duracion;

    private String director;

    private String anio;

    public Estrenos(String titulo, String duracion, String director, String anio) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.director = director;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }
}




