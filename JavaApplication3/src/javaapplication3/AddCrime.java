/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication3;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class AddCrime extends javax.swing.JFrame {

    myDBCon db;
    ResultSet rs;
    public AddCrime(myDBCon db) {
        initComponents();
        resetErrorLabels();
        this.db = db;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CategoryLabel = new javax.swing.JLabel();
        CrimeIDLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CrimeIDText = new javax.swing.JTextPane();
        NameLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        NameText = new javax.swing.JTextPane();
        CrimeIDError = new javax.swing.JLabel();
        NameError = new javax.swing.JLabel();
        CategoryCmbBox = new javax.swing.JComboBox<>();
        AddCrimeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel1.setText("Add Crime");

        CategoryLabel.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        CategoryLabel.setText("Category:");

        CrimeIDLabel.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        CrimeIDLabel.setText("Crime ID:");

        jScrollPane1.setViewportView(CrimeIDText);

        NameLabel.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        NameLabel.setText("Name:");

        jScrollPane2.setViewportView(NameText);

        CrimeIDError.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        CrimeIDError.setForeground(new java.awt.Color(255, 0, 0));
        CrimeIDError.setText("ERROR LABEL");

        NameError.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        NameError.setForeground(new java.awt.Color(255, 0, 0));
        NameError.setText("ERROR LABEL");

        CategoryCmbBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "infraction", "misdemeanor", "Felllony" }));

        AddCrimeButton.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        AddCrimeButton.setText("ADD");
        AddCrimeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCrimeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CategoryLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CategoryCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CrimeIDLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CrimeIDError, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(NameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(AddCrimeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CrimeIDLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CrimeIDError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NameLabel)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CategoryLabel)
                    .addComponent(CategoryCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(AddCrimeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void resetLabels()
    {
        CrimeIDText.setText("");
        NameText.setText("");
    }
    
    void resetErrorLabels()
    {
        CrimeIDError.setText("");
        NameError.setText("");
    }
    
    boolean isValidData() throws SQLException
    {
        resetErrorLabels();
        boolean flag = true;
        
        if(CrimeIDText.getText().trim().isEmpty() || !Validation.isInteger(CrimeIDText.getText()) || CrimeIDText.getText().length() > 4)
        {
            if(CrimeIDText.getText().trim().isEmpty())
            {
                CrimeIDError.setText("Invlaid. Must not be empty");               
            }
            else if(!Validation.isInteger(CrimeIDText.getText()))
            {
                CrimeIDError.setText("Invlaid. Must be Integer");  
            }
            else if(CrimeIDText.getText().length() > 4)
            {
                CrimeIDError.setText("Invlaid. Must be at most 4 digits"); 
            }
            
            flag = false;
        }
        
        rs = db.executeQuery("SELECT * FROM crime where crimeID = " + "'" + CrimeIDText.getText() + "'");
        if(rs.next())
        {
           CrimeIDError.setText("Invlaid. ID has been already taken");  
           flag = false;
        }
        
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
    
    private void AddCrimeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCrimeButtonActionPerformed
        try {
            if(isValidData())
            {
                db.setupPrepStatement("INSERT INTO crime (CrimeID, Name, Category) VALUES (?,?,?)");
                db.getPrepStatement().setInt(1, Integer.parseInt(CrimeIDText.getText()));
                db.getPrepStatement().setString(2,NameText.getText().toUpperCase());
                db.getPrepStatement().setString(3,CategoryCmbBox.getSelectedItem().toString());
                int result = db.executePrepUpdate();
                if(result > 0)
                {
                    javax.swing.JLabel label = new javax.swing.JLabel("New Crime added successfully.");
                    label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                }
                resetLabels();
            }} catch (SQLException ex) {
            Logger.getLogger(AddCrime.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_AddCrimeButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCrimeButton;
    private javax.swing.JComboBox<String> CategoryCmbBox;
    private javax.swing.JLabel CategoryLabel;
    private javax.swing.JLabel CrimeIDError;
    private javax.swing.JLabel CrimeIDLabel;
    private javax.swing.JTextPane CrimeIDText;
    private javax.swing.JLabel NameError;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextPane NameText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
