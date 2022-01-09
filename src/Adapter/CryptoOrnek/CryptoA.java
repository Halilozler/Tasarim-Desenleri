package Adapter.CryptoOrnek;

//bu bizim eski nesnemiz
public class CryptoA implements Crypto{
    @Override
    public void Sifreleme(String text) {
        System.out.println(text + " yazı şifrelendi.");
    }

    @Override
    public void Cozme(String text) {
        System.out.println(text + " yazı çözüldü.");
    }
}
