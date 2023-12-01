package multimedia;

//PROGETTO:PLAYER MULTIMEDIALE;

public class Main {
    public static void main(String[] args) {

        /*Tutte queste chiamate sono tutte le
        classi utilizzate per il bene del progetto si lo
        so potrà essere brutto ma a me piace e ci lavorerò in questi giorni;*/


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