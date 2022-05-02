/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_3;

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
         Institucion inst = new Institucion();
        String nombre = "Daniel Alvarez";
        String tipoInstitucion = "Fiscomisional";
        int numeroAlumnos = 500;
        int numeroDocentes = 200;
        int numeroSedes = 4;
        double gastoEstudiante = 12;
        double presupuesto;
        
        inst.establecerNombre(nombre);
        inst.establecerTipoInstitucion(tipoInstitucion);
        inst.establecerNumeroAlumnos(numeroAlumnos);
        inst.establecerNumeroDocentes(numeroDocentes);
        inst.establecerNumeroSedes(numeroSedes);
        inst.establecerGastoPresupuestoEstudiante(gastoEstudiante);
        inst.calcularPresupuesto();
        
        System.out.printf("Institucion\n"
                + "Nombre: %s\n"
                + "Tipo Institucion: %s\n"
                + "Numero de Alumnos: %d\n"
                +"Numero de Docentes: %d\n"
                + "Numero de Sedes: %d\n"
                + "Gasto Estudiante: %.2f\n"
                + "Presupuesto: %2f\n", inst.obtenerNombre(), 
                inst.obtenerTipoInstitucion(), 
                inst.obtenerNumeroAlumnos(), 
                inst.obtenerNumeroDocentes(), 
                inst.obtenerNumeroSedes(),
                inst.obtenerGastoPresupuestoEstudiante(), inst.obtenerPresupuesto());
        
    }
    
}
