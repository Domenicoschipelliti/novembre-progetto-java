package multimedia;

public class RegistrazioneAudio extends Player{


    String titolo;

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
