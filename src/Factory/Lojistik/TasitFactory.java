package Factory.Lojistik;

public class TasitFactory {
    public Taşıt TasıtTanımla(int tip){
        if(tip == 1){
            return new Kamyon();
        }
        else if(tip == 2){
            return new Gemi();
        }
        return null;
    }
}
