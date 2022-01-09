package Adapter.Ornek2;

public class Json implements IJson{
    @Override
    public void yazJson(String JsonText) {
        System.out.println(JsonText + "Json formatında yazıldı");
    }
}
