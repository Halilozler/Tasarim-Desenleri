package Adapter.Ornek2;

public class Xml implements IXml{
    @Override
    public void yazXml(String XmlYaz) {
        System.out.println(XmlYaz + "Xml formatında yazıldı");
    }
}
