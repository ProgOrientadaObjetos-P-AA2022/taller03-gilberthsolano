/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_2;

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
        EquivalenteHora eh= new EquivalenteHora();
        double hora=48;
        double dia;
        double minutos;
        double segundos;
        
        eh.establecerHora(hora);
        eh.calcularDia();
        eh.calcularMinutos();
        eh.calcularSegundos();
        
         System.out.printf("Equivalente hora\n"
                 + "\n Hora: %.2f\n Dia: %.2f\n Minutos: "
                + "%.2f\n Segundos: %.2f", eh.obtenerHora(), eh.obtenerDia(), eh.obtenerMinutos(), eh.obtenerSegundos());
    }
    
}
