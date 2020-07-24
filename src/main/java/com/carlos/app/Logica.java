package com.carlos.app;


public class Logica {
    //Constructor vacio del archivo logica
    public Logica(){

    }
    public void analisisDeDatos(String cadena1, String cadena2){
        System.out.println(cadena1);
        System.out.println(cadena2); 
        int posicionDeExtracccion=0;
        String primeraletradelacadena1;
        int posicion = 0;
        int caracter1 = 0;
        int caracter2 = 0;
        int cantidadDeConcidencias=0;
        while(posicionDeExtracccion<cadena1.length()){
            primeraletradelacadena1=String.valueOf(cadena1.charAt(posicionDeExtracccion)); 
            if(cadena2.indexOf(primeraletradelacadena1, posicion)!= -1)
            {
                while(cadena2.indexOf(primeraletradelacadena1, posicion)>-1){
                    caracter2 = cadena2.indexOf(primeraletradelacadena1, posicion);
                    posicion= caracter2+1;
                    if((posicionDeExtracccion+1) < cadena1.length()&&(caracter2+1)<cadena2.length()){
                        int posicionDeComparacion1 = posicionDeExtracccion;
                        int posicionDeComparacion2 = caracter2;
                        while(cadena1.charAt(posicionDeComparacion1)==cadena2.charAt(posicionDeComparacion2)){
                            cantidadDeConcidencias++;
                            if((posicionDeComparacion1+1)<cadena1.length())
                            {
                                posicionDeComparacion1++;
                            }
                            if((posicionDeComparacion2+1)<cadena2.length())
                            {
                                posicionDeComparacion2++;
                            }
                        }
                        if(cantidadDeConcidencias>1){
                            System.out.println("La cantidad de coincidencias es: "+ cantidadDeConcidencias);
                        }
                        cantidadDeConcidencias=0;
                    }
                }
            }
            posicion=0;
            posicionDeExtracccion++;
        }
    }
}