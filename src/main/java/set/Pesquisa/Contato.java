package main.java.set.Pesquisa;

import java.util.Objects;

public class Contato {
  
  private String nome;

  private int número;

  public Contato (String nome, int número) {
    this.nome = nome;
    this.número = número;
  }

  public String getNome() {
    return nome;
  }

  public int getNúmero() {
    return número;
  }

  public void setNúmero(int número) {
    this.número = número;
  }

   public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Contato contato)) return false;
    return Objects.equals(getNome(), contato.getNome());
  }

  public String toString() {
    return "Contato{" +
    "nome'" + nome + '\'' +
    ", número=" + número +
    '}';
  }
}
