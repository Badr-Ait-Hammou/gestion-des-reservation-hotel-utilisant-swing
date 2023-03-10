/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package front;

import connexion.Connexion;
import entities.Chambre;
import entities.Client;
import static front.Reservations.id;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.plaf.DesktopPaneUI;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import test.Test;



/**
 *
 * @author Badr
 */
public class Gestion extends javax.swing.JFrame {

    /**
     * Creates new form Gestion
     */
    public Gestion() {
        initComponents();
         Toolkit toolkit= getToolkit();
        Dimension size= toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2 , size.height/2 - getHeight()/2);
        Chart chart=new Chart();
        desktoppane.add( chart);
        chart.setVisible(true);
       // chart.setSize(300, 300);
       // Test test=new Test();
       
       // test.setVisible(true);
       
      // this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
Chambres chambres=new Chambres();
Categories cat=new Categories();
Clients cl=new Clients();
Reservations res= new Reservations();
Betweend bet=new Betweend();
Chart chart=new Chart();
Usersf users=new Usersf();
Categoriechambre categoriechambre=new Categoriechambre();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        desktoppane = new javax.swing.JDesktopPane();
        jButton2 = new javax.swing.JButton();
        clientbtn1 = new javax.swing.JButton();
        categoriebtn = new javax.swing.JButton();
        chambrebtn = new javax.swing.JButton();
        reservatbtn = new javax.swing.JButton();
        findbetweenbtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        categoriechambrebtn = new javax.swing.JButton();
        usersbtn = new javax.swing.JButton();

        jMenu8.setText("File");
        jMenuBar2.add(jMenu8);

        jMenu9.setText("Edit");
        jMenuBar2.add(jMenu9);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/Ait_hammou1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 210, 156));

        desktoppane.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout desktoppaneLayout = new javax.swing.GroupLayout(desktoppane);
        desktoppane.setLayout(desktoppaneLayout);
        desktoppaneLayout.setHorizontalGroup(
            desktoppaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );
        desktoppaneLayout.setVerticalGroup(
            desktoppaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );

        jPanel2.add(desktoppane, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 1050, 630));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/button.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 0, 30, 30));

        clientbtn1.setBackground(new java.awt.Color(0, 102, 102));
        clientbtn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clientbtn1.setForeground(new java.awt.Color(255, 255, 255));
        clientbtn1.setText(" Clients");
        clientbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientbtn1ActionPerformed(evt);
            }
        });
        jPanel2.add(clientbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 190, 50));
        class RoundBtn implements Border
        {
            private int r;
            RoundBtn(int r) {
                this.r = r;
            }
            public Insets getBorderInsets(Component c) {
                return new Insets(this.r+1, this.r+1, this.r+2, this.r);
            }
            public boolean isBorderOpaque() {
                return true;
            }
            public void paintBorder(Component c, Graphics g, int x, int y,
                int width, int height) {
                g.drawRoundRect(x, y, width-1, height-1, r, r);
            }
        }
        clientbtn1.setBorder(new RoundBtn(20));
        clientbtn1.setOpaque(false);
        clientbtn1.setContentAreaFilled(true);
        clientbtn1.setBorderPainted(false);

        categoriebtn.setBackground(new java.awt.Color(0, 102, 102));
        categoriebtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        categoriebtn.setForeground(new java.awt.Color(255, 255, 255));
        categoriebtn.setText("Categories");
        categoriebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriebtnActionPerformed(evt);
            }
        });
        jPanel2.add(categoriebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 190, 50));
        categoriebtn.setBorder(new RoundBtn(20));
        categoriebtn.setOpaque(false);
        categoriebtn.setContentAreaFilled(true);
        categoriebtn.setBorderPainted(false);

        chambrebtn.setBackground(new java.awt.Color(0, 102, 102));
        chambrebtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chambrebtn.setForeground(new java.awt.Color(255, 255, 255));
        chambrebtn.setText("Chambres");
        chambrebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chambrebtnActionPerformed(evt);
            }
        });
        jPanel2.add(chambrebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 190, 50));
        chambrebtn.setBorder(new RoundBtn(20));
        chambrebtn.setOpaque(false);
        chambrebtn.setContentAreaFilled(true);
        chambrebtn.setBorderPainted(false);

        reservatbtn.setBackground(new java.awt.Color(0, 102, 102));
        reservatbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reservatbtn.setForeground(new java.awt.Color(255, 255, 255));
        reservatbtn.setText("Reservations");
        reservatbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservatbtnActionPerformed(evt);
            }
        });
        jPanel2.add(reservatbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 190, 50));
        reservatbtn.setBorder(new RoundBtn(20));
        reservatbtn.setOpaque(false);
        reservatbtn.setContentAreaFilled(true);
        reservatbtn.setBorderPainted(false);

        findbetweenbtn.setBackground(new java.awt.Color(0, 102, 102));
        findbetweenbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        findbetweenbtn.setForeground(new java.awt.Color(255, 255, 255));
        findbetweenbtn.setText("Between dates");
        findbetweenbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findbetweenbtnActionPerformed(evt);
            }
        });
        jPanel2.add(findbetweenbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 190, 50));
        reservatbtn.setBorder(new RoundBtn(20));
        reservatbtn.setOpaque(false);
        reservatbtn.setContentAreaFilled(true);
        reservatbtn.setBorderPainted(false);

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 190, 50));
        jButton1.setBorder(new RoundBtn(20));
        jButton1.setOpaque(false);
        jButton1.setContentAreaFilled(true);
        jButton1.setBorderPainted(false);

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/exit.png"))); // NOI18N
        jButton3.setText("Log out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, 120, 40));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/front/minimise.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 0, 30, 30));

        categoriechambrebtn.setBackground(new java.awt.Color(0, 102, 102));
        categoriechambrebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        categoriechambrebtn.setForeground(new java.awt.Color(255, 255, 255));
        categoriechambrebtn.setText("Chambre/Categorie");
        categoriechambrebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriechambrebtnActionPerformed(evt);
            }
        });
        jPanel2.add(categoriechambrebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 190, 50));
        categoriechambrebtn.setBorder(new RoundBtn(20));
        categoriechambrebtn.setOpaque(false);
        categoriechambrebtn.setContentAreaFilled(true);
        categoriechambrebtn.setBorderPainted(false);

        usersbtn.setBackground(new java.awt.Color(0, 102, 102));
        usersbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usersbtn.setForeground(new java.awt.Color(255, 255, 255));
        usersbtn.setText("Utilisateurs");
        usersbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersbtnActionPerformed(evt);
            }
        });
        jPanel2.add(usersbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 190, 50));
        usersbtn.setBorder(new RoundBtn(20));
        usersbtn.setOpaque(false);
        usersbtn.setContentAreaFilled(true);
        usersbtn.setBorderPainted(false);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1280, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void clientbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientbtn1ActionPerformed
      desktoppane.removeAll();
        desktoppane.add(cl);
        chambres.setVisible(false);
       res.setVisible(false);
       cat.setVisible(false);
        cl.setVisible(true);
        bet.setVisible(false);
        users.setVisible(false);
        chart.setVisible(false);
         categoriechambre.setVisible(false);
    }//GEN-LAST:event_clientbtn1ActionPerformed

    private void categoriebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriebtnActionPerformed
        desktoppane.removeAll();
        desktoppane.add(cat); 
      
       res.setVisible(false);
       cl.setVisible(false);
       chambres.setVisible(false);
        cat.setVisible(true);
        bet.setVisible(false);
        users.setVisible(false);
        chart.setVisible(false);
         categoriechambre.setVisible(false);
    }//GEN-LAST:event_categoriebtnActionPerformed

    private void chambrebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chambrebtnActionPerformed
         desktoppane.removeAll();
        desktoppane.add(chambres);
       res.setVisible(false);
       cl.setVisible(false);
       chambres.setVisible(true);
        cat.setVisible(false);
        bet.setVisible(false);
        users.setVisible(false);
        chart.setVisible(false);
         categoriechambre.setVisible(false);
    }//GEN-LAST:event_chambrebtnActionPerformed

    private void reservatbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservatbtnActionPerformed
       desktoppane.removeAll();
        desktoppane.add(res);
       res.setVisible(true);
       cl.setVisible(false);
       chambres.setVisible(false);
        cat.setVisible(false);
         bet.setVisible(false);
         users.setVisible(false);
         chart.setVisible(false);
          categoriechambre.setVisible(false);
    }//GEN-LAST:event_reservatbtnActionPerformed

    private void findbetweenbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findbetweenbtnActionPerformed
      desktoppane.removeAll();
        
        desktoppane.add(bet);
        bet.setVisible(true);
         res.setVisible(false);
       cl.setVisible(false);
       chambres.setVisible(false);
        cat.setVisible(false);
        users.setVisible(false);
        chart.setVisible(false);
         categoriechambre.setVisible(false);
    }//GEN-LAST:event_findbetweenbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     desktoppane.removeAll();
     desktoppane.add(chart);
      chart.setVisible(true);
       bet.setVisible(false);
         res.setVisible(false);
       cl.setVisible(false);
       chambres.setVisible(false);
        cat.setVisible(false);
        users.setVisible(false);
         categoriechambre.setVisible(false);
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Login login =new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       this.setState(JFrame.ICONIFIED);
   //  this.setExtendedState(JFrame.MAXIMIZED_BOTH);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void categoriechambrebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriechambrebtnActionPerformed
       desktoppane.removeAll();
       desktoppane.add(categoriechambre);
       categoriechambre.setVisible(true);
       chart.setVisible(false);
       bet.setVisible(false);
         res.setVisible(false);
       cl.setVisible(false);
       chambres.setVisible(false);
        cat.setVisible(false);
        users.setVisible(false);
       
    }//GEN-LAST:event_categoriechambrebtnActionPerformed

    private void usersbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersbtnActionPerformed
        desktoppane.removeAll();
       desktoppane.add(users);
       users.setVisible(true);
        chambres.setVisible(false);
       res.setVisible(false);
       cat.setVisible(false);
        cl.setVisible(false);
        bet.setVisible(false);
        categoriechambre.setVisible(false);
        chart.setVisible(false);
    }//GEN-LAST:event_usersbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton categoriebtn;
    private javax.swing.JButton categoriechambrebtn;
    private javax.swing.JButton chambrebtn;
    private javax.swing.JButton clientbtn1;
    private javax.swing.JDesktopPane desktoppane;
    private javax.swing.JButton findbetweenbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton reservatbtn;
    private javax.swing.JButton usersbtn;
    // End of variables declaration//GEN-END:variables
}
