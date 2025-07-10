/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.gob.orellana.www.sistemaacademico.decanos;

import ec.gob.orellana.www.sistemaacademico.profesores.Profesor;

/**
 *
 * @author SO-LAB-PC6
 */
public interface IDecanos {
    public boolean AgregarDecanos(Decano decano);
    public void imprimirDatos ();
    public boolean actualizarDecano (int iD, Decano decano);
    public boolean eliminarDecano (int iD);
    public Decano buscarDecano(int id);
}
