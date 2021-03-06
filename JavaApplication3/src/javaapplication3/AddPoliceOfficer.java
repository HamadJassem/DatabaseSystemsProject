/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication3;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author theag
 */
public class AddPoliceOfficer extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    private myDBCon db;
    
    PreparedStatement prepStatement;
    ResultSet rsStation;
    ResultSet rs;

    public AddPoliceOfficer(myDBCon db) {
        this.db = db;     
        initComponents();
        lblRankError.setText("");
        clearErrorLabels();
        try {
            rsStation = db.executeQuery("SELECT stationID FROM police_station ORDER BY stationID ASC");
            rs = db.executeQuery("SELECT officerID FROM officer ORDER BY officerID ASC");
            while (rsStation.next()) {
                StationIDcomboBox.addItem(rsStation.getString("stationID"));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
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

        jLabel6 = new javax.swing.JLabel();
        StationIDLabel = new javax.swing.JLabel();
        RankcomboBox = new javax.swing.JComboBox<>();
        FirstNameLabel = new javax.swing.JLabel();
        LnameLabel = new javax.swing.JLabel();
        hiredateLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        OfficerIDLabel = new javax.swing.JLabel();
        txtOfficerID = new javax.swing.JTextField();
        txtFname = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        lblOfficerIDError = new javax.swing.JLabel();
        lblFnameError = new javax.swing.JLabel();
        lblRankError = new javax.swing.JLabel();
        lblLnameError = new javax.swing.JLabel();
        btnAddOfficer = new javax.swing.JButton();
        txtDate = new javax.swing.JTextField();
        lblDateError = new javax.swing.JLabel();
        StationIDcomboBox = new javax.swing.JComboBox<>();
        lblStationIDError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jLabel6.setText("Rank:");

        StationIDLabel.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        StationIDLabel.setText("Station#:");

        RankcomboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Officer", "Captain" }));
        RankcomboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RankcomboBoxItemStateChanged(evt);
            }
        });
        RankcomboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RankcomboBoxActionPerformed(evt);
            }
        });

        FirstNameLabel.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        FirstNameLabel.setText("Firsrt Name:");

        LnameLabel.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        LnameLabel.setText("Last Name:");

        hiredateLabel.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        hiredateLabel.setText("Hire Date:");

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel1.setText("Add Police Officer");

        OfficerIDLabel.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        OfficerIDLabel.setText("Officer ID:");

        lblOfficerIDError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblOfficerIDError.setForeground(new java.awt.Color(255, 0, 0));
        lblOfficerIDError.setText("error label");

        lblFnameError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblFnameError.setForeground(new java.awt.Color(255, 0, 0));
        lblFnameError.setText("error label");

        lblRankError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblRankError.setForeground(new java.awt.Color(255, 0, 0));
        lblRankError.setText("error label");

        lblLnameError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblLnameError.setForeground(new java.awt.Color(255, 0, 0));
        lblLnameError.setText("error label");

        btnAddOfficer.setText("ADD");
        btnAddOfficer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOfficerActionPerformed(evt);
            }
        });

        lblDateError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblDateError.setForeground(new java.awt.Color(255, 0, 0));
        lblDateError.setText("error label");

        StationIDcomboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StationIDcomboBoxActionPerformed(evt);
            }
        });

        lblStationIDError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblStationIDError.setForeground(new java.awt.Color(255, 0, 0));
        lblStationIDError.setText("error label");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FirstNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblFnameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LnameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblLnameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hiredateLabel)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(StationIDcomboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                        .addComponent(lblStationIDError, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(RankcomboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblRankError, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblDateError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(OfficerIDLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtOfficerID, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblOfficerIDError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(btnAddOfficer, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(StationIDLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OfficerIDLabel)
                    .addComponent(txtOfficerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOfficerIDError))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstNameLabel)
                    .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFnameError))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LnameLabel)
                    .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLnameError))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hiredateLabel)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDateError))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(RankcomboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblRankError))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(StationIDLabel)
                        .addComponent(StationIDcomboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblStationIDError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(btnAddOfficer, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RankcomboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RankcomboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RankcomboBoxActionPerformed

     boolean isValidData() {
        boolean result = true;
        

        if (txtOfficerID.getText().trim().isEmpty() || !Validation.isInteger(txtOfficerID.getText().trim()) || txtOfficerID.getText().trim().length() > 4) {
            if (txtOfficerID.getText().trim().isEmpty()) {
                lblOfficerIDError.setText("Invalid. Cannot be empty.");
            } else if (!Validation.isInteger(txtOfficerID.getText().trim())) {
                lblOfficerIDError.setText("Invalid. Must be integer.");
            }
            else
            {
                lblOfficerIDError.setText("Invalid. ID must be less than 10000.");
            }

            result = false;
        }

        if (txtFname.getText().trim().isEmpty() || (txtFname.getText().trim().length() > 10)) {
            if (txtFname.getText().trim().isEmpty()) {
                lblFnameError.setText("Invalid. Cannot be empty.");
            } else if ((txtFname.getText().trim().length() > 25)) {
                lblFnameError.setText("Invalid. cannot exceed 25 chars.");
            }

            result = false;
        }

        if (txtLname.getText().trim().isEmpty() || (txtLname.getText().trim().length() > 10)) {
            if (txtLname.getText().trim().isEmpty()) {
                lblLnameError.setText("Invalid. Cannot be empty.");
            } else if ((txtLname.getText().trim().length() > 25)) {
                lblLnameError.setText("Invalid. cannot exceed 25 chars.");
            }

            result = false;
        }
        
        if (txtDate.getText().trim().isEmpty()) {
            lblDateError.setText("Invalid. Cannot be empty.");
            result = false;
        }
        
        if(StationIDcomboBox.getItemCount() == 0)
        {
            lblStationIDError.setText("Invalid. Cannot be empty.");
            result = false;
        }

        

        return result;
    }
    private void btnAddOfficerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOfficerActionPerformed
        // TODO add your handling code here:
       clearErrorLabels();
       try {
       if(isValidData())
       {
               
               this.db.setupPrepStatement("INSERT INTO officer (officerID, fname, lname, hiredate, rank, stationID) VALUES (? , ? , ?, ? , ? , ?)");
               this.db.getPrepStatement().setInt(1, Integer.parseInt(txtOfficerID.getText()));
               this.db.getPrepStatement().setString(2, txtFname.getText().toUpperCase());
               this.db.getPrepStatement().setString(3, txtLname.getText().toUpperCase());
               this.db.getPrepStatement().setString(4, txtDate.getText());
               this.db.getPrepStatement().setString(5, RankcomboBox.getSelectedItem().toString().toUpperCase());
               this.db.getPrepStatement().setInt(6, Integer.parseInt(StationIDcomboBox.getSelectedItem().toString()));
               
               int result = this.db.executePrepUpdate();
                if (result > 0) {

                    javax.swing.JLabel label = new javax.swing.JLabel("New Officer added successfully.");
                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);

                    clearTxtBoxes();
                }
                
           }
       else
       {
           javax.swing.JLabel label = new javax.swing.JLabel("Please fix validation errors...");
           label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
           JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);
       }
           }  catch (SQLException ex) {
               lblOfficerIDError.setText("Invalid. Officer ID already exists.");
               JOptionPane.showMessageDialog(null, "Error adding new Officer.");
       }
       
       
    }//GEN-LAST:event_btnAddOfficerActionPerformed

    private void StationIDcomboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StationIDcomboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StationIDcomboBoxActionPerformed

    private void RankcomboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RankcomboBoxItemStateChanged
        try
        {
            StationIDcomboBox.removeAllItems();
            if(RankcomboBox.getSelectedItem().toString().equals("Captain"))     
            {
                rs = db.executeQuery("SELECT * FROM police_station WHERE HeadID = null");
                if(rs.next())
                {
                    rs.previous();
                    while(rs.next())
                    {
                        StationIDcomboBox.addItem(rs.getString("StationID"));
                        RankcomboBox.setSelectedItem("Officer"); // officer
                    }
                }
                else
                {
                    lblRankError.setText("Warning: there are no station with no head officer");
      
                }
            }
            else if(RankcomboBox.getSelectedItem().toString().equals("Officer"))
            {
                rs = db.executeQuery("SELECT * FROM police_station"); 
                while(rs.next())                  
                {
                    StationIDcomboBox.addItem(rs.getString("StationID"));
                } 
                lblRankError.setText("");
            }
        }
        catch (SQLException ex)
            {
                Logger.getLogger(AddPoliceOfficer.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }//GEN-LAST:event_RankcomboBoxItemStateChanged

   

    void clearErrorLabels() {
        lblOfficerIDError.setText("");
        lblFnameError.setText("");
        lblLnameError.setText("");
        lblDateError.setText("");
        lblStationIDError.setText("");
    }

   

    void clearTxtBoxes() {
        txtOfficerID.setText("");
        txtFname.setText("");
        txtLname.setText("");
        txtDate.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FirstNameLabel;
    private javax.swing.JLabel LnameLabel;
    private javax.swing.JLabel OfficerIDLabel;
    private javax.swing.JComboBox<String> RankcomboBox;
    private javax.swing.JLabel StationIDLabel;
    private javax.swing.JComboBox<String> StationIDcomboBox;
    private javax.swing.JButton btnAddOfficer;
    private javax.swing.JLabel hiredateLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblDateError;
    private javax.swing.JLabel lblFnameError;
    private javax.swing.JLabel lblLnameError;
    private javax.swing.JLabel lblOfficerIDError;
    private javax.swing.JLabel lblRankError;
    private javax.swing.JLabel lblStationIDError;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtOfficerID;
    // End of variables declaration//GEN-END:variables

}
