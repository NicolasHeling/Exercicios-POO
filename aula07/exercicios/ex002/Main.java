public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Aventuras em Java", "Autor Desconhecido");
        livro.adicionarPagina("Era uma vez uma aventura em Java...");
        livro.adicionarPagina("A aventura continuou em um novo capítulo.");

        System.out.println(livro.toString());
    }
}