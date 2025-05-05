public class Passaro implements Ave {
  @Override
  public void comer() {
      System.out.println("Pássaro está comendo sementes.");
  }

  @Override
  public void voar() {
      System.out.println("Pássaro está voando.");
  }

  @Override
  public void cantar() {
      System.out.println("Pássaro está cantando.");
  }
}
