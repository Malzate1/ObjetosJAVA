package com.example;

public class Planta {

    private String nombre;
    private String genero;
    private boolean floracion ;
    private int tamano;
    private int numeroHojas;
    private double cantidadAgua;


    
    public Planta(String nombre,String genero,boolean floracion,int tamano,int numeroHojas,double cantidadAgua){

        this.nombre=nombre;
        this.genero=genero;
        this.floracion=floracion;
        this.tamano=tamano;
        this.numeroHojas=numeroHojas;
        this.cantidadAgua=cantidadAgua;

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




}
