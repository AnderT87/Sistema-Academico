/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.gob.orellana.www.sistemaacademico.controlador;

import ec.gob.orellana.www.sistemaacademico.estudiantes.Estudiante;
import ec.gob.orellana.www.sistemaacademico.estudiantes.Estudiantes;
import ec.gob.orellana.www.sistemaacademico.estudiantes.IEstudiantes;
import ec.gob.orellana.www.sistemaacademico.profesores.Escalafon;
import ec.gob.orellana.www.sistemaacademico.profesores.Profesor;
import ec.gob.orellana.www.sistemaacademico.vista.NotificadorMensaje;
import ec.gob.orellana.www.sistemaacademico.vista.VEstudiantes;

public class ControladorEstudiante {

    private VEstudiantes vistaEstudiantes;
    private NotificadorMensaje notificadorMensaje;
    private IEstudiantes iEstudiantes;

    public ControladorEstudiante(VEstudiantes vistaEstudiantes) {
        this.vistaEstudiantes = vistaEstudiantes;
        this.notificadorMensaje = new NotificadorMensaje();
        this.iEstudiantes = new Estudiantes(10);
    }

    public void procesoControladorEstudiantes() {
        try {
            String nombreEstudiante = vistaEstudiantes.getNombre();
            String correoPersonalEstudiante = vistaEstudiantes.getCorreoPersonal();
            String cedulaEstudiante = vistaEstudiantes.getCedula();
            String correoInstitucionalEstudiante = vistaEstudiantes.getCorreoInstitucional();
            int idEstudiante = Integer.parseInt(vistaEstudiantes.getId());
            int codigoEstudiante = Integer.parseInt(vistaEstudiantes.getCodigo());

            Estudiante nuevoEstudiante = new Estudiante(
                    codigoEstudiante,
                    correoInstitucionalEstudiante,
                    nombreEstudiante,
                    idEstudiante,
                    nombreEstudiante,
                    cedulaEstudiante
            );
            boolean agregar = iEstudiantes.agregarEstudiantes(nuevoEstudiante);
            if (agregar == true) {
                notificadorMensaje.mostrarMensaje("Estudiante Agregado Exito");
                iEstudiantes.imprimirDato();
            }
        } catch (Exception e) {
            e.printStackTrace();
            notificadorMensaje.mostrarMensaje("Error al agregar el estudiante");
        }
    }

    public void procesoBuscarEstudiantes() {
        try {
            int iDEstudiante = Integer.parseInt(vistaEstudiantes.getBuscar());
            boolean profesorBuscado = iEstudiantes.buscarEstudiante(iDEstudiante);
            if (profesorBuscado == true) {
                 notificadorMensaje.mostrarMensaje("Estudiante encontrado");
            }else{
                notificadorMensaje.mostrarMensaje("Estudiante no encontrado");
            }
        } catch (Exception e) {
            notificadorMensaje.mostrarMensaje("Error al buscar el estudiante verifique que el codigo est correcto");
        }
    }

    public void procesoControladorEliminarEstudiantes() {
        try {
            int iDEstudiante = Integer.parseInt(vistaEstudiantes.getBuscar());
            boolean profesorBuscado = iEstudiantes.buscarEstudiante(iDEstudiante);
            if (profesorBuscado == true) {
                iEstudiantes.eliminarEstudiante(iDEstudiante);
                notificadorMensaje.mostrarMensaje("Estudiante eliminado");
            }
        } catch (Exception e) {
            notificadorMensaje.mostrarMensaje("Error al eliminar el estudiante");
        }
    }

    public void procesoControladorActualizarEstudiantes() {
        try {
            int idEstudiante = Integer.parseInt(vistaEstudiantes.getBuscar());

            boolean existe = iEstudiantes.buscarEstudiante(idEstudiante);
            if (existe) {
                String nombreEstudiante = vistaEstudiantes.getNombre();
                String correoPersonalEstudiante = vistaEstudiantes.getCorreoPersonal();
                String cedulaEstudiante = vistaEstudiantes.getCedula();
                String correoInstitucionalEstudiante = vistaEstudiantes.getCorreoInstitucional();
                int codigoEstudiante = Integer.parseInt(vistaEstudiantes.getCodigo());

                Estudiante estudianteActualizado = new Estudiante(
                        codigoEstudiante,
                        correoInstitucionalEstudiante,
                        nombreEstudiante,
                        idEstudiante,
                        nombreEstudiante,
                        cedulaEstudiante);

                iEstudiantes.actualizarEstudiante(idEstudiante, estudianteActualizado);

                notificadorMensaje.mostrarMensaje("Estudiante actualizado con éxito");
                iEstudiantes.imprimirDato();

            } else {
                notificadorMensaje.mostrarMensaje("No se encontró el estudiante con ID: " + idEstudiante);
            }

        } catch (NumberFormatException ex) {
            notificadorMensaje.mostrarMensaje("ID o Codigo inválido. Verifica los datos numéricos.");
        } catch (Exception e) {
            e.printStackTrace();
            notificadorMensaje.mostrarMensaje("Error al actualizar el estudiante");
        }
    }

}
