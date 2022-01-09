package AbstractFactory;

import AbstractFactory.GUI.GUIFactory;
import AbstractFactory.GUI.MacFactory;
import AbstractFactory.GUI.WinFactory;
import AbstractFactory.Mobilya.FactoryModern;
import AbstractFactory.Mobilya.FactoryVictorian;
import AbstractFactory.Mobilya.MobilyaFactory;

public class AbstractFactory {

    public static void main(String[] args) {
            /*
            * Abstarct Factory: Factory tasarım deseninde tek bir fabrika ile nesenelerimizi çıkarıyorduk. Bu tasarım deseninde
            * bize birden fazla arayüzle sınıflarımız gelirse yani birden fazla ürün ailesi elimizde varsa kullanırız.
            * Örnek: Bri tarafta mobilya fabrikamız bir tarafta bilgisayar fabrikamız var.
            */

        /*      Örnek1(GUI)
        * Button ve CheckBox altında bizim arayüzlerimiz bulunmakta. Bunlardan Mac ve Windows için farklı tarzda görünmekte.
        * işte tam burada 2 farklı ürün ailemiz bulunmakta(win-mac).
        */
        //Mac fabrikası oluşturduk.
        GUIFactory factory = new MacFactory();
        var button = factory.ButtonOlustur();
        var checkBox = factory.CheckBoxOlustur();

        button.olustur();           //Mac Button oluşturuldu
        checkBox.olustur();         //Mac CheckBox oluşturuldu

        //Windows fabrikası oluşturduk.
        GUIFactory win_factory = new WinFactory();
        var win_button = factory.ButtonOlustur();
        var win_checkBox = factory.CheckBoxOlustur();

        win_button.olustur();           //Windows Button oluşturuldu
        win_checkBox.olustur();         //Windows CheckBox oluşturuldu

        //Kısaca her bir ürün için fabrika sınıfımızı yapıyoruz. Ve oradan ürünümüzü çağırıyoruz.

        /*      Örnek-2(Mobilya)
        * Bizim 3 tane mobilyamız bulunmakta bunlar: Koltuk - Kanape - Sehpa.
        * Bu ailelerin çeşitli varyasyonları vardır: Modern - Victorian - ArtDeco
        * Oluşturacağımız ürünler ailenin diğer ürünleri ile eşleşmesi gerekmektedir mesela 2 Modern koltuk alana Modern Kanape verilmeli.
        */
        MobilyaFactory mobilyaFactory = new FactoryModern();
        var m_koltuk = mobilyaFactory.koltuk();
        var m_sehpa = mobilyaFactory.sehpa();

        MobilyaFactory mobilyaFactory1 = new FactoryVictorian();
        var v_koltuk = mobilyaFactory1.koltuk();
        var v_sehpa = mobilyaFactory1.sehpa();

        m_koltuk.olustur();     //Modern Koltuk Oluşturuldu
        m_sehpa.olustur();      //Modern Sehpa Oluşturuldu
        v_koltuk.olustur();     //Victorian Koltuk Oluşturuldu
        v_sehpa.olustur();      //Victorian Sehpa Oluşturuldu

        //burada denetim hangi fabrikadan aldınız
        //+ "... fabrikadan aldım"
        //+ "tamam size gereken sehpayı gönderiyorum"
        //ve böylece aynı modelde sehpa gönderilmiş olur.

        //1- Fabrikalarımızı bir interfaceye bağlı ve onlar bize ürünümüzün özelliklerini döndürüyor.
    }
}
