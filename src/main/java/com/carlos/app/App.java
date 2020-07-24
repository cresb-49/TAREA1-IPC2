package com.carlos.app;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Se ejecuto el programa");
        Logica analisis = new Logica();
        /*
        String cadena1 = "ATGTCTTCCTCGA";
        String cadena2 = "TGCTTCCTATGAC";
        */
        
        String cadena2 = "ctgactga";
        String cadena1 = "actgagc";
        
        /*
        String cadena2 = "cgtaattgcgat";
        String cadena1 = "cgtacagtagc";
        */
        
        
        analisis.analisisDeDatos(cadena1, cadena2);

    }
}
