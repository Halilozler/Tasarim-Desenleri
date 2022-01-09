package Strategy;

import Strategy.metin.CapsText;
import Strategy.metin.LowerText;
import Strategy.metin.TextEditor;

public class Strategy {
    public static void main(String[] args) {
        /*
        *   Strategy: Biz bazen bir işlem için birden fazla algoritma yöntemi kullanabiliriz. Bunun içinde strategy kullanılabilir.
        */

        /*  örnek-1(metin)
        * biz metinimizde yazıları küçültmek veya büyütlemek istiyoruz.
        */
        String text = "aaaaaa";

        TextEditor textEditor = new TextEditor(new CapsText());
        textEditor.textCevir(text);         //AAAAAA

        textEditor = new TextEditor(new LowerText());
        textEditor.textCevir(text);         //aaaaaa

        //Bridge ile aynı aslında ama bridgede daha fazla ayrılmasını istemiyoruz. Bunda ise 2 nesneyi bir interface ile aynı tür yaptıktan sonra
        //o sınıf yardımı ile istediğimiz sınıfı çağırıp işlem yapabiliyoruz.
    }
}
