package org.Ejercicios.Uno;

import org.Ejercicios.Cero.OperacionesCero;
import java.util.Scanner;

public class Main {
    static Scanner leer = new Scanner(System.in);
    static OperacionesUno operacionesUno = new OperacionesUno();
    static OperacionesCero operacionesCero = new OperacionesCero();

    public static String Ejercicio1() {
        System.out.println("Escribe el primer número: ");
        int numero1 = leer.nextInt();
        System.out.println("Escribe el segundo número: ");
        int numero2 = leer.nextInt();

        return operacionesUno.Multiplicacion(numero1, numero2);
    }
    public static Float Ejercicio2(){
        return operacionesCero.conversionDeEurosAPesetas();
    }
    public static double Ejercicio3(){
        return operacionesCero.conversionDePesetasAEuros();
    }

    public static String Ejercicio4(){
        System.out.println("Escribe el primer número: ");
        int numero1 = leer.nextInt();
        System.out.println("Escribe el segundo número: ");
        int numero2 = leer.nextInt();

        return operacionesUno.Calculadora(numero1, numero2);
    }
    public static int Ejercicio5(){
        System.out.println("Escribe el primer número: ");
        int base = leer.nextInt();
        System.out.println("Escribe el segundo número: ");
        int altura = leer.nextInt();

        return operacionesUno.AreaRectangulo(base, altura);
    }
    public static int Ejercicio6(){
        System.out.println("Escribe el primer número: ");
        int base = leer.nextInt();
        System.out.println("Escribe el segundo número: ");
        int altura = leer.nextInt();

        return operacionesUno.AreaTriangulo(base, altura);
    }
    public static double Ejercicio7(){
        System.out.println("Escribe el importe neto: ");
        float importeNeto = leer.nextFloat();
        return operacionesUno.ImporteTotal(importeNeto);
    }

    public static void main (String[] args){
        System.out.println("El ejercicio 1: \n"+Ejercicio1());
        System.out.println("-----------------------------------");
        System.out.println("El ejercicio 2: \n"+Ejercicio2());
        System.out.println("-----------------------------------");
        System.out.println("El ejercicio 3: \n"+Ejercicio3());
        System.out.println("-----------------------------------");
        System.out.println("El ejercicio 4: \n"+Ejercicio4());
        System.out.println("-----------------------------------");
        System.out.println("El ejercicio 5: \n"+Ejercicio5());
        System.out.println("-----------------------------------");
        System.out.println("El ejercicio 6: \n"+Ejercicio6());
        System.out.println("-----------------------------------");
        System.out.println("El ejercicio 7: \n"+Ejercicio7());
        System.out.println("-----------------------------------");

    }
}
