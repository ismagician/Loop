import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Piano extends Thread{
    String sample;



    Piano(String sample){

        this.sample= sample;

    }

    public void run(){
        try {
            File song =  new File(sample);

            while(true){

                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(song));
                clip.start();
                Thread.sleep(clip.getMicrosecondLength()/1000);

            }

                //time[0] = clip.getMicrosecondLength()/1000;
                //System.out.println(time[0]);

                //Thread.sleep(clip.getMicrosecondLength()/1000);

        } catch (Exception e){

        }


    }

}
