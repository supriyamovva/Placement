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
public class Deletestudent extends javax.swing.JFrame {

    /**
     * Creates new form Deletestudent
     */
    public Deletestudent() {
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
        stu_idfield = new javax.swing.JTextField();
        submitbutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ENTER THE STUDENT ID TO BE DELETED");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 20, 560, 102);

        stu_idfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stu_idfieldActionPerformed(evt);
            }
        });
        getContentPane().add(stu_idfield);
        stu_idfield.setBounds(230, 120, 137, 22);

        submitbutton.setText("SUBMIT");
        submitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(submitbutton);
        submitbutton.setBounds(260, 170, 77, 25);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/placementmanagement/main.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 650, 300);

        setSize(new java.awt.Dimension(660, 347));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void stu_idfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stu_idfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stu_idfieldActionPerformed

    private void submitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbuttonActionPerformed
        // TODO add your handling code here:
           try
        {
                 String sql1 = "delete from companies where student_id = "+stu_idfield.getText()+";";
                 System.out.println(sql1);
                  
                 Useconnections.registerDriver();
                 Connection conn = Useconnections.connectDatabase();
                 ResultSet rs = Useconnections.statementResultset(conn,sql1);
                 
                 if( sql1!= null)
                 {
                     try
        {
                 String sql2 = "delete from student where student_id = "+stu_idfield.getText()+";";
                 System.out.println(sql2);
                  
                 Useconnections.registerDriver();
                 Connection conn1 = Useconnections.connectDatabase();
                 ResultSet rs1 = Useconnections.statementResultset(conn1,sql2);
                 
                 if( sql2!= null)
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
    }//GEN-LAST:event_submitbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(Deletestudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deletestudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deletestudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deletestudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Deletestudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField stu_idfield;
    private javax.swing.JButton submitbutton;
    // End of variables declaration//GEN-END:variables
}
