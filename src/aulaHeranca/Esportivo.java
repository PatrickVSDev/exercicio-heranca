package aulaHeranca;

public class Esportivo extends Carro {

    private int velMaxima;

    public Esportivo(int numPassageiros, int capTanque, int kmL) {
        super(numPassageiros, capTanque, kmL);
    }

    public Esportivo() {
    }

    @Override
    void acelera() {
        System.out.println("Ssssuuuutututututu");
    }
}
