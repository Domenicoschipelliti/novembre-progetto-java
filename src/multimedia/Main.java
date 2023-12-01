package multimedia;

public class Main {
    public static void main(String[] args) {
       Player pl=new Player();
       RegistrazioneAudio re=new RegistrazioneAudio();
       Video video=new Video();
       pl.play(4);

       re.ripetere("tito");

       video.video();


    }
}