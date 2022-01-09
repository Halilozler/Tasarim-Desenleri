package Factory;

import Factory.Computer.ComputerFactory;
import Factory.Lojistik.TasitFactory;

public class Factory {

    public static void main(String[] args) {
        /*
        * Factory: fabrika tasarım desenini bir fabrika gibi düşünebiliriz nasıl bir fabrikada benzer nesneler çıakr ise burada
        * bir sınıf içinden benzer nesnelerimizi new yaparak çağırabiliriz.
        */

        /*      Örnek-1(Computer)
        *Computerlerimiz olsun bizim biri Dell, biri mac olmak üzere bunarı oluşturanda bir ComputerFactory yapalım.
        */
        ComputerFactory factory = new ComputerFactory();
        var aComputer = factory.getComputer(1);
        var bComputer = factory.getComputer(2);

        aComputer.name();       //Mac Bilgisayar
        bComputer.name();       //Dell Bilgisayar

        bComputer = factory.getComputer(1);
        bComputer.name();       //Mac Bilgisayar

        //burada bir fabrika sınıfı ile istediğimiz metodu new yaparak döndürüyoruz böylece yeni bir sınıf tanımlamamıza gerek kalmıyor.

        /*      Örnek-2(Lojistik)
        * Bir kamyon firmamız blunmakta ve sınıflarımız ona göre biz buraya bir de gemi sınıfını eklemek istiyoruz.
        */
        TasitFactory tFactory = new TasitFactory();
        var gemi = tFactory.TasıtTanımla(2);
        var kamyon = tFactory.TasıtTanımla(1);

        gemi.Tasi();        //Gemi Taşıyor.
        kamyon.Tasi();      //Kamyon Taşıyor.

    }
}
