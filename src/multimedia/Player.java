package multimedia;

public class Player {

    public int audio=50;
    public int durata;


    public int play(int audio,int durata){
        this.audio=audio;
        this.durata=durata;
        return audio;
    }


    public int alzaVolume(int audio){
        this.audio=audio;
        if (audio!=50){
            ++audio;
           System.out.println(audio);
        }else {
           System.out.println("il volume è 50 di default");
        }
        return audio;
    }

    public int abbassaVolume(int audio){
        this.audio=audio;
        if (audio!=50){
            --audio;
            System.out.println(audio);
        }else {
            System.out.println("il volume è 50 di default");
        }
        return audio;
    }
}
