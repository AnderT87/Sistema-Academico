/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.gob.orellana.www.sistemaacademico.controlador;

//import ec.gob.orellana.www.sistemaacademico.profesores.Escalafon;
import ec.gob.orellana.www.sistemaacademico.profesores.IProfesores;
import ec.gob.orellana.www.sistemaacademico.profesores.Profesor;
import ec.gob.orellana.www.sistemaacademico.profesores.Profesores;
import ec.gob.orellana.www.sistemaacademico.vista.NotificadorMensaje;
import ec.gob.orellana.www.sistemaacademico.vista.VProfesores;
import ec.gob.orellana.www.sistemaacademico.vista.VProfesores;
import javax.swing.JOptionPane;

/**
 *
 * @author SO_LAB3_PC04
 */
public class ControladorProfesores {

    private VProfesores vistaProfesor;
    private NotificadorMensaje notificarMensaje;
    private IProfesores iProfesores;

    public ControladorProfesores(VProfesores vistaProfesor) {
        this.vistaProfesor = vistaProfesor;
        this.iProfesores = new Profesores(10);
         this.notificarMensaje = new NotificadorMensaje();
    }

    public void procesoControladorProfesor() {
        try {
            String nombreProfesor = vistaProfesor.getNombreProfesor();
            String correoPersonalProfesor = vistaProfesor.getCorreoPersonal();
            String cedulaProfesor = vistaProfesor.getCedula();
            String correoInstitucionalProfesor = vistaProfesor.getCorreoInstitucional();
            double sueldoProfesor = Double.parseDouble(vistaProfesor.getSuledo());
            //Escalafon escalafonProfesor = vistaProfesor.getEscalafon();
            int idProfesor= Integer.parseInt(vistaProfesor.getId());

            Profesor nuevoProfesor = new Profesor(
                   // escalafonProfesor,
                    sueldoProfesor,
                    correoInstitucionalProfesor,
                    nombreProfesor,
                    idProfesor,
                    cedulaProfesor,
                    correoPersonalProfesor);
            boolean agregar = iProfesores.agregarProfesor(nuevoProfesor);
            if(agregar == true){
              notificarMensaje.mostrarMensaje("Profesor Agregado Exito");
             iProfesores.imprimirDatos();  
            }   
        } catch (Exception e) {
             e.printStackTrace();
            notificarMensaje.mostrarMensaje("Error al agregar el profesor");
        }
    }
    public void procesoBuscarProfesor(){
        try {
            int iDProfesor = Integer.parseInt(vistaProfesor.getBuscar());
            boolean profesorBuscado = iProfesores.buscarProfesor(iDProfesor);
            
        } catch (Exception e) {
            notificarMensaje.mostrarMensaje("Profesor no encontrado");
        }
    }
    /*
    public void procesoControladorEliminarProfesor(){
        try {
            int iDProfesor = Integer.parseInt(vistaProfesor.getBuscar());
            boolean profesorBuscado = iProfesores.buscarProfesor(iDProfesor);
            Profesor eliminarProfesor = new Profesor(0," "," ",  0, " ", " ");
            if(profesorBuscado == true){
                iProfesores.eliminarProfesor(iDProfesor, eliminarProfesor);
                
            }
        } catch (Exception e) {
        }
        
    } */

}

