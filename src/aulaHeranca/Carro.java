package aulaHeranca;

//public class Carro extends Veiculo{
public abstract class Carro extends Veiculo {
    public Carro(int numPassageiros, int capTanque, int kmL) {
        super(numPassageiros, capTanque, kmL);
    }

    public Carro() {
    }

    public int calcAutonomia() {
        return capTanque * kmL;
    }

    //@Override
    //public void acelera() {
    //    System.out.println("Vrum Vrum Vrum");
    // }
}
