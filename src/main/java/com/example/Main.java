package com.example;

public class Main {
    public static void main(String[] args) {
        

        Planta planta1= new Planta("Aloe vera", "Suculenta", true, 60, 10, 0.2);
        Planta planta2= new Planta("Petunia", "Petunia", true, 20, 30, 0.5);
        Puerta puerta1=new Puerta("Translucido", 2, true, "Analoga", 10, "vidrio");
        Puerta puerta2=new Puerta("gris", 1, true, "electronica", 20, "hibrido");
        Ascensor ascensor1= new Ascensor(10, 10, "aluminio", 1000, "electrica", "Schindler");
        Ascensor ascensor2=new Ascensor(7, 28, "aluminio", 750, "hidraulica", "Mitsubishi");




        planta1.getGenero();
        planta1.toString();
        planta1.setNumeroHojas(20);


    }

}






    