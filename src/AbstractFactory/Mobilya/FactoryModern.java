package AbstractFactory.Mobilya;

public class FactoryModern implements MobilyaFactory{
    @Override
    public Koltuk koltuk() {
        return new ModernKoltuk();
    }

    @Override
    public Sehpa sehpa() {
        return new ModernSehpa();
    }
}
