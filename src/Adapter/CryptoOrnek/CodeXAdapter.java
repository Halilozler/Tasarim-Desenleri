package Adapter.CryptoOrnek;

public class CodeXAdapter implements Crypto{
    private final ICodeX _codeX;

    public CodeXAdapter(ICodeX codeX){
        _codeX = codeX;
    }

    //eski kodlardan yeni kodları çağırmış oldum.
    @Override
    public void Sifreleme(String text) {
        _codeX.textKodlandı(text);
    }

    @Override
    public void Cozme(String text) {
        _codeX.textCozuldu(text);
    }
}
