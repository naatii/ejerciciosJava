package org.Ejercicios.Uno;

public class OperacionesUno {
    public String Multiplicacion(int numero1, int numero2){
        return String.format("El resultado de %d x %d es %d", numero1, numero2, numero1*numero2);
    }
    public String Calculadora(int numero1, int numero2){
        int suma = numero1+numero2;
        int resta = numero1-numero2;
        int multiplicacion = numero1*numero2;
        int division = numero1/numero2;
        return suma + "\n" + resta + "\n" + multiplicacion +"\n"+ division;
    }
    public int AreaRectangulo(int base, int altura){
        return base*altura;
    }
    public int AreaTriangulo(int base, int alutra){
        int numeroDividido = 2;

        return (base*alutra)/numeroDividido;
    }
    public double ImporteTotal(double importeNeto){
        int iva = 21;

        return (importeNeto * 21)/100 + importeNeto;
    }
}
