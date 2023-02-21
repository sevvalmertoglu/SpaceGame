import java.io.File;
import java.io.IOException;
import java.awt.HeadlessException;
import java.util.Scanner;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class OyunEkrani extends JFrame {

    public OyunEkrani(String title) throws HeadlessException {
        super(title);
    }
    
    /*public static class PlayMusic {
     // to store current position
    Long currentFrame;
    Clip clip;
      
    // current status of clip
    String status;
      
    AudioInputStream audioInputStream;
    static String filePath;
  
    // constructor to initialize streams and clip
    public PlayMusic()
        throws UnsupportedAudioFileException,
        IOException, LineUnavailableException 
    {
        // create AudioInputStream object
        audioInputStream = 
                AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());
          
        // create clip reference
        clip = AudioSystem.getClip();
          
        // open audioInputStream to the clip
        clip.open(audioInputStream);
          
        clip.loop(Clip.LOOP_CONTINUOUSLY);

        
        }
        public void play(){
            clip.start();
            status = "play";
}
 
}*/
        
    public static void main(String[] args){
        
        /* try
        {
             String filePath = "music.wav";
            PlayMusic audioPlayer = new PlayMusic();
              
            audioPlayer.play();
            Scanner sc = new Scanner(System.in);
        }
          catch (Exception ex) 
        {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
          
          }*/
        
    StartPage baslangic = new StartPage();
    baslangic.StartPage();
    
  
    
    
    
    
    }

  
}
