/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

import java.awt.Color;

/**
 *
 * @author Jovan Milutinovic
 */
public class igraonica extends javax.swing.JFrame {

    /**
     * Creates new form igraonica
     */
    public igraonica() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        soni4 = new javax.swing.JButton();
        soni1 = new javax.swing.JButton();
        soni2 = new javax.swing.JButton();
        soni3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 204));
        setPreferredSize(new java.awt.Dimension(710, 660));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        soni4.setBackground(new java.awt.Color(0, 255, 0));
        soni4.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        soni4.setText("PS4");
        soni4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                soni4MouseClicked(evt);
            }
        });
        getContentPane().add(soni4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, 250, 160));

        soni1.setBackground(new java.awt.Color(0, 255, 0));
        soni1.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        soni1.setText("PS1");
        soni1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                soni1MouseClicked(evt);
            }
        });
        getContentPane().add(soni1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 250, 160));

        soni2.setBackground(new java.awt.Color(0, 255, 0));
        soni2.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        soni2.setText("PS2");
        soni2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                soni2MouseClicked(evt);
            }
        });
        getContentPane().add(soni2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 250, 160));

        soni3.setBackground(new java.awt.Color(0, 255, 0));
        soni3.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        soni3.setText("PS3");
        soni3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                soni3MouseClicked(evt);
            }
        });
        getContentPane().add(soni3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 250, 160));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/cat-gamer-minimal-4k-ai.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-930, -20, 2030, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void soni1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soni1MouseClicked
        ps1 p1 = new ps1();
        p1.setVisible(true);
        
         ps1.brojSonija.setText("1");
        soni1.setBackground(Color.RED);
    }//GEN-LAST:event_soni1MouseClicked

    private void soni2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soni2MouseClicked
        ps2 p2 = new ps2();
        p2.setVisible(true);
        
         ps2.brojSonija2.setText("2");
        soni2.setBackground(Color.RED);
    }//GEN-LAST:event_soni2MouseClicked

    private void soni3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soni3MouseClicked
        ps3 p3 = new ps3();
        p3.setVisible(true);
        
         ps3.brojSonija3.setText("3");
        soni3.setBackground(Color.RED);
    }//GEN-LAST:event_soni3MouseClicked

    private void soni4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soni4MouseClicked
        ps4 p4 = new ps4();
        p4.setVisible(true);
        
         ps4.brojSonij4.setText("4");
        soni4.setBackground(Color.RED);
    }//GEN-LAST:event_soni4MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.setSize(760, 760);
       
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(igraonica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(igraonica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(igraonica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(igraonica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new igraonica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel6;
    protected static javax.swing.JButton soni1;
    protected static javax.swing.JButton soni2;
    protected static javax.swing.JButton soni3;
    protected static javax.swing.JButton soni4;
    // End of variables declaration//GEN-END:variables
}
