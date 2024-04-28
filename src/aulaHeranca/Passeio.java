package aulaHeranca;

public class Passeio extends Carro {

    private int capPortaMalas;

    public Passeio(int numPassageiros, int capTanque, int kmL) {
        super(numPassageiros, capTanque, kmL);
    }

    public Passeio() {
    }

    @Override
    void acelera() {
        System.out.println("BERRRAAAAAAAAAAAAAAAAAAAAM PO PO PO");
    }
}
