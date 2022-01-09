package Template.Database;

public class Oracle extends ConnectionTemplate{
    @Override
    public void setDbDriver() {
        System.out.println("Oracle...");
    }

    @Override
    public void setUserLogin() {
        System.out.println("Oracle User");
    }

    @Override
    public void setData() {
        System.out.println("Oracle Data");
    }
}
