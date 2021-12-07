/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication3;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EditCrime extends javax.swing.JFrame {

    myDBCon db;
    ResultSet rs;
    public EditCrime(myDBCon db) {
        this.db = db;
        initComponents();
        resetErrorLabels();
    }

    void fillComboBox()
    {
        CategoryCmbBox.addItem("Infraction");
        CategoryCmbBox.addItem("Misdemeanor");
        CategoryCmbBox.addItem("Felony");
    }
    
    void resetLabels()
    {
        CrimeIDText.setText("");
        NameText.setText("");
        crimeIDSearch.setText("");
        CategoryCmbBox.removeAllItems();
    }
    
    void resetErrorLabels()
    {
        NameError.setText("");
    }
    boolean isValidData()
    {
        resetErrorLabels();
        boolean flag = true;
        if(NameText.getText().trim().isEmpty() || NameText.getText().length() > 30)
        {
            if(NameText.getText().trim().isEmpty())
            {
                NameError.setText("Invlaid. Must not be empty");
            }
            else if(NameText.getText().length() > 30)
            {
                NameError.setText("Invlaid. Must be at most 30 chars");
            }
            flag = false;
        }
        return flag;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CategoryLabel = new javax.swing.JLabel();
        NameError = new javax.swing.JLabel();
        CategoryCmbBox = new javax.swing.JComboBox<>();
        CrimeIDLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CrimeIDText = new javax.swing.JTextPane();
        NameLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        NameText = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        crimeIDSearch = new javax.swing.JTextPane();
        SearchButton = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel1.setText("Edit Crime");

        CategoryLabel.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        CategoryLabel.setText("Category:");

        NameError.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        NameError.setForeground(new java.awt.Color(255, 0, 0));
        NameError.setText("ERROR LABEL");

        CrimeIDLabel.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        CrimeIDLabel.setText("Crime ID:");

        CrimeIDText.setEditable(false);
        CrimeIDText.setBackground(new java.awt.Color(240, 240, 240));
        jScrollPane1.setViewportView(CrimeIDText);

        NameLabel.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        NameLabel.setText("Name:");

        jScrollPane2.setViewportView(NameText);

        crimeIDSearch.setToolTipText("Enter Crime ID");
        jScrollPane3.setViewportView(crimeIDSearch);

        SearchButton.setText("SEARCH");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        buttonDelete.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        buttonDelete.setText("DELETE");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        buttonUpdate.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        buttonUpdate.setText("UPDATE");
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(CategoryLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(CategoryCmbBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(NameLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(CrimeIDLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addComponent(NameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 175, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchButton))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CrimeIDLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NameLabel)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CategoryLabel)
                    .addComponent(CategoryCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed

        try {
            rs = db.executeQuery("SELECT * FROM crime where crimeID = " + "'" + crimeIDSearch.getText() + "'");
            if(rs.next())
            {
                               
                CrimeIDText.setText(rs.getString("CrimeID"));
                NameText.setText(rs.getString("Name"));  
                fillComboBox(); 
                CategoryCmbBox.setSelectedItem(rs.getString("Category"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EditCrime.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        try
        {
            rs = db.executeQuery("SELECT * FROM case where crimeID = " + "'" + CrimeIDText.getText() + "'");
            if(rs.next())
            {
                javax.swing.JLabel label = new javax.swing.JLabel("Cannot delete crime. A criminal has commited this crime");
                label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.INFORMATION_MESSAGE); 
            }
            else
            {
                db.setupPrepStatement("DELETE FROM crime where crimeID = " + "'" + CrimeIDText.getText() + "'");
                int result = db.executePrepUpdate();
                
                if(result > 0)
                {
                        javax.swing.JLabel label = new javax.swing.JLabel("CRIME# " + CrimeIDText.getText() + " deleted successfully.");
                        label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                        JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE); 
                        resetLabels();
                }
                
            }
            
        } catch (SQLException ex)
        {
            Logger.getLogger(EditCases.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed

        try {
                if(isValidData())
                {
                    db.setupPrepStatement("UPDATE crime set name = ?, category = ? where crimeID = ?");
                    this.db.getPrepStatement().setString(1,NameText.getText());
                    this.db.getPrepStatement().setString(2, CategoryCmbBox.getSelectedItem().toString());
                    this.db.getPrepStatement().setInt(3,Integer.parseInt(CrimeIDText.getText()));
                    int result = db.executePrepUpdate();
                    
                    if(result > 0)
                    {
                        javax.swing.JLabel label = new javax.swing.JLabel("CRIME# " + CrimeIDText.getText() + " updated successfully.");
                        label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                        JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE); 
                        resetLabels(); 
                    }
                   
                }
        } catch (SQLException ex) {
            Logger.getLogger(EditCases.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_buttonUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CategoryCmbBox;
    private javax.swing.JLabel CategoryLabel;
    private javax.swing.JLabel CrimeIDLabel;
    private javax.swing.JTextPane CrimeIDText;
    private javax.swing.JLabel NameError;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextPane NameText;
    private javax.swing.JButton SearchButton;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JTextPane crimeIDSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
