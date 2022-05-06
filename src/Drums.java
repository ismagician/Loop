import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Drums extends Thread{
    String sample;


    Drums(String sample){

        this.sample= sample;

    }

    public void run(){
        try {
            File song =  new File(sample);

            while(true){

                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(song));
                Thread.sleep(clip.getMicrosecondLength()/1000*1);
                clip.start();
                clip.loop(2);
                //time[0] = clip.getMicrosecondLength()/1000;
                //System.out.println(time[0]);
                Thread.sleep(clip.getMicrosecondLength()/1000*2);
                clip.stop();
            }
        } catch (Exception e){

        }


    }
}
