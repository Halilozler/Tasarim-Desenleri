package Template.Database;

public class MySQL extends ConnectionTemplate {
    @Override
    public void setDbDriver() {
        System.out.println("MySql...");
    }

    @Override
    public void setUserLogin() {
        System.out.println("MySql User");
    }

    @Override
    public void setData() {
        System.out.println("MySql Data");
    }
}
