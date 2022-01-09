package Builder.Araba;

public class Car {
    private String bodyStyle;
    private String carType;
    private String power;

    //her araba için bir tipimiz olduğundan kurucumuz içine istiyoruz.
    public Car(String type){
        carType = type;
    }

    public void info(){
        System.out.println(getBodyStyle() + " " + getCarType() + " " + getPower());
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
}
