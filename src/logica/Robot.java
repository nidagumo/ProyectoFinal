package logica;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import jueguito.Juego;

public class Robot {
    private int x;
    private int y;
    private Juego juegoATerminar;
    
    public Robot(Juego juego) {
     this.x = 0;
     this.y = 0;
     this.juegoATerminar=juego;
    }
    
    public void MoverArriba(){
       if(juegoATerminar.getMipared().chequearMuro(x,y,false)){
           
        }
        else {
           this.y--;
            juegoATerminar.dibujarRobot ("build/classes/StarUp.png");
        }
        
    }
    public void MoverAbajo(){
        if(juegoATerminar.getMipared().chequearMuro(x,y+1,false)){           
        }
        else {
            this.y++;
            juegoATerminar.dibujarRobot ("build/classes/StarDown.png");
        }
        
    }
    public void MoverIzquierda(){
        if(juegoATerminar.getMipared().chequearMuro(x,y,true)){
           
        }
        else {
            this.x--;
            juegoATerminar.dibujarRobot ("build/classes/StarLeft.png");
        }
           
    }
    public void MoverDerecha(){
        if(juegoATerminar.getMipared().chequearMuro(x+1,y,true)){           
        }
        else {
            this.x++;
            juegoATerminar.dibujarRobot ("build/classes/StarRight.png");
        }
    }
    
    
    public int coordenadaX(){
        return this.x;
    }
    public int coordenadaY(){
        return this.y;
    }
    
    
    
}
    
  
 

