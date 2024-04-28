package aulaHeranca;

public abstract class Veiculo {
    protected int numPassageiros;
    protected int capTanque;
    protected int kmL;

    public Veiculo(int numPassageiros, int capTanque, int kmL) {
        super();
        this.numPassageiros = numPassageiros;
        this.capTanque = capTanque;
        this.kmL = kmL;
    }
    public Veiculo () {
        super();
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    public int getCapTanque() {
        return capTanque;
    }

    public void setCapTanque(int capTanque) {
        this.capTanque = capTanque;
    }

    public int getKmL() {
        return kmL;
    }

    public void setKmL(int kmL) {
        this.kmL = kmL;
    }

    abstract void acelera() ;

}


