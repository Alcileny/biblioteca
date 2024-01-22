import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    
        Categoria livroDidatico = new Categoria("Livro Didático", "Livro voltado para o ensino acadêmico");
        Categoria romance = new Categoria("Romance", "Histórias de amor e relacionamentos");
        Categoria ficcao = new Categoria("Ficção", "Narrativas imaginárias e fantasiosas");

        System.out.println("Livros Disponíveis");
        Livro livro1 = new Livro("Matemática Avançada", "Paulo", LocalDate.of(2022, 1, 20), livroDidatico);
        Livro livro2 = new Livro("É asim que acaba", "Colleen Hoover", LocalDate.of(2016, 2, 29), romance);
        Livro livro3 = new Livro("1984", "George Orwell", LocalDate.of(1949, 6, 8), ficcao);

    
        livro1.exibirlivro();
        System.out.println();
        livro2.exibirlivro();
        System.out.println();
        livro3.exibirlivro();
    }
}
