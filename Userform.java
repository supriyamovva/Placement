/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placementmanagement;

import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.*;
import javax.swing.table.*;

/**
 *
 * @author Lenovo
 */
public class Userform extends javax.swing.JDialog {

    /**
     * Creates new form Userform
     */
    public Userform(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        company_field_static = new javax.swing.JTextField();
        student_field_static = new javax.swing.JTextField();
        yearcombo = new javax.swing.JComboBox<>();
        combobranch = new javax.swing.JComboBox<>();
        submitbutton = new javax.swing.JButton();
        submit1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("            USER CAN GET THE INFORMATION ON THE FOLLOWING BASIS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 40, 760, 60);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("          YEAR:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(64, 142, 124, 27);

        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("BRANCH:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(437, 142, 119, 27);

        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("         COMPANY:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(96, 247, 124, 26);

        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText(" STUDENT_ID:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(430, 250, 119, 16);

        jButton3.setText("SUBMIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(130, 336, 77, 25);

        jButton4.setText("SUBMIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(460, 340, 77, 25);

        company_field_static.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                company_field_staticActionPerformed(evt);
            }
        });
        getContentPane().add(company_field_static);
        company_field_static.setBounds(64, 286, 193, 32);
        getContentPane().add(student_field_static);
        student_field_static.setBounds(390, 290, 197, 32);

        yearcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016" }));
        yearcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearcomboActionPerformed(evt);
            }
        });
        getContentPane().add(yearcombo);
        yearcombo.setBounds(64, 177, 124, 22);

        combobranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "ECE", "EEE", "ME" }));
        getContentPane().add(combobranch);
        combobranch.setBounds(384, 177, 146, 22);

        submitbutton.setText("SUBMIT");
        submitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(submitbutton);
        submitbutton.setBounds(206, 176, 77, 25);

        submit1.setText("SUBMIT");
        submit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit1ActionPerformed(evt);
            }
        });
        getContentPane().add(submit1);
        submit1.setBounds(548, 176, 94, 25);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/placementmanagement/main.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 700, 430);

        setSize(new java.awt.Dimension(719, 480));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void company_field_staticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_company_field_staticActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_company_field_staticActionPerformed

    private void yearcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearcomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearcomboActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         Staticvalues.result4 = student_field_static.getText();
         JFrame f = new JFrame();
         Student s = new Student(f,true);
         s.show(); 
         
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         Staticvalues.result3 = company_field_static.getText();
         JFrame f = new JFrame();
         Company c = new Company(f,true);
         c.show();  
       
    }//GEN-LAST:event_jButton3ActionPerformed

   

    private void submitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbuttonActionPerformed
        // TODO add your handling code here:
      this.setVisible(false);  
   Object selectedItem = yearcombo.getSelectedItem();
    if (selectedItem != null)
    {
    Staticvalues.result = selectedItem.toString();
    }
     JFrame f = new JFrame();
     Yeardata y = new Yeardata(f,true);
     y.show();    
       
    }//GEN-LAST:event_submitbuttonActionPerformed

    private void submit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit1ActionPerformed
        // TODO add your handling code here:
          this.setVisible(false);  
   Object selectedItem = combobranch.getSelectedItem();
    if (selectedItem != null)
    {
    Staticvalues.result1 = selectedItem.toString();
    }
     JFrame f = new JFrame();
     Branchdata b = new Branchdata(f,true);
     b.show();    
    }//GEN-LAST:event_submit1ActionPerformed

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
            java.util.logging.Logger.getLogger(Userform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Userform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Userform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Userform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Userform dialog = new Userform(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> combobranch;
    private javax.swing.JTextField company_field_static;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField student_field_static;
    private javax.swing.JButton submit1;
    private javax.swing.JButton submitbutton;
    private javax.swing.JComboBox<String> yearcombo;
    // End of variables declaration//GEN-END:variables
}
