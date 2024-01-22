/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import controlador.main;
import modelo.Traductor;

/**
 *
 * @author wwwda
 */
public class VentanaInicial extends javax.swing.JFrame {
    private final Loguin loguin;

    /**
     * Creates new form VentanaInicial
     * 
     * @param loguin
     */
    public VentanaInicial(Loguin loguin) {
        initComponents();
        setLocationRelativeTo(null);
        this.loguin = loguin;

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
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        txtDatos = new javax.swing.JTextField();
        btnIdioma = new org.edisoncor.gui.button.ButtonRound();
        btnTraducir = new org.edisoncor.gui.button.ButtonRound();
        txtTraducir = new javax.swing.JTextField();
        btnResetear = new org.edisoncor.gui.button.ButtonRound();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnSalir = new javax.swing.JMenu();
        cerrarSesion = new javax.swing.JMenuItem();
        btnExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        panelTranslucidoComplete21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        panelTranslucidoComplete21.setForeground(new java.awt.Color(255, 255, 204));
        panelTranslucidoComplete21.setColorPrimario(new java.awt.Color(0, 255, 51));
        panelTranslucidoComplete21.setColorSecundario(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido");

        txtArea.setEditable(false);
        txtArea.setBackground(new java.awt.Color(204, 255, 204));
        txtArea.setColumns(20);
        txtArea.setRows(5);
        txtArea.setText("Bienvenido a nuestro diccionario... \nPorfavor escoge un idioma: \n-Ingles\n-Kichwa\n\n");
        txtArea.setCaretColor(new java.awt.Color(255, 204, 0));
        txtArea.setDisabledTextColor(new java.awt.Color(255, 51, 51));
        jScrollPane1.setViewportView(txtArea);

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        txtDatos.setText("");
        txtDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatosActionPerformed(evt);
            }
        });

        btnIdioma.setBackground(new java.awt.Color(153, 255, 153));
        btnIdioma.setForeground(new java.awt.Color(0, 0, 0));
        btnIdioma.setText("Escoger Idioma");
        btnIdioma.setColorDeSombra(new java.awt.Color(0, 204, 0));
        btnIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIdiomaActionPerformed(evt);
            }
        });

        btnTraducir.setBackground(new java.awt.Color(153, 255, 153));
        btnTraducir.setForeground(new java.awt.Color(0, 0, 0));
        btnTraducir.setText("Traducir");
        btnTraducir.setColorDeSombra(new java.awt.Color(0, 204, 0));
        btnTraducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraducirActionPerformed(evt);
            }
        });

        txtTraducir.setText("");
        txtTraducir.setEnabled(false);
        txtTraducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTraducirActionPerformed(evt);
            }
        });

        btnResetear.setBackground(new java.awt.Color(153, 255, 153));
        btnResetear.setForeground(new java.awt.Color(0, 0, 0));
        btnResetear.setText("Restablecer");
        btnResetear.setColorDeSombra(new java.awt.Color(0, 204, 0));
        btnResetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTranslucidoComplete21Layout = new javax.swing.GroupLayout(
                panelTranslucidoComplete21);
        panelTranslucidoComplete21.setLayout(panelTranslucidoComplete21Layout);
        panelTranslucidoComplete21Layout.setHorizontalGroup(
                panelTranslucidoComplete21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelTranslucidoComplete21Layout.createSequentialGroup()
                                .addGroup(panelTranslucidoComplete21Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelTranslucidoComplete21Layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panelTranslucidoComplete21Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(panelTranslucidoComplete21Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btnIdioma, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtDatos, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(panelTranslucidoComplete21Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(panelTranslucidoComplete21Layout
                                                                .createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(txtTraducir,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 194,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(panelTranslucidoComplete21Layout
                                                                .createSequentialGroup()
                                                                .addGap(57, 57, 57)
                                                                .addComponent(btnTraducir,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(34, Short.MAX_VALUE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTranslucidoComplete21Layout
                                .createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnResetear, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)));
        panelTranslucidoComplete21Layout.setVerticalGroup(
                panelTranslucidoComplete21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelTranslucidoComplete21Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelTranslucidoComplete21Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTraducir, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(panelTranslucidoComplete21Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnTraducir, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDatos, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnResetear, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(20, Short.MAX_VALUE)));

        jMenuBar1.setBackground(new java.awt.Color(0, 255, 51));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btnSalir.setText("Opciones");

        cerrarSesion.setText("Cerrar Sesión");
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });
        btnSalir.add(cerrarSesion);

        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        btnSalir.add(btnExit);

        jMenuBar1.add(btnSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelTranslucidoComplete21, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelTranslucidoComplete21, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cerrarSesionActionPerformed
        // TODO add your handling code here:
        dispose();
        loguin.setVisible(true);
    }// GEN-LAST:event_cerrarSesionActionPerformed

    private void btnIdiomaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnIdiomaActionPerformed
        // TODO add your handling code here:
        main main2 = new main(loguin);
        main2.cargarIdiomas();
        txtArea.setText(main2.AcepInchwa(txtDatos.getText()));
        if (main2.selectInchwa(txtDatos.getText()) == true) {
            txtDatos.setEnabled(false);
            txtTraducir.setEnabled(true);
        } else {
            txtDatos.setText("");
        }

    }// GEN-LAST:event_btnIdiomaActionPerformed

    private void txtDatosActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtDatosActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtDatosActionPerformed

    private void txtTraducirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtTraducirActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtTraducirActionPerformed

    private void btnTraducirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnTraducirActionPerformed
        // TODO add your handling code here:
        Traductor traductor = new Traductor();
        String idioma = txtDatos.getText();
        String oralabra = txtTraducir.getText();
        txtArea.setText(traductor.traducirPalabra(idioma, oralabra));
        txtTraducir.setText("");
    }// GEN-LAST:event_btnTraducirActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }// GEN-LAST:event_btnExitActionPerformed

    private void btnResetearActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnResetearActionPerformed
        // TODO add your handling code here:
        txtArea.setText("""
                Restableciendo...
                Bienvenido a nuestro diccionario...
                Porfavor escoge un idioma:
                -Ingles
                -Kichwa""");
        txtDatos.setText("");
        txtTraducir.setText("");
        txtDatos.setEnabled(true);
        txtTraducir.setEnabled(false);
    }// GEN-LAST:event_btnResetearActionPerformed

    /**
     * @return
     */

    public JTextArea getTxtArea() {
        return txtArea;
    }

    public void setTxtArea(JTextArea txtArea) {
        this.txtArea = txtArea;
    }

    public JTextField getTxtDatos() {
        return txtDatos;
    }

    public void setTxtDatos(JTextField txtDatos) {
        this.txtDatos = txtDatos;
    }

    public JTextField getTxtTraducir() {
        return txtTraducir;
    }

    public void setTxtTraducir(JTextField txtTraducir) {
        this.txtTraducir = txtTraducir;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnExit;
    private org.edisoncor.gui.button.ButtonRound btnIdioma;
    private org.edisoncor.gui.button.ButtonRound btnResetear;
    private javax.swing.JMenu btnSalir;
    private org.edisoncor.gui.button.ButtonRound btnTraducir;
    private javax.swing.JMenuItem cerrarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private org.edisoncor.gui.panel.PanelTranslucidoComplete2 panelTranslucidoComplete21;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtDatos;
    private javax.swing.JTextField txtTraducir;
    // End of variables declaration//GEN-END:variables

    private Object TxtArea() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                       // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
