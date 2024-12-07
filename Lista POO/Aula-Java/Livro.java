import java.util.Scanner;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int paginaAtual;
    private String[] paginas;


    public Livro(String titulo, String autor, String[] paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.numeroDePaginas = paginas.length;
        this.paginaAtual = 0;
    }


    public void abrir() {
        if (paginaAtual == 0) {
            paginaAtual = 1;
            System.out.println("O livro foi aberto na página 1.");
            System.out.println("Título: " + titulo);
            System.out.println("Autor: " + autor);
        } else {
            System.out.println("O livro já está aberto na página " + paginaAtual + ".");
        }
    }


    public void lerPagina() {
        if (paginaAtual == 0) {
            System.out.println("O livro está fechado. Abra o livro primeiro.");
        } else if (paginaAtual > numeroDePaginas) {
            System.out.println("Você já leu todas as páginas do livro.");
        } else {
            System.out.println("Lendo a página " + paginaAtual + " do livro \"" + titulo + "\".");
            System.out.println(paginas[paginaAtual - 1]);
        }
    }


    public void avancarPagina() {
        if (paginaAtual == 0) {
            System.out.println("O livro está fechado. Abra o livro primeiro.");
        } else if (paginaAtual < numeroDePaginas) {
            paginaAtual++;
            System.out.println("Avançando para a página " + paginaAtual + ".");
            lerPagina();
        } else {
            System.out.println("Você já está na última página.");
        }
    }


    public void voltarPagina() {
        if (paginaAtual == 0) {
            System.out.println("O livro está fechado. Abra o livro primeiro.");
        } else if (paginaAtual > 1) {
            paginaAtual--;
            System.out.println("Voltando para a página " + paginaAtual + ".");
            lerPagina();
        } else {
            System.out.println("Você já está na primeira página.");
        }
    }


    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu do Livro ---");
            System.out.println("1. Abrir o livro");
            System.out.println("2. Ler página atual");
            System.out.println("3. Avançar para a próxima página");
            System.out.println("4. Voltar para a página anterior");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    abrir();
                    break;
                case 2:
                    lerPagina();
                    break;
                case 3:
                    avancarPagina();
                    break;
                case 4:
                    voltarPagina();
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}
