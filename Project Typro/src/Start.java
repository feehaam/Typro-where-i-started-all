public class Start {
      
      static int x=0;
      static int y=0;
      static Main m =new Main();
      static Main2 m2= new Main2();
      static boolean homeclicked=false;
      static boolean typeclicked=false;
      static boolean timeclicked=false;
      static boolean editclicked=false;
      
      
      public static void main(String args[]){
            m.setVisible(true);
      }
      
      public static void Main(){
            m.setLocation(x,y);
            m.setVisible(true);
      }
      public static void Main2(){
            m2.setLocation(x,y);
            m2.setVisible(true);
      }
      
      public static void menuClicked(String s){
            Start.homeclicked=false;
            Start.editclicked=false;
            Start.timeclicked=false;
            Start.typeclicked=false;
            
            if(s.equals("home"))
                  Start.homeclicked=true;
            if(s.equals("type"))
                  Start.typeclicked=true;
            if(s.equals("time"))
                  Start.timeclicked=true;
            if(s.equals("edit"))
                  Start.editclicked=true;
      }
      static String og, html, code;
      public static String toHtml(String loc){
            String s = Fileop.Read(loc);
            s="<html>"+s;
            s=s+"<html>";
            s=s.replace("\n", "<br/>");
            html=s;
            return s;
      }      
}
class Settings extends Start{
      static String keypresspath="F:\\Typro\\keypressc.wav";
}