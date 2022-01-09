package Strategy.metin;

public class CapsText implements textFormatter{
    @Override
    public void Format(String text) {
        System.out.printf(text.toUpperCase());
    }
}
