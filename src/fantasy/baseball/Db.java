/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fantasy.baseball;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author cdwue
 */
public class Db {
    
    public static Connection java_db() {
        try {
            Connection conn = null;
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\cdwue\\"
                    + "OneDrive\\Documents\\NetBeansProjects\\fantasy-baseball\\"
                    + "FantasyBaseball.sqlite");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
