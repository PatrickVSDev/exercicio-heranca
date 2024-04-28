package aulaHeranca;

public class Moto extends Veiculo{

    private int cilindradas;

    public Moto() {
        super(); // Com o super você pode usar qualquer coisa da Super Classe
    }

    public Moto(int numPassageiros, int capTanque, int kmL) {
        super(numPassageiros, capTanque, kmL);
    }

    public Moto(int numPassageiros, int capTanque, int kmL, int cilindradas) {
        super(numPassageiros, capTanque, kmL);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    @Override
    public void acelera() {
        System.out.println("Randandandan pápápá");
    }
}

