/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication3;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EditPoliceStation extends javax.swing.JFrame {

    /**
     * Creates new form EditPoliceStation
     */
    myDBCon db;
    ResultSet rs;
    public EditPoliceStation(myDBCon db)
    {
        
        this.db = db;
        initComponents();
        disableErrorLabels();
    }


     boolean isValidData()
    {
        boolean flag = true;
        //check for station ID (empty, integer, and grater than 4)
        if(StationIDText.getText().trim().isEmpty() ||  !Validation.isInteger(StationIDText.getText().trim()))
        {
            if(StationIDText.getText().trim().isEmpty())
            {
                StationIDError.setText("This field cannot be empty");
            }
            else if(!Validation.isInteger(StationIDText.getText().trim()))
            {
                StationIDError.setText("This field must be integer");
            }
            
            flag = false;
        }
        if(StationIDText.getText().trim().length() > 4)
        {
            StationIDError.setText("The length must be at most than 4 digits");
            flag = false;
        }
        
        //check for address (empty and greater than 30)
        if(AddressText.getText().trim().isEmpty())
        {
            AddressError.setText("This field cannot be empty");
            flag = false;
        }
        if(AddressText.getText().trim().length() > 30)
        {
            AddressError.setText("The length must at most than 30 characters");
            flag = false;
        }
        
        //check for headID (empty)
        if(HeadIDCmbBox.getItemCount() == 0)
        {
            HeadIDError.setText("There are no head officers to be hired at the new station");
            flag = false;
        }
        
        //check for state (empty, greater than 30)
        if(StateText.getText().trim().isEmpty() || StateText.getText().trim().length() > 30 )
        {
            if(StateText.getText().trim().isEmpty())
            {
            StateError.setText("This field cannot be empty");
            }
            else if(StateText.getText().trim().length() > 30)
            {
            StateError.setText("The length must be at most 30 characters");            
            }
            flag = false;
        }

        
        return flag;
    }
    
    void fillCmbBox() throws SQLException
    {
        rs = db.executeQuery("select * from Officer where rank = 'Captain' and OfficerID not in(select HeadID from police_station where officerID = headID) order by OfficerID ASC");
            while(rs.next())
            {
                System.out.println("Hi");
                HeadIDCmbBox.addItem(rs.getString("officerID"));
            }
        
    }
    
    void disableErrorLabels()
    {
        StationIDError.setText("");
        AddressError.setText("");
        HeadIDError.setText("");
        StateError.setText("");
    }
    
    void resetLabels()
    {
        StationIDText.setText("");
        AddressText.setText("");
        HeadIDCmbBox.removeAllItems();
        StateText.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddressError = new javax.swing.JLabel();
        StationIDLabel3 = new javax.swing.JLabel();
        StationIDError = new javax.swing.JLabel();
        StationIDLabel = new javax.swing.JLabel();
        StateError = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        StateText = new javax.swing.JTextPane();
        HeadIDCmbBox = new javax.swing.JComboBox<>();
        HeadIDError = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        StationIDText = new javax.swing.JTextPane();
        StationIDLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        AddressText = new javax.swing.JTextPane();
        StationIDLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        SearchText = new javax.swing.JTextPane();
        UpdateButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        AddressError.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        AddressError.setForeground(new java.awt.Color(255, 0, 0));
        AddressError.setText("ERROR LABEL");

        StationIDLabel3.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        StationIDLabel3.setText("State:");

        StationIDError.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        StationIDError.setForeground(new java.awt.Color(255, 0, 0));
        StationIDError.setText("ERROR LABEL");

        StationIDLabel.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        StationIDLabel.setText("Station ID:");

        StateError.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        StateError.setForeground(new java.awt.Color(255, 0, 0));
        StateError.setText("ERROR LABEL");

        jScrollPane4.setViewportView(StateText);

        HeadIDError.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        HeadIDError.setForeground(new java.awt.Color(255, 0, 0));
        HeadIDError.setText("ERROR LABEL");

        StationIDText.setEditable(false);
        StationIDText.setBackground(new java.awt.Color(240, 240, 240));
        jScrollPane1.setViewportView(StationIDText);

        StationIDLabel1.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        StationIDLabel1.setText("Address:");

        jScrollPane2.setViewportView(AddressText);

        StationIDLabel2.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        StationIDLabel2.setText("Availabe HeadID:");

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel1.setText("Edit Police Station");

        searchButton.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        searchButton.setText("search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        SearchText.setToolTipText("search police station by ID"); // NOI18N
        jScrollPane3.setViewportView(SearchText);

        UpdateButton.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        UpdateButton.setText("UPDATE");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        DeleteButton.setFont(new java.awt.Font("Lucida Bright", 0, 14)); // NOI18N
        DeleteButton.setText("DELETE");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(StationIDLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(StationIDLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HeadIDCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(StationIDLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(StationIDLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StationIDError, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                    .addComponent(AddressError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(StateError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HeadIDError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(searchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StationIDLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StationIDError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StationIDLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddressError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StationIDLabel2)
                    .addComponent(HeadIDCmbBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HeadIDError))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StationIDLabel3)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StateError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateButton)
                    .addComponent(DeleteButton))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        try 
        {   
            rs = db.executeQuery("SELECT * FROM police_station where stationID = " + "'" + SearchText.getText()  + "'" + "ORDER BY stationID ASC");
            if(rs.next())
            {
                StationIDText.setText(rs.getString("StationID"));
                AddressText.setText(rs.getString("Address"));
                HeadIDCmbBox.addItem(rs.getString("HeadID"));
                //fillCmbBox();
                HeadIDCmbBox.setSelectedItem(rs.getString("HeadID"));
                StateText.setText(rs.getString("State"));
            }
            
        } catch (SQLException ex)
        {
            Logger.getLogger(EditPoliceStation.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_searchButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        if(isValidData())
        {
            try {
                db.setupPrepStatement("UPDATE police_station set Address = ?, HeadID = ?, State = ? where StationID = ?");
                db.getPrepStatement().setString(1, AddressText.getText());
                db.getPrepStatement().setInt(2, Integer.parseInt(HeadIDCmbBox.getSelectedItem().toString()));
                db.getPrepStatement().setString(3, StateText.getText());
                db.getPrepStatement().setInt(4,Integer.parseInt(StationIDText.getText()));
            } catch (SQLException ex) {
                Logger.getLogger(EditPoliceStation.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        try {
            rs = db.executeQuery("SELECT * FROM Officer WHERE StationID = " + "'" + StationIDText.getText() + "'");
            
            if(rs.next())
            {
                              
                    javax.swing.JLabel label = new javax.swing.JLabel("You cannot remove a station if there are police officers working there.");
                    label.setFont(new java.awt.Font("Lucida Bright", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.INFORMATION_MESSAGE); 
                 
            }
            else
            {
                rs = db.executeQuery("DELETE FROM police_station where StationID = " + "'" + StationIDText.getText() + "'");
                
                if(rs.next())
                {
                    javax.swing.JLabel label = new javax.swing.JLabel("Police station removed successfully");
                    label.setFont(new java.awt.Font("Lucida Bright", java.awt.Font.BOLD, 18));
                    JOptionPane.showMessageDialog(null, label, "ERROR", JOptionPane.INFORMATION_MESSAGE);  
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(EditPoliceStation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_DeleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressError;
    private javax.swing.JTextPane AddressText;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JComboBox<String> HeadIDCmbBox;
    private javax.swing.JLabel HeadIDError;
    private javax.swing.JTextPane SearchText;
    private javax.swing.JLabel StateError;
    private javax.swing.JTextPane StateText;
    private javax.swing.JLabel StationIDError;
    private javax.swing.JLabel StationIDLabel;
    private javax.swing.JLabel StationIDLabel1;
    private javax.swing.JLabel StationIDLabel2;
    private javax.swing.JLabel StationIDLabel3;
    private javax.swing.JTextPane StationIDText;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
