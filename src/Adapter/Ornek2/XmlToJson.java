package Adapter.Ornek2;

public class XmlToJson implements IXml{
    private final IJson _json;

    public XmlToJson(IJson json){
        _json = json;
    }

    @Override
    public void yazXml(String XmlYaz) {
        _json.yazJson(XmlYaz);
    }
}
