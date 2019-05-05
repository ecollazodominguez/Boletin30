/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin30;

/**
 *
 * @author Mirroriced
 */
public class Seleccionador extends SeleccionFutbol {
    

    public Seleccionador(int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
    }

    @Override
    public void concentrarse() {
        System.out.println("Se concrentra el Seleccionador");
    }

    @Override
    public void viajar() {
        System.out.println("Viaja el Seleccionardor");
    }

    @Override
    public void entrenar() {
        System.out.println("Entrena el Seleccionador");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Juega partido el Seleccionador");
    }

    public void seleccionarXogador() {

        System.out.println("Seleccionando Xogador");

    }

    @Override
    public String toString() {
        return "Seleccionador: " +super.toString();
    }

}
