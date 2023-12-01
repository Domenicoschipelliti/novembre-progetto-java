package multimedia;

import java.util.Scanner;
//Player Classe Padre (molto comoda u.u);

public class Video extends Player {


    Scanner luce=new Scanner(System.in);

    public int luminosita=5;//<-- usata per dare un default alla luminosità;


    public int video(){
        System.out.println("il volume è regolato a " + audio + "\n");

        System.out.println("vuoi regolare la luminosità? 1 aumenta 2 diminuisci e"+"premi invio per continuare" );
        luce.nextLine();
        //^^scanner utilizzato per fare più spazio anche se in altri ho usato anche il nextLine \n;

        //Video è il figo di turno collega il tutto;

         aumentaLuminosita(4);

         diminusiciLuminosita(2);



        return luminosita;





    }
    public int aumentaLuminosita(int aumento){
        this.luminosita=aumento;
        //Aumenta e Abbassa luminosità si basano sullo stesso fenomeno del volume;

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
