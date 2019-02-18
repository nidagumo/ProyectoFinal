
package jueguito;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.geom.Rectangle2D;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import logica.Laberinto;
import logica.Robot;

public class Jueguito {
    
  
    
    public static void main(String[] args) {
     
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);               
               
            }
        });
        
        
    }
    
}
