package Bridge.Renk;

public class Kopru {
    private Sekil _sekil;
    private Renk _renk;

    public Kopru(Sekil sekil, Renk renk) {
        this._sekil = sekil;
        this._renk = renk;
    }

    public void SekliCiz(){
        System.out.println(_renk.rengi() + " " + _sekil.tur());
    }
}
