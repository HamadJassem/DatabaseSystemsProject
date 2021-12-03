package javaapplication3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class myDBCon {
    
    //to store the information of login in aqldeveloper -url,username,password-
    private String DBURL;
    private String DBUSER;
    private String DBPASS;
    Connection con;
    Statement statement;
   
    //define constructor of myDBCon where username and password needs to be passed to the constructor
    public myDBCon(String u, String p) throws SQLException, ClassNotFoundException
    {
        DBUSER = u;
        DBPASS = p;
        DBURL = "jdbc:oracle:thin:@coeoracle.aus.edu:1521:orcl";
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
        statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        statement.executeUpdate("ALTER SESSION SET NLS_DATE_FORMAT ='DD-MM-YYYY'");
        statement.executeUpdate("ALTER SESSION SET NLS_TIMESTAMP_FORMAT ='DD-MM-YYYY HH:MI:SS.FF'");
        

        
    }
    
    //query execution methods
    public ResultSet executeQuery(String sql) throws SQLException
    {
        statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        return statement.executeQuery(sql);
    }
    public int executeUpdate(String sql) throws SQLException
    {
        //the function first refreshes the current statement then executes an update based on the given sql statement
        statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE); 
        return statement.executeUpdate(sql);
    }

    public void close() throws SQLException
    {
        statement.close();
    }
}