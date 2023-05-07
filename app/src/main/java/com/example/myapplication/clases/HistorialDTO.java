package com.example.myapplication.clases;

public class HistorialDTO {

    private Registrar mascotas;
    private String ruta;

    public Registrar getMascotas() {
        return mascotas;
    }

    public void setMascotas(Registrar mascotas) {
        this.mascotas = mascotas;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
}
