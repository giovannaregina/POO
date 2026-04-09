package ads.poo;

import java.util.HashMap;

public class App {
private HashMap<String, Livro> livros = new HashMap<>();

    public App(){
        livros.put("978-85-333-0227-3", new Livro("Jogos Vorazes", "Suzanne Collins", "978-85-333-0227-3", 2008));
        livros.put("868-45-133-0334-8", new Livro("Jujutsu Kaisen 0", "Gege Akutami", "868-45-133-0334-8", 2018));
        livros.put("458-09-334-1226-5", new Livro("A Metamorfose", "Franz Kafka", "458-09-334-1226-5", 1915));
        livros.put("210-35-883-0977-2", new Livro("Relatos de um Gato Viajante", "Hiro Arikawa", "210-35-883-0977-2", 2017));
    }

    void cadastrar(){
        var titulo = IO.readln("Insira o título do livro: ");
        var autor = IO.readln("Insira o autor: ");
        var isbn = IO.readln("Insira o ISBN: ");
        int ano = Integer.parseInt(IO.readln("Insira o ano de lançamento: "));

        livros.put(isbn, new Livro(titulo, autor, isbn, ano));
    }

    void listarLivros(){
        livros.forEach((isbn, Livro) -> {
            IO.println("ISBN: " + Livro.getISBN());
            IO.println("Título: " + Livro.getTitulo());
            IO.println("Autor: " + Livro.getAutor());
            IO.println("Ano de publicação: " + Livro.getAno());
        });
    }

    void menu(int opcao){

    }


    static void main(String[] args) {





    //Sistema para gestão de acervo de uma livraria
    // 1 - Cadastrar livro
    // 2 - Listar todos os livros
    // 3 - Listar todos os livros publicados em um ano específico
    // 4 - Alterar dados de um livro
    // 5 - Sair





    }
}
