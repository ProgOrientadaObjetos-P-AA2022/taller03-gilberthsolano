/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema_1;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class Terreno {

    private double costo_terreno;
    private double ancho;
    private double largo;
    private double area;
    private double valor_Metrocuadrado;

    public void establecerAncho(double c) {
        ancho = c;

    }

    public void establecerLargo(double c) {
        largo = c;
    }

    public void calcularArea() {
        area = largo * ancho;

    }

    public void estableceValor_Metrocuadrado(double c) {
        valor_Metrocuadrado = c;
    }

    public void calcularCostoTerreno() {
        costo_terreno = valor_Metrocuadrado * area;
    }

    public double obtenerAncho() {
        return ancho;
    }

    public double obtenerLargo() {
        return largo;
    }

    public double obtenerArea() {
        return area;
    }

    public double obtenerValor_MetroCuadrado() {
        return valor_Metrocuadrado;
    }

    public double obtenerCostoTerreno() {
        return costo_terreno;
    }

}
