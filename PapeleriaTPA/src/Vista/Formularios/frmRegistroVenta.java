/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Formularios;

import Logica.Producto;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 *
 * @author sebgv_000
 */
public class frmRegistroVenta extends javax.swing.JFrame {

    /**
     * Creates new form frmRegistroVenta
     */
    public frmRegistroVenta() {
        initComponents();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblDocumento = new javax.swing.JLabel();
        lblProducto = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        cmbProducto = new javax.swing.JComboBox<>();
        lblRPrecio = new javax.swing.JLabel();
        lblRTotal = new javax.swing.JLabel();
        lblNombreVendedor = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        lblRNombreVendedor = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniVendedor = new javax.swing.JMenuItem();
        mniProducto = new javax.swing.JMenuItem();
        mniCliente = new javax.swing.JMenuItem();
        mniSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDocumento.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        lblDocumento.setForeground(new java.awt.Color(255, 255, 255));
        lblDocumento.setText("Documento:");
        getContentPane().add(lblDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        lblProducto.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        lblProducto.setForeground(new java.awt.Color(255, 255, 255));
        lblProducto.setText("Producto:");
        getContentPane().add(lblProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 65, -1, -1));

        lblPrecio.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(255, 255, 255));
        lblPrecio.setText("Precio:");
        getContentPane().add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 114, -1, -1));

        lblTotal.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblTotal.setText("Total:");
        getContentPane().add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 155, -1, -1));
        getContentPane().add(txtDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 21, 100, -1));

        cmbProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cmbProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 71, 100, -1));

        lblRPrecio.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        lblRPrecio.setForeground(new java.awt.Color(255, 255, 255));
        lblRPrecio.setText("Aqui va el precio");
        getContentPane().add(lblRPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 114, -1, -1));

        lblRTotal.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        lblRTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblRTotal.setText("Aqui va el total");
        getContentPane().add(lblRTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 155, 199, -1));

        lblNombreVendedor.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        lblNombreVendedor.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreVendedor.setText("Nombre vendedor:");
        getContentPane().add(lblNombreVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 12, -1, 35));

        lblCantidad.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(255, 255, 255));
        lblCantidad.setText("Cantidad:");
        getContentPane().add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 65, -1, -1));
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(454, 74, 39, -1));

        btnAgregar.setText("+");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 71, -1, -1));

        btnEliminar.setText("x");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 71, -1, -1));

        btnSalir.setText("Cerrar sesión");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        btnConfirmar.setText("Confirmar venta");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        lblRNombreVendedor.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
        lblRNombreVendedor.setForeground(new java.awt.Color(255, 255, 255));
        lblRNombreVendedor.setText("Aqui va el nombre");
        getContentPane().add(lblRNombreVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 12, -1, -1));

        jMenu1.setText("Archivo");

        mniVendedor.setText("Añadir vendedor");
        mniVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniVendedorActionPerformed(evt);
            }
        });
        jMenu1.add(mniVendedor);

        mniProducto.setText("Añadir productos");
        jMenu1.add(mniProducto);

        mniCliente.setText("Añadir cliente");
        mniCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniClienteActionPerformed(evt);
            }
        });
        jMenu1.add(mniCliente);

        mniSalir.setText("Salir");
        mniSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSalirActionPerformed(evt);
            }
        });
        jMenu1.add(mniSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edición");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Herramientas");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniVendedorActionPerformed
        frmRegistroVendedor regven = new frmRegistroVendedor();
        regven.setVisible(true);
    }//GEN-LAST:event_mniVendedorActionPerformed

    private void mniClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniClienteActionPerformed
        frmRegistroCliente regcli = new frmRegistroCliente();
        this.dispose();
        regcli.setVisible(true);
    }//GEN-LAST:event_mniClienteActionPerformed

    private void mniSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSalirActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_mniSalirActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        frmLogin login = new frmLogin();
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        Producto insertar = new Producto();
        insertar.insertarFinal(String.valueOf(cmbProducto.getSelectedIndex()), lblRPrecio.getText(), txtCantidad.getText());
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        Producto eliminar = new Producto();
        eliminar.eliminarFinal();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfirmarActionPerformed

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
            java.util.logging.Logger.getLogger(frmRegistroVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistroVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistroVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistroVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistroVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbProducto;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblDocumento;
    private javax.swing.JLabel lblNombreVendedor;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblRNombreVendedor;
    private javax.swing.JLabel lblRPrecio;
    private javax.swing.JLabel lblRTotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JMenuItem mniCliente;
    private javax.swing.JMenuItem mniProducto;
    private javax.swing.JMenuItem mniSalir;
    private javax.swing.JMenuItem mniVendedor;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDocumento;
    // End of variables declaration//GEN-END:variables
}
