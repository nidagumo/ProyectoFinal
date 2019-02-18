package jueguito;
import com.sun.glass.events.KeyEvent;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.ImageIcon;
import logica.Laberinto;
import logica.Robot;

public class Juego extends javax.swing.JFrame {
    private Robot miRobot;
    private Laberinto miPared;
    
    public Juego() {
        initComponents();
        miRobot = new Robot(this);       
        crearLaberintoBasico();
                
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblX = new javax.swing.JLabel();
        lblY = new javax.swing.JLabel();
        lblWin = new javax.swing.JLabel();
        BtnUp = new javax.swing.JButton();
        BtnLeft = new javax.swing.JButton();
        BtnDown = new javax.swing.JButton();
        BtnRight = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(650, 550));
        setSize(new java.awt.Dimension(660, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Laberinto");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 319, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Coordenadas");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel4.setText("X :");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel5.setText("Y :");

        lblX.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblX.setText("0");

        lblY.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblY.setText("0");
        lblY.setMaximumSize(new java.awt.Dimension(66, 14));

        lblWin.setFont(new java.awt.Font("Comic Sans MS", 0, 36)); // NOI18N
        lblWin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        BtnUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowUp.png"))); // NOI18N
        BtnUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnUpMouseClicked(evt);
            }
        });

        BtnLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowLeft.png"))); // NOI18N
        BtnLeft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnLeftMouseClicked(evt);
            }
        });

        BtnDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowDown.png"))); // NOI18N
        BtnDown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnDownMouseClicked(evt);
            }
        });

        BtnRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ArrowRight.png"))); // NOI18N
        BtnRight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnRightMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblY, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblX, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BtnUp, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(BtnDown, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnRight, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblWin, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblY, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(BtnUp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnRight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnDown, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(lblWin, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void dibujarRobot(String direccion){  
          if(miRobot.coordenadaX()==8){
               lblWin.setText("Has completado el nivel, ganaste");
           }     
        ImageIcon imagen = new ImageIcon(direccion);
        jPanel1.update(jPanel1.getGraphics());
        dibujarParedes();
       /* Polygon p = new Polygon();
         int xfin[]={320,320,360,360};
        int Yfin[]={0,360,360,0};
        jPanel1.getGraphics().fillPolygon(xfin, Yfin, 4);*/
        jPanel1.getGraphics().drawImage(imagen.getImage(), (miRobot.coordenadaX()*40)+1, (miRobot.coordenadaY()*40)+1,jPanel1);
        lblX.setText(String.valueOf(miRobot.coordenadaX()));
        lblY.setText(String.valueOf(miRobot.coordenadaY()));
        
    }
     private void crearLaberintoBasico() {
        miPared= new Laberinto(9,9);
        //vertical
        for(int i=0;i<=8;i++){
            miPared.crearMuro(0,i, true);
        } 
        miPared.crearMuro(1,0, true);        
        miPared.crearMuro(1,1, true);
        miPared.crearMuro(1,3, true);
        miPared.crearMuro(1,4, true);
        miPared.crearMuro(1,5, true);
        miPared.crearMuro(1,6, true);
        miPared.crearMuro(2,2, true);
        miPared.crearMuro(2,3, true);
        miPared.crearMuro(2,7, true);
        miPared.crearMuro(3,1, true);
        miPared.crearMuro(3,2, true);
        miPared.crearMuro(3,3, true);
        miPared.crearMuro(3,4, true);
        miPared.crearMuro(3,6, true);
        miPared.crearMuro(4,2, true);
        miPared.crearMuro(4,3, true);
        miPared.crearMuro(5,1, true);
        miPared.crearMuro(5,2, true);
        miPared.crearMuro(5,5, true);
        miPared.crearMuro(5,6, true);
        miPared.crearMuro(6,2, true);
        miPared.crearMuro(6,5, true);
        miPared.crearMuro(7,3, true);
        miPared.crearMuro(7,4, true);
        miPared.crearMuro(7,6, true);
        miPared.crearMuro(8,0, true);
        miPared.crearMuro(8,1, true);
        miPared.crearMuro(8,2, true);
        miPared.crearMuro(8,3, true);
        miPared.crearMuro(8,5, true);
        miPared.crearMuro(8,6, true);
        miPared.crearMuro(8,7, true);
        miPared.crearMuro(8,8, true); 
        
        //horizontal
        for(int i=0;i<=8;i++){
            miPared.crearMuro(i,0, false);
            miPared.crearMuro(i,8, false);
        } 
        miPared.crearMuro(2,1, false);
        miPared.crearMuro(4,1, false);
        miPared.crearMuro(5,1, false);
        miPared.crearMuro(6,1, false);
        miPared.crearMuro(1,2, false);
        miPared.crearMuro(3,2, false);
        miPared.crearMuro(6,2, false);
        miPared.crearMuro(7,2, false);
        miPared.crearMuro(5,3, false);
        miPared.crearMuro(1,4, false);
        miPared.crearMuro(4,4, false);
        miPared.crearMuro(5,4, false);
        miPared.crearMuro(6,4, false);
        miPared.crearMuro(2,5, false);
        miPared.crearMuro(3,5, false);
        miPared.crearMuro(4,5, false);
        miPared.crearMuro(6,5, false);
        miPared.crearMuro(7,5, false);
        miPared.crearMuro(1,6, false);
        miPared.crearMuro(2,6, false);
        miPared.crearMuro(3,6, false);
        miPared.crearMuro(4,7, false);
        miPared.crearMuro(5,7, false);
        miPared.crearMuro(6,7, false);
        
    }
    public void dibujarParedes(){
        for(int i=0;i<miPared.getAlto();i++){
            for(int j=0;j<miPared.getAncho();j++)
                {
                    if(miPared.chequearMuro(i, j,true )){
                    jPanel1.getGraphics().drawLine(i*40, j*40, (i)*40,(j+1)*40);
                    }
                    if(miPared.chequearMuro(i, j,false )){
                    jPanel1.getGraphics().drawLine(i*40, j*40, (i+1)*40,(j)*40);
                    }
                }
        }
            
    }
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
                  
        
       
                
    }//GEN-LAST:event_formKeyPressed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        dibujarParedes();
        dibujarRobot("build/classes/Star.png");
      
       
        //jPanel1.getGraphics().drawPolygon(xfin, xfin, 4);
    }//GEN-LAST:event_formWindowActivated

    private void BtnRightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRightMouseClicked
        miRobot.MoverDerecha();
        lblX.setText(String.valueOf(miRobot.coordenadaX()));
        lblY.setText(String.valueOf(miRobot.coordenadaY()));         
    }//GEN-LAST:event_BtnRightMouseClicked

    private void BtnDownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDownMouseClicked
        // TODO add your handling code here:
        miRobot.MoverAbajo();
        lblX.setText(String.valueOf(miRobot.coordenadaX()));
        lblY.setText(String.valueOf(miRobot.coordenadaY()));         
    }//GEN-LAST:event_BtnDownMouseClicked

    private void BtnLeftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLeftMouseClicked
        // TODO add your handling code here:
        miRobot.MoverIzquierda();
        lblX.setText(String.valueOf(miRobot.coordenadaX()));
        lblY.setText(String.valueOf(miRobot.coordenadaY()));         
    }//GEN-LAST:event_BtnLeftMouseClicked

    private void BtnUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnUpMouseClicked
        // TODO add your handling code here:
        miRobot.MoverArriba();
        lblX.setText(String.valueOf(miRobot.coordenadaX()));
        lblY.setText(String.valueOf(miRobot.coordenadaY()));         
    }//GEN-LAST:event_BtnUpMouseClicked
    public Robot getMirobot() {
        return miRobot;
    }
    public void setMirobot(Robot mirobot) {
        this.miRobot = mirobot;
    }
    public Laberinto getMipared() {
        return miPared;
    }
    public void setMipared(Laberinto mipared) {
        this.miPared = mipared;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDown;
    private javax.swing.JButton BtnLeft;
    private javax.swing.JButton BtnRight;
    private javax.swing.JButton BtnUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblWin;
    private javax.swing.JLabel lblX;
    private javax.swing.JLabel lblY;
    // End of variables declaration//GEN-END:variables

   
}
