/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author HP14
 */
public class LOGINFrame extends javax.swing.JFrame  {
            HOME home = new HOME();


    /**
     * Creates new form LAPAS
     */
    public LOGINFrame() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PASSWORD = new javax.swing.JLabel();
        USERNAME = new javax.swing.JLabel();
        USERNAMETextField = new javax.swing.JTextField();
        PASSWORDTextField = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PASSWORD.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        PASSWORD.setText("PASSWORD");
        getContentPane().add(PASSWORD, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 200, -1));

        USERNAME.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        USERNAME.setText("NIP");
        getContentPane().add(USERNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 130, -1));

        USERNAMETextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USERNAMETextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(USERNAMETextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 240, 30));
        getContentPane().add(PASSWORDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 240, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lapas/UI/LOGINBUTTON.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lapas/UI/LOGIN.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1024, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void USERNAMETextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USERNAMETextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_USERNAMETextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                try {
            String url="jdbc:mysql://localhost:3306/lapas"; // login merupakan nama dari database
            String user="root";
            String pass="";
            
            java.sql.Connection conn = (java.sql.Connection) DBConnection.koneksiDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet sql = stm.executeQuery("select * from PETUGAS where NIP='"+USERNAMETextField.getText()+"'");
            
            if(sql.next()){
                if(PASSWORDTextField.getText().equals(sql.getString("password"))){
                    JOptionPane.showMessageDialog(null, "login berhasil");
                    this.setVisible(false);
                    home.setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"username and password salah");
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"username dan password tidak tersedia");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"terjadi kesalahan");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(LOGINFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGINFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGINFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGINFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
  

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGINFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PASSWORD;
    private javax.swing.JPasswordField PASSWORDTextField;
    private javax.swing.JLabel USERNAME;
    private javax.swing.JTextField USERNAMETextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
