package org.Ejercicios.Cero;
import java.util.Scanner;

/**
 * The type OperacionesCero.
 */
public class OperacionesCero {

    /**
     * The X: es la variable x que se usa para realizar las operaciones del ejercicio 1.
     */
    int x = 144;
    /**
     * The Y: es la 2ª variable que se utiliza en las operaciones del ejercicio 1.
     */
    int y = 999;
    /**
     * The Nombre: El nombre para el 2º ejercicio.
     */
    String nombre = "Natalia cortés bernal";
    /**
     * The Direccion: Dirección usada para el ejercicio 3.
     */
    String direccion = "calle mil amores 12 1ºb";
    /**
     * The Telefono: Usado también par el ejercicio 3.
     */
    String telefono = "+34 123121232";


    /**
     * Suma int.
     *  Realiza la suma de x e y
     *
     * @return the int: resultado de x + y
     */
    public int suma(){
        return x+y;
    }

    /**
     * Resta int.
     *
     * @return the int
     */
    public int resta(){
        return x-y;
    }

    /**
     * Division int.
     *
     * @return the int
     */
    public int division(){
        return x/y;
    }

    /**
     * Multiplicacion int.
     *
     * @return the int
     */
    public int multiplicacion(){
        return x*y;
    }

    /**
     * Imprimir nombre string.
     *
     * @return the string
     */
    public String imprimirNombre() { return nombre; }

    /**
     * Imprimir datos string.
     *
     * @return the string
     */
    public String imprimirDatos() { return "Nombre: "+nombre+ "\nDirección: " + direccion+
            "\nTeléfono: " + telefono; }

    /**
     * Conversion de euros a pesetas float.
     *
     * @return the float
     */
    public float conversionDeEurosAPesetas() {
        float pesetas = 166.386F;
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce una cantidad en euros: ");
        int euros = leer.nextInt();
        return Math.round(euros * pesetas);
    }

    /**
     * Conversion de pesetas a euros double.
     *
     * @return the double
     */
    public double conversionDePesetasAEuros() {
        float pesetas = 166.386F;
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce una cantidad en pesetas: ");
        int pesetasAConvertir = leer.nextInt();
        System.out.println(pesetasAConvertir);
        return (Math.round(pesetasAConvertir/pesetas*1000.0) /1000.0);
    }

    /**
     * Calculo total factura float.
     *
     * @return the float
     */
    public float calculoTotalFactura(){
        int iva = 21;
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduce la base sin iva: ");
        int base = leer.nextInt();
        return ((float) (base * iva) /100)+base;
    }
}
