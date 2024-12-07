public class Cidade {
    private String nome;
    private int populacao;
    private String estado;

    public Cidade(String nome, int populacao, String estado) {
        this.nome = nome;
        this.populacao = populacao;
        this.estado = estado;
    }

    public void aumentarPopulacao(int quantidade) {
        if (quantidade > 0) {
            populacao += quantidade;
            System.out.println("População de " + nome + " aumentada em " + quantidade + " habitantes.");
        } else {
            System.out.println("Quantidade para aumento deve ser positiva.");
        }
    }

    public void diminuirPopulacao(int quantidade) {
        if (quantidade > 0) {
            if (quantidade <= populacao) {
                populacao -= quantidade;
                System.out.println("População de " + nome + " diminuída em " + quantidade + " habitantes.");
            } else {
                System.out.println("Quantidade para diminuição é maior que a população atual.");
            }
        } else {
            System.out.println("Quantidade para diminuição deve ser positiva.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}