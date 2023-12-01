package multimedia;

public class Main {
    public static void main(String[] args) {
        Player pl=new Player();
        RegistrazioneAudio re=new RegistrazioneAudio();
        Video video=new Video();
        Immagine img=new Immagine();



        pl.play(4);

        re.ripetere("titolo: perennemente stanco \n");

        video.video();

        img.show();


    }
}