package Builder.Ev;

public class BuilderDirector {
    private EvBuilder _builder;

    public BuilderDirector(EvBuilder builder){
        _builder = builder;
    }

    public void build(){
        _builder.buildBahceli();
        _builder.buildKapıSayısı();
        _builder.buildPencereSayısı();
    }
}
