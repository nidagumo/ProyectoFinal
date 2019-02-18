package logica;

import java.awt.Graphics;
import java.util.Scanner;
import javax.swing.ImageIcon;

public class Laberinto {
    private int ancho;
    private int alto;
    private boolean murosVerticales[][];
    private boolean murosHorizontales[][];
    /**
     * Metodo que crea muros en el laberinto
     * @param a el componente de filas
     * @param b el componente de columnas
     * @param direccion si es true es vertical y si es false es horizontal
     */
    public void crearMuro(int a , int b , boolean direccion){
        if(direccion){
        murosVerticales[a][b]=true;
        }
        else{
            murosHorizontales[a][b]=true;
        }             
     }

    public Laberinto(int ancho, int alto) {
        this.ancho=ancho;
        this.alto=alto;
        murosVerticales= new boolean[ancho+1][alto+1];
        murosHorizontales= new boolean[ancho+1][alto+1];
    }
    
    
            
    public boolean chequearMuro(int a , int b , boolean direccion){
        if(direccion){
            return murosVerticales[a][b];
        }
        else {
            return murosHorizontales[a][b];
        }
    }  

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    
}
