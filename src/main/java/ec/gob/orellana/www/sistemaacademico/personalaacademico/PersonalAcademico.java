/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.gob.orellana.www.sistemaacademico.personalaacademico;

import ec.gob.orellana.www.sistemaacademico.empleado.Empleado;

/**
 *
 * @author SO-LAB-PC6
 */
public class PersonalAcademico extends Empleado {

    public PersonalAcademico(double sueldo, String correoInstitucional, String nombre, int id, String correo, String cedula) {
        super(sueldo, correoInstitucional, nombre, id, correo, cedula);
    }
    
    // public abstract boolean verificarCedula(); 
    
    @Override
    public String toString() {
        return "personalAcademico{" + super.toString()+'}';
    }
    
    
    
}
