import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Main2 extends javax.swing.JFrame {
int xmove;
int ymove;
int typePos=0;
String carold=null;
int typew=1, timerT=0, totalTime=0, timerT2=0;
boolean timeAttack=false;
boolean testRunning=true;
public Main2(){
      initComponents();
}
      public Main2(String loc) {
            this.setLocation(Start.x, Start.y);
            initComponents();
            String sample = Fileop.Read(loc);
            Words.emptyArrays();
            typew=1;
            Words.set(sample+" [END]");
            Word.setMainText(sample+" [END]");
            setDis();
            
      }
      public Main2(String loc, int time) {
            this.setLocation(Start.x, Start.y);
            timeAttack=true;
            initComponents();
            timerT=time*60;
            totalTime=timerT;
            String sample = Fileop.Read(loc);
            Words.emptyArrays();
            typew=1;
            Words.set(sample+" [END]");
            Word.setMainText(sample+" [END]");
            setDis();
      }
      
      private void setDis(){
            String s=Word.MainText;
            s=s.replace("\n", "<br/>");
            s="<html><b>"+s+"</b></html>";
            dis.setText(s);
      }
      
            Timer TimerClock = new Timer(1000,new ActionListener() {
            public void actionPerformed(ActionEvent e){
                  if(timerT==30){
                        timerbg.setBackground(Color.yellow);
                        timer.setForeground(Color.black);
                  }
                        
                  if(timerT==10)
                        timerbg.setBackground(Color.red);
                  if(timerT==0)
                        timerbg.setBackground(Color.gray);
                  timerT--;
                  if(timerT>=0){
                        timer.setText(timerT+"");
                  }
                  else {
                        if(testRunning){
                              TimerClock.stop();
                              y.setEditable(false);
                              JOptionPane.showMessageDialog(bg, "Done!");
                              Stats.time=totalTime;
                              setVisible(false);
                              new Main().setVisible(true);
                              Stats.dis();
                        }
                  }
            }
});
            Timer TimerClock2 = new Timer(1000,new ActionListener() {
            public void actionPerformed(ActionEvent e){  
                  timerT2++;
                  timer.setText(timerT2+"");
            }
});
      
      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            bg = new javax.swing.JPanel();
            jPanel3 = new javax.swing.JPanel();
            jPanel1 = new javax.swing.JPanel();
            sdgdfg = new javax.swing.JPanel();
            jScrollPane2 = new javax.swing.JScrollPane();
            y = new javax.swing.JTextArea();
            z = new javax.swing.JTextArea();
            timerbg = new javax.swing.JPanel();
            timer = new javax.swing.JLabel();
            jScrollPane3 = new javax.swing.JScrollPane();
            dis = new javax.swing.JLabel();
            close = new javax.swing.JLabel();
            minimize = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            edit = new javax.swing.JLabel();
            time = new javax.swing.JLabel();
            home = new javax.swing.JLabel();
            type = new javax.swing.JLabel();
            sh = new javax.swing.JSeparator();
            st = new javax.swing.JSeparator();
            sa = new javax.swing.JSeparator();
            jLabel7 = new javax.swing.JLabel();
            se = new javax.swing.JSeparator();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setUndecorated(true);

            bg.setBackground(new java.awt.Color(35, 36, 66));
            bg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(150, 151, 162), 2, true));
            bg.setPreferredSize(new java.awt.Dimension(1389, 831));
            bg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                  public void mouseDragged(java.awt.event.MouseEvent evt) {
                        bgMouseDragged(evt);
                  }
            });
            bg.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        bgMouseClicked(evt);
                  }
                  public void mousePressed(java.awt.event.MouseEvent evt) {
                        bgMousePressed(evt);
                  }
            });

            jPanel3.setBackground(new java.awt.Color(35, 36, 66));
            jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 245, 243), 10, true));

            jPanel1.setBackground(new java.awt.Color(60, 63, 66));
            jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, new java.awt.Color(153, 153, 153)));

            sdgdfg.setBackground(new java.awt.Color(204, 204, 255));

            y.setColumns(20);
            y.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
            y.setForeground(new java.awt.Color(153, 153, 153));
            y.setRows(5);
            y.setText("Type here...");
            y.setDisabledTextColor(new java.awt.Color(102, 102, 102));
            y.addCaretListener(new javax.swing.event.CaretListener() {
                  public void caretUpdate(javax.swing.event.CaretEvent evt) {
                        yCaretUpdate(evt);
                  }
            });
            jScrollPane2.setViewportView(y);

            javax.swing.GroupLayout sdgdfgLayout = new javax.swing.GroupLayout(sdgdfg);
            sdgdfg.setLayout(sdgdfgLayout);
            sdgdfgLayout.setHorizontalGroup(
                  sdgdfgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(sdgdfgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1052, Short.MAX_VALUE)
                        .addContainerGap())
            );
            sdgdfgLayout.setVerticalGroup(
                  sdgdfgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sdgdfgLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
            );

            z.setEditable(false);
            z.setBackground(new java.awt.Color(60, 63, 66));
            z.setColumns(20);
            z.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 36)); // NOI18N
            z.setForeground(new java.awt.Color(255, 255, 255));
            z.setRows(5);
            z.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
            z.setSelectionColor(new java.awt.Color(255, 255, 255));

            timerbg.setBackground(new java.awt.Color(60, 63, 66));
            timerbg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

            timer.setBackground(new java.awt.Color(60, 63, 66));
            timer.setFont(new java.awt.Font("Jokerman", 1, 36)); // NOI18N
            timer.setForeground(new java.awt.Color(255, 255, 255));
            timer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

            javax.swing.GroupLayout timerbgLayout = new javax.swing.GroupLayout(timerbg);
            timerbg.setLayout(timerbgLayout);
            timerbgLayout.setHorizontalGroup(
                  timerbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(timer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            timerbgLayout.setVerticalGroup(
                  timerbgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(timer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            jScrollPane3.setForeground(new java.awt.Color(255, 255, 255));

            dis.setBackground(new java.awt.Color(255, 255, 255));
            dis.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
            dis.setForeground(new java.awt.Color(0, 0, 0));
            dis.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            dis.setVerticalAlignment(javax.swing.SwingConstants.TOP);
            dis.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(214, 217, 223), 10, true));
            jScrollPane3.setViewportView(dis);

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jScrollPane3)
                              .addComponent(sdgdfg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(z, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(timerbg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())
            );
            jPanel1Layout.setVerticalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addComponent(z, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                              .addComponent(timerbg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sdgdfg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
            );

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                  jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            jPanel3Layout.setVerticalGroup(
                  jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            close.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
            close.setForeground(new java.awt.Color(255, 255, 255));
            close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/close.jpg"))); // NOI18N
            close.setToolTipText("");
            close.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        closeMouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        closeMouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        closeMouseExited(evt);
                  }
            });

            minimize.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
            minimize.setForeground(new java.awt.Color(255, 255, 255));
            minimize.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
            minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/min.jpg"))); // NOI18N
            minimize.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        minimizeMouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        minimizeMouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        minimizeMouseExited(evt);
                  }
            });

            jLabel2.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(255, 255, 255));
            jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel2.setText("TYPRO");

            edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/e80.jpg"))); // NOI18N
            edit.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        editMouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        editMouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        editMouseExited(evt);
                  }
            });

            time.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/a80.jpg"))); // NOI18N
            time.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        timeMouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        timeMouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        timeMouseExited(evt);
                  }
            });

            home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/h80.jpg"))); // NOI18N
            home.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        homeMouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        homeMouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        homeMouseExited(evt);
                  }
            });

            type.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/t80.jpg"))); // NOI18N
            type.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        typeMouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        typeMouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        typeMouseExited(evt);
                  }
            });

            sh.setForeground(new java.awt.Color(102, 102, 102));
            sh.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        shMouseEntered(evt);
                  }
            });

            st.setForeground(new java.awt.Color(102, 102, 102));

            sa.setForeground(new java.awt.Color(102, 102, 102));

            jLabel7.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
            jLabel7.setForeground(new java.awt.Color(255, 255, 255));
            jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel7.setText("EXIT");

            se.setForeground(new java.awt.Color(102, 102, 102));

            javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
            bg.setLayout(bgLayout);
            bgLayout.setHorizontalGroup(
                  bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(bgLayout.createSequentialGroup()
                                    .addGap(17, 17, 17)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(bgLayout.createSequentialGroup()
                                    .addGap(53, 53, 53)
                                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(jLabel7)
                                          .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(se, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(sa, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(st, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(sh)
                                                .addComponent(type, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(bgLayout.createSequentialGroup()
                                    .addGap(1096, 1096, 1096)
                                    .addComponent(minimize)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(bgLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(23, Short.MAX_VALUE))
            );
            bgLayout.setVerticalGroup(
                  bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(bgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(bgLayout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(40, 40, 40)
                                    .addComponent(home)
                                    .addGap(36, 36, 36)
                                    .addComponent(sh, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(type)
                                    .addGap(34, 34, 34)
                                    .addComponent(st, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(time)
                                    .addGap(39, 39, 39)
                                    .addComponent(sa, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)
                                    .addComponent(edit)
                                    .addGap(30, 30, 30)
                                    .addComponent(se, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7)
                                    .addGap(43, 43, 43))
                              .addGroup(bgLayout.createSequentialGroup()
                                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                          .addComponent(minimize, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                          .addComponent(close, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(20, Short.MAX_VALUE))))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            pack();
      }// </editor-fold>//GEN-END:initComponents

      private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
            
            if(!timerbool){
                  if(JOptionPane.showConfirmDialog(this, "Test is running, are you sure you want to quit?")==0){
                        testRunning=false;
                        new Main().setVisible(true);
                        setVisible(false);
                  }
            }
            else{
                  new Main().setVisible(true);
                  setVisible(false);
            }
      }//GEN-LAST:event_closeMouseClicked

      private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
            close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/closer.jpg")));
      }//GEN-LAST:event_closeMouseEntered

      private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
            close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/close.jpg")));
      }//GEN-LAST:event_closeMouseExited

      private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
            minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/minr.jpg")));
      }//GEN-LAST:event_minimizeMouseEntered

      private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
            minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/min.jpg")));
      }//GEN-LAST:event_minimizeMouseExited

      private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked

      }//GEN-LAST:event_editMouseClicked

      private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
            if(!Start.editclicked)
            edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/e80r.jpg")));
      }//GEN-LAST:event_editMouseEntered

      private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
            if(!Start.editclicked)
            edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/e80.jpg")));
      }//GEN-LAST:event_editMouseExited

      private void timeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeMouseClicked

      }//GEN-LAST:event_timeMouseClicked

      private void timeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeMouseEntered
            if(!Start.timeclicked)
            time.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/a80r.jpg")));
      }//GEN-LAST:event_timeMouseEntered

      private void timeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeMouseExited
            if(!Start.timeclicked)
            time.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/a80.jpg")));
      }//GEN-LAST:event_timeMouseExited

      private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked

      }//GEN-LAST:event_homeMouseClicked

      private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
            if(!Start.homeclicked)
            home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/h80r.jpg")));
      }//GEN-LAST:event_homeMouseEntered

      private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
            if(!Start.homeclicked)
            home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/h80.jpg")));
      }//GEN-LAST:event_homeMouseExited

      private void typeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_typeMouseClicked

      }//GEN-LAST:event_typeMouseClicked

      private void typeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_typeMouseEntered
            if(!Start.typeclicked)
            type.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/t80r.jpg")));
      }//GEN-LAST:event_typeMouseEntered

      private void typeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_typeMouseExited
            if(!Start.typeclicked)
            type.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/t80.jpg")));
      }//GEN-LAST:event_typeMouseExited

      private void shMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shMouseEntered

      }//GEN-LAST:event_shMouseEntered

      private void bgMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseDragged
            int xx= evt.getXOnScreen();
            int yy= evt.getYOnScreen();
            this.setLocation(xx-xmove, yy-ymove);
            Start.x=xx-xmove;
            Start.y=yy-ymove;
      }//GEN-LAST:event_bgMouseDragged

      private void bgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseClicked

      }//GEN-LAST:event_bgMouseClicked

      private void bgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMousePressed
            xmove = evt.getX();
            ymove = evt.getY();
      }//GEN-LAST:event_bgMousePressed

      private void yCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_yCaretUpdate
            Music.keypress();
            if(timerbool){
                  if(timeAttack)
                        TimerClock.start();
                  else 
                        TimerClock2.start();
                  timerbool=false;
                  y.setForeground(Color.black);
                  y.setText("");
                  y.setFont(new Font("dialog", Font.PLAIN, 18));
            }
            if(typew>Words.sampleptr){
                  if(timeAttack){
                        JOptionPane.showMessageDialog(this, "It's done!");
                        Stats.time=totalTime;
                        setVisible(false);
                        new Main().setVisible(true);
                        Stats.dis();
                        return;
                  }
                  else{
                        y.setEditable(false);
                        JOptionPane.showMessageDialog(this, "It's done!");
                        TimerClock2.stop();
                        Stats.time=Integer.valueOf(timer.getText());
                        setVisible(false);
                        new Main().setVisible(true);
                        Stats.dis();
                        return;
                  }
                  
            }
            String zz=z.getText();
            String yy=y.getText();
            int d;
            if(yy.length()>prevW.length()){
                  z.setText(zz+yy.charAt(yy.length()-1));
            }
            else{
                  d=prevW.length()-yy.length();
                  d=z.getText().length()-d;
                  if(d<=0){

                        z.setText("");
                        d=0;
                        prevW=yy;

                        return;
                  }
                  else
                  z.setText(z.getText().substring(0,d));
            }
            prevW=yy;
            char xx=yy.charAt(yy.length()-1);

            if(zz.length()>0)
            if(xx==' '||xx=='\n'||xx=='\t'){
                  String typed=Word.getFinalWord(z.getText());
                  if(typed.length()<1)
                  return;
                  String sample=Word.getNthWord(typew);
                  ////////////HERE WE GO!!!!!

                  if(sample.equals(typed)||typed.charAt(typed.length()-1)=='^'){
                        Music.correct();
                        Stats.CorrectWord(sample+" ");
                        disColor(sample.length(),sample,true);
                  }
                  else{
                        Music.wrong();
                        Stats.WrongWord(sample+" ");
                        disColor(sample.length(),sample,false);
                  }

                  ///////////Signal section end
                  typew++;
                  z.setText("");
            }
      }//GEN-LAST:event_yCaretUpdate

      private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
            setState(ICONIFIED);
      }//GEN-LAST:event_minimizeMouseClicked
boolean timerbool=true;
void disColor(int l, String c, boolean corr){
      String s=Word.MainText;
      String s1=s.substring(0,typePos);
      String s2=s.substring(typePos,s.length());
      if(corr){
            s2=s2.replaceFirst(c, "<font color='green'>"+c+"</font>");
            typePos+=27+l+1;
      }
      else {
            s2=s2.replaceFirst(c, "<font color='red'>"+c+"</font>");
            typePos+=25+l+1;
      }
      Word.MainText=s1+s2;
      setDis();
}
      
      String prevW="";
      public static void main(String args[]) {
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
                  java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                  java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                  java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                  java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        //</editor-fold>

            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        //new Main2().setVisible(true);
                  }
            });
      }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JPanel bg;
      private javax.swing.JLabel close;
      private javax.swing.JLabel dis;
      private javax.swing.JLabel edit;
      private javax.swing.JLabel home;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel7;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JPanel jPanel3;
      private javax.swing.JScrollPane jScrollPane2;
      private javax.swing.JScrollPane jScrollPane3;
      private javax.swing.JLabel minimize;
      private javax.swing.JSeparator sa;
      private javax.swing.JPanel sdgdfg;
      private javax.swing.JSeparator se;
      private javax.swing.JSeparator sh;
      private javax.swing.JSeparator st;
      private javax.swing.JLabel time;
      private javax.swing.JLabel timer;
      private javax.swing.JPanel timerbg;
      private javax.swing.JLabel type;
      private javax.swing.JTextArea y;
      private javax.swing.JTextArea z;
      // End of variables declaration//GEN-END:variables
}