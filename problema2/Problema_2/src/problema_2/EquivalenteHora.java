/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema_2;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class EquivalenteHora {
    private double dia;
    private double hora;
    private double minutos;
    private double segundos;
    
    public void establecerHora(double c){
        hora=c;
    }
       public void calcularDia(){
       dia=hora/24;
    }
    public void calcularMinutos(){
        minutos=hora*60;
    }
    public void calcularSegundos(){
        segundos=minutos*60;
    }
    public double obtenerHora(){
        return hora;
    }
    public double obtenerDia(){
        return dia;
    }
    public double obtenerMinutos(){
        return minutos;
    }
    public double obtenerSegundos(){
        return segundos;
    }
    
}
