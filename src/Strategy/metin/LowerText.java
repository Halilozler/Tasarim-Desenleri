package Strategy.metin;

public class LowerText implements textFormatter{
    @Override
    public void Format(String text) {
        System.out.printf(text.toLowerCase());
    }
}
