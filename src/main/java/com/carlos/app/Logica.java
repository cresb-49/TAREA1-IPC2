package com.carlos.app;


public class Logica {
    //Constructor vacio del archivo logica
    static int SecuanciaResultante="";
    static int numeroDeConcidencias=0;
    public Logica(){

    }
    public void analisisDeDatos(String cadena1, String cadena2){
        System.out.println(cadena1);
        System.out.println(cadena2); 
        int posicionDeExtracccion=0;
        String primeraletradelacadena1;
        int posicion = 0;
        int caracter2 = 0;
        int cantidadDeConcidencias=0;
        int posicionDeComparacion1=0;
        int posicionInicial1=0;
        int posicionDeComparacion2=0;
        int posicionInicial2=0;

        while(posicionDeExtracccion<cadena1.length()){
            primeraletradelacadena1=String.valueOf(cadena1.charAt(posicionDeExtracccion)); 
            if(cadena2.indexOf(primeraletradelacadena1, posicion)!= -1)
            {
                while(cadena2.indexOf(primeraletradelacadena1, posicion)>-1){
                    caracter2 = cadena2.indexOf(primeraletradelacadena1, posicion);
                    posicion= caracter2+1;
                    if((posicionDeExtracccion+1) < cadena1.length()&&(caracter2+1)<cadena2.length()){
                        posicionInicial1=posicionDeExtracccion;
                        posicionInicial2=caracter2;
                        posicionDeComparacion1 = posicionDeExtracccion;
                        posicionDeComparacion2 = caracter2;
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
                            if(posicionDeComparacion1<cadena1.length())
                            {
                                int incio = posicionInicial1;
                                int fin = posicionDeComparacion1;
                                this.extraerTexto(cadena1, inicio, fin);
                                System.out.println("Inicio de la coincidencia: "+posicionInicial1+ " fin de la coincidencia: "+posicionDeComparacion1);
                            }
                            else{
                                int incio = posicionInicial1;
                                int fin = posicionDeComparacion1-1;
                                this.extraerTexto(cadena1, inicio, fin);
                                System.out.println("Inicio de la coincidencia: "+posicionInicial1+ " fin de la coincidencia: "+(posicionDeComparacion1-1));
                            }
                        }
                        cantidadDeConcidencias=0;
                    }
                }
            }
            posicion=0;
            posicionDeExtracccion++;
        }
    }
    private static String extraerTexto(String cadena, int inicio, int fin){
        String temporal="";
        char []temporalLetras = new char[(fin-inicio)+1];
        int contador=0;
        //extraccion de caracteres en los limites descritos
        for (int i = inicio; i <= fin; i++) {
            temporalLetras[contador]=cadena.charAt(i);
            contador++;
        }
        //converscion de la cadena a un String
        temporal=String.valueOf(temporalLetras);
        return temporal;
    }
    
}