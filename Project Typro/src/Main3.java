
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Main3 extends javax.swing.JFrame {
int xmove;
int ymove;
String name;
      public Main3() {
            initComponents();
            this.setLocation(Start.x, Start.y);
            setList();
      }
      public Main3(int x, int y) {
            initComponents();
            this.setLocation(Start.x, Start.y);
            setList();
            this.setLocation(x, y);
            Music.keypressPath=Settings.keypresspath;
      }

      
      
      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            bg = new javax.swing.JPanel();
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
            jPanel3 = new javax.swing.JPanel();
            jPanel1 = new javax.swing.JPanel();
            jScrollPane1 = new javax.swing.JScrollPane();
            menu = new javax.swing.JList();
            jButton1 = new javax.swing.JButton();
            jButton2 = new javax.swing.JButton();
            jButton3 = new javax.swing.JButton();
            jButton4 = new javax.swing.JButton();
            jButton5 = new javax.swing.JButton();
            jButton6 = new javax.swing.JButton();
            jScrollPane3 = new javax.swing.JScrollPane();
            body = new javax.swing.JTextArea();
            jPanel2 = new javax.swing.JPanel();
            title = new javax.swing.JLabel();
            jButton7 = new javax.swing.JButton();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setUndecorated(true);

            bg.setBackground(new java.awt.Color(35, 36, 66));
            bg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(150, 151, 162), 2, true));
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

            jPanel3.setBackground(new java.awt.Color(35, 36, 66));
            jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(254, 245, 243), 10, true));

            jPanel1.setBackground(new java.awt.Color(60, 63, 66));
            jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, new java.awt.Color(153, 153, 153)));

            menu.setBackground(new java.awt.Color(51, 51, 51));
            menu.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
            menu.setForeground(new java.awt.Color(255, 255, 255));
            menu.setModel(new javax.swing.AbstractListModel() {
                  String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
                  public int getSize() { return strings.length; }
                  public Object getElementAt(int i) { return strings[i]; }
            });
            menu.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        menuMouseClicked(evt);
                  }
            });
            jScrollPane1.setViewportView(menu);

            jButton1.setBackground(new java.awt.Color(0, 0, 0));
            jButton1.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
            jButton1.setForeground(new java.awt.Color(255, 255, 255));
            jButton1.setText("Add New");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                  }
            });

            jButton2.setBackground(new java.awt.Color(0, 0, 0));
            jButton2.setFont(new java.awt.Font("Stencil", 1, 24)); // NOI18N
            jButton2.setForeground(new java.awt.Color(255, 255, 255));
            jButton2.setText("SAVE");
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton2ActionPerformed(evt);
                  }
            });

            jButton3.setBackground(new java.awt.Color(0, 0, 0));
            jButton3.setFont(new java.awt.Font("Dialog", 1, 60)); // NOI18N
            jButton3.setForeground(new java.awt.Color(255, 255, 255));
            jButton3.setText("-");
            jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jButton3.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton3ActionPerformed(evt);
                  }
            });

            jButton4.setBackground(new java.awt.Color(0, 0, 0));
            jButton4.setFont(new java.awt.Font("Dialog", 1, 50)); // NOI18N
            jButton4.setForeground(new java.awt.Color(255, 255, 255));
            jButton4.setText("+");
            jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
            jButton4.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton4ActionPerformed(evt);
                  }
            });

            jButton5.setBackground(new java.awt.Color(255, 255, 255));
            jButton5.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton5ActionPerformed(evt);
                  }
            });

            jButton6.setBackground(new java.awt.Color(0, 0, 0));
            jButton6.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton6ActionPerformed(evt);
                  }
            });

            body.setEditable(false);
            body.setBackground(new java.awt.Color(214, 217, 223));
            body.setColumns(20);
            body.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
            body.setForeground(new java.awt.Color(0, 0, 0));
            body.setRows(5);
            body.setText("To edit a file you must select a file from the left list!\nOr create a new one!");
            body.setCaretColor(new java.awt.Color(255, 0, 0));
            body.addCaretListener(new javax.swing.event.CaretListener() {
                  public void caretUpdate(javax.swing.event.CaretEvent evt) {
                        bodyCaretUpdate(evt);
                  }
            });
            jScrollPane3.setViewportView(body);

            jPanel2.setBackground(new java.awt.Color(214, 217, 223));
            jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
            jPanel2.setForeground(new java.awt.Color(51, 51, 51));

            title.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
            title.setForeground(new java.awt.Color(204, 0, 0));
            title.setText("NO FILE IS SELECTED!");

            jButton7.setBackground(new java.awt.Color(0, 0, 0));
            jButton7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
            jButton7.setForeground(new java.awt.Color(255, 255, 255));
            jButton7.setText("DELETE");
            jButton7.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton7ActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                  jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
            );
            jPanel2Layout.setVerticalGroup(
                  jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
            );

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jScrollPane1)
                              .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                          .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
                              .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
            );
            jPanel1Layout.setVerticalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                          .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                          .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                              .addGroup(bgLayout.createSequentialGroup()
                                    .addComponent(minimize)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(23, Short.MAX_VALUE))
            );
            bgLayout.setVerticalGroup(
                  bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(bgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(bgLayout.createSequentialGroup()
                                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                          .addComponent(minimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20))
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
                                    .addGap(43, 43, 43))))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            pack();
      }// </editor-fold>//GEN-END:initComponents

      private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
            Main obj = new Main();
            obj.setLocation(Start.x, Start.y);
            obj.setVisible(true);
            setVisible(false);
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
            new Main(Start.x, Start.y).setVisible(true);
            setVisible(false);
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

      private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            body.setBackground(Color.decode("#D6D9DF"));
            body.setForeground(Color.black);
      }//GEN-LAST:event_jButton5ActionPerformed

      private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
            body.setBackground(Color.decode("#000000"));
            body.setForeground(Color.white);
      }//GEN-LAST:event_jButton6ActionPerformed

      private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            name = JOptionPane.showInputDialog(this, "Enter the name of your note.");
            for(int i=0; i<name.length(); i++)
                  if(name.charAt(i)=='@'){
                        JOptionPane.showMessageDialog(this, "You can not add special charecters in file name!");
                        return;
                  }
            Fileop.Create(Stats.loc+"Notes//"+name);
            Fileop.Add(Stats.loc+"Notes//List", "@"+name);
            JOptionPane.showMessageDialog(this, "New File Created successfully!");
            new Main3(Start.x, Start.y).setVisible(true);
            setVisible(false);
      }//GEN-LAST:event_jButton1ActionPerformed

      private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            Fileop.Write(Stats.loc+"Notes//"+name, body.getText());
            JOptionPane.showMessageDialog(this, "File saved successfully!");
      }//GEN-LAST:event_jButton2ActionPerformed

      private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
            String s=lll[menu.getSelectedIndex()];
            if(s.length()<1)
                  return;
            name=s;
            body.setText(Fileop.Read(Stats.loc+"Notes//"+s));
            body.setEditable(true);
            title.setText(name);
      }//GEN-LAST:event_menuMouseClicked

      private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
            int c=JOptionPane.showConfirmDialog(this, "Are you sure, you want do delete the file?");
            if(c==0){
                  String l=Fileop.Read(Stats.loc+"Notes//List");
                  System.out.println(l);
                  l=l.replace("@"+name, "");
                  Fileop.Write(Stats.loc+"Notes//List", l);
                  new Main3(Start.x, Start.y).setVisible(true);
                  setVisible(false);
            }
      }//GEN-LAST:event_jButton7ActionPerformed

      int fontSize=18;
      private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            if(fontSize>=60)
                  return;
            fontSize+=2;
            body.setFont(new Font("Arial", Font.PLAIN, fontSize));
      }//GEN-LAST:event_jButton4ActionPerformed

      private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            if(fontSize<=2)
                  return;
            fontSize-=2;
            body.setFont(new Font("Arial", Font.PLAIN, fontSize));
      }//GEN-LAST:event_jButton3ActionPerformed

      int typedLength=0;
      
      private void bodyCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_bodyCaretUpdate
            if(body.getText().length()>typedLength||body.getText().length()<typedLength){
                  Music.keypress();
                  typedLength=body.getText().length();
            }
            
      }//GEN-LAST:event_bodyCaretUpdate

      private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
           setState(ICONIFIED);
      }//GEN-LAST:event_minimizeMouseClicked

     String lll[]=new String[1000];
     int lllptr=0;
            
      public void setList(){
            File f = new File(Stats.loc+"Notes");
            f.mkdir();
            Fileop.Create(Stats.loc+"Notes//List");
            String l=Fileop.Read(Stats.loc+"Notes//List");
            for(int i=0; i<l.length(); i++){
                  if(l.charAt(i)=='@'){
                        for(int j=i+1; j<l.length(); j++){
                              if(l.charAt(j)=='@'||j==l.length()-1){
                                    if(j==l.length()-1)
                                    lll[lllptr]=(l.substring(i+1,j+1));
                                    else
                                    lll[lllptr]=(l.substring(i+1,j));
                                    lllptr++;
                                    i=j-1;
                                    break;
                              }
                        }
                  }
            }
            
            DefaultListModel listop= new DefaultListModel();
            menu.setModel(listop);
            for(int i=0, listindex=0; i<lll.length; i++, listindex++){
                  if(lll[i]==null)
                        lll[i]="";
                  if(lll[i].length()<=25)
                        listop.add(listindex, lll[i]);
                  else
                        listop.add(listindex, lll[i].substring(0,25)+"...");
            }
      }
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
                  java.util.logging.Logger.getLogger(Main3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                  java.util.logging.Logger.getLogger(Main3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                  java.util.logging.Logger.getLogger(Main3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                  java.util.logging.Logger.getLogger(Main3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        //</editor-fold>
            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        new Main3().setVisible(true);
                  }
            });
      }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JPanel bg;
      private javax.swing.JTextArea body;
      private javax.swing.JLabel close;
      private javax.swing.JLabel edit;
      private javax.swing.JLabel home;
      private javax.swing.JButton jButton1;
      private javax.swing.JButton jButton2;
      private javax.swing.JButton jButton3;
      private javax.swing.JButton jButton4;
      private javax.swing.JButton jButton5;
      private javax.swing.JButton jButton6;
      private javax.swing.JButton jButton7;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel7;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JPanel jPanel2;
      private javax.swing.JPanel jPanel3;
      private javax.swing.JScrollPane jScrollPane1;
      private javax.swing.JScrollPane jScrollPane3;
      private javax.swing.JList menu;
      private javax.swing.JLabel minimize;
      private javax.swing.JSeparator sa;
      private javax.swing.JSeparator se;
      private javax.swing.JSeparator sh;
      private javax.swing.JSeparator st;
      private javax.swing.JLabel time;
      private javax.swing.JLabel title;
      private javax.swing.JLabel type;
      // End of variables declaration//GEN-END:variables
}
