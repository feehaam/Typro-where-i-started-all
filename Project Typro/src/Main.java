import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author MD.Feeham
 */
public class Main extends javax.swing.JFrame {
      public Main() {
            initComponents();
            if(Start.x>0||Start.y>0)
                  this.setLocation(Start.x, Start.y);
            else
                  this.setLocation(0, 0);
            notesdetail.setText("<html>Save your special notes here.<br/>Access those.<br/>Edit those.<br/>Save those.<br/>Or delete those.<br/>Anytime you want!<br/><br/>Also don't forget to, <br/>select a keypress sound<br/>from settings section.</html>");
            tttdetails.setText("<html><b>Test your typing skill in a set amount of time!<br/></b>In this mode, very large sample text are given.<br/>Select your goal time from below, click on any sample.<br/>Then keep typing untill the time ends and test your limit.</html>");
            ttcdetails.setText("<html>Faster and easier. No time limit is set. Type untill the end to test your typing skill and test your limit.<br/>This campaign mode includes shorter samples based on story, religion, nature, code and banglish.</html>");
            gdet.setText("<html>See your performance in a while.<br/>All of your perfomence based on KMP-KeypressPerMinute is saved.<br/>A graph is implemented based on those data <br/>to trrack your improvements of typing.</html>");
            setList();
            setList2();
            setSamplelist();
            setSamplelist2();
      }
     public Main(int x, int y) {
           this.setLocation(Start.x, Start.y);
            initComponents();
            this.setLocation(x, y);
            notesdetail.setText("<html>Save your special notes here.<br/>Access those.<br/>Edit those.<br/>Save those.<br/>Or delete those.<br/>Anytime you want!<br/><br/>Also don't forget to, <br/>select a keypress sound<br/>from settings section.</html>");
            
      }
int xmove;
int ymove;
String list2[]=new String[100];
String list[]=new String[100];    
int lptr=0;
int lptr2=0;
int HistorySize=0;
void setList(){
      String s=Fileop.Read("F:\\Typro\\Samples\\List.txt");
            for(int i=0; i<s.length(); i++){
                  if(s.charAt(i)=='@')
                  for(int j=i; j<s.length(); j++){
                        if(s.charAt(j)=='#'){
                              list[lptr]=s.substring(i+1, j);
                              lptr++;
                              i=j+1;
                              break;
                        }
                  }
            }
            s=Fileop.Read("F:\\Typro\\Samples\\List2.txt");
            for(int i=0; i<s.length(); i++){
                  if(s.charAt(i)=='@')
                  for(int j=i; j<s.length(); j++){
                        if(s.charAt(j)=='#'){
                              list2[lptr2]=s.substring(i+1, j);
                              lptr2++;
                              i=j+1;
                              break;
                        }
                  }
            }
}
      @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            bg = new javax.swing.JPanel();
            jPanel3 = new javax.swing.JPanel();
            jPanel1 = new javax.swing.JPanel();
            jPanel2 = new javax.swing.JPanel();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jSeparator2 = new javax.swing.JSeparator();
            prev = new javax.swing.JButton();
            next = new javax.swing.JButton();
            tttdetails = new javax.swing.JLabel();
            setTime = new javax.swing.JTextField();
            jButton1 = new javax.swing.JButton();
            jButton2 = new javax.swing.JButton();
            jSeparator4 = new javax.swing.JSeparator();
            jSeparator5 = new javax.swing.JSeparator();
            jSeparator6 = new javax.swing.JSeparator();
            jSeparator7 = new javax.swing.JSeparator();
            jSeparator8 = new javax.swing.JSeparator();
            jSeparator9 = new javax.swing.JSeparator();
            jSeparator10 = new javax.swing.JSeparator();
            jSeparator11 = new javax.swing.JSeparator();
            jSeparator12 = new javax.swing.JSeparator();
            sn1 = new javax.swing.JLabel();
            sn2 = new javax.swing.JLabel();
            sn3 = new javax.swing.JLabel();
            sn4 = new javax.swing.JLabel();
            sn5 = new javax.swing.JLabel();
            sn6 = new javax.swing.JLabel();
            sn7 = new javax.swing.JLabel();
            sn8 = new javax.swing.JLabel();
            jPanel4 = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            jSeparator1 = new javax.swing.JSeparator();
            notesdetail = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            jPanel5 = new javax.swing.JPanel();
            jLabel4 = new javax.swing.JLabel();
            jSeparator3 = new javax.swing.JSeparator();
            prev1 = new javax.swing.JButton();
            next1 = new javax.swing.JButton();
            ttcdetails = new javax.swing.JLabel();
            jSeparator13 = new javax.swing.JSeparator();
            jSeparator14 = new javax.swing.JSeparator();
            jSeparator15 = new javax.swing.JSeparator();
            jSeparator16 = new javax.swing.JSeparator();
            jSeparator17 = new javax.swing.JSeparator();
            jSeparator18 = new javax.swing.JSeparator();
            jSeparator19 = new javax.swing.JSeparator();
            jSeparator20 = new javax.swing.JSeparator();
            jSeparator21 = new javax.swing.JSeparator();
            ss1 = new javax.swing.JLabel();
            ss2 = new javax.swing.JLabel();
            ss3 = new javax.swing.JLabel();
            ss4 = new javax.swing.JLabel();
            ss5 = new javax.swing.JLabel();
            ss6 = new javax.swing.JLabel();
            jPanel6 = new javax.swing.JPanel();
            jLabel6 = new javax.swing.JLabel();
            jSeparator22 = new javax.swing.JSeparator();
            gdet = new javax.swing.JLabel();
            jLabel8 = new javax.swing.JLabel();
            jPanel7 = new javax.swing.JPanel();
            jLabel10 = new javax.swing.JLabel();
            jSeparator24 = new javax.swing.JSeparator();
            jLabel11 = new javax.swing.JLabel();
            cmc = new javax.swing.JComboBox();
            jLabel12 = new javax.swing.JLabel();
            kmc = new javax.swing.JComboBox();
            jLabel13 = new javax.swing.JLabel();
            wmc = new javax.swing.JComboBox();
            jButton3 = new javax.swing.JButton();
            jPanel8 = new javax.swing.JPanel();
            jLabel9 = new javax.swing.JLabel();
            jSeparator23 = new javax.swing.JSeparator();
            jScrollPane1 = new javax.swing.JScrollPane();
            menu = new javax.swing.JList();
            close = new javax.swing.JLabel();
            minimize = new javax.swing.JLabel();
            header = new javax.swing.JLabel();
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

            jPanel2.setBackground(new java.awt.Color(204, 204, 255));

            jLabel2.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(0, 0, 0));
            jLabel2.setText("TYPING TEST");

            jLabel3.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
            jLabel3.setForeground(new java.awt.Color(0, 0, 0));
            jLabel3.setText("COUNTDOWN MODE");

            prev.setBackground(new java.awt.Color(204, 204, 204));
            prev.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            prev.setForeground(new java.awt.Color(51, 102, 255));
            prev.setText("<<");
            prev.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        prevActionPerformed(evt);
                  }
            });

            next.setBackground(new java.awt.Color(204, 204, 204));
            next.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            next.setForeground(new java.awt.Color(51, 102, 255));
            next.setText(">>");
            next.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        nextActionPerformed(evt);
                  }
            });

            tttdetails.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            tttdetails.setVerticalAlignment(javax.swing.SwingConstants.TOP);

            setTime.setEditable(false);
            setTime.setBackground(new java.awt.Color(204, 204, 255));
            setTime.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
            setTime.setForeground(new java.awt.Color(51, 51, 51));
            setTime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
            setTime.setText("2 minutes");
            setTime.setAutoscrolls(false);

            jButton1.setBackground(new java.awt.Color(35, 36, 66));
            jButton1.setForeground(new java.awt.Color(255, 255, 255));
            jButton1.setText("+");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                  }
            });

            jButton2.setBackground(new java.awt.Color(35, 36, 66));
            jButton2.setForeground(new java.awt.Color(255, 255, 255));
            jButton2.setText("-");
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton2ActionPerformed(evt);
                  }
            });

            sn1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
            sn1.setForeground(new java.awt.Color(51, 51, 51));
            sn1.setText("A tale of to ants and a tiger.");
            sn1.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        sn1MouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        sn1MouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        sn1MouseExited(evt);
                  }
            });

            sn2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
            sn2.setForeground(new java.awt.Color(51, 51, 51));
            sn2.setText("A tale of to ants and a tiger.");
            sn2.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        sn2MouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        sn2MouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        sn2MouseExited(evt);
                  }
            });

            sn3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
            sn3.setForeground(new java.awt.Color(51, 51, 51));
            sn3.setText("A tale of to ants and a tiger.");
            sn3.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        sn3MouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        sn3MouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        sn3MouseExited(evt);
                  }
            });

            sn4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
            sn4.setForeground(new java.awt.Color(51, 51, 51));
            sn4.setText("A tale of to ants and a tiger.");
            sn4.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        sn4MouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        sn4MouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        sn4MouseExited(evt);
                  }
            });

            sn5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
            sn5.setForeground(new java.awt.Color(51, 51, 51));
            sn5.setText("A tale of to ants and a tiger.");
            sn5.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        sn5MouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        sn5MouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        sn5MouseExited(evt);
                  }
            });

            sn6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
            sn6.setForeground(new java.awt.Color(51, 51, 51));
            sn6.setText("A tale of to ants and a tiger.");
            sn6.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        sn6MouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        sn6MouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        sn6MouseExited(evt);
                  }
            });

            sn7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
            sn7.setForeground(new java.awt.Color(51, 51, 51));
            sn7.setText("A tale of to ants and a tiger.");
            sn7.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        sn7MouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        sn7MouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        sn7MouseExited(evt);
                  }
            });

            sn8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
            sn8.setForeground(new java.awt.Color(51, 51, 51));
            sn8.setText("A tale of to ants and a tiger.");
            sn8.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        sn8MouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        sn8MouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        sn8MouseExited(evt);
                  }
            });

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                  jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(tttdetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jSeparator2)
                              .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(prev)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(next))
                              .addComponent(jSeparator4)
                              .addComponent(jSeparator5)
                              .addComponent(jSeparator6)
                              .addComponent(jSeparator7)
                              .addComponent(jSeparator8)
                              .addComponent(jSeparator9)
                              .addComponent(jSeparator10)
                              .addComponent(jSeparator11)
                              .addComponent(jSeparator12)
                              .addComponent(sn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(setTime, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 37, Short.MAX_VALUE))
                              .addComponent(sn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(sn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(sn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(sn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(sn6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(sn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(sn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
            );
            jPanel2Layout.setVerticalGroup(
                  jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tttdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(setTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addComponent(jButton1)
                              .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sn1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sn2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sn3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sn4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sn5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sn6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sn7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sn8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(prev)
                              .addComponent(next))
                        .addContainerGap())
            );

            jPanel4.setBackground(new java.awt.Color(255, 204, 204));

            jLabel1.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(0, 0, 0));
            jLabel1.setText("Notes");

            notesdetail.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
            notesdetail.setForeground(new java.awt.Color(102, 102, 102));
            notesdetail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            notesdetail.setVerticalAlignment(javax.swing.SwingConstants.TOP);
            notesdetail.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        notesdetailMouseClicked(evt);
                  }
            });

            jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
            jLabel5.setForeground(new java.awt.Color(255, 102, 102));
            jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel5.setText("OPEN NOTES");
            jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
            jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jLabel5MouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        jLabel5MouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        jLabel5MouseExited(evt);
                  }
            });

            javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                  jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                              .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(notesdetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
            );
            jPanel4Layout.setVerticalGroup(
                  jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(notesdetail, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
            );

            jPanel5.setBackground(new java.awt.Color(227, 255, 227));

            jLabel4.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(0, 0, 0));
            jLabel4.setText("TYPING TEST (cAMPAIGN MODE)");

            prev1.setBackground(new java.awt.Color(204, 204, 204));
            prev1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            prev1.setForeground(new java.awt.Color(153, 153, 153));
            prev1.setText("<<");
            prev1.setEnabled(false);
            prev1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        prev1ActionPerformed(evt);
                  }
            });

            next1.setBackground(new java.awt.Color(204, 204, 204));
            next1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            next1.setForeground(new java.awt.Color(153, 153, 153));
            next1.setText(">>");
            next1.setEnabled(false);
            next1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        next1ActionPerformed(evt);
                  }
            });

            jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);

            ss1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
            ss1.setForeground(new java.awt.Color(51, 51, 51));
            ss1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            ss1.setText("Andromeda the farest neighbour");
            ss1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
            ss1.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        ss1MouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        ss1MouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        ss1MouseExited(evt);
                  }
            });

            ss2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
            ss2.setForeground(new java.awt.Color(51, 51, 51));
            ss2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            ss2.setText("A tale of two ants and a tiger");
            ss2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
            ss2.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        ss2MouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        ss2MouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        ss2MouseExited(evt);
                  }
            });

            ss3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
            ss3.setForeground(new java.awt.Color(51, 51, 51));
            ss3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            ss3.setText("A tale of two ants and a tiger");
            ss3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
            ss3.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        ss3MouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        ss3MouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        ss3MouseExited(evt);
                  }
            });

            ss4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
            ss4.setForeground(new java.awt.Color(51, 51, 51));
            ss4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            ss4.setText("A tale of two ants and a tiger");
            ss4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
            ss4.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        ss4MouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        ss4MouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        ss4MouseExited(evt);
                  }
            });

            ss5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
            ss5.setForeground(new java.awt.Color(51, 51, 51));
            ss5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            ss5.setText("A tale of two ants and a tiger");
            ss5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
            ss5.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        ss5MouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        ss5MouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        ss5MouseExited(evt);
                  }
            });

            ss6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
            ss6.setForeground(new java.awt.Color(51, 51, 51));
            ss6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            ss6.setText("A tale of two ants and a tiger");
            ss6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
            ss6.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        ss6MouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        ss6MouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        ss6MouseExited(evt);
                  }
            });

            javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
            jPanel5.setLayout(jPanel5Layout);
            jPanel5Layout.setHorizontalGroup(
                  jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(jSeparator14)
                                          .addComponent(jSeparator16)
                                          .addComponent(jSeparator17)
                                          .addComponent(jSeparator18)
                                          .addComponent(ss1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                          .addComponent(ss2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                          .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addComponent(prev1)
                                                      .addComponent(ss3))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(next1)
                                                .addComponent(jSeparator15, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                                                .addComponent(jSeparator19)
                                                .addComponent(jSeparator20)
                                                .addComponent(jSeparator21))
                                          .addComponent(ss4)
                                          .addComponent(ss5)
                                          .addComponent(ss6))
                                    .addGap(3, 3, 3))
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                          .addComponent(ttcdetails, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 201, Short.MAX_VALUE))
                                          .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addContainerGap())))
            );
            jPanel5Layout.setVerticalGroup(
                  jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ttcdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ss4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ss5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ss6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(next1))
                              .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addGroup(jPanel5Layout.createSequentialGroup()
                                                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(1, 1, 1)
                                                .addComponent(ss1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(1, 1, 1)
                                                .addComponent(ss2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(1, 1, 1)
                                                .addComponent(ss3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                                .addComponent(prev1))
                                          .addComponent(jSeparator13))
                                    .addContainerGap())))
            );

            jPanel6.setBackground(new java.awt.Color(255, 255, 204));

            jLabel6.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
            jLabel6.setForeground(new java.awt.Color(0, 0, 0));
            jLabel6.setText("GRAPHS");

            jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
            jLabel8.setForeground(new java.awt.Color(255, 102, 102));
            jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel8.setText("OPEN GRAPH");
            jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
            jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jLabel8MouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        jLabel8MouseEntered(evt);
                  }
                  public void mouseExited(java.awt.event.MouseEvent evt) {
                        jLabel8MouseExited(evt);
                  }
            });

            javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
            jPanel6.setLayout(jPanel6Layout);
            jPanel6Layout.setHorizontalGroup(
                  jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jSeparator22)
                              .addComponent(gdet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 228, Short.MAX_VALUE))
                              .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
            );
            jPanel6Layout.setVerticalGroup(
                  jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gdet, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
            );

            jPanel7.setBackground(new java.awt.Color(204, 255, 255));

            jLabel10.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
            jLabel10.setForeground(new java.awt.Color(0, 0, 0));
            jLabel10.setText("Settings");

            jLabel11.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
            jLabel11.setForeground(new java.awt.Color(102, 102, 102));
            jLabel11.setText("Keypress Sound");

            cmc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Correct01", "Correct02", "Correct03" }));
            cmc.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        cmcMouseClicked(evt);
                  }
            });

            jLabel12.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
            jLabel12.setForeground(new java.awt.Color(102, 102, 102));
            jLabel12.setText("Typed Correct sound");

            kmc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Keypress01", "Keypress02", "Keypress03", "Keypress04", "Keypress05", "No music" }));
            kmc.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        kmcMouseClicked(evt);
                  }
            });
            kmc.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        kmcActionPerformed(evt);
                  }
            });
            kmc.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
                  public void propertyChange(java.beans.PropertyChangeEvent evt) {
                        kmcPropertyChange(evt);
                  }
            });

            jLabel13.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
            jLabel13.setForeground(new java.awt.Color(102, 102, 102));
            jLabel13.setText("Typed wrong sound");

            wmc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Error01", "Error02", "Error03" }));
            wmc.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        wmcMouseClicked(evt);
                  }
            });

            jButton3.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
            jButton3.setText("Save Changes");
            jButton3.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton3ActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
            jPanel7.setLayout(jPanel7Layout);
            jPanel7Layout.setHorizontalGroup(
                  jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(cmc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(jSeparator24)
                              .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                              .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(wmc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addComponent(kmc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))
                              .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
            );
            jPanel7Layout.setVerticalGroup(
                  jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator24, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kmc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wmc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );

            jPanel8.setBackground(new java.awt.Color(255, 255, 255));

            jLabel9.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
            jLabel9.setForeground(new java.awt.Color(0, 0, 0));
            jLabel9.setText("History");

            menu.setBackground(new java.awt.Color(255, 255, 255));
            menu.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
            menu.setModel(new javax.swing.AbstractListModel() {
                  String[] strings = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" };
                  public int getSize() { return strings.length; }
                  public Object getElementAt(int i) { return strings[i]; }
            });
            menu.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        menuMouseClicked(evt);
                  }
            });
            jScrollPane1.setViewportView(menu);

            javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
            jPanel8.setLayout(jPanel8Layout);
            jPanel8Layout.setHorizontalGroup(
                  jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                              .addComponent(jScrollPane1)
                              .addComponent(jSeparator23, javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
            );
            jPanel8Layout.setVerticalGroup(
                  jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                        .addContainerGap())
            );

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                          .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                          .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
            );
            jPanel1Layout.setVerticalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                              .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                          .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                          .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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

            header.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
            header.setForeground(new java.awt.Color(255, 255, 255));
            header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            header.setText("TYPRO");
            header.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        headerMouseEntered(evt);
                  }
            });

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
                                    .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                    .addComponent(minimize)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(25, Short.MAX_VALUE))
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
                                    .addGap(21, 21, 21))
                              .addGroup(bgLayout.createSequentialGroup()
                                    .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                  .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );

            pack();
            setLocationRelativeTo(null);
      }// </editor-fold>//GEN-END:initComponents

      private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
            close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/closer.jpg")));
      }//GEN-LAST:event_closeMouseEntered

      private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
            close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/close.jpg")));
      }//GEN-LAST:event_closeMouseExited

      private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
            if(JOptionPane.showConfirmDialog(this, "Are you sure, you want to exit?")==0)
            System.exit(0);
      }//GEN-LAST:event_closeMouseClicked

      private void bgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMousePressed
            xmove = evt.getX();
            ymove = evt.getY();
      }//GEN-LAST:event_bgMousePressed

      private void bgMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseDragged
            int xx= evt.getXOnScreen();
            int yy= evt.getYOnScreen();
            this.setLocation(xx-xmove, yy-ymove);
            Start.x=xx-xmove;
            Start.y=yy-ymove;
      }//GEN-LAST:event_bgMouseDragged

      private void bgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMouseClicked
            
      }//GEN-LAST:event_bgMouseClicked

      private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
            
      }//GEN-LAST:event_homeMouseEntered

      private void shMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shMouseEntered
            
      }//GEN-LAST:event_shMouseEntered

      private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
            minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/minr.jpg")));
      }//GEN-LAST:event_minimizeMouseEntered

      private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
            minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/min.jpg")));
      }//GEN-LAST:event_minimizeMouseExited

      private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
            if(!Start.homeclicked)
            home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/h80.jpg")));
      }//GEN-LAST:event_homeMouseExited

      private void typeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_typeMouseEntered
            if(!Start.typeclicked)
            type.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/t80r.jpg")));
      }//GEN-LAST:event_typeMouseEntered

      private void typeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_typeMouseExited
            if(!Start.typeclicked)
            type.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/t80.jpg")));
      }//GEN-LAST:event_typeMouseExited

      private void timeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeMouseEntered
            if(!Start.timeclicked)
            time.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/a80r.jpg")));
      }//GEN-LAST:event_timeMouseEntered

      private void timeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeMouseExited
            if(!Start.timeclicked)
            time.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/a80.jpg")));
      }//GEN-LAST:event_timeMouseExited

      private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
            if(!Start.editclicked)
            edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/e80r.jpg")));
      }//GEN-LAST:event_editMouseEntered

      private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
             if(!Start.editclicked)
            edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/e80.jpg")));
      }//GEN-LAST:event_editMouseExited

      private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
            
      }//GEN-LAST:event_homeMouseClicked

      private void typeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_typeMouseClicked
            
      }//GEN-LAST:event_typeMouseClicked

      private void timeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeMouseClicked
            
      }//GEN-LAST:event_timeMouseClicked

      private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
            new Main3(Start.x, Start.y).setVisible(true);
            setVisible(false);
      }//GEN-LAST:event_editMouseClicked

      private void headerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseEntered
            
      }//GEN-LAST:event_headerMouseEntered

      private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
            jLabel5.setForeground(Color.red);
      }//GEN-LAST:event_jLabel5MouseEntered

      private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
            jLabel5.setForeground(Color.decode("#FF6666"));
      }//GEN-LAST:event_jLabel5MouseExited

      private void notesdetailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notesdetailMouseClicked
            new Main3(Start.x, Start.y).setVisible(true);
            setVisible(false);
      }//GEN-LAST:event_notesdetailMouseClicked

      private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
            new Main3(Start.x, Start.y).setVisible(true);
            setVisible(false);
      }//GEN-LAST:event_jLabel5MouseClicked

      private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
            setState(ICONIFIED);
      }//GEN-LAST:event_minimizeMouseClicked

      int totalitem=0;
      int totalpage=0;
      int currentpage=0;
      void setSamplelist(){
            for(int i=0; i<list.length; i++){
                  if(list[i]==null){
                        totalitem=i-1;
                        break;
                  }
            }
                  
            
            totalpage=totalitem/8;
            setSamplelist(currentpage);
      }
      void setSamplelist(int page){
            int item=page*8;
            sn1.setText(list[item++]);
            sn2.setText(list[item++]);
            sn3.setText(list[item++]);
            sn4.setText(list[item++]);
            sn5.setText(list[item++]);
            sn6.setText(list[item++]);
            sn7.setText(list[item++]);
            sn8.setText(list[item++]);
            
            if(currentpage==0) enprev(false);
            else enprev(true);
            
            if(currentpage==totalpage) ennext(false);
            else ennext(true);
      }
      private void enprev(boolean x){
            if(x){
                  prev.setEnabled(true);
                  prev.setForeground(Color.decode("#3366FF"));
            }
            else{
                  prev.setEnabled(false);
                  prev.setForeground(Color.DARK_GRAY);
            }
      }
      private void ennext(boolean x){
            if(x){
                  next.setEnabled(true);
                  next.setForeground(Color.decode("#3366FF"));
            }
            else{
                  next.setEnabled(false);
                  next.setForeground(Color.DARK_GRAY);
            }
      }
      
      int totalitem2=0;
      int totalpage2=0;
      int currentpage2=0;
      void setSamplelist2(){
            for(int i=0; i<list2.length; i++){
                  if(list2[i]==null){
                        totalitem2=i-1;
                        break;
                  }
            }
            
            totalpage2=totalitem2/6;
            setSamplelist2(currentpage2);
      }
      void setSamplelist2(int page){
            int item=page*6;
            ss1.setText(list2[item++]);
            ss2.setText(list2[item++]);
            ss3.setText(list2[item++]);
            ss4.setText(list2[item++]);
            ss5.setText(list2[item++]);
            ss6.setText(list2[item++]);
            
            if(currentpage2==0) enprev2(false);
            else enprev2(true);
            
            if(currentpage2==totalpage2) ennext2(false);
            else ennext2(true);
      }
 private void enprev2(boolean x){
            if(x){
                  prev1.setEnabled(true);
                  prev1.setForeground(Color.decode("#3366FF"));
            }
            else{
                  prev1.setEnabled(false);
                  prev1.setForeground(Color.DARK_GRAY);
            }
      }
      private void ennext2(boolean x){
            if(x){
                  next1.setEnabled(true);
                  next1.setForeground(Color.decode("#3366FF"));
            }
            else{
                  next1.setEnabled(false);
                  next1.setForeground(Color.DARK_GRAY);
            }
      }
      
      
      
      
      
      private void prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevActionPerformed
            currentpage--;
            setSamplelist(currentpage);
      }//GEN-LAST:event_prevActionPerformed

      private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
            currentpage++;
            setSamplelist(currentpage);
      }//GEN-LAST:event_nextActionPerformed

      private void prev1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prev1ActionPerformed
            currentpage2--;
            setSamplelist2(currentpage2);
      }//GEN-LAST:event_prev1ActionPerformed

      private void next1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next1ActionPerformed
            currentpage2++;
            setSamplelist2(currentpage2);
      }//GEN-LAST:event_next1ActionPerformed
      int setTimeVal[]={1,2,5,10,15,20,30};
      int stvp=1;
      private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            if(setTimeVal[stvp]==1){
                  JOptionPane.showMessageDialog(this, "1 minute is the minimum goal time limit!");
            }
            else{
                  stvp--;
                  setTime.setText(setTimeVal[stvp]+" minutes");
            }
      }//GEN-LAST:event_jButton2ActionPerformed

      private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            if(setTimeVal[stvp]==30){
                  JOptionPane.showMessageDialog(this, "30 minutes is the maximum goal time limit!");
            }
            else{
                  stvp++;
                  setTime.setText(setTimeVal[stvp]+" minutes");
            }
      }//GEN-LAST:event_jButton1ActionPerformed

      private void sn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn1MouseEntered
            sn1.setForeground(Color.decode("#3366FF"));
      }//GEN-LAST:event_sn1MouseEntered

      private void sn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn1MouseExited
            sn1.setForeground(Color.decode("#333333"));
      }//GEN-LAST:event_sn1MouseExited

      private void sn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn2MouseEntered
            sn2.setForeground(Color.decode("#3366FF"));
      }//GEN-LAST:event_sn2MouseEntered

      private void sn2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn2MouseExited
            sn2.setForeground(Color.decode("#333333"));
      }//GEN-LAST:event_sn2MouseExited

      private void sn3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn3MouseEntered
            sn3.setForeground(Color.decode("#3366FF"));
      }//GEN-LAST:event_sn3MouseEntered

      private void sn3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn3MouseExited
            sn3.setForeground(Color.decode("#333333"));
      }//GEN-LAST:event_sn3MouseExited

      private void sn4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn4MouseEntered
            sn4.setForeground(Color.decode("#3366FF"));
      }//GEN-LAST:event_sn4MouseEntered

      private void sn4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn4MouseExited
            sn4.setForeground(Color.decode("#333333"));
      }//GEN-LAST:event_sn4MouseExited

      private void sn5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn5MouseEntered
            sn5.setForeground(Color.decode("#3366FF"));
      }//GEN-LAST:event_sn5MouseEntered

      private void sn5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn5MouseExited
            sn5.setForeground(Color.decode("#333333"));
      }//GEN-LAST:event_sn5MouseExited

      private void sn6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn6MouseEntered
            sn6.setForeground(Color.decode("#3366FF"));
      }//GEN-LAST:event_sn6MouseEntered

      private void sn6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn6MouseExited
            sn6.setForeground(Color.decode("#333333"));
      }//GEN-LAST:event_sn6MouseExited

      private void sn7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn7MouseEntered
            sn7.setForeground(Color.decode("#3366FF"));
      }//GEN-LAST:event_sn7MouseEntered

      private void sn7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn7MouseExited
            sn7.setForeground(Color.decode("#333333"));
      }//GEN-LAST:event_sn7MouseExited

      private void sn8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn8MouseEntered
            sn8.setForeground(Color.decode("#3366FF"));
      }//GEN-LAST:event_sn8MouseEntered

      private void sn8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn8MouseExited
            sn8.setForeground(Color.decode("#333333"));
      }//GEN-LAST:event_sn8MouseExited

      private void ss1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ss1MouseEntered
            ss1.setForeground(Color.decode("#3366FF"));
      }//GEN-LAST:event_ss1MouseEntered

      private void ss1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ss1MouseExited
            ss1.setForeground(Color.decode("#333333"));
      }//GEN-LAST:event_ss1MouseExited

      private void ss2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ss2MouseEntered
            ss2.setForeground(Color.decode("#3366FF"));
      }//GEN-LAST:event_ss2MouseEntered

      private void ss2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ss2MouseExited
            ss2.setForeground(Color.decode("#333333"));
      }//GEN-LAST:event_ss2MouseExited

      private void ss3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ss3MouseEntered
            ss3.setForeground(Color.decode("#3366FF"));
      }//GEN-LAST:event_ss3MouseEntered

      private void ss3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ss3MouseExited
            ss3.setForeground(Color.decode("#333333"));
      }//GEN-LAST:event_ss3MouseExited

      private void ss4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ss4MouseEntered
            ss4.setForeground(Color.decode("#3366FF"));
      }//GEN-LAST:event_ss4MouseEntered

      private void ss4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ss4MouseExited
            ss4.setForeground(Color.decode("#333333"));
      }//GEN-LAST:event_ss4MouseExited

      private void ss5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ss5MouseEntered
            ss5.setForeground(Color.decode("#3366FF"));
      }//GEN-LAST:event_ss5MouseEntered

      private void ss5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ss5MouseExited
            ss5.setForeground(Color.decode("#333333"));
      }//GEN-LAST:event_ss5MouseExited

      private void ss6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ss6MouseEntered
            ss6.setForeground(Color.decode("#3366FF"));
      }//GEN-LAST:event_ss6MouseEntered

      private void ss6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ss6MouseExited
            ss6.setForeground(Color.decode("#333333"));
      }//GEN-LAST:event_ss6MouseExited

      private void sn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn1MouseClicked
            openSample(sn1.getText());
      }//GEN-LAST:event_sn1MouseClicked

      private void sn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn2MouseClicked
            openSample(sn2.getText());
      }//GEN-LAST:event_sn2MouseClicked

      private void sn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn3MouseClicked
            openSample(sn3.getText());
      }//GEN-LAST:event_sn3MouseClicked

      private void sn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn4MouseClicked
            openSample(sn4.getText());
      }//GEN-LAST:event_sn4MouseClicked

      private void sn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn5MouseClicked
            openSample(sn5.getText());
      }//GEN-LAST:event_sn5MouseClicked

      private void sn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn6MouseClicked
            openSample(sn6.getText());
      }//GEN-LAST:event_sn6MouseClicked

      private void sn7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn7MouseClicked
            openSample(sn7.getText());
      }//GEN-LAST:event_sn7MouseClicked

      private void sn8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sn8MouseClicked
            openSample(sn8.getText());
      }//GEN-LAST:event_sn8MouseClicked

      private void ss1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ss1MouseClicked
            openSample2(ss1.getText());
      }//GEN-LAST:event_ss1MouseClicked

      private void ss2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ss2MouseClicked
            openSample2(ss2.getText());
      }//GEN-LAST:event_ss2MouseClicked

      private void ss3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ss3MouseClicked
            openSample2(ss3.getText());
      }//GEN-LAST:event_ss3MouseClicked

      private void ss4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ss4MouseClicked
            openSample2(ss4.getText());
      }//GEN-LAST:event_ss4MouseClicked

      private void ss5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ss5MouseClicked
            openSample2(ss5.getText());
      }//GEN-LAST:event_ss5MouseClicked

      private void ss6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ss6MouseClicked
            openSample2(ss6.getText());
      }//GEN-LAST:event_ss6MouseClicked

      private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
            JFrame frame = new JFrame();
            frame.setSize(1200,720);
            frame.setLocation(Start.x, Start.y);
            frame.setTitle("Stats graph (KMP-KeypressPerMinute) vs Time(Date)");
            frame.setVisible(true);
            frame.add(new Lines());
      }//GEN-LAST:event_jLabel8MouseClicked

      private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
            jLabel8.setForeground(Color.red);
      }//GEN-LAST:event_jLabel8MouseEntered

      private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
            jLabel8.setForeground(Color.decode("#FF6666"));
      }//GEN-LAST:event_jLabel8MouseExited


      
      private void kmcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kmcMouseClicked
            
      }//GEN-LAST:event_kmcMouseClicked

      private void cmcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmcMouseClicked
            // TODO add your handling code here:
      }//GEN-LAST:event_cmcMouseClicked

      private void wmcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wmcMouseClicked
            // TODO add your handling code here:
      }//GEN-LAST:event_wmcMouseClicked

      private void kmcPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_kmcPropertyChange
            
      }//GEN-LAST:event_kmcPropertyChange

      private void kmcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kmcActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_kmcActionPerformed

      private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            Fileop.Write("src\\Settings\\KMusic", kmc.getSelectedItem().toString());
            Fileop.Write("src\\Settings\\CMusic", cmc.getSelectedItem().toString());
            Fileop.Write("src\\Settings\\WMusic", wmc.getSelectedItem().toString());
            JOptionPane.showMessageDialog(this, "Changes has been saved.");
      }//GEN-LAST:event_jButton3ActionPerformed

      private void menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMouseClicked
           Stats.show(HistorySize-menu.getSelectedIndex()+1);
      }//GEN-LAST:event_menuMouseClicked
        

      private void openSample(String name){
            String loc = "F:\\Typro\\Samples\\"+name+".txt";
            new Main2(loc,setTimeVal[stvp]).setVisible(true);
            setVisible(false);
      }
      private void openSample2(String name){
            String loc = "F:\\Typro\\Samples\\"+name+".txt";
            new Main2(loc).setVisible(true);
            setVisible(false);
      }
      
      String lll[] = new String[1000];
      int lllptr=0;
      String item;
      public void setList2(){
            String s = Fileop.Read(Stats.loc+"Stats\\History.txt");
            for(int i=0; i<s.length(); i++){
                  if(s.charAt(i)=='*'){
                        for(int j=i+3; j<s.length(); j++){
                              if(s.charAt(j)=='#'){
                                    item = " "+(s.substring(i+3, j-2));
                                    i=j;
                                    break;
                              }
                        }
                        for(int j=i+2; j<s.length(); j++){
                              if(s.charAt(j)=='#'){
                                    item += " "+(s.substring(i+1, j-2));
                                    break;
                              }
                        }
                        lll[lllptr]=item;
                        lllptr++;
                  }
            }
            DefaultListModel listop= new DefaultListModel();
            menu.setModel(listop);
            for(int i=0; i<lll.length; i++)
                  if(lll[i]==null){
                        HistorySize=i-1;
                        break;
                  }
            for(int i=HistorySize, listindex=0; i>=0; i--, listindex++){
                  if(lll[i].length()<=25)
                        listop.add(listindex, lll[i]);
                  else
                        listop.add(listindex, lll[i].substring(0,25)+"...");
            }
      }
      
      
      
      public static void main(String args[]) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        new Main().setVisible(true);
                  }
            });
      }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JPanel bg;
      private javax.swing.JLabel close;
      private javax.swing.JComboBox cmc;
      private javax.swing.JLabel edit;
      private javax.swing.JLabel gdet;
      private javax.swing.JLabel header;
      private javax.swing.JLabel home;
      private javax.swing.JButton jButton1;
      private javax.swing.JButton jButton2;
      private javax.swing.JButton jButton3;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel10;
      private javax.swing.JLabel jLabel11;
      private javax.swing.JLabel jLabel12;
      private javax.swing.JLabel jLabel13;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JLabel jLabel6;
      private javax.swing.JLabel jLabel7;
      private javax.swing.JLabel jLabel8;
      private javax.swing.JLabel jLabel9;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JPanel jPanel2;
      private javax.swing.JPanel jPanel3;
      private javax.swing.JPanel jPanel4;
      private javax.swing.JPanel jPanel5;
      private javax.swing.JPanel jPanel6;
      private javax.swing.JPanel jPanel7;
      private javax.swing.JPanel jPanel8;
      private javax.swing.JScrollPane jScrollPane1;
      private javax.swing.JSeparator jSeparator1;
      private javax.swing.JSeparator jSeparator10;
      private javax.swing.JSeparator jSeparator11;
      private javax.swing.JSeparator jSeparator12;
      private javax.swing.JSeparator jSeparator13;
      private javax.swing.JSeparator jSeparator14;
      private javax.swing.JSeparator jSeparator15;
      private javax.swing.JSeparator jSeparator16;
      private javax.swing.JSeparator jSeparator17;
      private javax.swing.JSeparator jSeparator18;
      private javax.swing.JSeparator jSeparator19;
      private javax.swing.JSeparator jSeparator2;
      private javax.swing.JSeparator jSeparator20;
      private javax.swing.JSeparator jSeparator21;
      private javax.swing.JSeparator jSeparator22;
      private javax.swing.JSeparator jSeparator23;
      private javax.swing.JSeparator jSeparator24;
      private javax.swing.JSeparator jSeparator3;
      private javax.swing.JSeparator jSeparator4;
      private javax.swing.JSeparator jSeparator5;
      private javax.swing.JSeparator jSeparator6;
      private javax.swing.JSeparator jSeparator7;
      private javax.swing.JSeparator jSeparator8;
      private javax.swing.JSeparator jSeparator9;
      private javax.swing.JComboBox kmc;
      private javax.swing.JList menu;
      private javax.swing.JLabel minimize;
      private javax.swing.JButton next;
      private javax.swing.JButton next1;
      private javax.swing.JLabel notesdetail;
      private javax.swing.JButton prev;
      private javax.swing.JButton prev1;
      private javax.swing.JSeparator sa;
      private javax.swing.JSeparator se;
      private javax.swing.JTextField setTime;
      private javax.swing.JSeparator sh;
      private javax.swing.JLabel sn1;
      private javax.swing.JLabel sn2;
      private javax.swing.JLabel sn3;
      private javax.swing.JLabel sn4;
      private javax.swing.JLabel sn5;
      private javax.swing.JLabel sn6;
      private javax.swing.JLabel sn7;
      private javax.swing.JLabel sn8;
      private javax.swing.JLabel ss1;
      private javax.swing.JLabel ss2;
      private javax.swing.JLabel ss3;
      private javax.swing.JLabel ss4;
      private javax.swing.JLabel ss5;
      private javax.swing.JLabel ss6;
      private javax.swing.JSeparator st;
      private javax.swing.JLabel time;
      private javax.swing.JLabel ttcdetails;
      private javax.swing.JLabel tttdetails;
      private javax.swing.JLabel type;
      private javax.swing.JComboBox wmc;
      // End of variables declaration//GEN-END:variables
}
