package Bridge.a_b;

public class Abstraction {
    private Bridge _bridge;
    public Abstraction(Bridge bridge){
        _bridge = bridge;
    }
    public void tanımlamaYap(){
        _bridge.tanımla();
    }
}
