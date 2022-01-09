package Mediator.Havaalanı;

public interface IKule {
    void ucakKaydet(Ucak ucak);
    void PistKaydet(İnisPisti pist);
    void PistDurumu(boolean durum);
    boolean PistDurumuGorme();
}
