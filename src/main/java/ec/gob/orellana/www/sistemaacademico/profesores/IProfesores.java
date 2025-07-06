/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.gob.orellana.www.sistemaacademico.profesores;

/**
 *
 * @author SO-LAB-PC6
 */
public interface IProfesores {
    public boolean agregarProfesor(Profesor profesores);
    public void imprimirDatos();
    public boolean eliminarProfesor(int id,Profesor profesoress);
    public boolean actualizarProfesor(int iD,Profesor profesoress);
    public boolean buscarProfesor(int id);
}
