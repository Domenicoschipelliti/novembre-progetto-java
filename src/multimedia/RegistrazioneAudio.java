package multimedia;
//Ovvio eredità da Player xD

public class RegistrazioneAudio extends Player{


    String titolo;
       //Registrazionr audio che stampa il titolo meno utile ma fa il suo dovere;

       public String ripetere(String ri){
           this.titolo=ri;

           if (titolo.length()<=durata){
                  System.out.println("! "+ ri);
           }else {
               System.out.println(ri);
           }

           return ri;
       }

}
