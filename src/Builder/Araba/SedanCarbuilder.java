package Builder.Araba;

public class SedanCarbuilder implements CarBuilder{
    private final Car SedanCar = new Car("Sedan");

    @Override
    public void buildBodyStyle() {
        SedanCar.setBodyStyle("4 kapı var");
    }

    @Override
    public void bildPower() {
        SedanCar.setPower("110");
    }

    @Override
    public Car getCar() {
        return SedanCar;
    }
}
