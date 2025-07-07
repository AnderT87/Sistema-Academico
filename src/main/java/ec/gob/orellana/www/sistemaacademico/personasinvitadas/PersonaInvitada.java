
package ec.gob.orellana.www.sistemaacademico.personasinvitadas;

import ec.gob.orellana.www.sistemaacademico.personas.Persona;

public class PersonaInvitada extends Persona {
    
    //private String descripcion;
    
    
    //Constructor
    public PersonaInvitada(String nombre, int id, String correo, String cedula, String descripcion){
        super(nombre, id, correo, cedula);
        //this.descripcion = descripcion;
        super.toString();
    }

   /* public String getDescripcion() {
        return descripcion;
    }*/

   /* public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }*/
    
    
    //Metodos
    @Override
    public String toString() {
        return "Persona Invitada {" + super.toString()+ '}';
    }   
}
