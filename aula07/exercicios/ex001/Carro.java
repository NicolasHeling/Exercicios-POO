public class Carro {
    private String modelo;
    private Motor motor;

    public Carro(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    protected void ligarCarro(){
        this.motor.ligar();
    }
    protected void desligarCarro(){
        this.motor.desligar();
    }
    protected void turboBoost(){
        this.motor.aumentarPotencia(50);
    }
    protected void reduzirPotenciaMotor(){
        this.motor.reduzirPotencia(30);
    }
    protected void acionarFreio(int decrementoRPM){
        this.motor.reduzirRPM(decrementoRPM);
    }
    protected void acionarAcelerador(int incrementoRPM){
        this.motor.acelerar(incrementoRPM);
    }

    @Override
    public String toString() {
        return "Carro: " + modelo + ", Motor: " + motor.getModelo() + ", Tipo de Combustível: " + motor.getTipoCombustivel();
    }
}
