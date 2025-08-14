package com.example;

public class Puerta {

    private String color;
    private int numeroPartes;
    private boolean cerradura;
    private String tipoCerradura;
    private double peso;
    private String material;

    public Puerta(String color, int numeroPartes, boolean cerradura, String tipoCerradura, double peso,
            String material) {

        this.color = color;
        this.numeroPartes = numeroPartes;
        this.cerradura = cerradura;
        this.tipoCerradura = tipoCerradura;
        this.peso = peso;
        this.material = material;

    }

    @Override
    public String toString() {
        return "Puerta [color=" + color + ", numeroPartes=" + numeroPartes + ", cerradura=" + cerradura
                + ", tipoCerradura=" + tipoCerradura + ", peso=" + peso + ", material=" + material + "]";
    }

    public boolean getCerradura() {

        return cerradura;
    }

    public double getPeso() {

        return peso;
    }

    public void setColor(String color) {

        this.color = color;

    }

    public void setTipoCerradura() {

        this.tipoCerradura = tipoCerradura;

    }

    public void abrir() {
        if (cerradura == true) {
            System.out.println("La puerta se puede abrir con llave.");
        } else if (cerradura == false) {
            System.out.println("Debes buscar un cerrajero para que te ayude a abrir la puerta. ");
        }
    }

    public void pintar() {

        if ((color.equals("translucido")) || (color.equals("gris"))) {
            System.out.println("La puerta esta pintada.");
        } else {
            System.out.println("Hay que pintar la puerta. ");
        }
    }

}
