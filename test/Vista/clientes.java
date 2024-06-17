/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import dao.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

import modelo.Cliente;

/**
 *
 * @author CAMILO
 */
public class clientes extends javax.swing.JFrame {
   Conexion cc = new Conexion();
     Connection con =cc.abrirConexion();
     
    
    
    
    public clientes() {
        initComponents();
    }

public void agregarusuario(){
        
       
    String sql =  "INSERT INTO cliente(doc, nom_completo, direcc, telefono) VALUES(?,?,?,?)";
    
    try{
        PreparedStatement pst = con.prepareStatement(sql);
        
        
           
             
            pst.setString(1, txtDoc.getText());
            pst.setString(2, txtNom.getText());
            pst.setString(3,txtDirreccion.getText());
            pst.setString(4, txtTelefono.getText());
            
            
              pst.executeUpdate();
            
            
           JOptionPane.showMessageDialog(null, "registro exitoso");
    }catch(Exception e){
        System.out.println("Error al insertar el cliente: " + e.getMessage());
    }
    
    }
     public void eliminarUsuario() {
    String sql = "DELETE FROM cliente WHERE doc = ?";
    
    try {
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, txtid.getText());
        int rowsDeleted = pst.executeUpdate();
        
        if (rowsDeleted > 0) {
            JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el registro");
        }
    } catch (Exception e) {
        System.out.println("Error al eliminar el registro: " + e.getMessage());
    }
}
     
     
public void modificarUsuario() {
    String sql = "UPDATE cliente SET nom_completo = ?, dirrecc = ?, telefono = ? WHERE doc = ?";
    
    try {
        PreparedStatement pst = con.prepareStatement(sql);
         
        pst.setString(1, txtid.getText());
             pst.setString(1, txtDoc.getText());
            pst.setString(2, txtNom.getText());
            pst.setString(3,txtDirreccion.getText());
            pst.setString(4, txtTelefono.getText());
            pst.setString(4, txtcorreo.getText());
            
        pst.executeUpdate();
        
        JOptionPane.showMessageDialog(null, "Registro actualizado exitosamente");
    } catch (Exception e) {
        System.out.println("Error al modificar el registro: " + e.getMessage());
    }
}
     
     
  
     
     
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        menu_btn = new javax.swing.JButton();
        agregar_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        modificar = new javax.swing.JButton();
        eliminar_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nuevo_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDoc = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        txtDirreccion = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtId1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel7.setText("Clientes");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, -1, -1));

        menu_btn.setText("MENU");
        menu_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_btnActionPerformed(evt);
            }
        });
        getContentPane().add(menu_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 442, -1, -1));

        agregar_btn.setBackground(new java.awt.Color(0, 0, 102));
        agregar_btn.setForeground(new java.awt.Color(255, 255, 255));
        agregar_btn.setText("AGREGAR");
        agregar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_btnActionPerformed(evt);
            }
        });
        getContentPane().add(agregar_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 442, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(70, 255, 255));
        jLabel1.setText("Nombre completo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 83, 200, 34));

        modificar.setBackground(new java.awt.Color(0, 0, 102));
        modificar.setForeground(new java.awt.Color(255, 255, 255));
        modificar.setText("MODIFICAR");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        getContentPane().add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 442, -1, -1));

        eliminar_btn.setText("ELIMINAR");
        eliminar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_btnActionPerformed(evt);
            }
        });
        getContentPane().add(eliminar_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(70, 255, 255));
        jLabel2.setText("Doc");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 200, 34));

        nuevo_btn.setText("NUEVO");
        nuevo_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevo_btnActionPerformed(evt);
            }
        });
        getContentPane().add(nuevo_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 440, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(70, 255, 255));
        jLabel3.setText("Dirreccion");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 200, 34));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(70, 255, 255));
        jLabel5.setText("correo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 70, 34));

        txtDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocActionPerformed(evt);
            }
        });
        getContentPane().add(txtDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 160, -1));

        txtNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomActionPerformed(evt);
            }
        });
        getContentPane().add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 157, -1));

        txtcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcorreoActionPerformed(evt);
            }
        });
        getContentPane().add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 104, -1));

        txtDirreccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDirreccionActionPerformed(evt);
            }
        });
        getContentPane().add(txtDirreccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 160, -1));

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 160, -1));

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 104, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 9, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(70, 255, 255));
        jLabel6.setText("ID");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 43, 80, 34));

        txtId1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtId1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 160, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(70, 255, 255));
        jLabel9.setText("Telefono");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 70, 34));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/image/Ilustración1111.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 940, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_btnActionPerformed
agregarusuario();   
    }//GEN-LAST:event_agregar_btnActionPerformed

    private void txtNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomActionPerformed

    private void txtDirreccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDirreccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDirreccionActionPerformed

    private void eliminar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_btnActionPerformed
  eliminarUsuario();
    }//GEN-LAST:event_eliminar_btnActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
modificarUsuario();
   
    }//GEN-LAST:event_modificarActionPerformed

    private void nuevo_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevo_btnActionPerformed
       
        txtid.setText("");
        txtNom.setText("");
        txtDirreccion.setText("");
        txtcorreo.setText("");
    

    }//GEN-LAST:event_nuevo_btnActionPerformed

    private void menu_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_btnActionPerformed
        menu2 ve = new menu2();
             ve.setVisible(true);
             this.dispose();
      
    }//GEN-LAST:event_menu_btnActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcorreoActionPerformed

    private void txtId1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtId1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtId1ActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocActionPerformed

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
            java.util.logging.Logger.getLogger(clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar_btn;
    private javax.swing.JButton eliminar_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton menu_btn;
    private javax.swing.JButton modificar;
    private javax.swing.JButton nuevo_btn;
    private javax.swing.JTextField txtDirreccion;
    private javax.swing.JTextField txtDoc;
    private javax.swing.JTextField txtId1;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}