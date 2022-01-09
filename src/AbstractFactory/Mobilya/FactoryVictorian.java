package AbstractFactory.Mobilya;

public class FactoryVictorian implements MobilyaFactory{
    @Override
    public Koltuk koltuk() {
        return new VictorianKoltuk();
    }

    @Override
    public Sehpa sehpa() {
        return new VictorianSehpa();
    }
}
