/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema_4;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class EquipoCelulares {
     private String sitemaOperativo;
    private String tamanioPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private double ivaCostoInicial;
    private double costoFinal;
    private String direccionMac;
    private String ime;
    
    public void establecerSistemaOperativo(String c){
        sitemaOperativo=c;
        
    }
    public void establecerTamanioPantalla(String c){
        tamanioPantalla=c;
    }
    public void establecerCostoInicial(double c){
        costoInicial=c;
    }
    public void estableceIvaPorcentaje( double c){
        ivaPorcentaje=c;
    }
    
    public void calcularIvaCostoInicial(){
        ivaCostoInicial=costoInicial*ivaPorcentaje/100;
             
    }
    
    public void calcularCostoFinal( ){
        costoFinal =costoInicial+ivaCostoInicial;
      
    }
    public void establecerDireccionMac(String c){
        direccionMac=c;
    }
    public void establecerImei(String c){
        ime=c;
    }
    public String obtenerSistemaOperativo(){
        return sitemaOperativo;
    }
    public String obtenerTamanioPantalla(){
        return tamanioPantalla;
    }
    public double obtenerCostoInicial(){
        return costoInicial;
    }
    public double obtenerIvaPorcentaje(){
        return ivaPorcentaje;
    }
    public double obtenerIvaCostoInicial(){
        return ivaCostoInicial;
    }
    public double obtenerCostoFinal(){
        return costoFinal;
    }
    public String obtenerDireccionMac(){
        return direccionMac;
    }
    public String obtenerImei(){
        return ime;
    }
}
