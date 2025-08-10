package com.example;

public class Ascensor {

    private int capacidadPersonas;
    private int numeroBotones;
    private String materiales;
    private int peso;
    private String traccion;
    private String marca;


    

    public Ascensor(int capacidadPersonas,int numeroBotones,String materiales,int peso,String tipo,String marca){

        this.capacidadPersonas=capacidadPersonas;
        this.numeroBotones=numeroBotones;
        this.materiales=materiales;
        this.peso=peso;
        this.traccion=traccion;
        this.marca=marca;
    }


    @Override
    public String toString() {
        return "Ascensor [capacidadPersonas=" + capacidadPersonas + ", numeroBotones=" + numeroBotones + ", materiales="
                + materiales + ", peso=" + peso + ", traccion=" + traccion + ", marca=" + marca + "]";
    }


    public String getMateriales() {
        return materiales;
    }


    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }


    public String getTraccion() {
        return traccion;
    }


    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }



}
