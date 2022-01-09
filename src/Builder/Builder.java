package Builder;

import Builder.Araba.*;
import Builder.Ev.*;

public class Builder {
    public static void main(String[] args) {
        /*
        * Builder tasarım deseni constructer(kurucu) yapısını daha verimli hale getirmemizi sağlar.
        * Örnek: bir ev düşünelim farklı farklı ev türleri vardır değilmi bahçeli, havuzlu, bahçesiz, ... böyle böyle gider.
        * bunların hepsini kurucu içine koyarsak anlam karmaşası olur. Bunun için builder kullanırız
        *
        * Builder temel yapılacaklar:
        * - bir tane Builder interface kurulmalıdır. Bunun içinde bizim bütün özelliklerimiz tanınlanmalıdır.
        * - bir tane(bu şart değil ama olmaz ise main içinde yapılmalı) builderlarımızı çağıracak içinde doğru nesneyi bulucak
        * Director olmalıdır.
        *
        * Özellikler:
        * - Builder deseni kompleks nesneleri adım adım oluşturmamıza olanak tanır.
        * - Recursive çalışmaya olanak sağladığı için karmaşık yapılar için builde kullanılabilir.
        * - Yeni bir aynı nesne oluştumamıza kolay bir şekilde olanak sağlar.
        */

        /*      Örnek-1(Araba)
        * Bizim bir ana Araba Sınıfımız olsun. Arabaların farklı farklı özellikleri olduğundan builder tasarım deseni uygulayalım.
        */
        CarBuilder carBuilder = new SedanCarbuilder();
        CarDirector carDirector = new CarDirector(carBuilder);
        carDirector.Build();
        Car car = carBuilder.getCar();
        car.info();         //4 kapı var Sedan 110

        //Burada CarDirector mantığı bütün metotları çalıştırıp verileri belleğe atması. Eğer Director olmasını istemiyor ise hepsini teker teker
        //tanımlamamız lazımdı.

        CarBuilder carb = new SporCarBuilder();
        carb.bildPower();
        carb.buildBodyStyle();
        car = carb.getCar();
        car.info();         //2 kapı var Spor 300

        /*
        * Önemli olan burada bir builder interface içine bizim ana sınıfımızdaki nseneleri tanımak ve builder sınıfları oluşturarak interfaceye
        * bu özellikleri yüklemek. Bu özellikleri builder sınıfında yükledikten sonra getCar() gibi metotlar ile ana nesneyi çağırmak.
        */

        /*  Örnek-2(Ev)
        * Yukarıda belirtiğim gibi bizim ev sınıflarımız olsun. 2 tanede builderımız olsun bunlar apartman ve villa.
        */

        EvBuilder a = new ApartmanBuilder();
        BuilderDirector builderDirector = new BuilderDirector(a);
        builderDirector.build();

        Ev ev = a.ev();
        ev.ozellikler();    //Apartman Bahçe yok 50 10

    }
}
