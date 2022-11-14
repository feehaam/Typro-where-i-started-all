
import java.io.*;
import java.nio.file.*;

public class Fileop
{
      public static String Read(String fileName) {
            try { return new  String(Files.readAllBytes(Paths.get(fileName)));} 
            catch (IOException e) { e.printStackTrace(); return null;}
      }
      
      public static int Create(){
            try { 
                  File file = new File("F:\\Filer\\go.txt");
                  boolean fvar = file.createNewFile();
                  if (fvar) return 1;
                  else return 0;  } 
            catch (IOException e) { return 0; }
      }
      public static int Create(String dir){
            try { 
                  File file = new File(dir);
                  boolean fvar = file.createNewFile();
                  if (fvar) return 1;
                  else return 0;  } 
            catch (IOException e) { return 0; }
      }
      public static int Write(String dir, String data) {
            try {
                  Files.write(Paths.get(dir), data.getBytes()); return 1;} 
            catch (IOException e) {return 0;}
      }
public static int Add(String dir, String data) {
            try {
                  Files.write(Paths.get(dir), data.getBytes(), StandardOpenOption.APPEND); return 1;}
            catch (IOException e) {return 0;}
}

}
