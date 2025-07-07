/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.gob.orellana.www.sistemaacademico.controlador;

//import ec.gob.orellana.www.sistemaacademico.profesores.Escalafon;
import ec.gob.orellana.www.sistemaacademico.profesores.Escalafon;
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
    
    private Escalafon identificarEscalafon(String escalafon){
        
       Escalafon tipo=Escalafon.AGREGADO; 
        if("PRINCIPAL".equals(escalafon)){        
         tipo=Escalafon.PRINCIPAL;
        }else if("AGREGADO".equals(escalafon)){        
        tipo=Escalafon.AGREGADO;
        } 
        return tipo;
    }

    public void procesoControladorProfesor() {
        try {
            String nombreProfesor = vistaProfesor.getNombreProfesor();
            String correoPersonalProfesor = vistaProfesor.getCorreoPersonal();
            String cedulaProfesor = vistaProfesor.getCedula();
            String correoInstitucionalProfesor = vistaProfesor.getCorreoInstitucional();
            double sueldoProfesor = Double.parseDouble(vistaProfesor.getSuledo());
            String escalafonProfesor = vistaProfesor.getEscalafon();
            Escalafon tipoEscalafon=identificarEscalafon(escalafonProfesor);
            int idProfesor= Integer.parseInt(vistaProfesor.getId());

            Profesor nuevoProfesor = new Profesor(
                    tipoEscalafon,
                    sueldoProfesor,
                    correoInstitucionalProfesor,
                    nombreProfesor,
                    idProfesor,
                    correoPersonalProfesor,
                    cedulaProfesor);
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
            notificarMensaje.mostrarMensaje("Profesor encontrado");
           
            
        } catch (Exception e) {
            notificarMensaje.mostrarMensaje("Profesor no encontrado");
        }
    }
    
    public void procesoControladorEliminarProfesor(){
        try {
            int iDProfesor = Integer.parseInt(vistaProfesor.getBuscar());
            boolean profesorBuscado = iProfesores.buscarProfesor(iDProfesor);
            //Profesor eliminarProfesor = new Profesor(0," "," ",  0, " ", " ");
            if(profesorBuscado == true){
                iProfesores.eliminarProfesor(iDProfesor);
                notificarMensaje.mostrarMensaje("Profesor eliminado");         
            }
        } catch (Exception e) {
            notificarMensaje.mostrarMensaje("Error al eliminar el Profesor");
        }        
    } 
    
    public void procesoControladorActualizarProfesor() {
    try {
        int iDProfesor = Integer.parseInt(vistaProfesor.getBuscar());

        boolean existe = iProfesores.buscarProfesor(iDProfesor);
        if (existe) {
            String nombreProfesor = vistaProfesor.getNombreProfesor();
            String correoPersonalProfesor = vistaProfesor.getCorreoPersonal();
            String cedulaProfesor = vistaProfesor.getCedula();
            String correoInstitucionalProfesor = vistaProfesor.getCorreoInstitucional();
            double sueldoProfesor = Double.parseDouble(vistaProfesor.getSuledo());
            String escalafonProfesor = vistaProfesor.getEscalafon();
            Escalafon tipoEscalafon=identificarEscalafon(escalafonProfesor);
            // Escalafon escalafonProfesor = vistaProfesor.getEscalafon(); // si aplica

            
            Profesor profesorActualizado = new Profesor(
                tipoEscalafon,
                sueldoProfesor,
                correoInstitucionalProfesor,
                nombreProfesor,
                iDProfesor,
                cedulaProfesor,
                correoPersonalProfesor
            );

            
            iProfesores.actualizarProfesor(iDProfesor, profesorActualizado);

            
            notificarMensaje.mostrarMensaje("Profesor actualizado con éxito");

        } else {
            notificarMensaje.mostrarMensaje("No se encontró profesor con ID: " + iDProfesor);
        }

    } catch (NumberFormatException ex) {
        notificarMensaje.mostrarMensaje("ID o Sueldo inválido. Verifica los datos numéricos.");
    } catch (Exception e) {
        e.printStackTrace();
        notificarMensaje.mostrarMensaje("Error al actualizar el profesor");
    }
}


}

