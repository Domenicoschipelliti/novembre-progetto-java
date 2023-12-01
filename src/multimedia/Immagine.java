package multimedia;

public class Immagine extends Video {

    public int show(){
        System.out.println("//____..//..//..//..____//<--Immagine \n");
        aumentaLuminosita(4);
        System.out.println("*****");
        diminusiciLuminosita(2);
        System.out.println("*");
        System.out.println("\n fine audio/video");
        return luminosita;
    }

}
