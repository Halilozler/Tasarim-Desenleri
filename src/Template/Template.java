package Template;

import Template.Database.ConnectionTemplate;
import Template.Database.MySQL;

public class Template {
    public static void main(String[] args) {
        /*
        *   Template: Algoritmamızda adımalrı tanımlamamızı sağlar.
        * Örnek: bir arabayı çalıştırmak için ilk başta
        * -arabanın kapısını açarız
        * -arabaya bineriz
        * -anahtarı takarız
        * -anahtarı çeviririz diyebiliriz.
        * işte bu adımların birinin bile sırası şaşar ise arabayı çalıştıramayız. Template tasarım deseni bu adımları zorunlu
        * hale hale getirmektedir.
        */

        /*  Örnek-1(Database)
        * Bir database projemize taımlarken ilk başta o database bağlanmamız gereklidir. Sonra işlemleri yapabiliriz.
        */
        ConnectionTemplate template = new MySQL();
        template.run();
        //çıktısı sırası ile:
        //MySql...
        //MySql User
        //bağlandı
        //MySql Data

        //Burada önemli olan bizim ana sınıfımıza değiştirilemez(final) bir metodların sırası ile çalışacağı metot tanımlamaktır.
    }
}
