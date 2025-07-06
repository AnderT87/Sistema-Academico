/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.gob.orellana.www.sistemaacademico.decanos;

import ec.gob.orellana.www.sistemaacademico.personalaacademico.PersonalAcademico;

public class Decano extends PersonalAcademico {
    private String nivelJerarquico; 

    public Decano(String nivelJerarquico, double sueldo, String correoInstitucional, String nombre, int id, String correo, String cedula) {
        super(sueldo, correoInstitucional, nombre, id, correo, cedula);
        this.nivelJerarquico = nivelJerarquico;
    }

    

    public String getNivelJerarquico() {
        return nivelJerarquico;
    }

    public void setNivelJerarquico(String nivelJerarquico) {
        this.nivelJerarquico = nivelJerarquico;
    }
 

    @Override
    public String toString() {
        return "Decanos{" +
                "nivelJerarquico= " + nivelJerarquico +" " + super.toString() +
                '}';
    }
}
