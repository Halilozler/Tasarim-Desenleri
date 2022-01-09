package Builder.Ev;

public class Villa implements EvBuilder{
    private final Ev ev = new Ev("Villa");

    @Override
    public void buildKapıSayısı() {
        ev.setKapıSayısı(2);
    }

    @Override
    public void buildPencereSayısı() {
        ev.setPencereSayısı(5);
    }

    @Override
    public void buildBahceli() {
        ev.setBahceVar();
    }

    @Override
    public Ev ev() {
        return this.ev;
    }
}
