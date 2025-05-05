package aves;
import interfaces.Cantor;
import interfaces.Comedor;
import interfaces.Voador;

public class Passaro implements Comedor, Voador, Cantor {
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
