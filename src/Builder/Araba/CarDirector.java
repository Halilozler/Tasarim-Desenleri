package Builder.Araba;

public class CarDirector {
    private CarBuilder _builder;

    public CarDirector(CarBuilder builder){
        _builder = builder;
    }

    public void Build(){
        _builder.buildBodyStyle();
        _builder.bildPower();
    }
}
