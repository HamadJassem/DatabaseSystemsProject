/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author theag
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        myDBCon db = null;
        try {
            db = new myDBCon("b00082849", "b00082849");
        } catch (SQLException ex) {
            Logger.getLogger(JavaApplication3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JavaApplication3.class.getName()).log(Level.SEVERE, null, ex);
        }
        (new AddCriminal(db)).setVisible(true);
    }
    
}
