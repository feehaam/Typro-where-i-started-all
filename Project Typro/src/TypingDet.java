
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MD.Feeham
 */
public class TypingDet extends javax.swing.JFrame {

      /**
       * Creates new form TypingDet
       */
      public TypingDet() {
            initComponents();
      }
      int xmove=0;
      int ymove=0;
      public TypingDet(String tdname, String tddate, String tdtime, String tdcwt, String tdclt, String tdwwt, String tdwlt, String tdaqu, String tdwpm, String tdkpm, String tdper) {
            initComponents();
            this.setLocation(Start.x, Start.y);
            name.setText(name.getText()+tdname);
            date.setText(date.getText()+tddate);
            time.setText(time.getText()+tdtime);
            cwt.setText(cwt.getText()+tdcwt);
            clt.setText(clt.getText()+tdclt);
            wwt.setText(wwt.getText()+tdwwt);
            wlt.setText(wlt.getText()+tdwlt);
            aqu.setText(aqu.getText()+tdaqu+"%");
            wpm.setText(wpm.getText()+tdwpm);
            kpm.setText(kpm.getText()+tdkpm);
            per.setText(per.getText()+tdper);
      }

      /**
       * This method is called from within the constructor to initialize the
       * form. WARNING: Do NOT modify this code. The content of this method is
       * always regenerated by the Form Editor.
       */
      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            jPanel2 = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            x = new javax.swing.JLabel();
            name = new javax.swing.JLabel();
            time = new javax.swing.JLabel();
            cwt = new javax.swing.JLabel();
            clt = new javax.swing.JLabel();
            wwt = new javax.swing.JLabel();
            wlt = new javax.swing.JLabel();
            aqu = new javax.swing.JLabel();
            wpm = new javax.swing.JLabel();
            kpm = new javax.swing.JLabel();
            date = new javax.swing.JLabel();
            per = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setUndecorated(true);

            jPanel1.setBackground(new java.awt.Color(249, 249, 209));

            jPanel2.setBackground(new java.awt.Color(255, 153, 153));

            jLabel1.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(255, 255, 255));
            jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel1.setText("Typing statistics");
            jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                  public void mouseDragged(java.awt.event.MouseEvent evt) {
                        jLabel1MouseDragged(evt);
                  }
            });
            jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mousePressed(java.awt.event.MouseEvent evt) {
                        jLabel1MousePressed(evt);
                  }
            });

            x.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
            x.setForeground(new java.awt.Color(51, 51, 51));
            x.setText("x");
            x.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        xMouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        xMouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        xMouseExited(evt);
                  }
            });

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                  jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1023, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x)
                        .addGap(10, 10, 10))
            );
            jPanel2Layout.setVerticalGroup(
                  jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                              .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                    .addGap(18, 18, 18))))
            );

            name.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
            name.setForeground(new java.awt.Color(255, 102, 102));
            name.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            name.setText("Name: ");

            time.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
            time.setForeground(new java.awt.Color(102, 102, 102));
            time.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            time.setText("Total time: ");

            cwt.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
            cwt.setForeground(new java.awt.Color(102, 102, 102));
            cwt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            cwt.setText("Correctly Word Typed: ");

            clt.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
            clt.setForeground(new java.awt.Color(102, 102, 102));
            clt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            clt.setText("Correctly Latter Typed: ");

            wwt.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
            wwt.setForeground(new java.awt.Color(102, 102, 102));
            wwt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            wwt.setText("INCorrectly Word Typed: ");

            wlt.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
            wlt.setForeground(new java.awt.Color(102, 102, 102));
            wlt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            wlt.setText("InCorrectly Latter Typed: ");

            aqu.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
            aqu.setForeground(new java.awt.Color(0, 204, 0));
            aqu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            aqu.setText("Aquiracy: ");

            wpm.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
            wpm.setForeground(new java.awt.Color(102, 102, 102));
            wpm.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            wpm.setText("WPM(Words per munute): ");

            kpm.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
            kpm.setForeground(new java.awt.Color(153, 51, 255));
            kpm.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            kpm.setText("KPM(Keypress per munute): ");

            date.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
            date.setForeground(new java.awt.Color(255, 102, 102));
            date.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            date.setText("Date: ");

            per.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
            per.setForeground(new java.awt.Color(51, 153, 255));
            per.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            per.setText("Performance: ");

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(80, 80, 80)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                          .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addComponent(wlt, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(aqu, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(wpm, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(kpm, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addComponent(wwt, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                          .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                      .addComponent(cwt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                      .addComponent(clt, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(per, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(56, 56, 56))
            );
            jPanel1Layout.setVerticalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                              .addComponent(time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(cwt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(clt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addComponent(per, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wwt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(wlt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aqu, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wpm, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kpm, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            pack();
            setLocationRelativeTo(null);
      }// </editor-fold>//GEN-END:initComponents

      private void xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseClicked
            
            setVisible(false);
      }//GEN-LAST:event_xMouseClicked

      private void xMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseEntered
            x.setForeground(Color.green);
      }//GEN-LAST:event_xMouseEntered

      private void xMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseExited
            x.setForeground(Color.decode("#333333"));
      }//GEN-LAST:event_xMouseExited

      private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
            xmove = evt.getX();
            ymove = evt.getY();
      }//GEN-LAST:event_jLabel1MousePressed

      private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
            int xx= evt.getXOnScreen();
            int yy= evt.getYOnScreen();
            this.setLocation(xx-xmove, yy-ymove);
            Start.x=xx-xmove;
            Start.y=yy-ymove;
      }//GEN-LAST:event_jLabel1MouseDragged

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
                  java.util.logging.Logger.getLogger(TypingDet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                  java.util.logging.Logger.getLogger(TypingDet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                  java.util.logging.Logger.getLogger(TypingDet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                  java.util.logging.Logger.getLogger(TypingDet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        new TypingDet().setVisible(true);
                  }
            });
      }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JLabel aqu;
      private javax.swing.JLabel clt;
      private javax.swing.JLabel cwt;
      private javax.swing.JLabel date;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JPanel jPanel2;
      private javax.swing.JLabel kpm;
      private javax.swing.JLabel name;
      private javax.swing.JLabel per;
      private javax.swing.JLabel time;
      private javax.swing.JLabel wlt;
      private javax.swing.JLabel wpm;
      private javax.swing.JLabel wwt;
      private javax.swing.JLabel x;
      // End of variables declaration//GEN-END:variables
}
