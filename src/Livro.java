import java.time.LocalDate;

public class Livro {
    private String Nome;
    private String Autor;
    private LocalDate publicacao; 
    private Categoria categoria;

    public Livro(String nome, String autor, LocalDate publicacao, Categoria categoria) {
        this.Nome = nome;
        this.Autor = autor;
        this.publicacao = publicacao;
        this.categoria = categoria;
    }


public void exibirlivro () {
    System.out.println(" Nome:" + Nome);
    System.out.println("Autor:" + Autor);
    System.out.println("Data de publicacao:" + publicacao);
    System.out.println("Categoria:" + categoria);
    System.out.println("Categoria: " + categoria.getNome());
    System.out.println("Descrição da Categoria: " + categoria.getDescricao());
}


public String getNome() {
    return Nome;
}


public void setNome(String nome) {
    this.Nome = nome;
}


public String getAutor() {
    return Autor;
}


public void setAutor(String autor) {
    this.Autor = autor;
}


public LocalDate getPublicacao() {
    return publicacao;
}


public void setPublicacao(LocalDate publicacao) {
    this.publicacao = publicacao;
}


public Categoria getCategoria() {
    return categoria;
}


public void setCategoria(Categoria categoria) {
    this.categoria = categoria;
}
}