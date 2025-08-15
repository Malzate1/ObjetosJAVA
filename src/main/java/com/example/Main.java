package com.example;

public class Main {
    public static void main(String[] args) {

        Planta planta1 = new Planta("Aloe vera", "Suculenta", true, 60, 10, 0.2);
        Planta planta2 = new Planta("Petunia", "Petunia", true, 20, 30, 0.5);
        Puerta puerta1 = new Puerta("Translucido", 2, true, "Analoga", 10, "vidrio");
        Puerta puerta2 = new Puerta("gris", 1, true, "electronica", 20, "hibrido");
        Ascensor ascensor1 = new Ascensor(10, 10, "aluminio", 1000, "electrica", "Schindler");
        Ascensor ascensor2 = new Ascensor(7, 28, "aluminio", 750, "hidraulica", "Mitsubishi");

        System.out.println(planta1.getGenero());
        System.out.println(planta1.toString());
        planta1.setNumeroHojas(15);
        planta1.florecer();

        System.out.println(planta2.getGenero());
        System.out.println(planta2.toString());
        planta2.setNumeroHojas(20);
        planta2.florecer();

        System.out.println(puerta1.getPeso());
        System.out.println(puerta1.toString());
        puerta1.setTipoChapa("Hidraulica");
        puerta1.pintar();
        System.out.println(puerta2.getPeso());
        System.out.println(puerta2.toString());
        puerta2.setTipoChapa("Analoga");
        puerta2.pintar();

        System.out.println(ascensor1.getMateriales());
        System.out.println(ascensor1.toString());
        ascensor1.setTraccion("hidraulica");
        ascensor1.abrir();

        System.out.println(ascensor2.getMateriales());
        System.out.println(ascensor2.toString());
        ascensor2.setTraccion("electronica");
        ascensor2.abrir();

    }

}
