/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.gob.orellana.www.sistemaacademico.vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

/**
 *
 * @author tribe
 */
public class VentanaSeleccion extends javax.swing.JFrame {

    //private JComboBox<String> cmbEleccion;
    public VentanaSeleccion() {
        initComponents();
        /*setTitle("Menú Principal");
        setSize(400, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);*/

        //combo = new JComboBox<>(new String[]{"Selecciona una vista", "Inicio", "Datos", "Resumen"});
        
        cmbEleccion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String seleccion = (String) cmbEleccion.getSelectedItem();
                switch (seleccion) {
                    case "Personal Servicio":
                        new VPersonasServicios().setVisible(true);
                        break;
                    case "Persona Invitada":
                        new VPersonasInvitadas().setVisible(true);
                        break;
                    case "Estudiante":
                        new VEstudiantes().setVisible(true);
                        break;
                    case "Profesor":
                        new VProfesores().setVisible(true);
                        break;
                     case "Decano":
                        new VDecano().setVisible(true);
                        break;
                }
            }
        });
        add(cmbEleccion);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtRol = new javax.swing.JLabel();
        cmbEleccion = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtRol.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtRol.setText("Elija su rol en la institucion");

        cmbEleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Personal Servicio", "Persona Invitada", "Estudiante", "Profesor", "Decano" }));
        cmbEleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEleccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(cmbEleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtRol))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtRol)
                .addGap(18, 18, 18)
                .addComponent(cmbEleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbEleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEleccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEleccionActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbEleccion;
    private javax.swing.JLabel txtRol;
    // End of variables declaration//GEN-END:variables
}
