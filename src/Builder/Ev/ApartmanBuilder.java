package Builder.Ev;

public class ApartmanBuilder implements EvBuilder{
    private final Ev ev = new Ev("Apartman");

    @Override
    public void buildKapıSayısı() {
        ev.setKapıSayısı(10);
    }

    @Override
    public void buildPencereSayısı() {
        ev.setPencereSayısı(50);
    }

    @Override
    public void buildBahceli() {
        ev.setBahceYok();
    }

    @Override
    public Ev ev() {
        return this.ev;
    }
}
