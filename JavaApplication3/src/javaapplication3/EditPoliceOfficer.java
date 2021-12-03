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
public class EditPoliceOfficer extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    private myDBCon db;
    
   
    PreparedStatement prepStatement;
    ResultSet rs;
    ResultSet rsStation;
    public EditPoliceOfficer(myDBCon db) {
        this.db = db;
        initComponents();
        this.setLocationRelativeTo(null);

        
        lblOfficerIDError.setVisible(false);
        lblFnameError.setVisible(false);
        lblLnameError.setVisible(false);
        lblDateError.setVisible(false);
        lblRankError.setVisible(false);
        
        try {
            this.db = new myDBCon("b00083443", "b00083443");

            getNewData();
        } catch (ClassNotFoundException | SQLException e) {
            javax.swing.JLabel label = new javax.swing.JLabel("SQL Error - Connection error.");
            label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
            JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void getNewData()
    {
        try {
            rsStation = db.statement.executeQuery("SELECT stationID, address FROM police_station ORDER BY stationID ASC ");
            StationIDcomboBox.removeAllItems();
            while (rsStation.next()) {
                StationIDcomboBox.addItem(rsStation.getString("stationID"));
            }
            
            rs = db.statement.executeQuery("SELECT officerID, fname, lname, hiredate, rank, stationID FROM officer ORDER BY officerID ASC ");
            rs.beforeFirst();
            rs.first();
            populateFields();
            
        } catch (SQLException ex) {
            javax.swing.JLabel label = new javax.swing.JLabel("SQL Error - Display selected officerID.");
            label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
            JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);        
        }
    }
    
    
    //search?
    private void populateFields() {
        try {
            txtOfficerID.setText(rs.getString("officerID"));
            txtFname.setText(rs.getString("fname"));
            txtLname.setText(rs.getString("Lname"));
            txtDate.setText(rs.getString("hiredate"));
            txtRank.setText(rs.getString("rank"));
            

            
        } catch (SQLException ex) {
            Logger.getLogger(EditPoliceOfficer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public boolean isDouble(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    void clearErrorLabels() {
        lblOfficerIDError.setText("");
        lblOfficerIDError.setVisible(false);
        lblFnameError.setText("");
        lblFnameError.setVisible(false);
        lblLnameError.setText("");
        lblLnameError.setVisible(false);
        lblDateError.setText("");
        lblDateError.setVisible(false);
        lblRankError.setText("");
        lblRankError.setVisible(false);

    }
    
    boolean isValidData() {
        boolean result = true;
        clearErrorLabels();

        if (txtOfficerID.getText().trim().isEmpty() || !isInteger(txtOfficerID.getText().trim())) {
            if (txtOfficerID.getText().trim().isEmpty()) {
                lblOfficerIDError.setText("Invalid. Cannot be empty.");
            } else if (!isInteger(txtOfficerID.getText().trim())) {
                lblOfficerIDError.setText("Invalid. Must be integer.");
            }

            lblOfficerIDError.setVisible(true);
            result = false;
        }

        if (txtFname.getText().trim().isEmpty() || (txtFname.getText().trim().length() > 10)) {
            if (txtFname.getText().trim().isEmpty()) {
                lblFnameError.setText("Invalid. Cannot be empty.");
            } else if ((txtFname.getText().trim().length() > 25)) {
                lblFnameError.setText("Invalid. Must be < 25 chars.");
            }

            lblFnameError.setVisible(true);
            result = false;
        }

        if (txtLname.getText().trim().isEmpty() || (txtLname.getText().trim().length() > 10)) {
            if (txtLname.getText().trim().isEmpty()) {
                lblLnameError.setText("Invalid. Cannot be empty.");
            } else if ((txtLname.getText().trim().length() > 25)) {
                lblLnameError.setText("Invalid. Must be < 25 chars.");
            }

            lblLnameError.setVisible(true);
            result = false;
        }
        
        if (txtDate.getText().trim().isEmpty()) {
            lblDateError.setText("Invalid. Cannot be empty.");
            lblDateError.setVisible(true);
            result = false;
        }

        if (txtRank.getText().trim().isEmpty() || (txtRank.getText().trim().length() > 10)) {
            if (txtRank.getText().trim().isEmpty()) {
                lblRankError.setText("Invalid. Cannot be empty.");
            } else if ((txtRank.getText().trim().length() > 20)) {
                lblRankError.setText("Invalid. Must be < 20 chars.");
            }

            lblFnameError.setVisible(true);
            result = false;
        }

        return result;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane7 = new javax.swing.JScrollPane();
        txtRank = new javax.swing.JTextPane();
        StationIDcomboBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SearchText = new javax.swing.JTextPane();
        PicturePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        OfficerIDLabel = new javax.swing.JLabel();
        UpdateButton = new javax.swing.JButton();
        LnameLabel = new javax.swing.JLabel();
        DeleteButton = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtLname = new javax.swing.JTextPane();
        hiredateLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtOfficerID = new javax.swing.JTextPane();
        EditCriminalInfoLabel = new javax.swing.JLabel();
        FnameLabel = new javax.swing.JLabel();
        RankLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtFname = new javax.swing.JTextPane();
        lblOfficerIDError = new javax.swing.JLabel();
        lblFnameError = new javax.swing.JLabel();
        lblLnameError = new javax.swing.JLabel();
        lblDateError = new javax.swing.JLabel();
        lblRankError = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtDate = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane7.setViewportView(txtRank);

        StationIDcomboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        StationIDcomboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StationIDcomboBoxActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        jLabel9.setText("Station ID:");

        SearchText.setToolTipText("search criminal by ID"); // NOI18N
        jScrollPane1.setViewportView(SearchText);

        jLabel1.setText("Picture -maybe-");
        PicturePanel.add(jLabel1);

        searchButton.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        searchButton.setText("search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        OfficerIDLabel.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        OfficerIDLabel.setText("Officer ID:");

        UpdateButton.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        UpdateButton.setText("UPDATE");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        LnameLabel.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        LnameLabel.setText("Last Name:");

        DeleteButton.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        DeleteButton.setText("DELETE");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        jScrollPane5.setViewportView(txtLname);

        hiredateLabel.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        hiredateLabel.setText("HireDate:");

        jScrollPane2.setViewportView(txtOfficerID);

        EditCriminalInfoLabel.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        EditCriminalInfoLabel.setText("Edit Police Officer Information");

        FnameLabel.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        FnameLabel.setText("First Name:");

        RankLabel.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        RankLabel.setText("Rank:");

        jScrollPane4.setViewportView(txtFname);

        lblOfficerIDError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblOfficerIDError.setForeground(new java.awt.Color(255, 0, 0));
        lblOfficerIDError.setText("error label");

        lblFnameError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblFnameError.setForeground(new java.awt.Color(255, 0, 0));
        lblFnameError.setText("error label");

        lblLnameError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblLnameError.setForeground(new java.awt.Color(255, 0, 0));
        lblLnameError.setText("error label");

        lblDateError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblDateError.setForeground(new java.awt.Color(255, 0, 0));
        lblDateError.setText("error label");

        lblRankError.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblRankError.setForeground(new java.awt.Color(255, 0, 0));
        lblRankError.setText("error label");

        jScrollPane8.setViewportView(txtDate);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EditCriminalInfoLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(155, 155, 155)
                                        .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(62, 62, 62)))
                        .addGap(95, 95, 95))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PicturePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(StationIDcomboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(OfficerIDLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblOfficerIDError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FnameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblFnameError, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LnameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblLnameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hiredateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDateError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RankLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRankError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(searchButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EditCriminalInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(OfficerIDLabel)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblOfficerIDError))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FnameLabel)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFnameError))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LnameLabel)))
                            .addComponent(lblLnameError, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(16, 16, 16)
                                    .addComponent(hiredateLabel))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblDateError)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RankLabel)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRankError))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(StationIDcomboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PicturePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateButton)
                    .addComponent(DeleteButton))
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StationIDcomboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StationIDcomboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StationIDcomboBoxActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        // TODO add your handling code here:
        try {
            

            if (isValidData()) {
                prepStatement = db.con.prepareStatement("UPDATE officer SET fname = ?, lname = ?, hiredate = ?, raml = ?, stationID = ? WHERE officerID = ?");
                prepStatement.setString(1, txtFname.getText().toUpperCase());
                prepStatement.setString(2, txtLname.getText().toUpperCase());
                prepStatement.setString(3, txtDate.getText());
                prepStatement.setString(4, txtRank.getText().toUpperCase());
                prepStatement.setInt(5, Integer.parseInt(StationIDcomboBox.getSelectedItem().toString()));
                prepStatement.setInt(6, Integer.parseInt(txtOfficerID.getText().trim()));
                int result = prepStatement.executeUpdate();
                if (result > 0) {

                    javax.swing.JLabel label = new javax.swing.JLabel("Officer of ID: " + txtOfficerID.getText() + " updated successfully.");
                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);

                    getNewData();

                } 
                prepStatement.close();
            } else {

                javax.swing.JLabel label = new javax.swing.JLabel("Please fix validation errors...");
                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.ERROR_MESSAGE);

            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error updating officer." + e.getMessage());

        }
        
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        try {
            prepStatement = db.con.prepareStatement("DELETE emp WHERE empno = " + txtOfficerID.getText().trim());
            int result = prepStatement.executeUpdate();
            if (result > 0) {
                javax.swing.JLabel label = new javax.swing.JLabel("Officer of ID: " + txtOfficerID.getText().trim() + " deleted successfully.");
                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                getNewData();
            }

            prepStatement.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error adding new employee.");

        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteButton;
    private javax.swing.JLabel EditCriminalInfoLabel;
    private javax.swing.JLabel FnameLabel;
    private javax.swing.JLabel LnameLabel;
    private javax.swing.JLabel OfficerIDLabel;
    private javax.swing.JPanel PicturePanel;
    private javax.swing.JLabel RankLabel;
    private javax.swing.JTextPane SearchText;
    private javax.swing.JComboBox<String> StationIDcomboBox;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel hiredateLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JLabel lblDateError;
    private javax.swing.JLabel lblFnameError;
    private javax.swing.JLabel lblLnameError;
    private javax.swing.JLabel lblOfficerIDError;
    private javax.swing.JLabel lblRankError;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextPane txtDate;
    private javax.swing.JTextPane txtFname;
    private javax.swing.JTextPane txtLname;
    private javax.swing.JTextPane txtOfficerID;
    private javax.swing.JTextPane txtRank;
    // End of variables declaration//GEN-END:variables

    
}
