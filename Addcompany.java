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

/**
 *
 * @author Lenovo
 */
public class Addcompany extends javax.swing.JFrame {

    /**
     * Creates new form Addcompany
     */
    public Addcompany() {
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        companynamefield = new javax.swing.JTextField();
        companytypefield = new javax.swing.JTextField();
        companybranchfield = new javax.swing.JTextField();
        companyminqual = new javax.swing.JTextField();
        companycgpa = new javax.swing.JTextField();
        companyaddbutton = new javax.swing.JButton();
        companypackage = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        companyyearfield = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("          ADD COMPANY DETAILS");
        jLabel1.setMaximumSize(new java.awt.Dimension(315, 28));
        jLabel1.setMinimumSize(new java.awt.Dimension(315, 28));
        jLabel1.setPreferredSize(new java.awt.Dimension(315, 28));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 20, 392, 76);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 136, 36, 27);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NAME:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(12, 119, 86, 25);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TYPE:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(12, 162, 86, 27);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("BRANCH:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(13, 204, 86, 27);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MIN_QUAL:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(13, 244, 86, 30);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CGPA:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(13, 287, 86, 33);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PACKAGE:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(13, 327, 86, 32);

        companynamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companynamefieldActionPerformed(evt);
            }
        });
        getContentPane().add(companynamefield);
        companynamefield.setBounds(116, 120, 392, 22);

        companytypefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companytypefieldActionPerformed(evt);
            }
        });
        getContentPane().add(companytypefield);
        companytypefield.setBounds(116, 164, 392, 22);
        getContentPane().add(companybranchfield);
        companybranchfield.setBounds(116, 206, 392, 22);

        companyminqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyminqualActionPerformed(evt);
            }
        });
        getContentPane().add(companyminqual);
        companyminqual.setBounds(116, 244, 392, 22);

        companycgpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companycgpaActionPerformed(evt);
            }
        });
        getContentPane().add(companycgpa);
        companycgpa.setBounds(116, 287, 392, 22);

        companyaddbutton.setText("SUBMIT");
        companyaddbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyaddbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(companyaddbutton);
        companyaddbutton.setBounds(427, 417, 124, 46);

        companypackage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companypackageActionPerformed(evt);
            }
        });
        getContentPane().add(companypackage);
        companypackage.setBounds(116, 327, 392, 22);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("YEAR:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(12, 366, 70, 32);

        companyyearfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyyearfieldActionPerformed(evt);
            }
        });
        getContentPane().add(companyyearfield);
        companyyearfield.setBounds(116, 371, 392, 22);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/placementmanagement/main.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 610, 480);

        setSize(new java.awt.Dimension(630, 531));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void companyaddbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyaddbuttonActionPerformed
        // TODO add your handling code here:
          try
        {
                 String sql1="insert into company values('"+companynamefield.getText()+"','"+companytypefield.getText()+"','"+companybranchfield.getText()+"','"+companyminqual.getText()+"',"+companycgpa.getText()+","+companypackage.getText()+","+companyyearfield.getText()+");";
                 System.out.println(sql1);
                 Useconnections.registerDriver();
                 Connection conn = Useconnections.connectDatabase();
                 ResultSet rs = Useconnections.statementResultset(conn,sql1);
                 if( sql1!= null)
                 {
                 this.setVisible(false);
                 JFrame frame=new JFrame();
                 Selectform s = new Selectform(frame,true);
                 s.show();
                 }
                 else
                 {
                     JOptionPane.showMessageDialog(this,"Fill all the fields","ERROR",JOptionPane.ERROR_MESSAGE);
                 }
       
           
        }
        catch(Exception e)
        {
            System.out.println("ADD COMPANY EXCEPTION OCCURED"); 
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_companyaddbuttonActionPerformed

    private void companyminqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyminqualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_companyminqualActionPerformed

    private void companytypefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companytypefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_companytypefieldActionPerformed

    private void companypackageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companypackageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_companypackageActionPerformed

    private void companyyearfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyyearfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_companyyearfieldActionPerformed

    private void companynamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companynamefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_companynamefieldActionPerformed

    private void companycgpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companycgpaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_companycgpaActionPerformed

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
            java.util.logging.Logger.getLogger(Addcompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Addcompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Addcompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Addcompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Addcompany().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton companyaddbutton;
    private javax.swing.JTextField companybranchfield;
    private javax.swing.JTextField companycgpa;
    private javax.swing.JTextField companyminqual;
    private javax.swing.JTextField companynamefield;
    private javax.swing.JTextField companypackage;
    private javax.swing.JTextField companytypefield;
    private javax.swing.JTextField companyyearfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
