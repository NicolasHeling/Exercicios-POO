import java.util.ArrayList;
import java.util.List;

public class Maiin {
    public static void main(String[] args) {

        List<Carro> carros = new ArrayList<>();

        Motor AP16 = new Motor(tipoCombustivel.GASOLINA, "AP 1.6", 300, 2000, 0,false);

        Carro Chevette = new Carro("Chevette",AP16);
        carros.add(Chevette);


        Chevette.ligarCarro();
        Chevette.desligarCarro();
        Chevette.turboBoost();

        System.out.println("\n");

        Chevette.ligarCarro();
        Chevette.turboBoost();
        Chevette.reduzirPotenciaMotor();
        Chevette.acionarAcelerador(200);
        Chevette.acionarFreio(200);

        Motor motor2 = new Motor(tipoCombustivel.DIESEL, "V6", 400, 3000, 0, false);
        Carro f150 = new Carro("F-150", motor2);
        carros.add(f150);

        Motor motor3 = new Motor(tipoCombustivel.ELETRICO, "Elétrico", 250, 0, 0, false);
        Carro tesla = new Carro("Tesla Model S", motor3);
        carros.add(tesla);

        System.out.println("\n");

        for (Carro carro : carros) {
            System.out.println(carro);
        }

    }
}
