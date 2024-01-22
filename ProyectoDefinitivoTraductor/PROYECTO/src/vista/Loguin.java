/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package vista;

import controlador.main;
import javax.swing.JTextArea;

/**
 *
 * @author wwwda
 */
public class Loguin extends javax.swing.JDialog {

        /**
         * Creates new form Loguin
         * 
         * @param parent
         * @param modal
         */
        public Loguin(java.awt.Frame parent, boolean modal) {
                super(parent, modal);
                initComponents();
                setLocationRelativeTo(null);
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                panelTranslucidoComplete21 = new org.edisoncor.gui.panel.PanelTranslucidoComplete2();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                panelImage1 = new org.edisoncor.gui.panel.PanelImage();
                txt1 = new javax.swing.JTextField();
                txt2 = new javax.swing.JPasswordField();
                btnAceptar = new org.edisoncor.gui.button.ButtonSeven();
                jScrollPane1 = new javax.swing.JScrollPane();
                datos = new javax.swing.JTextArea();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

                panelTranslucidoComplete21.setBackground(new java.awt.Color(255, 255, 0));
                panelTranslucidoComplete21
                                .setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 0),
                                                5));
                panelTranslucidoComplete21.setForeground(new java.awt.Color(255, 255, 255));
                panelTranslucidoComplete21.setColorPrimario(new java.awt.Color(204, 255, 0));
                panelTranslucidoComplete21.setColorSecundario(new java.awt.Color(204, 153, 0));

                jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(102, 0, 102));
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("Bienvenido al diccionario Kichwa-Inglés");

                jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel2.setText("Ingrese sus datos:");

                jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel3.setText("Usuario:");

                jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel4.setText("Contraseña");

                panelImage1.setBackground(new java.awt.Color(0, 255, 51));
                panelImage1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 0), 5));
                panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgTraductor.jpeg"))); // NOI18N

                javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
                panelImage1.setLayout(panelImage1Layout);
                panelImage1Layout.setHorizontalGroup(
                                panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 143, Short.MAX_VALUE));
                panelImage1Layout.setVerticalGroup(
                                panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 100, Short.MAX_VALUE));

                txt1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
                txt1.setText("");
                txt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                txt1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txt1ActionPerformed(evt);
                        }
                });

                txt2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
                txt2.setText("");
                txt2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
                txt2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txt2ActionPerformed(evt);
                        }
                });

                btnAceptar.setBackground(new java.awt.Color(102, 255, 102));
                btnAceptar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
                btnAceptar.setForeground(new java.awt.Color(0, 0, 0));
                btnAceptar.setText("Aceptar");
                btnAceptar.setColorBrillo(new java.awt.Color(255, 255, 102));
                btnAceptar.setColorDeSombra(new java.awt.Color(0, 204, 0));
                btnAceptar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnAceptarActionPerformed(evt);
                        }
                });

                datos.setEditable(false);
                datos.setColumns(20);
                datos.setRows(5);
                datos.addAncestorListener(new javax.swing.event.AncestorListener() {
                        public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                                datosAncestorAdded(evt);
                        }

                        public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                        }

                        public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                        }
                });
                jScrollPane1.setViewportView(datos);

                javax.swing.GroupLayout panelTranslucidoComplete21Layout = new javax.swing.GroupLayout(
                                panelTranslucidoComplete21);
                panelTranslucidoComplete21.setLayout(panelTranslucidoComplete21Layout);
                panelTranslucidoComplete21Layout.setHorizontalGroup(
                                panelTranslucidoComplete21Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(panelTranslucidoComplete21Layout.createSequentialGroup()
                                                                .addGroup(panelTranslucidoComplete21Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                false)
                                                                                .addComponent(jLabel1,
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jLabel2,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                panelTranslucidoComplete21Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addContainerGap()
                                                                                                                .addGroup(panelTranslucidoComplete21Layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                .addGroup(panelTranslucidoComplete21Layout
                                                                                                                                                .createSequentialGroup()
                                                                                                                                                .addComponent(btnAceptar,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addGap(31, 31, 31)
                                                                                                                                                .addComponent(jScrollPane1))
                                                                                                                                .addGroup(panelTranslucidoComplete21Layout
                                                                                                                                                .createSequentialGroup()
                                                                                                                                                .addGroup(panelTranslucidoComplete21Layout
                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                .addGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                                panelTranslucidoComplete21Layout
                                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                                .addGap(22, 22, 22)
                                                                                                                                                                                                .addGroup(
                                                                                                                                                                                                                panelTranslucidoComplete21Layout
                                                                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                                                                                                false)
                                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                                jLabel4,
                                                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                                                114,
                                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                                jLabel3,
                                                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                                                114,
                                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                                                                .addGap(158, 158,
                                                                                                                                                                                                                158))
                                                                                                                                                                .addGroup(
                                                                                                                                                                                panelTranslucidoComplete21Layout
                                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                                .addGroup(
                                                                                                                                                                                                                panelTranslucidoComplete21Layout
                                                                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                                txt1,
                                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                                                276,
                                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                                txt2,
                                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                                                276,
                                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                                                                .addGap(18, 18, 18)))
                                                                                                                                                .addComponent(panelImage1,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addGap(63, 63, 63)))))
                                                                .addGap(0, 0, Short.MAX_VALUE)));
                panelTranslucidoComplete21Layout.setVerticalGroup(
                                panelTranslucidoComplete21Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(panelTranslucidoComplete21Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                42,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel2)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel3)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(panelTranslucidoComplete21Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(panelTranslucidoComplete21Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(txt1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                28,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(jLabel4)
                                                                                                .addGap(9, 9, 9)
                                                                                                .addComponent(txt2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                30,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(panelImage1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(panelTranslucidoComplete21Layout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                panelTranslucidoComplete21Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addGap(42, 42, 42)
                                                                                                                .addComponent(btnAceptar,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(18, 18, 18))
                                                                                .addGroup(panelTranslucidoComplete21Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(11, 11, 11)
                                                                                                .addComponent(jScrollPane1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                74,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addContainerGap(
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)))));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(panelTranslucidoComplete21,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(panelTranslucidoComplete21,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAceptarActionPerformed
                // TODO add your handling code here:
                main mainIniciar = new main(this);
                mainIniciar.login(txt1.getText(), new String(txt2.getPassword()));

        }// GEN-LAST:event_btnAceptarActionPerformed

        private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt1ActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_txt1ActionPerformed

        private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txt2ActionPerformed
                // TODO add your handling code here:
        }// GEN-LAST:event_txt2ActionPerformed

        private void datosAncestorAdded(javax.swing.event.AncestorEvent evt) {// GEN-FIRST:event_datosAncestorAdded
                // TODO add your handling code here:
                datos.setText("Datos cargados...");

        }// GEN-LAST:event_datosAncestorAdded

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
                // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
                // (optional) ">
                /*
                 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
                 * look and feel.
                 * For details see
                 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
                 */
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(Loguin.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Loguin.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Loguin.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Loguin.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                }
                // </editor-fold>

                /* Create and display the dialog */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                Loguin dialog = new Loguin(new javax.swing.JFrame(), true);
                                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                                        @Override
                                        public void windowClosing(java.awt.event.WindowEvent e) {
                                                System.exit(0);
                                        }
                                });
                                dialog.setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private org.edisoncor.gui.button.ButtonSeven btnAceptar;
        private javax.swing.JTextArea datos;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JScrollPane jScrollPane1;
        private org.edisoncor.gui.panel.PanelImage panelImage1;
        private org.edisoncor.gui.panel.PanelTranslucidoComplete2 panelTranslucidoComplete21;
        private javax.swing.JTextField txt1;
        private javax.swing.JPasswordField txt2;
        // End of variables declaration//GEN-END:variables

        public javax.swing.JTextField getTxt1() {
                return txt1;
        }

        public void setTxt1(javax.swing.JTextField txt1) {
                this.txt1 = txt1;
        }

        public javax.swing.JPasswordField getTxt2() {
                return txt2;
        }

        public void setTxt2(javax.swing.JPasswordField txt2) {
                this.txt2 = txt2;
        }

        public JTextArea getDatos() {
                return datos;
        }

        public void setDatos(JTextArea datos) {
                this.datos = datos;
        }

}
