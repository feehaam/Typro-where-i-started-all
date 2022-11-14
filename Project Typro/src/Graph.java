import java.awt.*;
import java.util.Arrays;
import javax.swing.*;
public class Graph {
      static JFrame frame = new JFrame();
      public static void main(String args[]){
            frame.setSize(1200,700);
            frame.setTitle("Stats graph (KMP-KeypressPerMinute) vs Time(Date)");
            frame.setBackground(Color.decode("#FFFFCC"));
            frame.setVisible(true);
            frame.add(new Lines());
      }
}
class Lines extends JComponent{
      boolean draw = true;
      String users[]=new String[1000];
      int up=0;
      int per[]= new int[1000];
      int time[]=new int[10000];
      String dates[]=new String[1000];
      public void paintComponent(Graphics g){
            g.setColor(Color.darkGray);
            g.fillRect(0, 0, 4000, 4000);
            g.setColor(Color.red);
            for(int i=0; i<2; i++){
                  g.drawLine(50+i, 550, 50+i, 480);
                  g.drawLine(30+i, 505, 50+i, 480);
                  g.drawLine(70+i, 505, 50+i, 480);
                  
                  g.drawLine(195, 632+i, 295, 632+i);
                  g.drawLine(265, 612+i, 295, 632+i);
                  g.drawLine(265, 652+i, 295, 632+i);
            }
            for(int i=0; i<500; i+=50){
                  g.setColor(Color.red);
                  g.drawLine(70, i, 100, i);
                  g.drawLine(70, i+1, 100, i+1);
                  g.setColor(Color.white);
                  g.drawString(String.valueOf((600-i)/2), 30, i+10);
            }
            g.setColor(Color.red);
            g.setFont(new Font("Arial", Font.BOLD, 30));
            g.drawString("KPM", 20, 580);
            g.drawString("Time", 120, 640);
            g.setColor(Color.black);
            g.fillRect(100, 0, 1100, 600);
            g.setColor(Color.white);
            g.drawLine(100,600,1200,600);
            g.drawLine(100, 0, 100, 600);
            String s = Fileop.Read(Stats.loc+"Stats\\List.txt");
            for(int i=0; i<s.length(); i++)
                  if(s.charAt(i)=='@')
                        for(int j=i+1; j<s.length(); j++)
                              if(s.charAt(j)==';'){
                                    users[up]=s.substring(i+1,j);
                                    up++;
                                    i=j;
                                    break;
                              }
            for(int x=0; x>-1; x++){
                  int pt=0, dt=0;
                  if(users[x]==null)
                        break;
                  s=Fileop.Read(Stats.loc+"Stats\\"+users[x]+".txt");
                        Arrays.fill(per, 0);
                  for(int i=0; i<s.length(); i++){
                        int kpm=0;
                        String date="";
                        //Not letting genarate error if an user has less than two performance records.
                        int n=0;
                        for(int m=0; m<s.length(); m++)
                              if(s.charAt(m)=='@')
                                    n++;
                        if(n<2)
                              break;
                        if(s.charAt(i)=='@')
                              for(int j=i+1; j<s.length(); j++)
                                    if(s.charAt(j)=='#'){
                                          Double X = Double.parseDouble(s.substring(i+1, j));
                                          kpm=X.intValue();
                                          i=j;
                                          break;
                                    }
                              
                        if(s.charAt(i)=='#')
                              for(int j=i+1; j<s.length(); j++)
                                    if(s.charAt(j)==';'){
                                          date=s.substring(i+1, j);
                                          i=j;
                                          break;
                                    }
                        if(s.charAt(i)==';'){
                              per[pt]=kpm;
                              pt++;
                              dates[dt]=date;
                              dt++;
                        }
                        
                  
                        
                  }      
                  for(int p=0; p<per.length; p++){
                        if(per[p]==0)
                              break;
                        int div=1000/(pt-1);
                        time[0]=0;
                        for(int i=1; i<time.length; i++){
                              time[i]=time[i-1]+div;
                        }
                        for(int i=1; i<per.length; i++){
                              if(per[i-1]==0) break;
                              if(i==1){
                                    g.setFont(new Font("Arial", Font.BOLD, 14));
                                    g.setColor(Color.lightGray);
                                    g.fillRect(time[i-1]+100, 600-per[i-1]*2-25,100,15);
                                    g.setColor(Color.black);
                                    g.drawString(users[x], time[i-1]+100+5, 600-per[i-1]*2-13);
                                    g.setColor(Color.white);
                              }
                              if(per[i]!=0)
                              g.drawLine(time[i-1]+100, 600-per[i-1]*2,time[i]+100,600-per[i]*2);
                              
                              g.fillOval(time[i-1]+95, 600-per[i-1]*2-5, 10,10);
                              
                              g.setFont(new Font("Arial", Font.BOLD, 14));
                              g.setColor(Color.red);
                              g.drawString(String.valueOf(per[i-1]), time[i-1]+110, 600-per[i-1]*2+7);
                              g.setColor(Color.white);
                              g.drawString(dates[i-1], time[i-1]+110, 600-per[i-1]*2+20);
                        }
                  }
                  }
            
      }
}