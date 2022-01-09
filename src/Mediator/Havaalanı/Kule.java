package Mediator.Havaalanı;

public class Kule implements IKule{
    private İnisPisti pist;
    private Ucak ucak;
    private boolean durum = true;

    @Override
    public void ucakKaydet(Ucak ucak) {
        this.ucak = ucak;
    }

    @Override
    public void PistKaydet(İnisPisti pist) {
        this.pist = pist;
    }

    @Override
    public void PistDurumu(boolean durum) {
        this.durum = durum;
    }

    @Override
    public boolean PistDurumuGorme() {
        return durum;
    }
}
