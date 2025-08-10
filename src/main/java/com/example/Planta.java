package com.example;

public class Planta {

    private String nombre;
    private String genero;
    private boolean floracion;
    private int tamano;
    private int numeroHojas;
    private double cantidadAgua;

    public Planta(String nombre, String genero, boolean floracion, int tamano, int numeroHojas, double cantidadAgua) {

        this.nombre = nombre;
        this.genero = genero;
        this.floracion = floracion;
        this.tamano = tamano;
        this.numeroHojas = numeroHojas;
        this.cantidadAgua = cantidadAgua;

    }

    @Override
    public String toString() {
        return "Planta [nombre=" + nombre + ", genero=" + genero + ", floracion=" + floracion + ", tamano=" + tamano
                + ", numeroHojas=" + numeroHojas + ", cantidadAgua=" + cantidadAgua + "]";
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNumeroHojas(int numeroHojas) {
        this.numeroHojas = numeroHojas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void florecer() {

        if (floracion == true) {

            System.out.println("La planta floreció.");

        } else if (floracion == false) {

            System.out.println("La planta aún no florece.Debe abonarla o esperar la temporada de floración. ");
        }
    }

    public void regar() {

        if (cantidadAgua < 0) {

            System.out.println("A la planta le falta humedad, debes regarla en las próximas 24 hrs.");

        } else if (cantidadAgua > 250) {
            System.out.println("La planta tiene suficiente humedad. Espera 2 dias más para volver a regarla. ");
        }
    }

}
