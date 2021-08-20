/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Metodos.verificacion;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class sesion extends javax.swing.JFrame {
       
    /**
     * Creates new form sesion
     */
    public sesion() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    public static String nombre = "";
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonIngresar = new javax.swing.JButton();
        jLabelUsuario = new javax.swing.JLabel();
        jLabeluser = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelContraseña = new javax.swing.JLabel();
        jPasswordFieldContraseña = new javax.swing.JPasswordField();
        jButtonSalir = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonIngresar.setBackground(new java.awt.Color(0, 51, 102));
        jButtonIngresar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonIngresar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIngresar.setText("Ingresar");
        jButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, 30));

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUsuario.setText("Usuario:");
        getContentPane().add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 90, 20));

        jLabeluser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user.png"))); // NOI18N
        getContentPane().add(jLabeluser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jTextFieldUsuario.setBackground(new java.awt.Color(102, 153, 255));
        jTextFieldUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldUsuarioKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 140, -1));

        jLabelContraseña.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelContraseña.setForeground(new java.awt.Color(255, 255, 255));
        jLabelContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelContraseña.setText("Contraseña:");
        getContentPane().add(jLabelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 80, 20));

        jPasswordFieldContraseña.setBackground(new java.awt.Color(102, 153, 255));
        jPasswordFieldContraseña.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jPasswordFieldContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 140, -1));

        jButtonSalir.setBackground(new java.awt.Color(0, 51, 102));
        jButtonSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 80, 30));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/waallpapers.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 307, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioKeyTyped
        // TODO add your handling code here:
        int caracter = evt.getKeyChar();
        if(Character.isDigit(caracter)){
          evt.consume();
        }
    }//GEN-LAST:event_jTextFieldUsuarioKeyTyped

    private void jButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarActionPerformed
        // TODO add your handling code here:
        
        nombre = this.jTextFieldUsuario.getText();
        
        verificacion objeto1 = new verificacion();
        try {
            if(objeto1.verificarIngreso(this.jTextFieldUsuario.getText(),new String(this.jPasswordFieldContraseña.getPassword()))){
                Productos producto1 = new Productos();
                producto1.setVisible(true);
                this.dispose();
            }else{
              JOptionPane.showMessageDialog(null,"Usuario o contraseña incorrecta");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
        
    }//GEN-LAST:event_jButtonIngresarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

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
            java.util.logging.Logger.getLogger(sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JLabel jLabeluser;
    private javax.swing.JPasswordField jPasswordFieldContraseña;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
