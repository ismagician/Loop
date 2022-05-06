public class TypeofBeat {

    public static void main(String[] args) {
        int bpm = 75;

        Piano hithat = new Piano("./sound/piano.wav");
        Drums drums = new Drums("./sound/drums.wav");
        Vocals vocals = new Vocals("./sound/vocals2.wav");

        hithat.start();
        drums.start();
        vocals.start();


    }
}
