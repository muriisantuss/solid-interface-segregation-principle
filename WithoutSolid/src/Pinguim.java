public class Pinguim implements Ave {
  @Override
  public void comer() {
      System.out.println("Pinguim está comendo peixes.");
  }

  @Override
  public void voar() {
      // Pinguins não voam!
      System.out.println("Pinguim não voa.");
  }

  @Override
  public void cantar() {
      // Pinguins não cantam!
      System.out.println("Pinguim não canta.");
  }
}
