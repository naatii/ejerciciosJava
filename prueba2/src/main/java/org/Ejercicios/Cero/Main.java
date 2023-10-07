package org.Ejercicios.Cero;

public class Main {
    static OperacionesCero ejerciciosBasicos = new OperacionesCero();

    /**
     * Escribe un programa en el que se declaren las variables enteras x e y.
     *  Asignales los valores 144 y 999 respectivamente. A continuación,
     * muestra por pantalla el valor de cada variable, la suma, la resta, la
     * división y la multiplicación.
     */
    public static String ejercicio1() {


        return "La suma es: " + ejerciciosBasicos.suma()+
                "\nLa resta es: " + ejerciciosBasicos.resta()+
                "\nLa división es: " + ejerciciosBasicos.division()+
                "\nLa multiplicación es: " + ejerciciosBasicos.multiplicacion()+"\n";

    }
    /**
     * Ejercicio 2: Crea la variable nombre y asígnale tu nombre completo. Muestra su
     * valor por pantalla de tal
     * forma que el resultado del programa sea el mismo que en el ejercicio 1 del capítulo
     * 1.
     * **/
    public static  String ejercicio2(){

        return ejerciciosBasicos.imprimirNombre();
    }
    /**
     * Crea las variables nombre, direccion y telefono y asígnale los valores corres-
     * pondientes. Muestra los valores de esas variables por pantalla de tal forma
     * que el resultado del programa sea el mismo que en el ejercicio 2.
     * **/
    public static String ejercicio3(){

        return ejerciciosBasicos.imprimirDatos();
    }
    /**
     * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
     * convertir deberá estar almacenada en una variable.
     * **/
    public static String ejercicio4(){

        return "La cantidad convertida es de: "+ejerciciosBasicos.conversionDeEurosAPesetas();
    }
    /**
     * Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
     * convertir deberá estar almacenada en una variable.
     * **/
    public static String ejercicio5(){
        return "La cantidad convertida es: "+ejerciciosBasicos.conversionDePesetasAEuros();
    }
    /**
     * Escribe un programa que calcule el total de una factura a partir de la base
     * imponible (precio sin IVA). La base imponible estará almacenada en una
     * variable.
     * **/
    public static String ejercicio6(){
        return "El precio con iva es de: "+ejerciciosBasicos.calculoTotalFactura();
    }

    public static void main(String[] args) {
        System.out.println("El ejercicio 1: \n"+ejercicio1());
        System.out.println("-----------------------------------");
        System.out.println("El ejercicio 2: \n"+ejercicio2()+"\n");
        System.out.println("-----------------------------------");
        System.out.println("El ejercicio 3: \n"+ejercicio3()+"\n");
        System.out.println("-----------------------------------");
        System.out.println("El ejercicio 4: \n"+ejercicio4()+"\n");
        System.out.println("-----------------------------------");
        System.out.println("El ejercicio 5: \n"+ejercicio5()+"\n");
        System.out.println("-----------------------------------");
        System.out.println("El ejercicio 6: \n"+ejercicio6()+"\n");
    }
}