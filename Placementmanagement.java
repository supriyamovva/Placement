/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placementmanagement;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Lenovo
 */
public class Placementmanagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame frame = new JFrame();
        Main ma = new Main(frame,true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setUndecorated(true);
        frame.setVisible(true);
        ma.show();
       
        
    }
    
}
