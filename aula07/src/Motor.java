public class Motor {
    private Integer cilindradas;
    private String modelo;
    private tipoCombustivel tipoCombustivel;    private Integer RPM;
    private Potencia potencia;
    private Boolean ligado;

    public Motor(Integer cilindradas, String modelo, tipoCombustivel tipoCombustivel, Integer RPM, Integer potencia) {
        this.cilindradas = cilindradas;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
        this.RPM = 0;
        this.potencia = potencia;
        this.ligado = ligado;
    }

    public void definirPotencia(Integer cilindros,Double potencia){
        this.potencia = new Potencia(cilindros, potencia,Cavalos.CV);
    }

    public Integer getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(Integer cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public tipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(tipoCombustivel tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public Integer getRPM() {
        return RPM;
    }

    public void setRPM(Integer RPM) {
        this.RPM = RPM;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    protected void ligar(){
        this.ligado = true;
        this.RPM = 1000;
    }
    protected void desligar(){
        this.ligado = false;
        this.RPM = 0;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "cilindradas=" + cilindradas +
                ", modelo='" + modelo + '\'' +
                ", tipoCombustivel=" + tipoCombustivel +
                ", RPM=" + RPM +
                ", potencia=" + potencia +
                ", ligado=" + ligado +
                '}';
    }
}
