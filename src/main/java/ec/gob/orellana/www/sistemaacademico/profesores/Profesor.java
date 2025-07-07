
package ec.gob.orellana.www.sistemaacademico.profesores;

import ec.gob.orellana.www.sistemaacademico.personalaacademico.PersonalAcademico;


public class Profesor extends PersonalAcademico{
    private Escalafon escalafon; 
    

    public Profesor(Escalafon escalafon, double sueldo, String correoInstitucional, String nombre, int id, String correo, String cedula) {
        super(sueldo, correoInstitucional, nombre, id, correo, cedula);
        this.escalafon = escalafon;
        super.toString();
    }

    public void setEscalafon(Escalafon escalafon) {
        this.escalafon = escalafon;
    }
    public Escalafon getEscalafon() {
        return escalafon;
    }
   
    public  void setCorreoInstitucional (){
        
        //supser.toString() = correoInstitucional;
    }
    public String getCorreoInstitucional (){
        
        return " ";
    }
    
    @Override
    public String toString() {
        return "Profesores{" + "escalafon=" /*+ escalafon */+ " " + super.toString() + '}';
    }
}
