/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

/**
 *
 * @author user
 */
public class ModoDeJuego extends javax.swing.JFrame {

    /**
     * Creates new form ModoDeJuego
     */
    public ModoDeJuego() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1Jugador = new javax.swing.JButton();
        jButtonVolver = new javax.swing.JButton();
        jButton2Jugadores = new javax.swing.JButton();
        jButtonJugadorVsPc = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1Jugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1Jugadorpeque.png"))); // NOI18N
        jButton1Jugador.setContentAreaFilled(false);
        jButton1Jugador.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1Jugadorpeque.png"))); // NOI18N
        jButton1Jugador.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton1Jugador.png"))); // NOI18N
        jButton1Jugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1JugadorActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Jugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 320, 90));

        jButtonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonVolverpeque.png"))); // NOI18N
        jButtonVolver.setContentAreaFilled(false);
        jButtonVolver.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonVolverpeque.png"))); // NOI18N
        jButtonVolver.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonVolver.png"))); // NOI18N
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 640, 210, -1));

        jButton2Jugadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2Jugadorespeque.png"))); // NOI18N
        jButton2Jugadores.setContentAreaFilled(false);
        jButton2Jugadores.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2Jugadorespeque.png"))); // NOI18N
        jButton2Jugadores.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2Jugadores.png"))); // NOI18N
        jButton2Jugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2JugadoresActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2Jugadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 300, 90));

        jButtonJugadorVsPc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/JugadorVsPcpeque.png"))); // NOI18N
        jButtonJugadorVsPc.setContentAreaFilled(false);
        jButtonJugadorVsPc.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/JugadorVsPcpeque.png"))); // NOI18N
        jButtonJugadorVsPc.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/JugadorVsPc.png"))); // NOI18N
        getContentPane().add(jButtonJugadorVsPc, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 350, 80));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ModoDeJuego.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        Menu menu=new Menu();
        this.setVisible(false);
        menu.setVisible(true);
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jButton1JugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1JugadorActionPerformed
       SeleccionDePersonaje sdp= new SeleccionDePersonaje(true);
       this.setVisible(false);
       sdp.setVisible(true);
    }//GEN-LAST:event_jButton1JugadorActionPerformed

    private void jButton2JugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2JugadoresActionPerformed
        SeleccionDePersonaje sdp= new SeleccionDePersonaje(false);
       this.setVisible(false);
       sdp.setVisible(true);
    }//GEN-LAST:event_jButton2JugadoresActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Jugador;
    private javax.swing.JButton jButton2Jugadores;
    private javax.swing.JButton jButtonJugadorVsPc;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabelFondo;
    // End of variables declaration//GEN-END:variables
}
