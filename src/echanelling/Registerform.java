/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echanelling;

import DBConnector.DBConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Rajive Lochchan
 */
public class Registerform extends javax.swing.JFrame {

    Connection con;

    /**
     * Creates new form Resgisterform
     */
    public Registerform() {
        initComponents();
        DBConnection objDB = new DBConnection();
        con = objDB.geConnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        txtcontact = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        txtblood = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        radiomale = new javax.swing.JRadioButton();
        radiofemale = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        access = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rajive Lochchan\\Downloads\\icons8-long-arrow-left-80.png")); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, -1, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setText("Create an Account");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 11, -1, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel3.setText("Name:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 52, -1, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel4.setText("Age:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 78, -1, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel5.setText("Contact No:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 106, -1, -1));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel6.setText("Address:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 156, -1, -1));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel7.setText("Gender:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel8.setText("Email:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 20));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel9.setText("Blood Group:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));
        jPanel2.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 50, 170, -1));
        jPanel2.add(txtage, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 76, 170, -1));

        txtcontact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontactActionPerformed(evt);
            }
        });
        jPanel2.add(txtcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 104, 170, -1));

        txtaddress.setColumns(20);
        txtaddress.setRows(5);
        jScrollPane1.setViewportView(txtaddress);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 156, 210, 50));

        txtblood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbloodActionPerformed(evt);
            }
        });
        jPanel2.add(txtblood, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 170, -1));
        jPanel2.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 170, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rajive Lochchan\\Pictures\\Register-Button copy.jpg")); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 280, 460, 50));

        radiomale.setBackground(new java.awt.Color(255, 255, 255));
        radiomale.setText("Male");
        radiomale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiomaleActionPerformed(evt);
            }
        });
        jPanel2.add(radiomale, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        radiofemale.setBackground(new java.awt.Color(255, 255, 255));
        radiofemale.setText("Female");
        jPanel2.add(radiofemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel10.setText("Account Credentials");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, -1));

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel11.setText("Username:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 60, 20));
        jPanel2.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 170, -1));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel12.setText("Password:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, 20));

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rajive Lochchan\\Downloads\\icons8-add-user-male-filled-50.png")); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 50, 60));
        jPanel2.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 170, -1));

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel18.setText("Acess Type:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, 20));

        access.setEditable(false);
        access.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        access.setText("Patient");
        jPanel2.add(access, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 120, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText("*For Office Use Only");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 100, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 340, 520));

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rajive Lochchan\\Pictures\\medilogo.png")); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, 140));

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Register Your Account Here");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 330, 50));

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rajive Lochchan\\Pictures\\register.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 540));

        setSize(new java.awt.Dimension(704, 580));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtcontactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontactActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        Login obj = new Login();
        obj.setVisible(true);
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseClicked

    private void radiomaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiomaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiomaleActionPerformed
    public void variable() {

    }
    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked

        String mobileNumber = txtcontact.getText().toString().trim();

        if (txtname.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Name Field is empty", "Registration Unsuccesfull", JOptionPane.ERROR_MESSAGE);
        } else if (txtage.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Age Field is empty", "Registration Unsuccesfull", JOptionPane.ERROR_MESSAGE);
        } else if (txtcontact.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Contact Field is empty", "Registration Unsuccesfull", JOptionPane.ERROR_MESSAGE);
        }

        if (mobileNumber.length() != 10) {

            JOptionPane.showMessageDialog(null, "Mobile Number should be 10 Characters", "Registration Unsuccesfull", JOptionPane.ERROR_MESSAGE);

        } else if (txtaddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Address Field empty", "Registration Unsuccesfull", JOptionPane.ERROR_MESSAGE);
        } else if (txtblood.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Blood Group Field empty", "Registration Unsuccesfull", JOptionPane.ERROR_MESSAGE);
        } else if (txtemail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Email Field empty", "Registration Unsuccesfull", JOptionPane.ERROR_MESSAGE);
        } else {
            String Gender = null;
            if (radiomale.isSelected()) {
                Gender = "Male";
            } else if (radiofemale.isSelected()) {
                Gender = "Female";
            }

            try {
                PreparedStatement stat = con.prepareStatement("insert into PatientTable values (?,?,?,?,?,?,?) ");
                int row = 0;

                stat.setString(1, txtname.getText());
                stat.setString(2, txtage.getText());
                stat.setString(3, txtcontact.getText());
                stat.setString(4, Gender);
                stat.setString(5, txtaddress.getText());
                stat.setString(6, txtblood.getText());
                stat.setString(7, txtemail.getText());

                row = stat.executeUpdate();
                if (row > 0) {
                    JOptionPane.showMessageDialog(null, "Patient Details Have Been Registered", "Registeration sucessful", JOptionPane.INFORMATION_MESSAGE);
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "An error occured during the execution\n" + ex, "Information not submitted", JOptionPane.ERROR_MESSAGE);
            }
        }

// TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

    private void txtbloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbloodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbloodActionPerformed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked

        if (txtusername.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Username Field is empty", "Registration Unsuccesfull", JOptionPane.ERROR_MESSAGE);
        } else if (txtpassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Password Field is empty", "Registration Unsuccesfull", JOptionPane.ERROR_MESSAGE);
        }   
        
try {
                PreparedStatement stat = con.prepareStatement("insert into UserTable values (?,?,?) ");
                int row = 0;

                stat.setString(1, txtusername.getText());
                stat.setString(2, txtpassword.getText());
                stat.setString(3, access.getText());
                
                

                    row = stat.executeUpdate();
                if (row > 0) {
                    JOptionPane.showMessageDialog(null, "Patient Credentials Have Been Registered", "Registeration sucessful", JOptionPane.INFORMATION_MESSAGE);
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, "An error occured during the execution\n" + ex, "Information not submitted", JOptionPane.ERROR_MESSAGE);
            }


// TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MouseClicked

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
            java.util.logging.Logger.getLogger(Registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registerform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registerform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField access;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radiofemale;
    private javax.swing.JRadioButton radiomale;
    private javax.swing.JTextArea txtaddress;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtblood;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
