package Factory.Computer;

public class ComputerFactory {

    public Computer getComputer(int tercih){
        if(tercih == 1){
            return new Mac();
        }
        else if(tercih == 2){
            return new Dell();
        }

        return null;
    }
}
