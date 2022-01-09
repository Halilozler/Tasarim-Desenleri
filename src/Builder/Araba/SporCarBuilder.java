package Builder.Araba;

public class SporCarBuilder implements CarBuilder{
    private final Car SporCar = new Car("Spor");

    @Override
    public void buildBodyStyle() {
        SporCar.setBodyStyle("2 kapı var");
    }

    @Override
    public void bildPower() {
        SporCar.setPower("300");
    }

    @Override
    public Car getCar() {
        return SporCar;
    }
}
