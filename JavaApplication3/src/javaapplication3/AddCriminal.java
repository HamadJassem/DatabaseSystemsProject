/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Customizer.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author theag
 */
public class AddCriminal extends javax.swing.JPanel implements java.beans.Customizer {
    
    private Object bean;

    /**
     * Creates new customizer AddCriminal
     */
    public AddCriminal() {
        initComponents();
    }
    
    public void setObject(Object bean) {
        this.bean = bean;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        FirstNameLabel = new javax.swing.JLabel();
        FirstNameText = new javax.swing.JTextField();
        LastNameLabel = new javax.swing.JLabel();
        LastNameText = new javax.swing.JTextField();
        CriminalIDLabel = new javax.swing.JLabel();
        CriminalIDText = new javax.swing.JTextField();
        CrimeIDLabel = new javax.swing.JLabel();
        CrimeIDText = new javax.swing.JTextField();
        CriminalPicLabel = new javax.swing.JLabel();
        InsertButton = new javax.swing.JButton();
        AddCriminalButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel1.setText("Add Criminal");

        FirstNameLabel.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        FirstNameLabel.setText("first Name:");

        FirstNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameTextActionPerformed(evt);
            }
        });

        LastNameLabel.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        LastNameLabel.setText("Last Name:");

        LastNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameTextActionPerformed(evt);
            }
        });

        CriminalIDLabel.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        CriminalIDLabel.setText("Criminal ID:");

        CriminalIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriminalIDTextActionPerformed(evt);
            }
        });

        CrimeIDLabel.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        CrimeIDLabel.setText("Crime ID:");

        CrimeIDText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrimeIDTextActionPerformed(evt);
            }
        });

        CriminalPicLabel.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        CriminalPicLabel.setText("Criminal's picture:");

        InsertButton.setText("insert");
        InsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertButtonActionPerformed(evt);
            }
        });

        AddCriminalButton.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        AddCriminalButton.setText("ADD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(189, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(197, 197, 197))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LastNameLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(FirstNameLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FirstNameText)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(CrimeIDLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CrimeIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CriminalIDLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CriminalIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(CriminalPicLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InsertButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(AddCriminalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CriminalIDLabel)
                    .addComponent(CriminalIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstNameLabel)
                    .addComponent(FirstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastNameLabel)
                    .addComponent(LastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CrimeIDLabel)
                    .addComponent(CrimeIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CriminalPicLabel)
                    .addComponent(InsertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(AddCriminalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void FirstNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameTextActionPerformed

    private void LastNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameTextActionPerformed

    private void CriminalIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriminalIDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CriminalIDTextActionPerformed

    private void CrimeIDTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrimeIDTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CrimeIDTextActionPerformed

    private void InsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InsertButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCriminalButton;
    private javax.swing.JLabel CrimeIDLabel;
    private javax.swing.JTextField CrimeIDText;
    private javax.swing.JLabel CriminalIDLabel;
    private javax.swing.JTextField CriminalIDText;
    private javax.swing.JLabel CriminalPicLabel;
    private javax.swing.JLabel FirstNameLabel;
    private javax.swing.JTextField FirstNameText;
    private javax.swing.JButton InsertButton;
    private javax.swing.JLabel LastNameLabel;
    private javax.swing.JTextField LastNameText;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
