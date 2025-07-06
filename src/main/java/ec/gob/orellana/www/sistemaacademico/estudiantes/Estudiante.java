
package ec.gob.orellana.www.sistemaacademico.estudiantes;

import ec.gob.orellana.www.sistemaacademico.personalinstitucional.PersonaInstitucional;


public class Estudiante extends PersonaInstitucional{
    //Atributos
    private int codigo;

    public Estudiante(int codigo, String correoInstitucional, String nombre, int id, String correo, String cedula) {
        super(correoInstitucional, nombre, id, correo, cedula);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "codigo=" + codigo + super.toString() + '}';
    }

    
    
}
