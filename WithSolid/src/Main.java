import aves.Passaro;
import aves.Pinguim;

public class Main {
    public static void main(String[] args) throws Exception {
        Pinguim pinguim = new Pinguim();
        System.out.println();
        pinguim.comer();

        Passaro passaro = new Passaro();
        System.out.println();
        passaro.comer();
        passaro.voar();
        passaro.cantar();
    }
}
