/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_1;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Terreno t = new Terreno();
        double ancho = 50.8;
        double largo = 40.8;
        double area ;
        double valor_Metrocuadrado = 20;
        double costo_terreno;

        t.establecerAncho(ancho);
        t.establecerLargo(largo);
        t.estableceValor_Metrocuadrado(valor_Metrocuadrado);

        t.calcularArea();
        t.calcularCostoTerreno();

        System.out.printf("Calcular costo terreno\n\nAncho: %.2f\nLargo: %.2f\nArea: "
                + "%.2f\nValor Metro Cuadrado: %.2f\n Costo Terreno: %.2f\n", t.obtenerAncho(), t.obtenerLargo(), t.obtenerArea(),
                t.obtenerValor_MetroCuadrado(), t.obtenerCostoTerreno());

    }

}
