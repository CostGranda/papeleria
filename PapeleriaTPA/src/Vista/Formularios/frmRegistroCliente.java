/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Formularios;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Logica.LogicaDeNegocio;
import java.sql.ResultSet;

/**
 *
 * @author Jorge L Granda.
 */
public class frmRegistroCliente extends javax.swing.JFrame {
    
    LogicaDeNegocio ln;
    /**
     * Creates new form frmRegistro
     */
    public frmRegistroCliente() {
        ln = new LogicaDeNegocio();
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Vista/media/signup.png")).getImage());
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/Vista/media/fondo.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSignUp = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblDocumento = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbEmail = new javax.swing.JComboBox();
        txtOtrocorreol = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro Cliente");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnSignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/media/registerB.png"))); // NOI18N
        btnSignUp.setToolTipText("Sign Up");
        btnSignUp.setBorder(null);
        btnSignUp.setBorderPainted(false);
        btnSignUp.setContentAreaFilled(false);
        btnSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignUp.setFocusPainted(false);
        btnSignUp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSignUp.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/media/registerC.png"))); // NOI18N
        btnSignUp.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/media/registerA.png"))); // NOI18N
        btnSignUp.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnSignUp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        txtNombre.setBackground(new java.awt.Color(240, 240, 240));

        lblNombre.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre:");

        lblDocumento.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 14)); // NOI18N
        lblDocumento.setForeground(new java.awt.Color(255, 255, 255));
        lblDocumento.setText("Documento:");

        txtDocumento.setBackground(new java.awt.Color(240, 240, 240));

        jLabel5.setFont(new java.awt.Font("Papyrus", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("@");

        cmbEmail.setFont(new java.awt.Font("Papyrus", 0, 13)); // NOI18N
        cmbEmail.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "gmail.com", "outlook.com", "hotmail.com", "yahoo.com", "Otro" }));
        cmbEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEmailActionPerformed(evt);
            }
        });

        txtOtrocorreol.setEnabled(false);

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/media/rbackB.png"))); // NOI18N
        btnBack.setToolTipText("Go back");
        btnBack.setBorder(null);
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.setFocusPainted(false);
        btnBack.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBack.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/media/rbackC.png"))); // NOI18N
        btnBack.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/media/rbackA.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblCorreo.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 14)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo.setText("Correo:");

        txtCorreo.setBackground(new java.awt.Color(240, 240, 240));

        lblTelefono.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 14)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefono.setText("Telefono:");

        txtTelefono.setBackground(new java.awt.Color(240, 240, 240));

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lblDocumento)
                        .addGap(31, 31, 31)
                        .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnConsultar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnSignUp))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNombre)
                                    .addComponent(lblCorreo)
                                    .addComponent(lblTelefono))))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64)
                                .addComponent(cmbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtOtrocorreol, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDocumento)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConsultar)
                            .addComponent(btnEditar))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtOtrocorreol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCorreo)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSignUp)
                    .addComponent(btnBack))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        String nombre, documento, telefono, correo, usuario, clave;
        nombre = txtNombre.getText();
        documento = txtDocumento.getText();
        telefono = txtTelefono.getText();
        correo = txtCorreo.getText() + "@";

        //Si alguno de los campos está vacio muestra un mensaje.
        if (txtNombre.getText().equals("") || txtDocumento.getText().equals("")
                || txtTelefono.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "Informaciòn", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        //Concatena el correo para añadir a la db
        switch (cmbEmail.getSelectedIndex()) {
            case 0:
                correo += "gmail.com";
                break;
            case 1:
                correo += "outlook.com";
                break;
            case 2:
                correo += "hotmail.com";
                break;
            case 3:
                correo += "yahoo.com";
                break;
            case 4:
                correo += txtOtrocorreol.getText();
                break;
        }

        //Si el cliente existe muestra un mensaje y limpia el campo.
        if (ln.validarSiExisteCliente(documento)) {
            JOptionPane.showMessageDialog(null, "El cliente '" + txtDocumento.getText() + "' ya está registrado.");
            txtDocumento.requestFocus();
            txtDocumento.setText("");
            txtNombre.setText("");
            txtTelefono.setText("");
            txtCorreo.setText("");
            return;
        }

        //Inserta los datos del cliente.
        ln.insertarCliente(documento, nombre, telefono, correo);
        JOptionPane.showMessageDialog(null, "¡Cliente registrado con éxito!");

        Vista.Formularios.frmRegistroVenta principal = new Vista.Formularios.frmRegistroVenta();
        this.setVisible(false);
        principal.setVisible(true);


    }//GEN-LAST:event_btnSignUpActionPerformed

    private void cmbEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEmailActionPerformed
        //Si selecciona la opcion 'Otro' habilita el campo y pone el foco
        if (cmbEmail.getSelectedIndex() == 4) {
            txtOtrocorreol.setEnabled(true);
            txtOtrocorreol.requestFocus();
        }
    }//GEN-LAST:event_cmbEmailActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // Vuelve al formulario principal
        dispose();
        Vista.Formularios.frmRegistroVenta principal = new Vista.Formularios.frmRegistroVenta();
        principal.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String doc = txtDocumento.getText();
        String[] sep;
        if (ln.validarSiExisteCliente(doc)) {
            ResultSet rs = ln.datosCliente(doc);
            try {
                while (rs.next()) {
                    txtNombre.setText(rs.getString(2));
                    txtTelefono.setText(rs.getString(3));
                    sep = rs.getString(4).split("@");
                    txtCorreo.setText(sep[0]);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            btnEditar.setEnabled(true);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    void deshabilitarCampos() {
        txtNombre.setEnabled(false);
        txtOtrocorreol.setEnabled(false);
        txtCorreo.setEnabled(false);
        txtTelefono.setEnabled(false);
        cmbEmail.setEnabled(false);
        btnSignUp.setEnabled(false);
        btnEditar.setEnabled(false);
    }

    void habilitarCampos() {
        txtNombre.setEnabled(true);
        txtOtrocorreol.setEnabled(true);
        txtCorreo.setEnabled(true);
        txtTelefono.setEnabled(true);
        cmbEmail.setEnabled(true);
        btnSignUp.setEnabled(true);

    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        deshabilitarCampos();
    }//GEN-LAST:event_formWindowOpened


    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        habilitarCampos();
    }//GEN-LAST:event_btnEditarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmRegistroCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistroCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistroCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistroCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JComboBox cmbEmail;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDocumento;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtOtrocorreol;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
