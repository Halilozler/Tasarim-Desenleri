package Adapter.CryptoOrnek;

public class CodeX implements ICodeX{
    @Override
    public void textKodlandı(String text) {
        System.out.println(text + " text kodlandı!!");
    }

    @Override
    public void textCozuldu(String text) {
        System.out.println(text + " text kodu çözüldü!!");
    }
}
