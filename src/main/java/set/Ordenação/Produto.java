package main.java.set.Ordenação;

import java.util.Comparator;

public class Produto implements Comparable<Produto> {
  
  private long código;

  private String nome;

  private double preço;

  private int quantidade;

  public Produto(long código, String nome, double preço, int quantidade){
    this.código = código;
    this.nome = nome;
    this.preço = preço;
    this.quantidade = quantidade;
  }

  @Override
  public int compareTo(Produto p) {
    // TODO Auto-generated method stub
    return nome.compareToIgnoreCase(p.getNome());
  }
  
  public long getCódigo() {
    return código;
  }

  public String getNome() {
    return nome;
  }

  public double getPreço() {
    return preço;
  }

  public int getQauntidade() {
    return quantidade;
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Produto produto)) return false;
    return getCódigo() == produto.getCódigo();
  }

  public String toString() {
    return "Produto{" +
        "codigo=" + código +
        ", nome='" + nome + '\'' +
        ", preco=" + preço +
        ", quantidade=" + quantidade +
        '}';
  }
}

class ComparaToPorPreço implements Comparator<Produto> {

  @Override
  public int compare(Produto p1, Produto p2) {
    // TODO Auto-generated method stub
    return Double.compare(p1.getPreço(), p2.getPreço());
  }
} 
