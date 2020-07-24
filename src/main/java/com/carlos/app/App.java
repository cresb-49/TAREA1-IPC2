package com.carlos.app;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Se ejecuto el programa");
        Logica analisis = new Logica();
        String cadena1 = "ATGTCTTCCTCGA";
        String cadena2 = "TGCTTCCTATGAC";
        analisis.analisisDeDatos(cadena1, cadena2);

    }
}
