/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_4;

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
           EquipoCelulares ec= new EquipoCelulares();
        String sistemaOperativo= "Android 12";
        String tamanioPantalla="6.2 Pulgadas";
        double costoInicial=300;
        double ivaPorcentaje=12;
        double ivaCostoInicial;
        double costoFinal;
        String direccionMac ="001:1e:c2:9e:28:6b";
        String ime= "0293484312345";
        
        ec.establecerSistemaOperativo(sistemaOperativo);
        ec.establecerTamanioPantalla(tamanioPantalla);
        ec.establecerCostoInicial(costoInicial);
        ec.estableceIvaPorcentaje(ivaPorcentaje);
        ec.calcularIvaCostoInicial();
        ec.calcularCostoFinal();
        ec.establecerDireccionMac(direccionMac);
        ec.establecerImei(ime);
        
        
          System.out.printf("Equipos Celulares\n"
                + "Sistema Operativo: %s\n"
                + "Tamanio Pantalla: %s\n"
                + "Costo Inicial: %.2f\n"
                + "Iva porcentaje: %.2f\n"
                + "Iva costo inicial: %.2f\n"
                + "Costo final: %2f\n"
                + "Direccion mac: %s\n"
                + "iMei: %s\n", ec.obtenerSistemaOperativo(), ec.obtenerTamanioPantalla(), 
                ec.obtenerCostoInicial(), ec.obtenerIvaPorcentaje(), 
                ec.obtenerIvaCostoInicial(), ec.obtenerCostoFinal(), 
                ec.obtenerDireccionMac(), ec.obtenerImei());
        
    }
    
}
