/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication3;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author alhammadi
 */
public class SearchCriminal extends javax.swing.JFrame {

    /**
     * Creates new form SearchCriminal
     */
    myDBCon db;
    public SearchCriminal(myDBCon db) {
        this.db = db;
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

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("First Name");

        jLabel2.setText("Last Name");

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText(" Age");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("Weight");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setText("Height");

        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setText("Criminal ID");

        jButton6.setText("Search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel7.setText("Query Criminal By Attribute");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel7)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel7)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(jLabel5))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(jTextField6.getText().isEmpty() || jTextField6.getText().length()>4 || !Validation.isInteger(jTextField6.getText().trim()) || Integer.valueOf(jTextField6.getText())<0)
        {
            if(jTextField6.getText().isEmpty()) JOptionPane.showMessageDialog(null, "Please Type A number");
            else if(jTextField6.getText().length()>4) JOptionPane.showMessageDialog(null, "criminalid must be 4 digits");
            else if(!Validation.isInteger(jTextField6.getText().trim())) JOptionPane.showMessageDialog(null, "please type an integer");
            else JOptionPane.showMessageDialog(null, "criminalid cannot be negative");
        }
        else
        {
            String SQL = "SELECT * FROM CRIMINAL WHERE CRIMINALID = '" + jTextField6.getText().trim() + "'";
            System.out.println(SQL);
            int size = 0;
            try {
                ResultSet rs = db.executeQuery(SQL);
                
                while (rs.next()) {
                    size++;
                }
            } catch (SQLException ex) {
                Logger.getLogger(SearchCriminal.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(size == 0)
            {
                JOptionPane.showMessageDialog(null, "Result set is empty");
            }
            else
            {
                new DisplayCriminal(db, SQL).setVisible(true);
            }
            
            
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "First Name Cannot Be Empty");        
        }
        else
        {
            String SQL = "SELECT * FROM CRIMINAL WHERE FNAME = '" + jTextField1.getText().trim().toUpperCase() + "'";
            int size = 0;
            try {
                ResultSet rs = db.executeQuery(SQL);

                while (rs.next()) {
                    size++;
                }
            } catch (SQLException ex) {
                Logger.getLogger(SearchCriminal.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(size == 0)
            {
                JOptionPane.showMessageDialog(null, "Result set is empty");
            }
            else
            {
                new DisplayCriminal(db, SQL).setVisible(true);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jTextField2.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Last Name Cannot Be Empty");        
        }
        else
        {
            String SQL = "SELECT * FROM CRIMINAL WHERE LNAME = '" + jTextField2.getText().trim().toUpperCase() + "'";
            int size = 0;
            try {
                ResultSet rs = db.executeQuery(SQL);

                while (rs.next()) {
                    size++;
                }
            } catch (SQLException ex) {
                Logger.getLogger(SearchCriminal.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(size == 0)
            {
                JOptionPane.showMessageDialog(null, "Result set is empty");
            }
            else
            {
                new DisplayCriminal(db, SQL).setVisible(true);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(jTextField3.getText().isEmpty() || jTextField3.getText().length()>3 || !Validation.isInteger(jTextField3.getText().trim()) || Integer.valueOf(jTextField3.getText())<0)
        {
            if(jTextField3.getText().isEmpty()) JOptionPane.showMessageDialog(null, "Please Type A number");
            else if(jTextField3.getText().length()>4) JOptionPane.showMessageDialog(null, "age must be 3 digits");
            else if(!Validation.isInteger(jTextField3.getText().trim())) JOptionPane.showMessageDialog(null, "please type an integer");
            else JOptionPane.showMessageDialog(null, "age cannot be negative");
        }
        else
        {
            String SQL = "SELECT * FROM CRIMINAL WHERE AGE = '" + jTextField3.getText().trim() + "'";
            int size = 0;
            try {
                ResultSet rs = db.executeQuery(SQL);

                while (rs.next()) {
                    size++;
                }
            } catch (SQLException ex) {
                Logger.getLogger(SearchCriminal.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(size == 0)
            {
                JOptionPane.showMessageDialog(null, "Result set is empty");
            }
            else
            {
                new DisplayCriminal(db, SQL).setVisible(true);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(jTextField4.getText().isEmpty() || !Validation.isInteger(jTextField4.getText().trim()) || Integer.valueOf(jTextField4.getText())<0)
        {
            if(jTextField4.getText().isEmpty()) JOptionPane.showMessageDialog(null, "Please Type A number");
            
            else if(!Validation.isInteger(jTextField4.getText().trim())) JOptionPane.showMessageDialog(null, "please type an integer");
            else JOptionPane.showMessageDialog(null, "weight cannot be negative");
        }
        else
        {
            String SQL = "SELECT * FROM CRIMINAL WHERE WEIGHT = '" + jTextField4.getText().trim() + "'";
            int size = 0;
            try {
                ResultSet rs = db.executeQuery(SQL);

                while (rs.next()) {
                    size++;
                }
            } catch (SQLException ex) {
                Logger.getLogger(SearchCriminal.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(size == 0)
            {
                JOptionPane.showMessageDialog(null, "Result set is empty");
            }
            else
            {
                new DisplayCriminal(db, SQL).setVisible(true);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(jTextField5.getText().isEmpty() || !Validation.isInteger(jTextField5.getText().trim()) || Integer.valueOf(jTextField5.getText())<0)
        {
            if(jTextField5.getText().isEmpty()) JOptionPane.showMessageDialog(null, "Please Type A number");
            
            else if(!Validation.isInteger(jTextField5.getText().trim())) JOptionPane.showMessageDialog(null, "please type an integer");
            else JOptionPane.showMessageDialog(null, "height cannot be negative");
        }
        else
        {
            String SQL = "SELECT * FROM CRIMINAL WHERE HEIGHT = '" + jTextField5.getText().trim() + "'";
            int size = 0;
            try {
                ResultSet rs = db.executeQuery(SQL);

                while (rs.next()) {
                    size++;
                }
            } catch (SQLException ex) {
                Logger.getLogger(SearchCriminal.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(size == 0)
            {
                JOptionPane.showMessageDialog(null, "Result set is empty");
            }
            else
            {
                new DisplayCriminal(db, SQL).setVisible(true);
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
