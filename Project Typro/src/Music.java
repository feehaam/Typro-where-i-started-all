import java.io.*;
import sun.audio.*;

public class Music {
      public static String keypressPath="";
      public static String correctPath="";
      public static String wrongPath="";
      public static String donePath="";
      public static String Filepath="";
      
      public static void play(String fp){
            Filepath=fp;
            new MusicPlay();
      }
      
      public static void keypress(){      play("src\\Musics\\"+Fileop.Read("src\\Settings\\KMusic")+".wav");     }
      
      public static void correct(){      play("src\\Musics\\"+Fileop.Read("src\\Settings\\CMusic")+".wav");     }
      
      public static void wrong(){      play("src\\Musics\\"+Fileop.Read("src\\Settings\\WMusic")+".wav");     }
      
      public static void done(){      play("src\\Musics\\"+Fileop.Read("src\\Settings\\DMusic")+".wav");     }
}
class MusicPlay extends Music implements Runnable{
            Thread t;
            MusicPlay(){
            t=new Thread(this,"Music Play");
            t.start();
      }
      @Override
      public void run() {
            InputStream music;
            try{
                  music = new FileInputStream(new File(Filepath));
                  AudioStream audios= new AudioStream(music);
                  AudioPlayer.player.start(audios);
            } catch(Exception e){ System.out.println("Error occured while playing music!"); } 
      }
}