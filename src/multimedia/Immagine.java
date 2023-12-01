package multimedia;
//Immagine che eredità Video per la luminosità;

public class Immagine extends Video {

    public int show(){
        System.out.println("//____..//..//..//..____//<--Immagine \n");

        aumentaLuminosita(4);

        System.out.println("*****");

        diminusiciLuminosita(2);

        System.out.println("*");

        System.out.println("fine audio/video");

        return luminosita;
    }

}
