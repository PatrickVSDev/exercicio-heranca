package aulaHeranca;

public class DemVeiculo {
    public static void main(String[] args) {
        // Veiculo uno = new Veiculo();

        Moto cg = new Moto();
        cg.setCapTanque(8);

        //Carro gol = new Carro();

        Esportivo ferrari = new Esportivo();

        Passeio celta = new Passeio();

        // uno.acelera();
        cg.acelera();
        //gol.acelera();
        ferrari.acelera();
        celta.acelera();
    }
}
