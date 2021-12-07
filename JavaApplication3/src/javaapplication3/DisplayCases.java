/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication3;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author theag
 */
public class DisplayCases extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    private myDBCon db;
    ResultSet rs;
    String SQL;
    public DisplayCases(myDBCon DB, String SQL) throws SQLException {
        this.db = DB;
        this.SQL = SQL;
        initComponents();
        getNewData();
    }

    /**
     * 
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CaseIDLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CaseIDText = new javax.swing.JTextPane();
        descriptionLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DescriptionText = new javax.swing.JTextPane();
        RecordedDateLabel = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        DateText = new javax.swing.JTextPane();
        CriminalIDLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        CriminalIDText = new javax.swing.JTextPane();
        CrimeIDLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        CrimeIDText = new javax.swing.JTextPane();
        OfficerIDLabel = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        OfficerIDText = new javax.swing.JTextPane();
        PrevButton = new javax.swing.JButton();
        NextButton = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        StationIDText = new javax.swing.JTextPane();
        CaseIDLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel1.setText("Cases Display");

        CaseIDLabel.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        CaseIDLabel.setText("Case ID:");

        CaseIDText.setEditable(false);
        jScrollPane1.setViewportView(CaseIDText);

        descriptionLabel.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        descriptionLabel.setText("Description:");

        DescriptionText.setEditable(false);
        jScrollPane2.setViewportView(DescriptionText);

        RecordedDateLabel.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        RecordedDateLabel.setText("Recorded Date:");

        DateText.setEditable(false);
        jScrollPane7.setViewportView(DateText);

        CriminalIDLabel.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        CriminalIDLabel.setText("Criminal ID:");

        CriminalIDText.setEditable(false);
        jScrollPane3.setViewportView(CriminalIDText);

        CrimeIDLabel.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        CrimeIDLabel.setText("Crime ID:");

        CrimeIDText.setEditable(false);
        jScrollPane4.setViewportView(CrimeIDText);

        OfficerIDLabel.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        OfficerIDLabel.setText("Officer ID:");

        OfficerIDText.setEditable(false);
        jScrollPane5.setViewportView(OfficerIDText);

        PrevButton.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        PrevButton.setText("<< PREV");
        PrevButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrevButtonActionPerformed(evt);
            }
        });

        NextButton.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        NextButton.setText("NEXT >>");
        NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButtonActionPerformed(evt);
            }
        });

        StationIDText.setEditable(false);
        jScrollPane6.setViewportView(StationIDText);

        CaseIDLabel5.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        CaseIDLabel5.setText("Station ID:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CaseIDLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(descriptionLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(RecordedDateLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CrimeIDLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CriminalIDLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(OfficerIDLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CaseIDLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PrevButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CaseIDLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descriptionLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CriminalIDLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OfficerIDLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CrimeIDLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RecordedDateLabel)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CaseIDLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PrevButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
        try {
            // TODO add your handling code here:

            if (!rs.isLast()) {

                rs.next();
                populateFields();

            }
        } catch (SQLException ex) {
            //Logger.getLogger(DisplayCriminal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_NextButtonActionPerformed

    private void PrevButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrevButtonActionPerformed
        try {
            // TODO add your handling code here:

            if (!rs.isFirst()) {
                rs.previous();
                populateFields();
            }
        } catch (SQLException ex) {
            //Logger.getLogger(DisplayCriminal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PrevButtonActionPerformed

    void getNewData() throws SQLException
    {
      if(SQL == null) rs = db.executeQuery("SELECT * FROM case ORDER BY caseID ASC");
      else rs = db.executeQuery(SQL);
      rs.beforeFirst();
      rs.first();
      populateFields();    
    }
    
    void populateFields() throws SQLException
    {
        CaseIDText.setText(rs.getString("caseID"));
        DescriptionText.setText(rs.getString("description"));
        CriminalIDText.setText(rs.getString("criminalID"));
        CrimeIDText.setText(rs.getString("crimeID"));
        OfficerIDText.setText(rs.getString("OfficerID"));
        DateText.setText(rs.getString("recorded_date"));
        StationIDText.setText(rs.getString("StationID"));
        EnableDisableButtons();
    }
    
    private void EnableDisableButtons()
    {
        try {
            if (rs.isFirst()) {
                PrevButton.setVisible(false);
            } else {
                PrevButton.setVisible(true);
            }
            if (rs.isLast()) {
                NextButton.setVisible(false);
            } else {
                NextButton.setVisible(true);
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DisplayCriminal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CaseIDLabel;
    private javax.swing.JLabel CaseIDLabel5;
    private javax.swing.JTextPane CaseIDText;
    private javax.swing.JLabel CrimeIDLabel;
    private javax.swing.JTextPane CrimeIDText;
    private javax.swing.JLabel CriminalIDLabel;
    private javax.swing.JTextPane CriminalIDText;
    private javax.swing.JTextPane DateText;
    private javax.swing.JTextPane DescriptionText;
    private javax.swing.JButton NextButton;
    private javax.swing.JLabel OfficerIDLabel;
    private javax.swing.JTextPane OfficerIDText;
    private javax.swing.JButton PrevButton;
    private javax.swing.JLabel RecordedDateLabel;
    private javax.swing.JTextPane StationIDText;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    // End of variables declaration//GEN-END:variables
}
