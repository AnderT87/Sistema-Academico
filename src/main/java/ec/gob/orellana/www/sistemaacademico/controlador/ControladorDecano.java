/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.gob.orellana.www.sistemaacademico.controlador;

import ec.gob.orellana.www.sistemaacademico.decanos.Decano;
import ec.gob.orellana.www.sistemaacademico.decanos.Decanos;
import ec.gob.orellana.www.sistemaacademico.decanos.IDecanos;
import ec.gob.orellana.www.sistemaacademico.profesores.Escalafon;
import ec.gob.orellana.www.sistemaacademico.profesores.Profesor;
import ec.gob.orellana.www.sistemaacademico.vista.NotificadorMensaje;
import ec.gob.orellana.www.sistemaacademico.vista.VDecano;

/**
 *
 * @author tribe
 */
public class ControladorDecano {

    private VDecano vistaDecano;
    private NotificadorMensaje notificarMensaje;
    private IDecanos iDecano;

    public ControladorDecano(VDecano vistaDecano) {
        this.vistaDecano = vistaDecano;
        this.notificarMensaje = new NotificadorMensaje();
        this.iDecano = new Decanos(10);
    }

    public void procesoControladorDecano() {
        try {
            String nombreDecano = vistaDecano.getNombreProfesor();
            String correoPersonalDecano = vistaDecano.getCorreoPersonal();
            String cedulaDecano = vistaDecano.getCedula();
            String correoInstitucionalDecano = vistaDecano.getCorreoInstitucional();
            double sueldoDecano = Double.parseDouble(vistaDecano.getSuledo());
            int idDecano = Integer.parseInt(vistaDecano.getId());
            String nivelJerarquico = vistaDecano.getNivelJerarquico();

            Decano nuevoDecano = new Decano(
                    nivelJerarquico,
                    sueldoDecano,
                    correoInstitucionalDecano,
                    nombreDecano,
                    idDecano,
                    nombreDecano,
                    cedulaDecano);
            boolean agregar = iDecano.AgregarDecanos(nuevoDecano);
            if (agregar == true) {
                notificarMensaje.mostrarMensaje("Profesor Agregado Exito");
                iDecano.imprimirDatos();
            }
        } catch (Exception e) {
            e.printStackTrace();
            notificarMensaje.mostrarMensaje("Error al agregar el profesor");
        }
    }

    public void procesoBuscarDecano() {
        try {
            int idDecano = Integer.parseInt(vistaDecano.getBuscar());
            boolean decanoBuscado = iDecano.buscarProfesor(idDecano);
            if(decanoBuscado == true){
                notificarMensaje.mostrarMensaje("Decano encontrado");
            }else{
                notificarMensaje.mostrarMensaje("Decano no encontrado");
            }            
        } catch (Exception e) {
            notificarMensaje.mostrarMensaje("Error en el codigo");
        }
    }

    public void procesoControladorEliminarProfesor() {
        try {
            int idDecano = Integer.parseInt(vistaDecano.getBuscar());
            boolean profesorBuscado = iDecano.buscarProfesor(idDecano);
            //Profesor eliminarProfesor = new Profesor(0," "," ",  0, " ", " ");
            if (profesorBuscado == true) {
                iDecano.eliminarDecano(idDecano);
                notificarMensaje.mostrarMensaje("Profesor eliminado");
            }
        } catch (Exception e) {
            notificarMensaje.mostrarMensaje("Error al eliminar el Profesor");
        }
    }

    public void procesoControladorActualizarProfesor() {
        try {
            int iDProfesor = Integer.parseInt(vistaDecano.getBuscar());

            boolean existe = iDecano.buscarProfesor(iDProfesor);
            if (existe) {
                String nombreDecano = vistaDecano.getNombreProfesor();
                String correoPersonalDecano = vistaDecano.getCorreoPersonal();
                String cedulaDecano = vistaDecano.getCedula();
                String correoInstitucionalDecano = vistaDecano.getCorreoInstitucional();
                double sueldoDecano = Double.parseDouble(vistaDecano.getSuledo());
                int idDecano = Integer.parseInt(vistaDecano.getId());
                String nivelJerarquico = vistaDecano.getNivelJerarquico();

                Decano decanoActualizado = new Decano(
                        nivelJerarquico,
                        sueldoDecano,
                        correoInstitucionalDecano,
                        nombreDecano,
                        idDecano,
                        nombreDecano,
                        cedulaDecano);

                iDecano.actualizarDecano(iDProfesor, decanoActualizado);

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
