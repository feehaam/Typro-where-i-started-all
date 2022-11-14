import java.time.*;
import java.time.format.*;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Stats{
      static int dataNO=0;
      static final String loc="F://Typro//";
      static String name="";
      static int time=0;
      static int CorrectWordTyped=1;
      static int CorrectLatterTyped=1;
      static int WrongWordTyped=1;
      static int WrongLatterTyped=1;
      static double aqu=0;
      static Double wpm=0.0;
      static Double kpm=0.0;
      static String date="";
      static Double performance=0.0;
      static void CorrectWord(String word){
            CorrectLatterTyped+=word.length();
            CorrectWordTyped++;
      }
      static void WrongWord(String word){
            WrongLatterTyped+=word.length();
            WrongWordTyped++;
      }
      static void getName(){
            try{
                  if(Fileop.Read("src\\Settings\\LastUsedName").length()>4)
                  name=JOptionPane.showInputDialog("Enter your name", Fileop.Read("src\\Settings\\LastUsedName"));
            else
                  name=JOptionPane.showInputDialog("Enter your name");
            } catch (Exception e){
                  getName();
            }
            if(name==null||name.length()<=1||name.contains("*")){
                  getName();
            }
      }
      static void dis(){
            getName();
            Fileop.Write("src\\Settings\\LastUsedName", name);
            wpm=CorrectWordTyped/((time*1.00)/60);
            kpm=CorrectLatterTyped/(time*1.00)*60;
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yy"); LocalDateTime now = LocalDateTime.now();
            date=(dtf.format(now)).toString();
            aqu=(CorrectLatterTyped*100)/(WrongLatterTyped+CorrectLatterTyped);
            performance = (aqu*kpm)/200;
            
            new File(Stats.loc+"Stats").mkdir();
            Fileop.Create(Stats.loc+"Stats\\"+name+".txt");
            Fileop.Create(Stats.loc+"Stats\\List.txt");
            if(Fileop.Read(Stats.loc+"Stats\\List.txt").contains(name)) {}
            else Fileop.Add(Stats.loc+"Stats\\List.txt", "@"+name+";  ");
            if(kpm==0)
                  kpm=1.0;
            Fileop.Add(Stats.loc+"Stats\\"+name+".txt", "@"+kpm+"#"+date+";   \n");
            
            Fileop.Create(Stats.loc+"Stats\\History.txt");
            Fileop.Add(Stats.loc+"Stats\\History.txt", "*\n#"+name+";\n");
            Fileop.Add(Stats.loc+"Stats\\History.txt", "#"+date+";\n");
            Fileop.Add(Stats.loc+"Stats\\History.txt", "#"+time+";\n");
            Fileop.Add(Stats.loc+"Stats\\History.txt", "#"+CorrectWordTyped+";\n");
            Fileop.Add(Stats.loc+"Stats\\History.txt", "#"+CorrectLatterTyped+";\n");
            Fileop.Add(Stats.loc+"Stats\\History.txt", "#"+WrongWordTyped+";\n");
            Fileop.Add(Stats.loc+"Stats\\History.txt", "#"+WrongLatterTyped+";\n");
            Fileop.Add(Stats.loc+"Stats\\History.txt", "#"+aqu+";\n");
            Fileop.Add(Stats.loc+"Stats\\History.txt", "#"+String.format("%.2f", wpm)+";\n");
            Fileop.Add(Stats.loc+"Stats\\History.txt", "#"+String.format("%.2f", kpm)+";\n");
            Fileop.Add(Stats.loc+"Stats\\History.txt", "#"+String.format("%.2f", performance)+";\n");
            String x = Fileop.Read(Stats.loc+"Stats\\History.txt");
            int num=0;
            for(int i=0; i<x.length(); i++){
                  if(x.charAt(i)=='*')
                        num++;
            }
            show(num);
      }
      //Read saved n-th performance details
      static void show(int index){
            dataNO=0;
            String s = Fileop.Read(Stats.loc+"Stats\\History.txt");
            for(int m=0; m<s.length(); m++){
                  if(s.charAt(m)=='*')
                        index--;
                  if(index==0){
                        m+=2;
                        for(int n=m; n<s.length(); n++){
                              if(s.charAt(n)=='*'||n==s.length()-1){
                                    show2(s.substring(m, n));
                                    m=s.length()+1;
                                    n=s.length()+1;
                              }      }
                        break;
                  }      }     }
      
      //Extrack from details
      static void show2(String s){
            for(int i=0; i<s.length(); i++){
                  if(s.charAt(i)=='#'){
                        for(int j=0; j<s.length(); j++){
                              if(s.charAt(j)==';'){
                                    dataNO++;
                                    show3(s.substring(i+1,j));
                                    i=j+2;
                              }  }   }  }  }
              
      static String tdname, tddate, tdtime, tdcwt, tdclt, tdwwt, tdwlt, tdaqu, tdwpm, tdkpm, tdper;
      static void show3(String s){
            switch(dataNO){
                  case 1: tdname=s; break;
                  case 2: tddate=s; break;
                  case 3: tdtime=s; break;
                  case 4: tdcwt=s; break;
                  case 5: tdclt=s; break;
                  case 6: tdwwt=s; break;
                  case 7: tdwlt=s; break;
                  case 8: tdaqu=s; break;
                  case 9: tdwpm=s; break;
                  case 10: tdkpm=s; break;
                  case 11: tdper=s; 
                        new TypingDet(tdname, tddate, tdtime, tdcwt, tdclt, tdwwt, tdwlt, tdaqu, tdwpm, tdkpm, tdper).setVisible(true);
            }
      }
}