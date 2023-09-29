package main.java.list.Pesquisa;

public class Livro {
  private String titulo;

  private String autor;

  private int anoPublicação;

  public Livro (String titulo, String autor, int anoPublicação) {
    this.titulo = titulo;
    this.autor = autor;
    this.anoPublicação = anoPublicação;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getAutor() {
    return autor;
  }

  public int getAnoPublicação() {
    return anoPublicação;
  }

  public String toString() {
    return "Livro{" +
        "titulo='" + titulo + '\'' +
        ", autor='" + autor + '\'' +
        ", anoPublicacao=" + anoPublicação +
        '}';
  }
}
