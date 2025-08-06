package tonyteste;

public class Loja {
  public void comprar() {
    System.out.println("Automatica - Comprando produtos na loja");
  }

  public void verificarEstoque() {
    Vendedor vendedor = new Vendedor();
    vendedor.verificarEstoque();
  }
}
