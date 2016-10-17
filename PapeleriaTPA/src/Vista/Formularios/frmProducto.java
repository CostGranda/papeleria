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
import java.sql.SQLException;

/**
 *
 * @author Jorge L Granda.
 */
public class frmProducto extends javax.swing.JFrame {

    /**
     * Creates new form frmLogin
     */
    LogicaDeNegocio ln;

    /**
     * Se carga la imagen de fondo, y los iconos del jframe.
     */
    public frmProducto() {
        initComponents();
        setLocationRelativeTo(null);

        setIconImage(new ImageIcon(getClass().getResource("/Vista/media/product.png")).getImage());
        ((JPanel) getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/Vista/media/fondo.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnAgregar = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaDescripcion = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        spnDisponible = new javax.swing.JSpinner();
        spnPrecio = new javax.swing.JSpinner();
        btnConsultar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        rbtnNombre = new javax.swing.JRadioButton();
        rbtnCodigo = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro productos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/media/registerB.png"))); // NOI18N
        btnAgregar.setToolTipText("Añadir");
        btnAgregar.setBorder(null);
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setFocusPainted(false);
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/media/registerC.png"))); // NOI18N
        btnAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/media/registerA.png"))); // NOI18N
        btnAgregar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

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

        jLabel4.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Descripción:");

        txtaDescripcion.setColumns(15);
        txtaDescripcion.setRows(2);
        jScrollPane1.setViewportView(txtaDescripcion);

        jLabel5.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Precio:");

        jLabel6.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Disponible:");

        spnDisponible.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnDisponible.setBorder(null);

        spnPrecio.setModel(new javax.swing.SpinnerNumberModel(0.0f, 0.0f, null, 100.0f));
        spnPrecio.setBorder(null);

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/media/searchB.png"))); // NOI18N
        btnConsultar.setBorder(null);
        btnConsultar.setBorderPainted(false);
        btnConsultar.setContentAreaFilled(false);
        btnConsultar.setFocusPainted(false);
        btnConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/media/searchC.png"))); // NOI18N
        btnConsultar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/media/search.png"))); // NOI18N
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/media/deleteB.png"))); // NOI18N
        btnEliminar.setToolTipText("Eliminar");
        btnEliminar.setBorder(null);
        btnEliminar.setBorderPainted(false);
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/media/deleteC.png"))); // NOI18N
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/media/deleteA.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/media/editB.png"))); // NOI18N
        btnEditar.setBorder(null);
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.setFocusPainted(false);
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/media/editC.png"))); // NOI18N
        btnEditar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/media/edit.png"))); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        txtCodigo.setEnabled(false);

        buttonGroup1.add(rbtnNombre);
        rbtnNombre.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 14)); // NOI18N
        rbtnNombre.setForeground(java.awt.Color.white);
        rbtnNombre.setSelected(true);
        rbtnNombre.setText("Nombre:");
        rbtnNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnNombreActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnCodigo);
        rbtnCodigo.setFont(new java.awt.Font("Bitstream Vera Sans", 0, 14)); // NOI18N
        rbtnCodigo.setForeground(java.awt.Color.white);
        rbtnCodigo.setText("Código:");
        rbtnCodigo.setFocusPainted(false);
        rbtnCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnNombre)
                            .addComponent(rbtnCodigo)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(spnPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(22, 22, 22)
                        .addComponent(spnDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsultar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnBack)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(spnPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(spnDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar)
                    .addComponent(btnBack)
                    .addComponent(btnConsultar)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String nombre, descripcion, precio, disponible;
        nombre = txtNombre.getText();
        descripcion = txtaDescripcion.getText();
        precio = String.valueOf(spnPrecio.getValue());
        disponible = String.valueOf(spnDisponible.getValue());

        //Si alguno de los campos está vacio muestra un mensaje.
        if (txtNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "Informaciòn", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        ln = new LogicaDeNegocio();
        //Si el producto existe muestra un mensaje y limpia el campo.
        if (ln.validarSiExisteProductoNombre(nombre)) {
            JOptionPane.showMessageDialog(null, "El producto '" + txtNombre.getText() + "' ya existe.");
            txtNombre.requestFocus();
            txtNombre.setText("");
            txtaDescripcion.setText("");
            spnPrecio.setValue(0);
            spnDisponible.setValue(0);
            return;
        }

        //Inserta un nuevo producto
        ln.insertarProducto(nombre, descripcion, precio, disponible);
        JOptionPane.showMessageDialog(null, "¡Producto registrado con éxito!");

        Vista.Formularios.frmRegistroVenta principal = new Vista.Formularios.frmRegistroVenta();
        this.setVisible(false);
        principal.setVisible(true);

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // Vuelve al formulario principal
        dispose();
        //Vista.Formularios.frmRegistroVenta principal = new Vista.Formularios.frmRegistroVenta();
        //pincipal.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        ln = new LogicaDeNegocio();
        String cod = rbtnCodigo.getActionCommand();
        String codigo = txtCodigo.getText();
        String nombre = txtNombre.getText();
        ResultSet rs = null;
        if (rbtnCodigo.isSelected()) {
            if (ln.validarSiExisteProductoCodigo(codigo)) {
                rs = ln.listarProductosCodigo(Integer.valueOf(codigo));
            }
            else{
               JOptionPane.showMessageDialog(null, "El producto '" + txtCodigo.getText() + "' no existe."); 
            }
        } else {
            if (ln.validarSiExisteProductoNombre(nombre)) {
                rs = ln.listarProductosNombre(nombre);
            }
            else{
               JOptionPane.showMessageDialog(null, "El producto '" + txtNombre.getText() + "' no existe."); 
            }            
        }
        try {
            while (rs.next()) {
                txtCodigo.setText(rs.getString(1));
                txtNombre.setText(rs.getString(2));
                txtaDescripcion.setText(rs.getString(3));
                spnPrecio.setValue(Float.valueOf(rs.getString(4)));
                spnDisponible.setValue(Integer.valueOf(rs.getString(5)));
            }
        } catch (SQLException | NumberFormatException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void rbtnCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCodigoActionPerformed
        txtCodigo.setEnabled(true);
        txtNombre.setEnabled(false);
        txtNombre.setText("");
        txtCodigo.setText("");
        txtaDescripcion.setText("");
        spnPrecio.setValue(0);
        spnDisponible.setValue(0);
    }//GEN-LAST:event_rbtnCodigoActionPerformed

    private void rbtnNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnNombreActionPerformed
        txtCodigo.setEnabled(false);
        txtNombre.setEnabled(true);
        txtCodigo.setText("");
        txtNombre.setText("");
        txtaDescripcion.setText("");
        spnPrecio.setValue(0);
        spnDisponible.setValue(0);
    }//GEN-LAST:event_rbtnNombreActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txtNombre.requestFocus(true);
    }//GEN-LAST:event_formWindowOpened

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String nombre, codigo, descripcion, precio, dispo;
        codigo = txtCodigo.getText();
        nombre = txtNombre.getText();
        descripcion = txtaDescripcion.getText();
        precio = String.valueOf(spnPrecio.getValue());
        dispo = String.valueOf(spnDisponible.getValue());
        ln.actualizarProducto(nombre, descripcion, precio, dispo);
        
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
            java.util.logging.Logger.getLogger(frmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtnCodigo;
    private javax.swing.JRadioButton rbtnNombre;
    private javax.swing.JSpinner spnDisponible;
    private javax.swing.JSpinner spnPrecio;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextArea txtaDescripcion;
    // End of variables declaration//GEN-END:variables
}
