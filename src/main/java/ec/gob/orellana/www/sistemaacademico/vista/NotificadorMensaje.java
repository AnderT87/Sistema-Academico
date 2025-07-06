/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.gob.orellana.www.sistemaacademico.vista;

import javax.swing.JOptionPane;

/**
 *
 * @author SO_LAB3_PC04
 */
public class NotificadorMensaje {
    public void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, "informacion", JOptionPane.INFORMATION_MESSAGE);
    }
}
