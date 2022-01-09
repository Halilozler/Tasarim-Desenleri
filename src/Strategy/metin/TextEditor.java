package Strategy.metin;

public class TextEditor {
    private final textFormatter text_f;

    public TextEditor(textFormatter textFormatter){
        text_f = textFormatter;
    }

    public void textCevir(String text){
        text_f.Format(text);
    }
}
