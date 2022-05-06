public class TypeofBeat {

    public static void main(String[] args) {
        int bpm = 75;


        //System.out.println(String.format("%.5f", time));
        //System.out.println(String.format("%.5f", time1));

        Piano hithat = new Piano("./sound/piano.wav");
        Drums drums = new Drums("./sound/drums.wav");
        Vocals vocals = new Vocals("./sound/vocals2.wav");
        //Kick kick = new Kick("./sound/kick.wav", (long)time1);

        hithat.start();
        drums.start();
        vocals.start();


    }
}
