package Mediator;

import Mediator.Havaalanı.IKule;
import Mediator.Havaalanı.Kule;
import Mediator.Havaalanı.Ucak;
import Mediator.Havaalanı.İnisPisti;

public class Mediator {
    public static void main(String[] args) {
        /*
        *   Mediator: En iyi Örnek olarak havaalanlarındaki kuleler diyebiliriz. peki neden:
        * Havaalanlarında uçaklar birbirleri işlem yapacaklarında birbirleri ile iletişime geçmezler kule onlar için duruma bakar
        * Durumu gözledikten sonra uçakların hepsini kontrol ederek trafiği sağlar.
        *
        * Yani özet olarak bizim nesnelerimizi kontrol eden bir sınıfımız olur. nesnemizi o sınıfa bağlayarak işlemleri gerçekleştiririz.
        */

        /*  Örnek-1(Havaalanı)
        * Bizim havaalanı iniş çıkış kontrol için 1-Uçak, 2-İnişAlanı ve son olarak 3-Kulemiz olması lazım. Tabikide Uçakların içinde
        * Kule tanımlanmalı. Uçaklar kuleye giderek bilgileri alıcak sonra ise işlemi gerçekleştirilecek.
        */
        IKule kule = new Kule();
        Ucak f1 = new Ucak(kule);
        Ucak f2 = new Ucak(kule);
        İnisPisti i̇nisPisti = new İnisPisti(kule);

        kule.ucakKaydet(f1);
        kule.ucakKaydet(f2);
        kule.PistKaydet(i̇nisPisti);

        f1.in();        //iniş yapılıyor
        f2.in();        //pist müsait değil
        f1.parked();    //uçak park edildi
        f2.in();        //iniş yapılıyor

        //uçaklar kule ile iletişime geçiyor sınıflarında sonra kule onlara durum gönderiyor uçaklar ona göre haraket ediyor kısaca bu.
    }
}
