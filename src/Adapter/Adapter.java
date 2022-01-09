package Adapter;

import Adapter.CryptoOrnek.CodeX;
import Adapter.CryptoOrnek.CodeXAdapter;
import Adapter.CryptoOrnek.CryptoA;
import Adapter.Ornek2.IXml;
import Adapter.Ornek2.Json;
import Adapter.Ornek2.Xml;
import Adapter.Ornek2.XmlToJson;

public class Adapter {

    public static void main(String[] args) {
         /*
         * Adabter: MEvcut bir sınıfı veya arayüzü başka bir sınıfa veya arayüe uygun hale getirmek.
         * Örnek:
         *      XML formatını JSON formatına çevirmek.
         */

        /*      Örnek-1
        * Burada örnekte bir Crypto diye interface olsun CryptoA yi implements etsin.
        * CryptoA bizim eski metodlarımızı olduğu class yeni bir class yapmak istiyoruz buda CodeX diye.
        * CodeX i ICodeX den implement ediyoruz bundada yeni metotlarımız var.
        * CodeXAdapter dan ise(kendisi adapterımız) Crypto interfacesinden implement ediyoruz.
        * Burada eski metodlar adı altında direk olarak yeni metodları çalıştırır olduk.
        */

        CryptoA cryptoA = new CryptoA();
        cryptoA.Sifreleme("metin");     //metin yazı şifrelendi.
        cryptoA.Cozme("metin");         //metin yazı çözüldü.

        //bu kodları CodeX formatına çevirmek istiyoruz.
        CodeX codeX = new CodeX();
        CodeXAdapter codeXAdapter = new CodeXAdapter(codeX);
        codeXAdapter.Sifreleme("metin");    //metin text kodlandı!!
        codeXAdapter.Cozme("metin");        //metin text kodu çözüldü!!

        //aynı şekilde sadece class adapterı koyarak Crypto metotlarını kullanmış oluyoruz.

        /*      Örnek-2
        *  Burada XML formatından JSON formatına çevirmek istiyoruz.
        */

        IXml xml = new Xml();
        xml.yazXml("metin");        //metin Xml formatında yazıldı

        XmlToJson xmlToJson = new XmlToJson(new Json());
        xmlToJson.yazXml("metin");  //metin Json formatında yazıldı

        //burada önemli olan adapter sınıfını eski interfacemiz ile implement ediyoruz. Sonra ise eski gelen metodlarımızın
        //içinde yeni metodlarımızı çağırıyoruz bu kadar basit oluyor.

    }
}
