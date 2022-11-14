public class Word {
      static int cp=1;
      static String MainText;
      public static String getNthWord(int n){
            n--;
            return Words.sample[n];
      }
      public static void setMainText(String s){
            s=s.replace("\t"," ");
            int ashfdkf=10;
            while(ashfdkf-->0)
            s=s.replace("  "," ");
            MainText=s;
      }
      public static String getFinalWord(String s){
            int finpos=0;
            int begpos=-1;
            if(s.length()==0)
                  return "";
            for(int i=s.length()-1; i>0; i--){
                  if(s.charAt(i)!=' '&&s.charAt(i)!='\n'&&s.charAt(i)!='\t'&&s.charAt(i)!=0){
                        finpos=i;
                        break;
                  }
            }
            for(int i=finpos; i>=0; i--){
                  if(s.charAt(i)==' '||s.charAt(i)=='\n'||s.charAt(i)=='\t'||s.charAt(i)==0){
                        begpos=i;
                        break;
                  }
            }
                  return s.substring(begpos+1, finpos+1);
      }
      
      public static String colWord(String s, int p){
            int n=0;
            for(int i=0; i<s.length(); i++){
                  if(s.charAt(i)=='\n'||s.charAt(i)==' '||i==s.length()-1){
                        n++; 
                        if(n==p)
                        for(int j=i-1; j>=0; j--){
                              if(s.charAt(j)=='\n'||s.charAt(j)==' '||j==0){
                                    if(j==0)
                                          System.out.println(s.substring(j,i));
                                    else
                                          System.out.println(s.substring(j+1,i));
                                    break;
                              }
                        }
                  }
            }
            return null;
      }
}
