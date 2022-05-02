/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema_3;

/**
 *
 * @author gilbertsolanosotomayor
 */
public class Institucion {

    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastoPEstudiante;
    private double presupuesto;

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerTipoInstitucion(String c) {
        tipoInstitucion = c;
    }

    public void establecerNumeroAlumnos(int c) {
        numeroAlumnos = c;
    }

    public void establecerNumeroDocentes(int c) {
        numeroDocentes = c;
    }

    public void establecerNumeroSedes(int c) {
        numeroSedes = c;
    }

    public void establecerGastoPresupuestoEstudiante(double c) {
        gastoPEstudiante = c;
    }

    public void calcularPresupuesto() {
        presupuesto = numeroAlumnos * gastoPEstudiante;

    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerTipoInstitucion() {
        return tipoInstitucion;
    }

    public int obtenerNumeroAlumnos() {
        return numeroAlumnos;
    }

    public int obtenerNumeroDocentes() {
        return numeroDocentes;
    }
    public int obtenerNumeroSedes(){
        return numeroSedes;
    }
    public double obtenerGastoPresupuestoEstudiante(){
        return gastoPEstudiante;
    }
    public double obtenerPresupuesto(){
        return presupuesto;
    }
}
