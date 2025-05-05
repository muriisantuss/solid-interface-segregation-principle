import aves.Passaro;
import aves.Pinguim;

public class Main {
    public static void main(String[] args) throws Exception {
        // === Ações do Pinguim ===
        Pinguim pinguim = new Pinguim();
        System.out.println("🐧 Ações do Pinguim:");
        pinguim.comer();

        System.out.println();

        // === Ações do Pássaro ===
        Passaro passaro = new Passaro();
        System.out.println("🐦 Ações do Pássaro:");
        passaro.comer();
        passaro.voar();
        passaro.cantar();
    }
}
