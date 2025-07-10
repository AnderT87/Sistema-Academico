/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.gob.orellana.www.sistemaacademico.decanos;

import ec.gob.orellana.www.sistemaacademico.profesores.Profesor;

/**
 *
 * @author SO-LAB-PC6
 */
public class Decanos implements IDecanos {

    private Decano[] decanos;
    private int totalDecanos;

    public Decanos(int dimension) {
        decanos = new Decano[dimension];
        totalDecanos = 0;

    }

    @Override
    public boolean AgregarDecanos(Decano decano) {
        if (totalDecanos == decanos.length) {
            return false;
        } else {
            decanos[totalDecanos] = decano;
            totalDecanos = totalDecanos + 1;
            return true;
        }
    }

    @Override
    public void imprimirDatos() {
        for (int i = 0; i < totalDecanos; i++) {
            System.out.println("------DECANO------" + "|" + (i + 1) + "|");
            System.out.println("Nombre :" + decanos[i].getNombre());
            System.out.println("Id :" + decanos[i].getId());
            System.out.println("Cedula :" + decanos[i].getCedula());
            System.out.println("Correo personal :" + decanos[i].getCorreo());
            System.out.println("Correo institucional :" + decanos[i].getCorreoInstitucional());
            System.out.println("Nivel jerarquico: " + decanos[i].getNivelJerarquico());
            System.out.println(" ");

        }
    }

    @Override
    public boolean actualizarDecano(int iD, Decano decano) {
        for (int i = 0; i < totalDecanos; i++) {
            decanos[i] = decano;
            imprimirDatos();
            return true;
        }
        return false;
    }

    public boolean eliminarDecano(int id) {
        for (int i = 0; i < totalDecanos; i++) {
            if (decanos[i].getId() == id) {
                // Reorganizar el arreglo para quitar el hueco
                for (int j = i; j < totalDecanos - 1; j++) {
                    decanos[j] = decanos[j + 1];
                }
                decanos[totalDecanos - 1] = null;
                totalDecanos--;
                System.out.println("Profesor eliminado");
                return true;
            }
        }
        return false;
    }

    public Decano buscarDecano(int id) {
        for (int i = 0; i < totalDecanos; i++) {
            if (decanos[i] != null && decanos[i].getId() == id) {
                return decanos[i];
            }
        }
        return null;
    }

}
