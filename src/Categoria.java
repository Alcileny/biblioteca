public class Categoria {
    private String Nome;
    private String descricao;

public Categoria (String nome, String descricao){
    this.Nome = nome;
    this.descricao = descricao;
}

public String getNome() {
    return Nome;
}

public void setNome(String nome) {
    this.Nome = nome;
}

public String getDescricao() {
    return descricao;
}

public void setDescricao(String descricao) {
    this.descricao = descricao;
}
}
