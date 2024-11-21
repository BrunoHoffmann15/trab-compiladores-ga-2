public class Simbolo {
  private String nome;
  private String tipo;
  private String contexto;

  public Simbolo(String nome, String tipo, String contexto) {
    this.nome = nome;
    this.tipo = tipo;
    this.contexto = contexto;
  }

  @Override
  public String toString() {
    return "Nome: " + nome + ", Tipo: " + tipo + ", Contexto: " + contexto;
  }
}
