public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void aumentarEstoque(int quantidade) {
        if (quantidade > 0) {
            quantidadeEstoque += quantidade;
            System.out.println("Estoque aumentado em " + quantidade + " unidades.");
        } else {
            System.out.println("Quantidade a ser adicionada deve ser positiva.");
        }
    }

    public void diminuirEstoque(int quantidade) {
        if (quantidade > 0) {
            if (quantidade <= quantidadeEstoque) {
                quantidadeEstoque -= quantidade;
                System.out.println("Estoque diminuído em " + quantidade + " unidades.");
            } else {
                System.out.println("Quantidade para diminuir é maior que o estoque disponível.");
            }
        } else {
            System.out.println("Quantidade a ser removida deve ser positiva.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}