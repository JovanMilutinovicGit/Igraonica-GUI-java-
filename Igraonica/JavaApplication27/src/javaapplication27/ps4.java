/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication27;

import java.awt.Color;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Jovan Milutinovic
 */
public class ps4 extends javax.swing.JFrame {

  static int milisekunde=0;
    static int sekunde=0;
    static int minuti=0;
    static int sati=0;
     static boolean state = true;
    public ps4() {
        initComponents();
        datum();
    }

     public void datum(){
    Calendar c = new GregorianCalendar();
    int dan = c.get(Calendar.DAY_OF_MONTH);
    int mesec = c.get(Calendar.MONTH);
    int godina = c.get(Calendar.YEAR);
    
    datum1.setText(dan+". "+mesec+". "+godina+".");
    }
    
    String pomoc = "<html>Pritiskom na dugme STOP, "
            + "automatski ce se uneti broj odigrnaih sati.<html>";
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        brojSonij4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        brojOdigranihSati = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cenaPica = new javax.swing.JTextField();
        sve = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        vremeProba = new javax.swing.JLabel();
        sat1 = new javax.swing.JTextField();
        minut1 = new javax.swing.JTextField();
        sekunda1 = new javax.swing.JTextField();
        milisekunda1 = new javax.swing.JTextField();
        resetuj1 = new javax.swing.JButton();
        start1 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        Ultra = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        fanta = new javax.swing.JButton();
        kokaKola = new javax.swing.JButton();
        stop1 = new javax.swing.JButton();
        datum1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        obavestenje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sony br.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        brojSonij4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        brojSonij4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(brojSonij4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 50, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setText("Vreme igranja");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        brojOdigranihSati.setEditable(false);
        getContentPane().add(brojOdigranihSati, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 210, 60));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ukupno");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, -1, -1));

        cenaPica.setEditable(false);
        cenaPica.setText("0");
        getContentPane().add(cenaPica, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 500, 80, -1));

        sve.setEditable(false);
        sve.setText("0");
        getContentPane().add(sve, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 210, 50));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Broj odigrnaih sati");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 120, -1));
        getContentPane().add(vremeProba, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 90, 20));

        sat1.setEditable(false);
        getContentPane().add(sat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 60, 30));

        minut1.setEditable(false);
        getContentPane().add(minut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 70, 30));

        sekunda1.setEditable(false);
        getContentPane().add(sekunda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 70, 30));

        milisekunda1.setEditable(false);
        getContentPane().add(milisekunda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 80, 30));

        resetuj1.setBackground(new java.awt.Color(0, 204, 204));
        resetuj1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        resetuj1.setText("Resetuj");
        resetuj1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetuj1ActionPerformed(evt);
            }
        });
        getContentPane().add(resetuj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 100, 30));

        start1.setBackground(new java.awt.Color(0, 255, 0));
        start1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        start1.setText("Start");
        start1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                start1MouseClicked(evt);
            }
        });
        start1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start1ActionPerformed(evt);
            }
        });
        getContentPane().add(start1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 80, 30));

        jButton14.setBackground(new java.awt.Color(255, 0, 0));
        jButton14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Resetuj sve");
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, -1, 30));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Naplati");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 210, 40));

        jButton8.setBackground(new java.awt.Color(33, 153, 136));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 0));
        jButton8.setText("Sola multivitamin");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 480, 100, 60));

        jButton5.setBackground(new java.awt.Color(33, 153, 136));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 0));
        jButton5.setText("Tuborg");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 410, 100, 60));

        jButton12.setBackground(new java.awt.Color(33, 153, 136));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 0));
        jButton12.setText("Kisela voda");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 410, 100, 60));

        jButton13.setBackground(new java.awt.Color(33, 153, 136));
        jButton13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 0));
        jButton13.setText("Rosa");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 330, 100, 60));

        jButton11.setBackground(new java.awt.Color(33, 153, 136));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 0));
        jButton11.setText("Sola isotonic");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, 100, 60));

        jButton9.setBackground(new java.awt.Color(33, 153, 136));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 0));
        jButton9.setText("Ultra mango");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 250, 100, 60));

        jButton10.setBackground(new java.awt.Color(33, 153, 136));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 0));
        jButton10.setText("Sola ice tea");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 250, 100, 60));

        Ultra.setBackground(new java.awt.Color(33, 153, 136));
        Ultra.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Ultra.setForeground(new java.awt.Color(255, 255, 0));
        Ultra.setText("Ultra");
        Ultra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UltraMouseClicked(evt);
            }
        });
        getContentPane().add(Ultra, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 170, 100, 60));

        jButton7.setBackground(new java.awt.Color(33, 153, 136));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 0));
        jButton7.setText("Buster");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, 100, 60));

        jButton3.setBackground(new java.awt.Color(33, 153, 136));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 0));
        jButton3.setText("Schweppes");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, 100, 60));

        jButton4.setBackground(new java.awt.Color(33, 153, 136));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 0));
        jButton4.setText("Guarana");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 90, 100, 60));

        fanta.setBackground(new java.awt.Color(33, 153, 136));
        fanta.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        fanta.setForeground(new java.awt.Color(255, 255, 0));
        fanta.setText("Fanta");
        fanta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fantaMouseClicked(evt);
            }
        });
        getContentPane().add(fanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 100, 60));

        kokaKola.setBackground(new java.awt.Color(33, 153, 136));
        kokaKola.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        kokaKola.setForeground(new java.awt.Color(255, 255, 0));
        kokaKola.setText("Coca-cola");
        kokaKola.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kokaKolaMouseClicked(evt);
            }
        });
        getContentPane().add(kokaKola, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 100, 60));

        stop1.setBackground(new java.awt.Color(255, 0, 0));
        stop1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        stop1.setText("Stop");
        stop1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                stop1MouseMoved(evt);
            }
        });
        stop1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stop1MouseClicked(evt);
            }
        });
        stop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop1ActionPerformed(evt);
            }
        });
        getContentPane().add(stop1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 80, 30));

        datum1.setForeground(new java.awt.Color(0, 255, 0));
        getContentPane().add(datum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 140, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jovan Milutinovic\\Desktop\\Igraonica\\JavaApplication27\\slike\\cat-gamer-minimal-4k-ai.jpg")); // NOI18N
        jLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel5MouseMoved(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1000, -190, 2200, 990));

        obavestenje.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        obavestenje.setForeground(new java.awt.Color(255, 102, 102));
        getContentPane().add(obavestenje, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 220, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetuj1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetuj1ActionPerformed
        state = false;
        sati = 0;
        minuti = 0;
        sekunde = 0;
        milisekunde = 0;

        sat1.setText("");
        minut1.setText("");
        sekunda1.setText("");
        milisekunda1.setText("");
    }//GEN-LAST:event_resetuj1ActionPerformed

    private void start1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_start1MouseClicked
        start1.setEnabled(false);
    }//GEN-LAST:event_start1MouseClicked

    private void start1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start1ActionPerformed
        state = true;
        Thread t = new Thread(){
            public void run(){
                for (;;){
                    if (state==true){
                        try{
                            sleep(1);
                            if(milisekunde>500){
                                milisekunde=0;
                                sekunde++;
                            }else if(sekunde>60){
                                milisekunde=0;
                                sekunde=0;
                                minuti++;
                            }else if(minuti>60){
                                milisekunde=0;
                                sekunde=0;
                                minuti=0;
                                sati++;
                            }
                            milisekunda1.setText(": "+milisekunde);
                            milisekunde++;
                            sekunda1.setText(": "+sekunde);
                            minut1.setText(": "+minuti);
                            sat1.setText(sati+": ");
                        }catch(Exception e){

                        }

                    }else{
                        break;
                    }
                }
            }
        };
        t.start();
    }//GEN-LAST:event_start1ActionPerformed

    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked
        sve.setText("0");
        brojOdigranihSati.setText("");
        cenaPica.setText("0");
    }//GEN-LAST:event_jButton14MouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       igraonica.soni4.setBackground(Color.GREEN);
    }//GEN-LAST:event_formWindowClosed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Double c = Double.parseDouble(cenaPica.getText());
        Double p = Double.parseDouble(brojOdigranihSati.getText());
        String p1 = (p*120+c+"");
        sve.setText(p1);
        String br = String.valueOf(p);

        //----------------------------
        if (p != null){
            double ukupno =  (120.0*p+(double)c);
            sve.setText(ukupno+"");
            pregled.dodaj(new Object[]{
                brojSonij4.getText(),
                cenaPica.getText(),
                brojOdigranihSati.getText(),
                sve.getText()
            });
        }else{
        JOptionPane.showMessageDialog(null, "Niste uneli broj odigranih sati!");
        }

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        double p = 80;
        double c = Double.parseDouble(cenaPica.getText());
        cenaPica.setText(p+c+"");
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        double p = 120;
        double c = Double.parseDouble(cenaPica.getText());
        cenaPica.setText(p+c+"");
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        double p = 50;
        double c = Double.parseDouble(cenaPica.getText());
        cenaPica.setText(p+c+"");
    }//GEN-LAST:event_jButton12MouseClicked

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        double p = 50;
        double c = Double.parseDouble(cenaPica.getText());
        cenaPica.setText(p+c+"");
    }//GEN-LAST:event_jButton13MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        double p = 80;
        double c = Double.parseDouble(cenaPica.getText());
        cenaPica.setText(p+c+"");
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        double p = 80;
        double c = Double.parseDouble(cenaPica.getText());
        cenaPica.setText(p+c+"");
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        double p = 80;
        double c = Double.parseDouble(cenaPica.getText());
        cenaPica.setText(p+c+"");
    }//GEN-LAST:event_jButton10MouseClicked

    private void UltraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UltraMouseClicked
        double p = 80;
        double c = Double.parseDouble(cenaPica.getText());
        cenaPica.setText(p+c+"");
    }//GEN-LAST:event_UltraMouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        double p = 80;
        double c = Double.parseDouble(cenaPica.getText());
        cenaPica.setText(p+c+"");
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        double p = 80;
        double c = Double.parseDouble(cenaPica.getText());
        cenaPica.setText(p+c+"");
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        double p = 80;
        double c = Double.parseDouble(cenaPica.getText());
        cenaPica.setText(p+c+"");
    }//GEN-LAST:event_jButton4MouseClicked

    private void fantaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fantaMouseClicked
        double p = 80;
        double c = Double.parseDouble(cenaPica.getText());
        cenaPica.setText(p+c+"");
    }//GEN-LAST:event_fantaMouseClicked

    private void kokaKolaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kokaKolaMouseClicked
        double p = 80;
        double c = Double.parseDouble(cenaPica.getText());
        cenaPica.setText(p+c+"");
    }//GEN-LAST:event_kokaKolaMouseClicked

    private void stop1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stop1MouseMoved
        obavestenje.setText(pomoc);
    }//GEN-LAST:event_stop1MouseMoved

    private void stop1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stop1MouseClicked

    }//GEN-LAST:event_stop1MouseClicked

    private void stop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stop1ActionPerformed
        state = false;
        start1.setEnabled(true);

        brojOdigranihSati.setText(sati+"."+minuti);
    }//GEN-LAST:event_stop1ActionPerformed

    private void jLabel5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseMoved
        obavestenje.hide();
    }//GEN-LAST:event_jLabel5MouseMoved

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
         this.setSize(1040,620);
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
            java.util.logging.Logger.getLogger(ps4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ps4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ps4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ps4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ps4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ultra;
    private javax.swing.JTextField brojOdigranihSati;
    protected static javax.swing.JLabel brojSonij4;
    private javax.swing.JTextField cenaPica;
    private javax.swing.JLabel datum1;
    private javax.swing.JButton fanta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton kokaKola;
    private javax.swing.JTextField milisekunda1;
    private javax.swing.JTextField minut1;
    private javax.swing.JLabel obavestenje;
    private javax.swing.JButton resetuj1;
    private javax.swing.JTextField sat1;
    private javax.swing.JTextField sekunda1;
    private javax.swing.JButton start1;
    private javax.swing.JButton stop1;
    private javax.swing.JTextField sve;
    private javax.swing.JLabel vremeProba;
    // End of variables declaration//GEN-END:variables
}
