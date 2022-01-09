package Mediator.Havaalanı;

public class İnisPisti implements Command{
    private IKule kule;

    public İnisPisti(IKule kule) {
        this.kule = kule;
    }
    @Override
    public void in() {
        if(kule.PistDurumuGorme()){
            System.out.printf("iniş yapılıyor");
            kule.PistDurumu(false);
        }
        else {
            System.out.printf("pist müsait değil.");
        }
    }
}
