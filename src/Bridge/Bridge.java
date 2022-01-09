package Bridge;

import Bridge.Renk.*;
import Bridge.a_b.*;

public class Bridge {
    public static void main(String[] args) {
        /*
        *   Bridge: 2 class arasında Köprü olması ile bir sınıftan diğer sınıflarımıza erişim denebilir. Hangi nesneyi kullanıcak isek kullanım
        * anında karar vererek yola çıkarız.
        */

        /*  Örnek-1(a_b)
        * Burada 2 tan nesnemiz var biri a diğeri b. Bu nesneleri Bridge interfacemiz ile implement ediyoruz böylece bridge İnterfacemiz ile
        * 2 nesneyede ulaşabiliriz.
        * Bir tane Abstraction sınıfımız bulunmakta bu sınıf ile Gelen bridgeyi alıyoruz ve maine aktarabiliyoruz.
        */

        Abstraction abstraction = new Abstraction(new a());
        abstraction.tanımlamaYap();     //A tanımlandı

        abstraction = new Abstraction(new b());
        abstraction.tanımlamaYap();     //B tanımlandı

        /*      Örnek-2(Renk)
        *  2 tane nesnemiz bulunmakta bunlar daire ve küp. Şimdi bunları kırmızı ve maviye boyamak istiyoruz normalde ne yaparız
        * K_daire, K_küp, M_daire, ... diye sınıflar oluşturarak uzayıp gider
        * Bunun içinde bridge kullanılır.
        */
        Kopru kopru = new Kopru(new Daire(), new Kırmızı());
        kopru.SekliCiz();   //Kırmızı Daire

        kopru = new Kopru(new Kup(), new Mavi());
        kopru.SekliCiz();   //Mavi Küp

        //her zaman bir köprü ile nesnelerimiz birleştiriyoruz. Köprü üstünden işlemlerimi yapıyoruz. mesela oradan yazdırdık burada.
    }
}
