package multimedia;

import java.util.Scanner;

public class Player {



    public int audio=50;
    public int durata;


    public int play(int durata){

         this.durata=durata;

         Scanner pla=new Scanner(System.in);

         System.out.println("premi play per sentire");
         System.out.println( "l'audio dura un  "+ durata + "  secondo/i" );
         pla.nextLine();

         System.out.println("inizio video/audio");

         alzaVolume(39);

         abbassaVolume(25);


         System.out.println("fine audio/video");

        return durata;


    }


    public int alzaVolume(int aumento){
        this.audio=aumento;
        if (audio!=50){
            ++aumento;
           System.out.println( "Il tuo volume è stato alzato a  "+ aumento);
        }else {
           System.out.println("il volume è 50 di default");
        }
        return aumento;
    }

    public int abbassaVolume(int diminuire){
        this.audio=diminuire;
        if (audio!=50){
            --diminuire;
            System.out.println("Il tuo volume è stato abbassato a  "+ diminuire);
        }else {
            System.out.println("il volume è 50 di default");
        }
        return diminuire;
    }
}
