/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.gob.orellana.www.sistemaacademico.personalinstitucional;

import ec.gob.orellana.www.sistemaacademico.personas.Persona;


public  class PersonaInstitucional extends Persona{
    //Atributos
    private String correoInstitucional;

    //Constructor
    public PersonaInstitucional(String correoInstitucional, String nombre, int id, String correo, String cedula) {
        super(nombre, id, correo, cedula);
        this.correoInstitucional = correoInstitucional;
    }
    
    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    //Metodos Set y Get
    public void setCorreoInstitucional(String correoInstitucional) {    
        this.correoInstitucional = correoInstitucional;
    }

    //public abstract boolean verificarCedula ();
    @Override
    public String toString() {
        return "PersonaInstitucional{" + "correoInstitucional=" + correoInstitucional + super.toString()+'}';
    }
    
    
    
    
}
