package Mediator.Havaalanı;

public class Ucak implements Command{
    private IKule kule;

    public Ucak(IKule kule) {
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

    public void parked(){
        System.out.printf("uçak park edildi");
        kule.PistDurumu(true);
    }
}
