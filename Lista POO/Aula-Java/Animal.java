public class Animal {
    private String especie;
    private int idade;
    private double peso;

    public Animal(String especie, int idade, double peso) {
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    public void alimentar(double quantidade) {
        if (quantidade > 0) {
            System.out.println("O " + especie + " foi alimentado com " + quantidade + " kg de comida.");
        } else {
            System.out.println("A quantidade de comida deve ser positiva.");
        }
    }

    public void dormir() {
        System.out.println("O " + especie + " está dormindo.");
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}