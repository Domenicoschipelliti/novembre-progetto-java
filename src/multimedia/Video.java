package multimedia;

import java.util.Scanner;

public class Video extends Player {


    Scanner luce=new Scanner(System.in);

    public int luminosita=5;


    public int video(){
        System.out.println("il volume è regolato a " + audio + "\n");
        System.out.println("vuoi regolare la luminosità? 1 aumenta 2 diminuisci "+ luminosita +"premi invio per continuare" );
        luce.nextLine();

         aumentaLuminosita(4);
         diminusiciLuminosita(2);



        return luminosita;





    }
    public int aumentaLuminosita(int aumento){
        this.luminosita=aumento;
        if (luminosita!=5){
            ++aumento;
            System.out.println( "la luminosità è stata aumentata a "+ aumento + "\n");
        }else {
            System.out.println("la luminosità è 5 di default");
        }
        return aumento;
    }

    public int diminusiciLuminosita(int diminuire){
        this.luminosita=diminuire;
        if (luminosita!=5){
            --diminuire;
            System.out.println("la luminosità è stata abbassata a  "+ diminuire + "\n");
        }else {
            System.out.println("il volume è 50 di default");
        }
        return diminuire;
    }

}
