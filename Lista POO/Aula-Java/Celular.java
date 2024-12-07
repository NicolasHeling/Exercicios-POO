import java.util.Scanner;

public class Celular {
    private String marca;
    private String modelo;
    private int capacidadeBateria;
    private int bateriaAtual;
    private boolean ligado;

    public Celular(String marca, String modelo, int capacidadeBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeBateria = capacidadeBateria;
        this.bateriaAtual = capacidadeBateria;
        this.ligado = false;
    }

    public void ligar() {
        if (ligado) {
            System.out.println("O celular já está ligado.");
        } else if (bateriaAtual <= 0) {
            System.out.println("A bateria está zerada. Não é possível ligar o celular.");
        } else {
            ligado = true;
            System.out.println("O celular foi ligado.");
        }
    }

    public void desligar() {
        if (!ligado) {
            System.out.println("O celular já está desligado.");
        } else {
            ligado = false;
            System.out.println("O celular foi desligado.");
        }
    }

    public void mostrarStatus() {
        System.out.println("\n--- Status do Celular ---");
        System.out.println("Modelo: " + modelo);
        System.out.println("Bateria: " + calcularPorcentagemBateria() + "%");
        System.out.println("Celular " + (ligado ? "ligado" : "desligado"));
    }

    public void usarBateria(int quantidade) {
        if (ligado) {
            bateriaAtual = Math.max(bateriaAtual - quantidade, 0);
            if (bateriaAtual == 0) {
                System.out.println("A bateria está zerada. O celular será desligado automaticamente.");
                desligar();
            }
        } else {
            System.out.println("O celular está desligado. Ligue-o para usar.");
        }
    }

    public void carregarBateria(int quantidade) {
        if (quantidade < 0) {
            System.out.println("A quantidade a ser carregada deve ser positiva.");
            return;
        }
        if (!ligado) {
            bateriaAtual = Math.min(bateriaAtual + quantidade, capacidadeBateria);
            System.out.println("A bateria foi carregada. Nível atual: " + calcularPorcentagemBateria() + "%");
        } else {
            System.out.println("Desligue o celular antes de carregá-lo.");
        }
    }

    private int calcularPorcentagemBateria() {
        return (int) ((double) bateriaAtual / capacidadeBateria * 100);
    }

    public void exibirMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            mostrarStatus();
            System.out.println("\n--- Menu do Celular ---");
            System.out.println("1. Ligar o celular");
            System.out.println("2. Desligar o celular");
            System.out.println("3. Usar o celular (diminuir a bateria)");
            System.out.println("4. Carregar a bateria");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    ligar();
                    break;
                case 2:
                    desligar();
                    break;
                case 3:
                    if (ligado) {
                        System.out.print("Quantidade de bateria a ser usada (em mAh): ");
                        int uso = scanner.nextInt();
                        usarBateria(uso);
                    } else {
                        System.out.println("O celular está desligado. Ligue-o para usar.");
                    }
                    break;
                case 4:
                    if (!ligado) {
                        System.out.print("Quantidade de bateria a ser carregada (em mAh): ");
                        int carga = scanner.nextInt();
                        carregarBateria(carga);
                    } else {
                        System.out.println("Desligue o celular antes de carregá-lo.");
                    }
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
