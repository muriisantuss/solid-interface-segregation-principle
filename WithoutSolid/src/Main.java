public class Main {
    public static void main(String[] args) {
        System.out.println("🐧 Ações do Pinguim:");
        Pinguim pinguim = new Pinguim();
        pinguim.comer();
        pinguim.voar();   // Comportamento forçado
        pinguim.cantar(); // Comportamento forçado

        System.out.println();

        System.out.println("🐦 Ações do Pássaro:");
        Passaro passaro = new Passaro();
        passaro.comer();
        passaro.voar();
        passaro.cantar();
    }
}
