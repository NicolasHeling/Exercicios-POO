public class Motor {
    private tipoCombustivel tipoCombustivel;
    private String modelo;
    private int potencia;
    private int cilindradas;
    private int RPM;
    private Boolean ligado;

    public Motor(tipoCombustivel tipoCombustivel, String modelo, int potencia, int cilindradas, int RPM, Boolean ligado) {
        this.tipoCombustivel = tipoCombustivel;
        this.modelo = modelo;
        this.potencia = potencia;
        this.cilindradas = cilindradas;
        this.RPM = 0;
        this.ligado = false;
    }

    public tipoCombustivel getTipoCombustivel(){
        return tipoCombustivel;
    }

    public String getModelo(){
        return modelo;
    }

    public int getPotencia(){
        return potencia;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public int getRPM() {
        return RPM;
    }

    protected void ligar(){
        if(!ligado){
            this.ligado = true;
            this.RPM = 1000;
            System.out.println("Motor ligado. RPM: " + RPM);
        } else{
            System.out.println("Carro já está ligado");
        }
    }

    protected void desligar(){
        if(ligado){
            this.ligado= false;
            this.RPM = 0;
            System.out.println("Motor desligado.");
        } else{
            System.out.println("O carro já está desligado");
        }
    }

    protected void aumentarPotencia(int incremento){
        if (ligado) {
            this.potencia += incremento;
            System.out.println("Aumentando potência. HP: " + potencia);
        } else {
            System.out.println("O motor precisa estar ligado para aumentar a potência.");
        }
    }

    protected void reduzirPotencia(int decremento){
        if (ligado) {
            this.potencia -= decremento;
            System.out.println("Reduzindo potência. HP: " + potencia);
        } else {
            System.out.println("O motor precisa estar ligado para reduzir a potência.");
        }
    }

    protected void acelerar(int incrementoRPM){
        if (ligado) {
            this.RPM += incrementoRPM;
            System.out.println("Acelerando. RPM: " + RPM);
        } else {
            System.out.println("O motor precisa estar ligado para acelerar.");
        }
    }
    protected void reduzirRPM(int decrementoRPM){
        if (ligado) {
            this.RPM -= decrementoRPM;
            System.out.println("Reduzindo RPM. RPM: " + RPM);
        } else {
            System.out.println("O motor precisa estar ligado para reduzir o RPM.");
        }

    }


}
