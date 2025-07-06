/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.gob.orellana.www.sistemaacademico.controlador;

import ec.gob.orellana.www.sistemaacademico.decanos.IDecanos;
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
        this.notificarMensaje = notificarMensaje;
        this.iDecano = iDecano;
    }
    
    
    
}
