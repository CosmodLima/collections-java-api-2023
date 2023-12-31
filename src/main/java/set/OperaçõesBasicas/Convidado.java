package main.java.set.OperaçõesBasicas;

public class Convidado {
  
  private String nome;

  private int codigoConvite;

  public Convidado(String nome, int codigoConvite) {
    this.nome = nome;
    this.codigoConvite = codigoConvite;
  }

  public String getNome() {
    return nome;
  }

  public  int getCodigoConvite() {
    return codigoConvite;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Convidado convidado)) return false;
    return getCodigoConvite() == convidado.getCodigoConvite();
  }

  public String toString() {
    return "Convidado{" +
    "nome'" + nome + '\'' +
    ",codigoConvite=" + codigoConvite +
    '}';
  }
}
