public class Empresa {
    private String nome;
    private String CNPJ;
    private int numeroFuncionarios;

    public Empresa(String nome, String CNPJ, int numeroFuncionarios) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public void contratar(int quantidade) {
        if (quantidade > 0) {
            numeroFuncionarios += quantidade;
            System.out.println("Foram contratados " + quantidade + " funcionários. Total de funcionários agora: " + numeroFuncionarios);
        } else {
            System.out.println("A quantidade a contratar deve ser positiva.");
        }
    }

    public void demitir(int quantidade) {
        if (quantidade > 0) {
            if (quantidade <= numeroFuncionarios) {
                numeroFuncionarios -= quantidade;
                System.out.println("Foram demitidos " + quantidade + " funcionários. Total de funcionários agora: " + numeroFuncionarios);
            } else {
                System.out.println("Número de funcionários a demitir excede o número de funcionários atuais.");
            }
        } else {
            System.out.println("A quantidade a demitir deve ser positiva.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }
}