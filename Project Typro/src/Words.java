
import java.util.Arrays;

public class Words {
      static boolean done=false;
      static String line[];
      static String list[];
      static String sample[];
      static int listptr=0;
      static int lineptr=0;
      static int sampleptr=0;
      static void emptyArrays(){
            line=new String[10000];
            list=new String[100000];
            sample=new String[100000];
            
            listptr=0;
            lineptr=0;
            sampleptr=0;
            done = false;
            
            Stats.CorrectWordTyped=0;
            Stats.CorrectLatterTyped=0;
      }
      static void set(String s){
            if(done) return;
            s=s.replace("\t"," ");
            int ashfdkf=10;
            while(ashfdkf-->0)
            s=s.replace("  "," ");
            String arr[]=new String [10000];
            int pos=0;
            for(int i=0; i<s.length(); i++){
                  if(s.charAt(i)=='\n'){
                        push(s.substring(pos,i));
                        pos=i+1;
                  }
                  else if(i==s.length()-1){
                        push(s.substring(pos,i+1));
                        pos=i+1;
                  }
            }
            for(int j=0; j<lineptr; j++){
            int p=0;
            s=line[j];
            for(int i=0; i<s.length(); i++){
                  if(j==lineptr-1&&i==s.length()-1){
                        add(s.substring(p,i+1));
                        done=true;
                        break;
                  }
                  if(s.charAt(i)==' '||i==s.length()-1){
                  add(s.substring(p,i));
                  p=i+1;
            }
            }
      }
      for(int i=0; i<listptr; i++)
            if(list[i].length()>=1){
                  sample[sampleptr]=list[i];
                  if(i!=listptr-1)
                  sampleptr++;
            }
}
      static void push(String s){
            if(s.startsWith(" "))
                  s=s.substring(1,s.length());
            if(s.endsWith(" "))
                  s=s.substring(0,s.length()-1);
            line[lineptr]=s;
            lineptr++;
      }
      static void add(String s){
            list[listptr]=s;
            listptr++;
      }
}