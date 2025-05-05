package aves;
import interfaces.Comedor;

public class Pinguim implements Comedor {
  @Override
  public void comer() {
      System.out.println("Pinguim está comendo peixes.");
  }
}